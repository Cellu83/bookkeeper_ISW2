import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet1 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet1 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet1 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet5 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getBookies();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver8 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet9 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver5 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet6 = bookieWatcherImpl0.getAllBookies();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver1 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet4 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver4 = bookieWatcherImpl0.getBookieAddressResolver();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver6 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver7 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = bookieWatcherImpl0.getReadOnlyBookies();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.apache.bookkeeper.client.BookieWatcherImpl bookieWatcherImpl0 = new org.apache.bookkeeper.client.BookieWatcherImpl();
        bookieWatcherImpl0.releaseAllQuarantinedBookies();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver2 = bookieWatcherImpl0.getBookieAddressResolver();
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver3 = bookieWatcherImpl0.getBookieAddressResolver();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookieWatcherImpl0.initialBlockingBookieRead();
    }
}

