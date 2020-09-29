package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: hbt reason: default package */
public final class hbt {
    public static PlayerContext a(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        PlayerContext playerContext = new PlayerContext(hcj.string("uri", ""), hbv.a(hcj.bundle("metadata")), hbw.a(hcj.bundle("restrictions")), hbu.a(hcj.bundleArray("pages")), hbu.a(hcj.bundleArray("fallback_pages")), hcj.string("url"));
        return playerContext;
    }
}
