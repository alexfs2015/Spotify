package com.spotify.mobile.android.service.plugininterfaces;

import android.content.Intent;
import java.util.List;

public interface SpotifyServiceIntentProcessor {

    /* renamed from: com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Result $default$a(SpotifyServiceIntentProcessor _this, boolean z, Intent intent, a aVar) {
            return _this.a(z, intent);
        }
    }

    public enum Result {
        PROCESSED,
        NOT_PROCESSED,
        IGNORABLE
    }

    public interface a {
        public static final a a = $$Lambda$SpotifyServiceIntentProcessor$a$z1Oglx0_SMz06WflwuQ7EpFJSiA.INSTANCE;

        /* renamed from: com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* synthetic */ void a(List list) {
            }
        }

        void onError(List<String> list);
    }

    Result a(boolean z, Intent intent);

    Result a(boolean z, Intent intent, a aVar);
}
