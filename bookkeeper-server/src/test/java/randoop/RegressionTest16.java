package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel3.read(byteBuf20, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
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
            int int21 = bufferedReadChannel3.read(byteBuf19, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf16, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass19 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass19 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass13 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass17 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel2.read(byteBuf18, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
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
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
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
            int int21 = bufferedReadChannel3.read(byteBuf19, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel2.read(byteBuf19, (long) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf15, 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
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
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
            int int15 = bufferedReadChannel3.read(byteBuf13, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
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
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf16, (long) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf12, 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf17, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf16, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf17, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel2.read(byteBuf20, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel2.read(byteBuf20, (long) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel3.read(byteBuf20, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf16, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int18 = bufferedReadChannel3.read(byteBuf15, 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
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
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
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
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
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
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf19, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel2.read(byteBuf17, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
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
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
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
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel3.read(byteBuf20, (long) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
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
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int18 = bufferedReadChannel3.read(byteBuf16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedReadChannel2.read(byteBuf19, (long) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
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
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf15, 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
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
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass20 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
        java.lang.Class<?> wildcardClass17 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
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
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf16, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
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
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bufferedReadChannel3.read(byteBuf23, (long) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel2.read(byteBuf18, (long) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
            int int13 = bufferedReadChannel2.read(byteBuf11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
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
        io.netty.buffer.ByteBuf byteBuf21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedReadChannel2.read(byteBuf21, (long) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
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
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
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
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass12 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, (long) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
            int int16 = bufferedReadChannel3.read(byteBuf14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf17, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel2.read(byteBuf20, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf16, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int19 = bufferedReadChannel3.read(byteBuf17, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass21 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass20 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
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
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
        java.lang.Class<?> wildcardClass17 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
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
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
            int int16 = bufferedReadChannel3.read(byteBuf14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
            long long13 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
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
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel2.read(byteBuf18, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel3.read(byteBuf20, 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
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
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass19 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8475");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8476");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8477");
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
        io.netty.buffer.ByteBuf byteBuf21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedReadChannel2.read(byteBuf21, (long) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8478");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8479");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8480");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel3.read(byteBuf20, 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8481");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
            int int17 = bufferedReadChannel3.read(byteBuf14, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8482");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8483");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8484");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8485");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8486");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8487");
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
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8488");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8489");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8490");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8491");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8492");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8493");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8494");
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
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8495");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8496");
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
            int int21 = bufferedReadChannel3.read(byteBuf19, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8497");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8498");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8499");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8500");
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
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

