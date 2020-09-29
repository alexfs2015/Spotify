package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

public interface RxQueueManagerModule {

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ObjectMapper provideObjectMapper(rwl rwl) {
            return rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }

        public static gmm<PlayerQueue> providePlayerQueueRxTypedResolver(gmn gmn) {
            return gmn.a(PlayerQueue.class);
        }
    }

    public interface Bindings {
        QueueManager bindQueueManager(RxQueueManager rxQueueManager);
    }
}
