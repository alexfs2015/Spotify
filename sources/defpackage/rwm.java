package defpackage;

import android.app.Application;

/* renamed from: rwm reason: default package */
public final class rwm implements vua<glv> {
    private final wlc<jjf> a;
    private final wlc<Application> b;
    private final wlc<heg> c;
    private final wlc<gll> d;

    private rwm(wlc<jjf> wlc, wlc<Application> wlc2, wlc<heg> wlc3, wlc<gll> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rwm a(wlc<jjf> wlc, wlc<Application> wlc2, wlc<heg> wlc3, wlc<gll> wlc4) {
        return new rwm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        jjf jjf = (jjf) this.a.get();
        Application application = (Application) this.b.get();
        gll gll = (gll) this.d.get();
        rwo rwo = new rwo(vun.a(((heg) this.c.get()).b()));
        rwo.a((glu) gll);
        rwo.a((glu) new rwq(jjf));
        rwo.a((glu) new rwe(application.getApplicationContext()));
        return (glv) vuf.a(rwo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
