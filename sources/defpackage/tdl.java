package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tdl reason: default package */
public final class tdl implements a<PlayerTrack> {
    public tep a;
    public final urn b;
    private boolean c;

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

    public tdl(urn urn) {
        this.b = urn;
    }

    private static boolean a(PlayerTrack playerTrack) {
        return PlayerTrackUtil.isAd(playerTrack) || InterruptionUtil.isInterruptionUri(playerTrack.uri());
    }

    private void a(boolean z) {
        this.c = z;
        if (z) {
            this.a.b();
        } else {
            this.a.c();
        }
    }
}
