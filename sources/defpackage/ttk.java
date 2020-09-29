package defpackage;

import com.spotify.music.ondemandsharing.flags.AbOnDemandSharing;

/* renamed from: ttk reason: default package */
public final class ttk {
    private final fqn a;
    private final rqb b;
    private final sye c;

    public ttk(fqn fqn, rqb rqb, sye sye) {
        this.a = fqn;
        this.b = rqb;
        this.c = sye;
    }

    private AbOnDemandSharing b() {
        return (AbOnDemandSharing) this.a.a(ttj.a);
    }

    public final boolean a() {
        if (this.b.a(this.a) && b() == AbOnDemandSharing.ENABLED) {
            sye sye = this.c;
            if (!sye.a(this.a)) {
                return true;
            }
        }
        return false;
    }
}
