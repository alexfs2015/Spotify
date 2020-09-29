package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: hwu reason: default package */
public final class hwu {
    private final hws a;
    private final hxa b;
    private final hxd c;
    private final hww d;
    private boolean e;
    private boolean f;

    public hwu(hws hws, hxa hxa, hxd hxd, hww hww) {
        this.a = hws;
        this.b = hxa;
        this.c = hxd;
        this.d = hww;
    }

    public final void a(boolean z, fpt fpt, kyi kyi) {
        if (fpt != null && z) {
            Logger.b("Trying to Add AdsNavigationListener", new Object[0]);
            Boolean bool = (Boolean) fpt.a(hwb.a);
            Boolean valueOf = Boolean.valueOf(fpt.a(hwb.l) == RolloutFlag.ENABLED);
            if (bool.booleanValue() && !this.e) {
                Logger.b("Adding AdsNavigationListener", new Object[0]);
                this.e = true;
                kyi.a((kyh) this.a);
                kyi.a((kyh) this.b);
                kyi.a((kyh) this.c);
            } else if (!bool.booleanValue() && this.e) {
                a(kyi);
            }
            if (valueOf.booleanValue() && !this.f) {
                Logger.b("[Marquee] - Adding MarqueeNavigationListener", new Object[0]);
                this.f = true;
                kyi.a((kyh) this.d);
            } else if (this.f && !valueOf.booleanValue() && this.f) {
                Logger.b("[Marquee] - removing MarqueeNavigationListener", new Object[0]);
                this.f = false;
                kyi.b((kyh) this.d);
            }
        }
    }

    public final void a(kyi kyi) {
        Logger.b("Trying to Remove AdsNavigationListener", new Object[0]);
        if (this.e) {
            Logger.b("Removing AdsNavigationListener", new Object[0]);
            this.e = false;
            this.a.a();
            kyi.b((kyh) this.a);
            kyi.b((kyh) this.b);
            kyi.b((kyh) this.c);
        }
    }
}
