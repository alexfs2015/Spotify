package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: gza reason: default package */
public final class gza {
    public static PlayerContext a(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        PlayerContext playerContext = new PlayerContext(gzq.string("uri", ""), gzc.a(gzq.bundle("metadata")), gzd.a(gzq.bundle("restrictions")), gzb.a(gzq.bundleArray("pages")), gzb.a(gzq.bundleArray("fallback_pages")), gzq.string("url"));
        return playerContext;
    }
}
