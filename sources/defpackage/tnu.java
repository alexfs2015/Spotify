package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tnu reason: default package */
public final class tnu implements a<PlayerTrack> {
    public toz a;
    public final vcs b;
    private boolean c;

    public tnu(vcs vcs) {
        this.b = vcs;
    }

    private void a(boolean z) {
        this.c = z;
        if (z) {
            this.a.b();
        } else {
            this.a.c();
        }
    }

    private static boolean a(PlayerTrack playerTrack) {
        return PlayerTrackUtil.isAd(playerTrack) || InterruptionUtil.isInterruptionUri(playerTrack.uri());
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (!a(playerTrack) || this.c) {
            if (!a(playerTrack) && this.c) {
                a(false);
            }
            return;
        }
        a(true);
    }
}
