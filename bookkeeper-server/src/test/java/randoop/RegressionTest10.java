package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
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
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
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
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, 1L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        io.netty.buffer.ByteBuf byteBuf22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedReadChannel3.read(byteBuf22, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
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
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        java.lang.Class<?> wildcardClass22 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
            int int19 = bufferedReadChannel3.read(byteBuf16, 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
            int int13 = bufferedReadChannel2.read(byteBuf10, 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
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
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
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
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
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
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf16, (long) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
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
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
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
        java.lang.Class<?> wildcardClass13 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
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
            int int18 = bufferedReadChannel2.read(byteBuf15, (long) (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
            int int20 = bufferedReadChannel2.read(byteBuf18, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
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
            int int13 = bufferedReadChannel2.read(byteBuf10, 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
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
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
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
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf6, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
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
        java.lang.Class<?> wildcardClass11 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
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
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
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
        java.lang.Class<?> wildcardClass12 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
            int int21 = bufferedReadChannel3.read(byteBuf19, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
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
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf8, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

