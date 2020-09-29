package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: jfz reason: default package */
public final class jfz implements PlayerStateObserver {
    private Optional<Boolean> a = Optional.e();
    private String b = "";
    private final jfy c;

    public jfz(jfy jfy) {
        this.c = (jfy) fay.a(jfy);
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        fay.a(playerState);
        String a2 = jvs.a(playerState, "is_advertisement");
        String a3 = jvs.a(playerState, "ad_id");
        String a4 = jvs.a(playerState, "duration");
        Optional<Boolean> b2 = Optional.b(Boolean.valueOf(Boolean.parseBoolean(a2)));
        boolean z = b2.b() && ((Boolean) b2.c()).booleanValue() && !this.b.equals(a3);
        if (!this.a.equals(b2)) {
            this.a = b2;
            if (((Boolean) b2.c()).booleanValue()) {
                Logger.b("Ads product ad %s is Playing", a3);
                this.b = a3;
                this.c.a(a3, a4);
                return;
            }
            Logger.b("Ads product ad is not Playing ", new Object[0]);
            this.c.a();
            return;
        }
        if (z) {
            this.a = b2;
            this.b = a3;
            this.c.b(a3, a4);
        }
    }
}
