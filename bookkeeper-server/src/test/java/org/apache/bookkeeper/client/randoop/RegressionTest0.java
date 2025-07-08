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
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.EnsemblePlacementPolicy ensemblePlacementPolicy1 = null;
        org.apache.bookkeeper.discover.RegistrationClient registrationClient2 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl5 = new org.apache.bookkeeper.client.BookieWatcherImpl(clientConfiguration0, ensemblePlacementPolicy1, registrationClient2, bookieAddressResolver3, statsLogger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.conf.ClientConfiguration.getBookieQuarantineTimeSeconds()\" because \"conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass2 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList7 = bookieWatcherImpl0.newEnsemble((int) ' ', (int) (byte) -1, (int) (byte) 0, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass4 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        java.lang.Class<?> wildcardClass3 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList7 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList7, bookieIdArray6);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId13 = bookieWatcherImpl0.replaceBookie((int) (short) 0, (int) ' ', 0, strMap5, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList7, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (short) 0, 1, (int) (byte) -1, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList7 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList7, bookieIdArray6);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId13 = bookieWatcherImpl0.replaceBookie((int) (short) 0, (int) 'a', 0, strMap5, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList7, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.lang.Class<?> wildcardClass1 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass2 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        java.util.Map<java.lang.String, byte[]> strMap6 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray7 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList8 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList8, bookieIdArray7);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet12, bookieIdArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId14 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (short) 0, (-1), strMap6, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList8, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bookieIdArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass5 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookieAddressResolver4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, 0, (int) '4', strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.util.Map<java.lang.String, byte[]> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList5 = bookieWatcherImpl0.newEnsemble(1, (int) (byte) 1, 0, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble(10, (int) (short) -1, (int) '#', strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList7 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) (short) 0, 10, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) ' ', (int) (byte) 1, 0, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (byte) 1, 0, 0, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble(0, 100, (int) (byte) 0, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) '4', 10, 10, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie(100, (int) (short) 0, (int) (short) 0, strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (short) 1, (int) (byte) -1, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble((int) (short) 100, (int) (short) 0, (int) (byte) 100, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.util.Map<java.lang.String, byte[]> strMap4 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray5 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList6 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList6, bookieIdArray5);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId12 = bookieWatcherImpl0.replaceBookie((int) (byte) -1, 10, (int) (short) 1, strMap4, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList6, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) (short) 0, 1, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble((int) (short) 0, (-1), 1, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) (short) 100, 0, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie(100, (int) (byte) 10, (int) (short) 10, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (byte) 100, (int) (byte) 100, (int) (short) 100, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie(100, (int) (byte) -1, (int) (byte) 10, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) (short) 1, (int) (byte) 10, (int) (byte) 1, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.util.Map<java.lang.String, byte[]> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList5 = bookieWatcherImpl0.newEnsemble((int) (short) 10, (-1), 100, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (short) 1, 1, (int) (byte) -1, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass4 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble(10, (int) (byte) 100, (int) '#', strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass3 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) 'a', 0, 0, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) '4', (int) (byte) 100, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie(100, (int) (byte) 10, (int) ' ', strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) (short) 100, (int) 'a', strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList12 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList12, bookieIdArray11);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) (short) 1, (int) (byte) 100, (int) (short) 100, strMap10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList12, (int) (short) 0, bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (short) 10, (int) '4', strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie((int) (byte) -1, (int) (byte) -1, (-1), strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble(10, (int) (byte) -1, 10, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookieAddressResolver4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookieAddressResolver3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble(0, (int) '#', (int) ' ', strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId14 = bookieWatcherImpl0.replaceBookie(0, 1, 10, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (-1), bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList11 = bookieWatcherImpl0.newEnsemble((-1), (int) (short) 100, (int) (byte) 100, strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass13 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) '4', (int) '#', (int) (byte) 1, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (short) 100, 100, 0, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (-1), (int) (short) 0, strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) 'a', (int) (byte) 0, (int) (short) 0, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (byte) 10, (int) '#', strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass8 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId18 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (byte) -1, 100, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, 0, bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        java.lang.Class<?> wildcardClass4 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (short) 0, (int) (byte) 0, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) (short) 0, (int) (short) 1, (int) (byte) 100, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) '#', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookieAddressResolver7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList11 = bookieWatcherImpl0.newEnsemble(10, 0, 0, strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, 10, (int) (short) 0, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (short) 100, 1, strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookieAddressResolver9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookieAddressResolver8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList12 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList12, bookieIdArray11);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet16, bookieIdArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId18 = bookieWatcherImpl0.replaceBookie((int) ' ', 0, 1, strMap10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList12, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass4 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie((int) (byte) 1, 0, (int) 'a', strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) 'a', (int) (byte) -1, 0, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) '4', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) '4', (int) (short) 100, (int) (byte) 1, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList12 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList12, bookieIdArray11);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet16, bookieIdArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId18 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) '4', (int) (byte) 10, strMap10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList12, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) '#', (int) '4', strMap11, bookieIdList12, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.get(int)\" because \"existingBookies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (byte) 1, 0, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble(0, (int) (byte) 10, (int) (short) -1, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (-1), (int) (short) 0, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass14 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) (short) -1, (int) (short) 1, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.lang.Class<?> wildcardClass5 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, 100, (int) (byte) -1, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble(0, (int) (byte) 0, (int) (short) 0, strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble(0, (int) (short) 10, (int) (byte) -1, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie(0, (int) (short) 100, 1, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble((int) 'a', (int) 'a', 100, strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (short) 0, 1, (int) (short) 10, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (byte) 10, (int) (short) 1, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble((-1), (int) (short) 0, 1, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie(1, (int) (byte) 100, (int) '4', strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) '4', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList7 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList7, bookieIdArray6);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId11 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, 0, (int) (byte) 0, strMap5, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList7, (int) (byte) 1, bookieIdSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie(0, (int) (byte) 0, (int) '4', strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.lang.Class<?> wildcardClass5 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, 0, (int) (short) 1, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass6 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble((int) (short) 1, (int) (byte) 1, 100, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList11 = bookieWatcherImpl0.newEnsemble(0, (int) ' ', (int) (short) 100, strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList11 = bookieWatcherImpl0.newEnsemble((int) (short) -1, 0, 0, strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie(0, (int) (short) -1, 10, strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble(100, (int) (short) 100, (int) (byte) 0, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (short) 10, (int) ' ', (int) (short) 1, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie(0, (int) (short) -1, 10, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, 100, (int) (byte) -1, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (byte) 100, (int) (byte) 100, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie(10, (int) (short) 0, (int) 'a', strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) '#', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) 'a', 10, (int) (byte) 10, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble((int) 'a', (int) (short) 10, 0, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, (int) ' ', (-1), strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie(0, (int) (short) 100, (int) '4', strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (-1), (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (short) -1, (int) ' ', strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (int) (byte) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble((int) (short) 10, 10, (int) (byte) 10, strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie(0, (int) '4', (int) '4', strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (int) (byte) 1, (int) ' ', strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.util.Map<java.lang.String, byte[]> strMap4 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray5 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList6 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList6, bookieIdArray5);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId12 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (-1), (int) (short) -1, strMap4, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList6, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) ' ', (int) ' ', strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) ' ', 10, (-1), strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble(10, (int) (byte) 100, (int) (byte) 10, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList7 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList7, bookieIdArray6);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId13 = bookieWatcherImpl0.replaceBookie((int) ' ', 0, 0, strMap5, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList7, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (-1), (int) (byte) 10, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList18 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) 'a', (int) 'a', strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (byte) 100, 0, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie(1, (int) (byte) 0, 0, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) (byte) -1, (int) (byte) 100, strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) (byte) 0, 0, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (short) 0, (int) (byte) 0, strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList20 = bookieWatcherImpl0.newEnsemble((int) (short) 1, (-1), (int) 'a', strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (byte) 100, (int) (short) 1, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, (-1), (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble(0, (int) ' ', 0, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((-1), (int) ' ', (int) '4', strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) ' ', 0, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (short) -1, (int) (short) 0, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) 'a', 0, (int) (short) 100, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (short) 10, 100, (int) (short) 1, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie(0, 1, (int) ' ', strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie(10, (int) (short) 10, (int) ' ', strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass13 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) (short) 10, (int) (short) 1, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, 100, 0, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) 'a', (int) '4', (int) (short) 10, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (byte) -1, (int) (byte) -1, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (short) 10, 0, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (short) -1, (int) (short) 1, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (short) 1, 1, (-1), strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) ' ', (int) ' ', strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass5 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, 100, 0, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) '#', 100, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (short) 100, (int) (short) 1, (int) ' ', strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass6 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass15 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, 0, (int) (byte) 10, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) '4', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie(1, (int) (byte) 10, (int) '#', strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookieAddressResolver9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble((int) (short) 0, (int) (short) 1, 0, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble(100, (int) (short) -1, (-1), strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookieAddressResolver8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie(1, 100, (int) (byte) 1, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) (byte) 1, 0, (int) (byte) 1, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId14 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (byte) 10, (int) '4', strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, 0, bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass14 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) (short) 1, 10, strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) (short) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (-1), (int) (short) 1, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) 'a', 0, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) '#', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (short) 10, 0, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass6 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) (short) 0, (int) (byte) 10, (int) ' ', strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) (short) -1, (-1), strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (short) 0, (int) 'a', (int) (byte) 1, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) 'a', 1, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble(0, (-1), 0, strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) (byte) 10, (int) (byte) 1, strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass15 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (short) 10, (int) (short) 100, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray8 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList9 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList9, bookieIdArray8);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (short) 1, (int) (byte) 1, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) '4', (int) '#', strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList12 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList12, bookieIdArray11);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet16, bookieIdArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId18 = bookieWatcherImpl0.replaceBookie(100, (int) (short) 1, (int) (byte) 10, strMap10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList12, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookieAddressResolver5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (short) 1, (int) (short) 1, 0, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) '#', 0, (int) (short) 10, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (short) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap17 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList19 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList19, bookieIdArray18);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) '4', (int) (byte) 0, (int) (byte) 100, strMap17, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList19, (int) (byte) 0, bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) (short) 0, (int) '4', strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList10 = bookieWatcherImpl0.newEnsemble(1, 100, (int) (short) -1, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) (short) -1, 10, (int) (short) 0, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (int) (short) 0, (int) ' ', strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) (short) 10, 1, strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) (byte) -1, 1, (int) 'a', strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie((int) (short) 1, 1, (int) (byte) 0, strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (short) 10, (-1), strMap14, bookieIdList15, (int) (byte) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.get(int)\" because \"existingBookies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (short) 1, (int) (short) 0, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId17 = bookieWatcherImpl0.replaceBookie(10, (int) (short) 1, (int) (byte) 10, strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, (int) (short) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie(1, (int) '#', (int) (byte) 0, strMap14, bookieIdList15, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.get(int)\" because \"existingBookies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList6 = bookieWatcherImpl0.newEnsemble((int) ' ', 10, (int) (short) 0, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble(0, 0, 0, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie((int) (byte) 1, (-1), (-1), strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.util.Map<java.lang.String, byte[]> strMap10 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList12 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList12, bookieIdArray11);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet16, bookieIdArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId18 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (short) 0, 0, strMap10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList12, (int) (byte) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList9 = bookieWatcherImpl0.newEnsemble((int) '#', (-1), (int) 'a', strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass16 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble(100, 100, (int) (byte) 1, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        java.util.Map<java.lang.String, byte[]> strMap4 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray5 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList6 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList6, bookieIdArray5);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId12 = bookieWatcherImpl0.replaceBookie((int) (short) 100, (int) (short) 10, (int) '#', strMap4, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList6, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap8 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList10 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet14, bookieIdArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId16 = bookieWatcherImpl0.replaceBookie((int) (byte) 1, (int) (short) -1, (int) '4', strMap8, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList10, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (int) (byte) 0, (int) (byte) -1, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((int) (short) 100, (-1), (int) (short) 1, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble(0, (int) (byte) 1, (int) ' ', strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookieAddressResolver9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        java.lang.Class<?> wildcardClass8 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap17 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList19 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet23 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet23, bookieIdArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId25 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (byte) -1, (int) (byte) 0, strMap17, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList19, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble((-1), (int) (byte) 1, (int) (byte) -1, strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList15 = bookieWatcherImpl0.newEnsemble((-1), (int) '#', (int) ' ', strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList15 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (short) 1, (int) (short) 100, strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        java.util.Map<java.lang.String, byte[]> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList8 = bookieWatcherImpl0.newEnsemble((int) '#', 1, (int) 'a', strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }
}

