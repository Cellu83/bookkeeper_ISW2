package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.nio.channels.FileChannel fileChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass9 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
            int int12 = bufferedReadChannel3.read(byteBuf9, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf6, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, false);
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, true);
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, true);
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass8 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10);
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        java.lang.Class<?> wildcardClass3 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100);
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10);
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, false);
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 10, false);
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
            int int11 = bufferedReadChannel3.read(byteBuf9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass4 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bufferedReadChannel2.read(byteBuf3, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass5 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf5, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100, false);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass7 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, false);
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, true);
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4');
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel2.read(byteBuf6, 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 100, false);
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel3.read(byteBuf4, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 0, false);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 1, false);
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 10, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, (long) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bufferedReadChannel3.read(byteBuf7, (long) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', false);
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a', true);
        bufferedReadChannel3.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 10, true);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedReadChannel3.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
            int int12 = bufferedReadChannel3.read(byteBuf10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ', false);
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf3, (long) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel2.read(byteBuf5, (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '4', false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, (long) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 100);
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bufferedReadChannel2.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) 'a');
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        bufferedReadChannel2.clear();
        java.lang.Class<?> wildcardClass6 = bufferedReadChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100);
        bufferedReadChannel2.clear();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel2.read(byteBuf4, (long) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (short) 1, true);
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedReadChannel3.read(byteBuf4, (long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 100, false);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedReadChannel3.read(byteBuf8, 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, 0, false);
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) ' ');
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 1, false);
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bufferedReadChannel3.read(byteBuf5, (long) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel2 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) (byte) 0);
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.nio.channels.FileChannel fileChannel0 = null;
        org.apache.bookkeeper.bookie.BufferedReadChannel bufferedReadChannel3 = new org.apache.bookkeeper.bookie.BufferedReadChannel(fileChannel0, (int) '#', true);
        bufferedReadChannel3.clear();
        bufferedReadChannel3.clear();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bufferedReadChannel3.read(byteBuf6, 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.isOpen()\" because \"this.fileChannel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

