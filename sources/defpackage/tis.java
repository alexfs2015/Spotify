package defpackage;

import com.spotify.music.ondemandsharing.flags.AbOnDemandSharing;

/* renamed from: tis reason: default package */
public final class tis {
    private final fpt a;
    private final rgz b;
    private final snx c;

    public tis(fpt fpt, rgz rgz, snx snx) {
        this.a = fpt;
        this.b = rgz;
        this.c = snx;
    }

    public final boolean a() {
        if (this.b.a(this.a) && b() == AbOnDemandSharing.ENABLED) {
            snx snx = this.c;
            if (!snx.a(this.a)) {
                return true;
            }
        }
        return false;
    }

    private AbOnDemandSharing b() {
        return (AbOnDemandSharing) this.a.a(tir.a);
    }
}
