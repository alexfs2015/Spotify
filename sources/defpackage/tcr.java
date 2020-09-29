package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tcr reason: default package */
public final class tcr {
    public static void a(PlayerTrack... playerTrackArr) {
        if (playerTrackArr != null) {
            for (PlayerTrack a : playerTrackArr) {
                Uri a2 = ivs.a(a);
                if (!Uri.EMPTY.equals(a2)) {
                    ((uvt) ggw.a(uvt.class)).a().a(a2).i();
                }
            }
        }
    }
}
