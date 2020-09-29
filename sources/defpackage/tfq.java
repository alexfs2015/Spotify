package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: tfq reason: default package */
public final class tfq implements tca {
    private final uzg a;
    private final fqn b;
    private final Context c;
    private final vrr d;

    public tfq(uzg uzg, fqn fqn, Context context, vrr vrr) {
        this.a = uzg;
        this.b = fqn;
        this.c = context;
        this.d = vrr;
    }

    public final boolean a(PlayerState playerState) {
        boolean z;
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        if (!jvi.c(this.c)) {
            if (this.b.a(uzf.a) == RolloutFlag.ENABLED) {
                boolean a2 = this.d.a();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                uzg uzg = this.a;
                if (uze.a(uzg.b) ? playerTrack.metadata().containsKey("storylines.id") : uzg.a.a().containsEntity(playerTrack.uri())) {
                    return true;
                }
            }
        }
        return false;
    }
}
