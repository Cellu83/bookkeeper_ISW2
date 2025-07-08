import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver21 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertNull(bookieAddressResolver21);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap20 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId28 = bookieWatcherImpl0.replaceBookie(100, (int) '4', 10, strMap20, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList16 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList16, bookieIdArray15);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) '#', (int) (short) 100, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
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
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass15 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        java.lang.Class<?> wildcardClass7 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, 10, (int) (short) 100, strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
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
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) ' ', (int) '#', strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (-1), bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
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
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList17 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) '#', (int) (byte) -1, strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId18);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNull(bookieAddressResolver19);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList23 = bookieWatcherImpl0.newEnsemble((int) '4', (int) (short) 1, (-1), strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass10 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble(0, (int) (short) 1, (int) (short) 10, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = bookieAddressResolver12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        java.util.Map<java.lang.String, byte[]> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList25 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) (short) 10, (int) '4', strMap24);
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList21 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray24 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet25 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet25, bookieIdArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId27 = bookieWatcherImpl0.replaceBookie((int) ' ', (int) '#', 100, strMap19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList21, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.apache.bookkeeper.net.BookieId bookieId20 = null;
        boolean boolean21 = bookieWatcherImpl0.isBookieUnavailable(bookieId20);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass23 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, (int) (short) 1, (-1), strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble(10, (int) (byte) 1, (int) (short) 10, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId15);
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList24 = bookieWatcherImpl0.newEnsemble((int) 'a', (-1), (int) ' ', strMap23);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookieAddressResolver13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver20 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList25 = bookieWatcherImpl0.newEnsemble(10, (int) ' ', (int) 'a', strMap24);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertNull(bookieAddressResolver20);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId16);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass13 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
            org.apache.bookkeeper.net.BookieId bookieId15 = bookieWatcherImpl0.replaceBookie((int) (byte) 100, (int) (byte) 10, (int) (byte) -1, strMap7, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList9, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) (short) 0, (int) (short) 0, 10, strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList7 = bookieWatcherImpl0.newEnsemble((int) (byte) 100, (int) ' ', 1, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (byte) -1, 0, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
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
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId22 = null;
        boolean boolean23 = bookieWatcherImpl0.isBookieUnavailable(bookieId22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        java.lang.Class<?> wildcardClass20 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList20 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList20, bookieIdArray19);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet24, bookieIdArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId26 = bookieWatcherImpl0.replaceBookie(1, (int) (short) 100, (int) (byte) 10, strMap18, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList20, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.lang.Class<?> wildcardClass20 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
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
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) '#', 0, (-1), strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (byte) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass8 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
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
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.Class<?> wildcardClass12 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList20 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList20, bookieIdArray19);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet24, bookieIdArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId26 = bookieWatcherImpl0.replaceBookie(0, (int) (short) -1, 100, strMap18, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList20, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet24);
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
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId20 = null;
        boolean boolean21 = bookieWatcherImpl0.isBookieUnavailable(bookieId20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = bookieAddressResolver19.getClass();
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNull(bookieAddressResolver19);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) 'a', (int) (byte) 0, (int) (byte) -1, strMap18);
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
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
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
            org.apache.bookkeeper.net.BookieId bookieId21 = bookieWatcherImpl0.replaceBookie((int) (short) -1, 1, (int) ' ', strMap13, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList15, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver20 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap24 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId30 = bookieWatcherImpl0.replaceBookie((int) (short) -1, 0, (int) 'a', strMap24, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (int) '#', bookieIdSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(bookieAddressResolver20);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
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
            org.apache.bookkeeper.net.BookieId bookieId20 = bookieWatcherImpl0.replaceBookie((int) (byte) 0, (int) (byte) -1, 0, strMap12, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble(100, (int) (byte) 1, (int) 'a', strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        java.lang.Class<?> wildcardClass17 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
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
            org.apache.bookkeeper.net.BookieId bookieId25 = bookieWatcherImpl0.replaceBookie(100, 0, (int) ' ', strMap17, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList19, (int) (byte) 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
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
            org.apache.bookkeeper.net.BookieId bookieId22 = bookieWatcherImpl0.replaceBookie((int) (short) 1, (int) (byte) -1, (int) (byte) 100, strMap14, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList16, 1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap16 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet22, bookieIdArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId24 = bookieWatcherImpl0.replaceBookie((int) (byte) -1, 100, 100, strMap16, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
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
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) (byte) 0, (int) (byte) 1, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList21 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray24 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet25 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet25, bookieIdArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId27 = bookieWatcherImpl0.replaceBookie((int) (short) -1, (int) 'a', 100, strMap19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList21, (-1), (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet25);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList20 = bookieWatcherImpl0.newEnsemble((int) (short) 100, 10, (int) (byte) 1, strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver18);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble(10, (int) (short) 10, (int) 'a', strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.lang.Class<?> wildcardClass9 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.apache.bookkeeper.net.BookieId bookieId20 = null;
        boolean boolean21 = bookieWatcherImpl0.isBookieUnavailable(bookieId20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (short) 10, 1, 0, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, 0, 0, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver21 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
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
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(bookieAddressResolver21);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie(1, 0, (int) (short) -1, strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) ' ', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        java.lang.Class<?> wildcardClass14 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        java.lang.Class<?> wildcardClass14 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        java.lang.Class<?> wildcardClass17 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = bookieAddressResolver15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        java.util.Map<java.lang.String, byte[]> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList22 = bookieWatcherImpl0.newEnsemble((int) (byte) 10, (int) (short) 1, (int) '4', strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) (short) 10, 10, 100, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookieAddressResolver13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
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
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble(0, (int) 'a', (int) ' ', strMap18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap22 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray27 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet28 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet28, bookieIdArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId30 = bookieWatcherImpl0.replaceBookie(0, 100, (int) ' ', strMap22, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet28);
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((-1), (int) (short) -1, 0, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
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
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
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
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (short) -1, (int) (byte) -1, (int) (byte) 0, strMap11);
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
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookieAddressResolver11.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId20 = null;
        boolean boolean21 = bookieWatcherImpl0.isBookieUnavailable(bookieId20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
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
            org.apache.bookkeeper.net.BookieId bookieId23 = bookieWatcherImpl0.replaceBookie((int) (short) -1, 100, (int) (short) 100, strMap15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.util.Map<java.lang.String, byte[]> strMap17 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList19 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet23 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet23, bookieIdArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId25 = bookieWatcherImpl0.replaceBookie((int) (short) 1, (int) (byte) 1, (int) (byte) -1, strMap17, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList19, (int) '4', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (byte) -1, (int) (short) 100, 0, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId21 = null;
        boolean boolean22 = bookieWatcherImpl0.isBookieUnavailable(bookieId21);
        java.util.Map<java.lang.String, byte[]> strMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList27 = bookieWatcherImpl0.newEnsemble((int) (byte) 0, (int) 'a', (int) (byte) 0, strMap26);
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNull(bookieAddressResolver18);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        java.util.Map<java.lang.String, byte[]> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList12 = bookieWatcherImpl0.newEnsemble((int) (short) 100, 0, (int) (short) -1, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.net.BookieId bookieId10 = null;
        boolean boolean11 = bookieWatcherImpl0.isBookieUnavailable(bookieId10);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver20 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
        org.junit.Assert.assertNull(bookieAddressResolver20);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        java.util.Map<java.lang.String, byte[]> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList14 = bookieWatcherImpl0.newEnsemble((int) '#', (-1), (int) (byte) -1, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.apache.bookkeeper.net.BookieId bookieId17 = null;
        boolean boolean18 = bookieWatcherImpl0.isBookieUnavailable(bookieId17);
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = bookieWatcherImpl0.getBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.net.BookieId bookieId18 = null;
        boolean boolean19 = bookieWatcherImpl0.isBookieUnavailable(bookieId18);
        java.util.Map<java.lang.String, byte[]> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList24 = bookieWatcherImpl0.newEnsemble(10, 0, 10, strMap23);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList18 = bookieWatcherImpl0.newEnsemble(0, (int) ' ', (int) (byte) -1, strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble(100, (int) (short) 10, (int) (byte) -1, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList20 = bookieWatcherImpl0.newEnsemble(0, (int) (short) 100, (int) ' ', strMap19);
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
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap22 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray27 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet28 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet28, bookieIdArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId30 = bookieWatcherImpl0.replaceBookie((int) (byte) 0, (int) (short) 10, (int) (short) 100, strMap22, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24, (int) (short) 100, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
        java.util.Map<java.lang.String, byte[]> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble(0, 0, (int) 'a', strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        java.util.Map<java.lang.String, byte[]> strMap20 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId28 = bookieWatcherImpl0.replaceBookie((int) (short) 10, (int) (byte) 10, (int) (byte) 100, strMap20, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22, (-1), (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap21 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList23 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList23, bookieIdArray22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId29 = bookieWatcherImpl0.replaceBookie((int) (byte) 10, (int) ' ', (-1), strMap21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList23, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27);
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
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList13 = bookieWatcherImpl0.newEnsemble((int) (short) 1, (int) 'a', 10, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        java.util.Map<java.lang.String, byte[]> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList16 = bookieWatcherImpl0.newEnsemble((-1), (int) (short) 1, 0, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
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
        org.junit.Assert.assertNull(bookieAddressResolver11);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getReadOnlyBookies();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        java.lang.Class<?> wildcardClass16 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId4 = null;
        boolean boolean5 = bookieWatcherImpl0.isBookieUnavailable(bookieId4);
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        java.util.Map<java.lang.String, byte[]> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList19 = bookieWatcherImpl0.newEnsemble((int) (byte) 1, (int) (byte) 0, 100, strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver9 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.initialBlockingBookieRead();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.watchWritableBookies(org.apache.bookkeeper.discover.RegistrationClient$RegistrationListener)\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        java.lang.Class<?> wildcardClass11 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId6 = null;
        boolean boolean7 = bookieWatcherImpl0.isBookieUnavailable(bookieId6);
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver19 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertNull(bookieAddressResolver19);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertNull(bookieAddressResolver16);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.net.BookieId bookieId7 = null;
        boolean boolean8 = bookieWatcherImpl0.isBookieUnavailable(bookieId7);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookieWatcherImpl0.quarantineBookie(bookieId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver6);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver21 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(bookieAddressResolver21);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
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
            org.apache.bookkeeper.net.BookieId bookieId19 = bookieWatcherImpl0.replaceBookie((int) 'a', (int) (byte) 10, (int) ' ', strMap11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13, (int) (byte) -1, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookieAddressResolver1);
        org.junit.Assert.assertNull(bookieAddressResolver2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        java.lang.Class<?> wildcardClass13 = bookieWatcherImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap19 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList21 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray24 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet25 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet25, bookieIdArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId27 = bookieWatcherImpl0.replaceBookie(100, (int) '#', (int) '#', strMap19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList21, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.net.BookieId bookieId3 = null;
        boolean boolean4 = bookieWatcherImpl0.isBookieUnavailable(bookieId3);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = bookieWatcherImpl0.getBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getWritableBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver18 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId19 = null;
        boolean boolean20 = bookieWatcherImpl0.isBookieUnavailable(bookieId19);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver21 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet22 = bookieWatcherImpl0.getAllBookies();
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
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNull(bookieAddressResolver15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(bookieAddressResolver18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(bookieAddressResolver21);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        java.util.Map<java.lang.String, byte[]> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList22 = bookieWatcherImpl0.newEnsemble((int) (short) 10, (int) 'a', 100, strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.client.EnsemblePlacementPolicy.newEnsemble(int, int, int, java.util.Map, java.util.Set)\" because \"this.placementPolicy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId2 = null;
        boolean boolean3 = bookieWatcherImpl0.isBookieUnavailable(bookieId2);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        boolean boolean6 = bookieWatcherImpl0.isBookieUnavailable(bookieId5);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId8 = null;
        boolean boolean9 = bookieWatcherImpl0.isBookieUnavailable(bookieId8);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId12 = null;
        boolean boolean13 = bookieWatcherImpl0.isBookieUnavailable(bookieId12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet14 = bookieWatcherImpl0.getAllBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getAllBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.net.BookieId bookieId1 = null;
        boolean boolean2 = bookieWatcherImpl0.isBookieUnavailable(bookieId1);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId9 = null;
        boolean boolean10 = bookieWatcherImpl0.isBookieUnavailable(bookieId9);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        org.apache.bookkeeper.net.BookieId bookieId15 = null;
        boolean boolean16 = bookieWatcherImpl0.isBookieUnavailable(bookieId15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertNull(bookieAddressResolver5);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        boolean boolean14 = bookieWatcherImpl0.isBookieUnavailable(bookieId13);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.net.BookieId bookieId16 = null;
        boolean boolean17 = bookieWatcherImpl0.isBookieUnavailable(bookieId16);
        java.util.Map<java.lang.String, byte[]> strMap21 = null;
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList22 = null;
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieId bookieId25 = bookieWatcherImpl0.replaceBookie(10, (int) '4', (int) (byte) -1, strMap21, bookieIdList22, (int) '4', bookieIdSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.get(int)\" because \"existingBookies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.apache.bookkeeper.net.BookieId bookieId11 = null;
        boolean boolean12 = bookieWatcherImpl0.isBookieUnavailable(bookieId11);
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver14 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver15 = bookieWatcherImpl0.getBookieAddressResolver();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bookieAddressResolver7);
        org.junit.Assert.assertNull(bookieAddressResolver8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertNull(bookieAddressResolver14);
        org.junit.Assert.assertNull(bookieAddressResolver15);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver12 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.net.BookieId bookieId14 = null;
        boolean boolean15 = bookieWatcherImpl0.isBookieUnavailable(bookieId14);
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver17 = bookieWatcherImpl0.getBookieAddressResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = bookieWatcherImpl0.getReadOnlyBookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.discover.RegistrationClient.getReadOnlyBookies()\" because \"this.registrationClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(bookieAddressResolver4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertNull(bookieAddressResolver12);
        org.junit.Assert.assertNull(bookieAddressResolver13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(bookieAddressResolver17);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver10 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver11 = bookieWatcherImpl0.getBookieAddressResolver();
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
        org.junit.Assert.assertNull(bookieAddressResolver3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookieAddressResolver9);
        org.junit.Assert.assertNull(bookieAddressResolver10);
        org.junit.Assert.assertNull(bookieAddressResolver11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

