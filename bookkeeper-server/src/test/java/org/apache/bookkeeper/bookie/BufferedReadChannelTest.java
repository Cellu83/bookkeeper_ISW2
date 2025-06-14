package org.apache.bookkeeper.bookie;

import org.junit.jupiter.api.*;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BufferedReadChannelTest {

    private Path tempFile;
    private byte[] testData = "The quick brown fox jumps over the lazy dog".getBytes();

    @BeforeAll
    public void setup() throws IOException {
        tempFile = Files.createTempFile("BufferedReadChannelTest", ".tmp");
        Files.write(tempFile, testData);
    }

    @AfterAll
    public void teardown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    /**
     * Verifica che la lettura dall'inizio del file con un buffer vuoto legga i primi 10 byte correttamente.
     */
    @Test
    public void testReadFromBeginningWithEmptyBuffer() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(10, bytesRead);
            byte[] readBytes = new byte[10];
            dest.readBytes(readBytes);
            assertArrayEquals("The quick ".getBytes(), readBytes);
        }
    }

    /**
     * Verifica che la lettura oltre la fine del file ritorni EOF (-1).
     */
    @Test
    public void testReadBeyondEOF() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            long positionBeyondEOF = testData.length + 10;
            int bytesRead = bufferedChannel.read(dest, positionBeyondEOF);
            assertEquals(-1, bytesRead);
        }
    }

    /**
     * Verifica che il metodo clear svuoti il buffer interno e permetta una nuova lettura corretta dall'inizio.
     */
    @Test
    public void testClearBuffer() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            // Read some data to fill the buffer
            int bytesRead = bufferedChannel.read(dest, 0);
            assertTrue(bytesRead > 0);
            // Clear the buffer
            bufferedChannel.clear();
            // The buffer should now be empty, so readBufferStartPosition should be reset,
            // but since it's private, we test by reading again and expecting correct data
            ByteBuf dest2 = Unpooled.buffer(10);
            int bytesRead2 = bufferedChannel.read(dest2, 0);
            assertEquals(10, bytesRead2);
            byte[] readBytes = new byte[10];
            dest2.readBytes(readBytes);
            assertArrayEquals("The quick ".getBytes(), readBytes);
        }
    }

    /**
     * Verifica che una lettura parziale a partire da una posizione specifica restituisca i dati corretti.
     */
    @Test
    public void testPartialRead() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(5);
            int bytesRead = bufferedChannel.read(dest, 4);
            assertEquals(5, bytesRead);
            byte[] readBytes = new byte[5];
            dest.readBytes(readBytes);
            assertArrayEquals("quick".getBytes(), readBytes);
        }
    }

    /**
     * Verifica che letture sequenziali restituiscano i dati corretti da posizioni consecutive.
     */
    @Test
    public void testMultipleSequentialReads() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest1 = Unpooled.buffer(10);
            ByteBuf dest2 = Unpooled.buffer(10);

            int bytesRead1 = bufferedChannel.read(dest1, 0);
            int bytesRead2 = bufferedChannel.read(dest2, 10);

            assertEquals(10, bytesRead1);
            assertEquals(10, bytesRead2);

            byte[] readBytes1 = new byte[10];
            byte[] readBytes2 = new byte[10];
            dest1.readBytes(readBytes1);
            dest2.readBytes(readBytes2);

            assertArrayEquals("The quick ".getBytes(), readBytes1);
            assertArrayEquals("brown fox ".getBytes(), readBytes2);
        }
    }

    /**
     * Verifica che la lettura di una quantità di dati pari alla dimensione del buffer funzioni correttamente.
     */
    @Test
    public void testReadExactBufferSize() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(16);
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(16, bytesRead);
            byte[] readBytes = new byte[16];
            dest.readBytes(readBytes);
            assertArrayEquals("The quick brown ".getBytes(), readBytes);
        }
    }

    /**
     * Verifica che la lettura dell'intero contenuto del file restituisca tutti i dati corretti.
     */
    @Test
    public void testReadRemainingData() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(testData.length);
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(testData.length, bytesRead);
            byte[] readBytes = new byte[testData.length];
            dest.readBytes(readBytes);
            assertArrayEquals(testData, readBytes);
        }
    }


    /**
     * Verifica che la lettura con un buffer più grande del file legga tutto il contenuto disponibile.
     */
    @Test
    public void testReadWithBufferLargerThanFile() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(testData.length + 100); // buffer più grande del file
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(testData.length, bytesRead);
            byte[] readBytes = new byte[testData.length];
            dest.readBytes(readBytes);
            assertArrayEquals(testData, readBytes);
        }
    }

    /**
     * Verifica che una lettura di lunghezza zero non legga dati e non causi errori.
     */
    @Test
    public void testZeroLengthRead() throws IOException {
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(0); // buffer di dimensione 0
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(0, bytesRead);
        }
    }

    /**
     * Verifica che la lettura da un file vuoto ritorni EOF immediatamente.
     */
    @Test
    public void testReadEmptyFile() throws IOException {
        Path emptyFile = Files.createTempFile("BufferedReadChannelTestEmpty", ".tmp");
        try (FileChannel fileChannel = FileChannel.open(emptyFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(-1, bytesRead);
        } finally {
            Files.deleteIfExists(emptyFile);
        }
    }

}