package defpackage;

import android.os.Build.VERSION;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kug reason: default package */
public final class kug {
    private final fpt a;
    private final kuq b;
    private final kum c;

    public kug(fpt fpt, kum kum, kuq kuq) {
        this.a = fpt;
        this.b = kuq;
        this.c = kum;
    }

    public final boolean a(PlayerTrack playerTrack) {
        if (playerTrack.metadata().containsKey("canvas.id") || playerTrack.metadata().containsKey("canvas.url")) {
            kum kum = this.c;
            fpt fpt = this.a;
            if (VERSION.SDK_INT >= 23 && !jtc.c(kum.b) && fpt.a(kul.a) == RolloutFlag.ENABLED && !((Boolean) fpt.a(kul.b)).booleanValue() && kum.a.a() && !((Boolean) fay.a(kum.c.a.get())).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
