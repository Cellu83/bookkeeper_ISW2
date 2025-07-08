package randoop;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.bookkeeper.bookie.BufferedReadChannel;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BufferedReadChannelLLMTest {
    /**
     Test tramite llm
     */


    // Verifica la lettura di 10 byte da una posizione valida del file usando un buffer inizialmente vuoto.
    @Test
    public void testReadFromPositionWithEmptyBuffer() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            int bytesRead = bufferedChannel.read(dest, 10);
            assertEquals(10, bytesRead);
            byte[] readBytes = new byte[10];
            dest.readBytes(readBytes);
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica che il metodo size() del BufferedReadChannel restituisca la dimensione corretta del file.
    @Test
    public void testFileSize() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            assertEquals(fileChannel.size(), bufferedChannel.size());
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica l'incremento di invocationCount dopo una chiamata a read()
    @Test
    public void testInvocationCountIncrement() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "1234567890".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 8);
            long before = bufferedChannel.invocationCount;
            ByteBuf dest = Unpooled.buffer(5);
            bufferedChannel.read(dest, 0);
            long after = bufferedChannel.invocationCount;
            assertEquals(before + 1, after);
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica l'incremento di cacheHitCount se si legge due volte la stessa area del file
    @Test
    public void testCacheHitCountIncrement() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "abcdefghij".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 10);
            ByteBuf dest1 = Unpooled.buffer(5);
            bufferedChannel.read(dest1, 0); // prima lettura
            long hitsBefore = bufferedChannel.cacheHitCount;
            ByteBuf dest2 = Unpooled.buffer(5);
            bufferedChannel.read(dest2, 0); // seconda lettura nella stessa posizione
            long hitsAfter = bufferedChannel.cacheHitCount;
            assertEquals(hitsBefore + 1, hitsAfter);
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica il ramo sealed == true nel metodo size(), coprendo il caso con inizializzazione lazy di fileSize
    @Test
    public void testSizeSealedWithLazyInit() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "1234567890".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 8, true);
            long size = bufferedChannel.size();
            assertEquals(fileChannel.size(), size);
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica che l'operazione di clear() venga eseguita correttamente dopo una lettura dal canale.
    @Test
    public void testClear2() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            int bytesRead = bufferedChannel.read(dest, 0);
            assertEquals(10, bytesRead);
            bufferedChannel.clear();
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica che una lettura da una posizione oltre la fine del file restituisca -1 (EOF).
    @Test
    public void testReadBeyondFileLength() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            int bytesRead = bufferedChannel.read(dest, 1000);
            assertEquals(-1, bytesRead);
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica che leggere da una posizione negativa lanci un'eccezione IllegalArgumentException.
    @Test
    public void testReadFromInvalidPosition() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            ByteBuf dest = Unpooled.buffer(10);
            assertThrows(IllegalArgumentException.class, () -> {
                bufferedChannel.read(dest, -1);
            });
        }
        Files.deleteIfExists(tempFile);
    }

    // Verifica che leggere passando un buffer nullo lanci un'eccezione NullPointerException.
    @Test
    public void testReadWithNullBuffer() throws IOException {
        Path tempFile = Paths.get("testfile.dat");
        Files.write(tempFile, "01234567890123456789".getBytes(StandardCharsets.UTF_8));
        try (FileChannel fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ)) {
            BufferedReadChannel bufferedChannel = new BufferedReadChannel(fileChannel, 16);
            assertThrows(NullPointerException.class, () -> {
                bufferedChannel.read(null, 0);
            });
        }
        Files.deleteIfExists(tempFile);
    }
}
