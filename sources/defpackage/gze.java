package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gze reason: default package */
final class gze {
    static PlayerTrack[] a(gzq[] gzqArr) {
        if (gzqArr == null) {
            return null;
        }
        PlayerTrack[] playerTrackArr = new PlayerTrack[gzqArr.length];
        for (int i = 0; i < gzqArr.length; i++) {
            playerTrackArr[i] = a(gzqArr[i]);
        }
        return playerTrackArr;
    }

    private static PlayerTrack a(gzq gzq) {
        String str = "";
        return PlayerTrack.create(gzq.string("uri", str), gzq.string("uid", str), gzq.string("album_uri"), gzq.string("artist_uri"), gzq.string("provider"), gzc.a(gzq.bundle("metadata")));
    }

    static gzq[] a(PlayerTrack[] playerTrackArr) {
        if (playerTrackArr == null) {
            return null;
        }
        gzq[] gzqArr = new gzq[playerTrackArr.length];
        for (int i = 0; i < playerTrackArr.length; i++) {
            gzqArr[i] = a(playerTrackArr[i]);
        }
        return gzqArr;
    }

    private static gzq a(PlayerTrack playerTrack) {
        String str = "uid";
        a a = HubsImmutableComponentBundle.builder().a("uri", playerTrack.uri()).a(str, playerTrack.uid());
        String str2 = "album_uri";
        a a2 = a.a(str2, (String) playerTrack.metadata().get(str2));
        String str3 = "artist_uri";
        return a2.a(str3, (String) playerTrack.metadata().get(str3)).a("provider", playerTrack.provider()).a("metadata", gzc.a(playerTrack.metadata())).a();
    }
}
