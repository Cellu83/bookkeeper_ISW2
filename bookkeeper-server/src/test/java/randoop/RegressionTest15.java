package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
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
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
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
            int int12 = bufferedReadChannel2.read(byteBuf10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
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
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedReadChannel2.read(byteBuf21, (long) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
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
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
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
            int int18 = bufferedReadChannel2.read(byteBuf16, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
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
            int int19 = bufferedReadChannel2.read(byteBuf16, (long) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
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
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
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
        java.lang.Class<?> wildcardClass17 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, (long) (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
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
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
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
            int int22 = bufferedReadChannel3.read(byteBuf20, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
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
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
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
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
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
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
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
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
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
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf18, 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
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
            int int25 = bufferedReadChannel3.read(byteBuf23, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
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
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf5, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
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
            int int22 = bufferedReadChannel2.read(byteBuf19, (long) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
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
            int int23 = bufferedReadChannel2.read(byteBuf20, (long) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
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
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
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
            int int17 = bufferedReadChannel2.read(byteBuf15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
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
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedReadChannel2.read(byteBuf9, 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
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
            int int19 = bufferedReadChannel3.read(byteBuf17, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
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
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
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
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        java.lang.Class<?> wildcardClass18 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
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
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
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
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
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
            int int15 = bufferedReadChannel2.read(byteBuf13, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
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
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
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
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 1L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
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
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
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
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
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
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel2.read(byteBuf16, (long) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
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
            int int19 = bufferedReadChannel3.read(byteBuf16, (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
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
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
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
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
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
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
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
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel2.read(byteBuf15, 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
            int int13 = bufferedReadChannel3.read(byteBuf11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
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
            int int15 = bufferedReadChannel2.read(byteBuf12, (long) (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
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
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf19, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
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
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf13, (long) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
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
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
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
        java.lang.Class<?> wildcardClass17 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
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
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedReadChannel3.read(byteBuf16, (long) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
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
            int int13 = bufferedReadChannel2.read(byteBuf10, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
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
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
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
            int int18 = bufferedReadChannel2.read(byteBuf16, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
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
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
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
            int int13 = bufferedReadChannel2.read(byteBuf11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
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
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
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
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
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
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
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
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
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
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
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
            int int21 = bufferedReadChannel3.read(byteBuf19, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
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
            int int16 = bufferedReadChannel2.read(byteBuf13, (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
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
        java.lang.Class<?> wildcardClass13 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
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
            int int16 = bufferedReadChannel2.read(byteBuf14, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
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
        java.lang.Class<?> wildcardClass19 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
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
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
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
            int int17 = bufferedReadChannel2.read(byteBuf15, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel2.read(byteBuf7, (long) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
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
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
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
            int int14 = bufferedReadChannel2.read(byteBuf12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
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
            int int11 = bufferedReadChannel2.read(byteBuf9, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
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
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf7, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf14, (long) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
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
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
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
            int int19 = bufferedReadChannel3.read(byteBuf17, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
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
        java.lang.Class<?> wildcardClass15 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
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
            int int15 = bufferedReadChannel3.read(byteBuf13, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
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
            int int12 = bufferedReadChannel2.read(byteBuf9, (long) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
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
            int int17 = bufferedReadChannel2.read(byteBuf14, 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
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
        java.lang.Class<?> wildcardClass16 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
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
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, (long) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
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
            int int11 = bufferedReadChannel2.read(byteBuf8, (long) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
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
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
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
            int int17 = bufferedReadChannel3.read(byteBuf15, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
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
        io.netty.buffer.ByteBuf byteBuf21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedReadChannel3.read(byteBuf21, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
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
            int int16 = bufferedReadChannel3.read(byteBuf13, 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
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
        java.lang.Class<?> wildcardClass14 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf8, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, (long) (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
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
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf11, (long) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
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
            int int18 = bufferedReadChannel3.read(byteBuf16, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
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
        java.lang.Class<?> wildcardClass20 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
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
            int int21 = bufferedReadChannel2.read(byteBuf18, (long) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
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
        java.lang.Class<?> wildcardClass18 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
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
            int int14 = bufferedReadChannel3.read(byteBuf12, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
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
            int int20 = bufferedReadChannel3.read(byteBuf18, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
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
            int int21 = bufferedReadChannel3.read(byteBuf18, (long) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
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
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf17, (long) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf7, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
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
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedReadChannel3.read(byteBuf19, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
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
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedReadChannel2.read(byteBuf12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
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
            int int13 = bufferedReadChannel3.read(byteBuf10, (long) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
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
            int int16 = bufferedReadChannel3.read(byteBuf14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
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
            int int13 = bufferedReadChannel3.read(byteBuf11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
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
            int int14 = bufferedReadChannel3.read(byteBuf11, (long) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
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
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedReadChannel3.read(byteBuf18, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
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
            int int10 = bufferedReadChannel2.read(byteBuf8, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
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
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel3.read(byteBuf13, (long) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
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
            int int15 = bufferedReadChannel3.read(byteBuf12, (long) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
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
            int int14 = bufferedReadChannel2.read(byteBuf11, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
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
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedReadChannel2.read(byteBuf14, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedReadChannel3.read(byteBuf15, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
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
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedReadChannel3.read(byteBuf15, (long) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
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
            int int22 = bufferedReadChannel3.read(byteBuf19, (long) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
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
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
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
            int int13 = bufferedReadChannel2.read(byteBuf10, (long) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
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
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

