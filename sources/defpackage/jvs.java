package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: jvs reason: default package */
public final class jvs {
    public static String a(PlayerState playerState, String str) {
        return a(playerState.track(), str);
    }

    public static String a(PlayerTrack playerTrack, String str) {
        String str2 = "";
        return playerTrack == null ? str2 : (String) jtc.a(playerTrack.metadata().get(str), str2);
    }
}
