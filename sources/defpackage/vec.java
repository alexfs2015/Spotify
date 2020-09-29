package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;

/* renamed from: vec reason: default package */
public final class vec {
    public static boolean a(PlayerTrack playerTrack) {
        return Boolean.parseBoolean((String) playerTrack.metadata().get(Metadata.MEDIA_LIVE));
    }
}
