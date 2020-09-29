package defpackage;

import android.app.Activity;

/* renamed from: nvz reason: default package */
public final class nvz implements vua<nvy> {
    private final wlc<kda> a;
    private final wlc<kdl> b;
    private final wlc<Activity> c;
    private final wlc<nut> d;
    private final wlc<spi> e;
    private final wlc<jfg> f;

    private nvz(wlc<kda> wlc, wlc<kdl> wlc2, wlc<Activity> wlc3, wlc<nut> wlc4, wlc<spi> wlc5, wlc<jfg> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static nvz a(wlc<kda> wlc, wlc<kdl> wlc2, wlc<Activity> wlc3, wlc<nut> wlc4, wlc<spi> wlc5, wlc<jfg> wlc6) {
        nvz nvz = new nvz(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return nvz;
    }

    public static nvy a(kda kda, kdl kdl, Activity activity, nut nut, spi spi, jfg jfg) {
        nvy nvy = new nvy(kda, kdl, activity, nut, spi, jfg);
        return nvy;
    }

    public final /* synthetic */ Object get() {
        nvy nvy = new nvy((kda) this.a.get(), (kdl) this.b.get(), (Activity) this.c.get(), (nut) this.d.get(), (spi) this.e.get(), (jfg) this.f.get());
        return nvy;
    }
}
