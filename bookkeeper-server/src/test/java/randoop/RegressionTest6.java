package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel3.read(byteBuf19, 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass12 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, 1L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf10, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf10, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, 10L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass18 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass13 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf14, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass13 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass12 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass10 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf11, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

