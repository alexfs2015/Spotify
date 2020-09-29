package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: svj reason: default package */
public final class svj implements srt {
    private final uoc a;
    private final fpt b;
    private final Context c;
    private final veu d;

    public svj(uoc uoc, fpt fpt, Context context, veu veu) {
        this.a = uoc;
        this.b = fpt;
        this.c = context;
        this.d = veu;
    }

    public final boolean a(PlayerState playerState) {
        boolean z;
        boolean z2;
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        if (!jtc.c(this.c)) {
            if (this.b.a(uob.a) == RolloutFlag.ENABLED) {
                boolean a2 = this.d.a();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                uoc uoc = this.a;
                if (uoa.a(uoc.b)) {
                    z2 = playerTrack.metadata().containsKey("storylines.id");
                } else {
                    z2 = uoc.a.a().containsEntity(playerTrack.uri());
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
