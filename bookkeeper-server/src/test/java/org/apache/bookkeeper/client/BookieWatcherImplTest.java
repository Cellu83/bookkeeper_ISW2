package org.apache.bookkeeper.client;

import org.apache.bookkeeper.conf.ClientConfiguration;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.discover.ZKRegistrationClient;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.StatsLogger;
import org.apache.bookkeeper.versioning.Versioned;
import org.apache.zookeeper.KeeperException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookieWatcherImplTest {

    private BookieWatcherImpl watcher;
    private ZKRegistrationClient mockRegClient;

    @BeforeEach
    public void setup() {
        ClientConfiguration conf = mock(ClientConfiguration.class);
        EnsemblePlacementPolicy policy = mock(EnsemblePlacementPolicy.class);
        mockRegClient = mock(ZKRegistrationClient.class);  // <-- qui uso direttamente il campo
        BookieAddressResolver resolver = mock(BookieAddressResolver.class);
        StatsLogger statsLogger = mock(StatsLogger.class);

        watcher = new BookieWatcherImpl(conf, policy, mockRegClient, resolver, statsLogger);
    }

    @Test
    public void testGetAllBookies_emptyCluster() throws Exception {
        Set<BookieId> emptySet = new HashSet<>();
        Versioned<Set<BookieId>> versionedSet = new Versioned<>(emptySet, null);
        when(mockRegClient.getAllBookies()).thenReturn(CompletableFuture.completedFuture(versionedSet));
        Set<BookieId> bookies = watcher.getAllBookies();
        assertNotNull(bookies);
        assertTrue(bookies.isEmpty());
    }

    @Test
    public void testGetAllBookies_nonEmptyCluster() throws Exception {
        Set<BookieId> mockBookies = new HashSet<>();
        mockBookies.add(BookieId.parse("bookie1:3181"));
        mockBookies.add(BookieId.parse("bookie2:3181"));

        Versioned<Set<BookieId>> versionedSet = new Versioned<>(mockBookies, null);
        when(mockRegClient.getAllBookies()).thenReturn(CompletableFuture.completedFuture(versionedSet));
        Set<BookieId> result = watcher.getAllBookies();

        assertEquals(2, result.size());
        assertTrue(result.contains(BookieId.parse("bookie1:3181")));
        assertTrue(result.contains(BookieId.parse("bookie2:3181")));
    }

    @Test
    public void testHandleBookieFailure_withBackoff() {
        // Simula un fallimento e verifica che venga gestito secondo una logica di retry/backoff.
        // Sarà necessario arricchire questo test quando i dettagli del comportamento saranno più chiari.
    }

    @Test
    public void testRemoveReadOnlyBookie() throws Exception {
        BookieId readOnly = BookieId.parse("readonly:3181");

        // Inserisci nel set simulando lo stato interno
        Set<BookieId> readOnlySet = new HashSet<>();
        readOnlySet.add(readOnly);
        Versioned<Set<BookieId>> versionedSet = new Versioned<>(readOnlySet, null);

        CompletableFuture<Versioned<Set<BookieId>>> future = CompletableFuture.completedFuture(versionedSet);
        when(mockRegClient.getReadOnlyBookies()).thenReturn(future);

        Set<BookieId> before = watcher.getReadOnlyBookies();
        assertTrue(before.contains(readOnly));
    }

    @Test
    public void testHandleZKError() throws Exception {
        CompletableFuture<Versioned<Set<BookieId>>> future = new CompletableFuture<>();
        future.completeExceptionally(KeeperException.create(KeeperException.Code.CONNECTIONLOSS));
        when(mockRegClient.getAllBookies()).thenReturn(future);

        BKException.MetaStoreException exception = assertThrows(
                BKException.MetaStoreException.class,
                () -> watcher.getAllBookies()
        );
        assertTrue(exception.getCause() instanceof KeeperException.ConnectionLossException);
    }

}
