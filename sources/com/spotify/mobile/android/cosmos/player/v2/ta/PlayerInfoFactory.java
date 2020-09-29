package com.spotify.mobile.android.cosmos.player.v2.ta;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public final class PlayerInfoFactory {
    private PlayerInfoFactory() {
    }

    public static jis createPlayerInfo(PlayerState playerState) {
        if (playerState == null) {
            return null;
        }
        jis jis = new jis();
        boolean z = true;
        boolean z2 = playerState.isPlaying() && !playerState.isPaused();
        jis.d = playerState.currentPlaybackPosition();
        jis.a = Boolean.valueOf(z2);
        String a = jvs.a(playerState, "is_advertisement");
        String a2 = jvs.a(playerState, "media.type");
        if (!z2 || !"true".equals(a)) {
            z = false;
        }
        jis.b = Boolean.valueOf(z);
        jis.c = Boolean.valueOf("video".equals(a2));
        return jis;
    }

    public static jit createTrackFromPlayerTrack(PlayerTrack playerTrack) {
        jit jit = new jit();
        if (playerTrack != null) {
            jit.b((String) playerTrack.metadata().get("title"));
            jit.a(playerTrack.uri());
            jit.c = (String) playerTrack.metadata().get("artist_uri");
            jit.d = (String) playerTrack.metadata().get("artist_name");
            jit.e = (String) playerTrack.metadata().get("album_uri");
            jit.f = (String) playerTrack.metadata().get("album_title");
            jit.g = Boolean.valueOf(Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection")));
        }
        return jit;
    }

    public static jir createContextFromPlayer(String str, String str2) {
        jir jir = new jir();
        jir.a(str);
        jir.b(str2);
        jir.c = "UNKNOWN";
        return jir;
    }

    public static jir createContextFromPlayerLinkType(String str, String str2, String str3) {
        jir jir = new jir();
        jir.a(str);
        jir.b(str2);
        jir.c = str3;
        return jir;
    }
}
