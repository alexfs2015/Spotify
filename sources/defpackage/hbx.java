package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: hbx reason: default package */
final class hbx {
    private static PlayerTrack a(hcj hcj) {
        String str = "";
        return PlayerTrack.create(hcj.string("uri", str), hcj.string("uid", str), hcj.string("album_uri"), hcj.string("artist_uri"), hcj.string("provider"), hbv.a(hcj.bundle("metadata")));
    }

    private static hcj a(PlayerTrack playerTrack) {
        String str = "uid";
        a a = HubsImmutableComponentBundle.builder().a("uri", playerTrack.uri()).a(str, playerTrack.uid());
        String str2 = "album_uri";
        a a2 = a.a(str2, (String) playerTrack.metadata().get(str2));
        String str3 = "artist_uri";
        return a2.a(str3, (String) playerTrack.metadata().get(str3)).a("provider", playerTrack.provider()).a("metadata", hbv.a(playerTrack.metadata())).a();
    }

    static PlayerTrack[] a(hcj[] hcjArr) {
        if (hcjArr == null) {
            return null;
        }
        PlayerTrack[] playerTrackArr = new PlayerTrack[hcjArr.length];
        for (int i = 0; i < hcjArr.length; i++) {
            playerTrackArr[i] = a(hcjArr[i]);
        }
        return playerTrackArr;
    }

    static hcj[] a(PlayerTrack[] playerTrackArr) {
        if (playerTrackArr == null) {
            return null;
        }
        hcj[] hcjArr = new hcj[playerTrackArr.length];
        for (int i = 0; i < playerTrackArr.length; i++) {
            hcjArr[i] = a(playerTrackArr[i]);
        }
        return hcjArr;
    }
}
