package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tmy reason: default package */
public final class tmy {
    public static void a(PlayerTrack... playerTrackArr) {
        if (playerTrackArr != null) {
            for (PlayerTrack a : playerTrackArr) {
                Uri a2 = iyd.a(a);
                if (!Uri.EMPTY.equals(a2)) {
                    ((vhj) gih.a(vhj.class)).a().a(a2).i();
                }
            }
        }
    }
}
