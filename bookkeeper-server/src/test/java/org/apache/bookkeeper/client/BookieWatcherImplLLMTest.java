package org.apache.bookkeeper.client;

import org.apache.bookkeeper.conf.ClientConfiguration;
import org.apache.bookkeeper.discover.RegistrationClient;
import org.apache.bookkeeper.discover.ZKRegistrationClient;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.StatsLogger;
import org.apache.bookkeeper.versioning.Versioned;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookieWatcherImplLLMTest {

    EnsemblePlacementPolicy placementPolicy = mock(EnsemblePlacementPolicy.class);
    RegistrationClient registrationClient = mock(RegistrationClient.class);
    BookieAddressResolver resolver = mock(BookieAddressResolver.class);
    StatsLogger statsLogger = mock(StatsLogger.class);
    BookieWatcherImpl watcher;

    @BeforeEach
    void setUp() {
        ClientConfiguration conf = new ClientConfiguration();
        watcher = new BookieWatcherImpl(
            conf,
            placementPolicy,
            registrationClient,
            resolver,
            statsLogger
        );
    }

    // Test isBookieUnavailable(bookieId)
    @Test
    void isBookieUnavailable_newlyAddedBookie() {
        // Given: un libro nuovo non in quarantena
        BookieId bookieId = BookieId.parse("new-bookie");

        // When: chiedo se il libro è disponibile
        boolean available = watcher.isBookieUnavailable(bookieId);

        // Then: il libro è disponibile
        assertFalse(available);
    }

    @Test
    void isBookieUnavailable_alreadyInQuarantine() {
        // Given: un libro già in quarantena
        BookieId bookieId = BookieId.parse("already-in-quarantena");
        watcher.quarantineBookie(bookieId);

        // When: chiedo se il libro è disponibile
        boolean available = watcher.isBookieUnavailable(bookieId);

        // Then: il libro non è disponibile
        assertTrue(available);
    }

    @Test
    void isBookieUnavailable_bookieNotInQuarantena() {
        // Given: un libro non in quarantena
        BookieId bookieId = BookieId.parse("bookie-3");

        // When: chiedo se il libro è disponibile
        boolean available = watcher.isBookieUnavailable(bookieId);

        // Then: il libro è disponibile
        assertFalse(available);
    }
}