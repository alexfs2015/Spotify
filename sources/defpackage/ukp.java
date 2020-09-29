package defpackage;

import com.spotify.music.shuffleplayconfusion.flags.AbShufflePlayConfusion;

/* renamed from: ukp reason: default package */
public final class ukp {
    private final fqn a;
    private final sye b;

    public ukp(fqn fqn, sye sye) {
        this.a = fqn;
        this.b = sye;
    }

    public final boolean a() {
        if (b() != AbShufflePlayConfusion.CONTROL) {
            sye sye = this.b;
            if (!sye.a(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final AbShufflePlayConfusion b() {
        return (AbShufflePlayConfusion) this.a.a(ukr.a);
    }
}
