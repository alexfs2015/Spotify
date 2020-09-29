package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

public interface RxQueueManagerModule {

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gky<PlayerQueue> providePlayerQueueRxTypedResolver(gkz gkz) {
            return gkz.a(PlayerQueue.class);
        }

        public static ObjectMapper provideObjectMapper(rnf rnf) {
            return rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }
    }

    public interface Bindings {
        QueueManager bindQueueManager(RxQueueManager rxQueueManager);
    }
}
