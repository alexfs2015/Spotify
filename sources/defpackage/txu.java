package defpackage;

import com.spotify.music.shuffleplayconfusion.flags.AbShufflePlayConfusion;

/* renamed from: txu reason: default package */
public final class txu {
    private final fpt a;
    private final snx b;

    public txu(fpt fpt, snx snx) {
        this.a = fpt;
        this.b = snx;
    }

    public final boolean a() {
        if (b() != AbShufflePlayConfusion.CONTROL) {
            snx snx = this.b;
            if (!snx.a(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final AbShufflePlayConfusion b() {
        return (AbShufflePlayConfusion) this.a.a(txw.a);
    }
}
