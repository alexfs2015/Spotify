package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: hzg reason: default package */
public final class hzg {
    private final hze a;
    private final hzm b;
    private final hzp c;
    private final hzi d;
    private boolean e;
    private boolean f;

    public hzg(hze hze, hzm hzm, hzp hzp, hzi hzi) {
        this.a = hze;
        this.b = hzm;
        this.c = hzp;
        this.d = hzi;
    }

    public final void a(lbr lbr) {
        Logger.b("Trying to Remove AdsNavigationListener", new Object[0]);
        if (this.e) {
            Logger.b("Removing AdsNavigationListener", new Object[0]);
            this.e = false;
            this.a.a();
            lbr.b((lbq) this.a);
            lbr.b((lbq) this.b);
            lbr.b((lbq) this.c);
        }
    }

    public final void a(boolean z, fqn fqn, lbr lbr) {
        if (fqn != null && z) {
            Logger.b("Trying to Add AdsNavigationListener", new Object[0]);
            Boolean bool = (Boolean) fqn.a(hyn.a);
            Boolean valueOf = Boolean.valueOf(fqn.a(hyn.l) == RolloutFlag.ENABLED);
            if (bool.booleanValue() && !this.e) {
                Logger.b("Adding AdsNavigationListener", new Object[0]);
                this.e = true;
                lbr.a((lbq) this.a);
                lbr.a((lbq) this.b);
                lbr.a((lbq) this.c);
            } else if (!bool.booleanValue() && this.e) {
                a(lbr);
            }
            if (valueOf.booleanValue() && !this.f) {
                Logger.b("[Marquee] - Adding MarqueeNavigationListener", new Object[0]);
                this.f = true;
                lbr.a((lbq) this.d);
            } else if (this.f && !valueOf.booleanValue() && this.f) {
                Logger.b("[Marquee] - removing MarqueeNavigationListener", new Object[0]);
                this.f = false;
                lbr.b((lbq) this.d);
            }
        }
    }
}
