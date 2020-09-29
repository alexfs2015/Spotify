package defpackage;

import android.app.Activity;

/* renamed from: lup reason: default package */
public final class lup implements vua<luo> {
    private final wlc<Activity> a;
    private final wlc<ukj> b;
    private final wlc<umf> c;
    private final wlc<fpt> d;

    private lup(wlc<Activity> wlc, wlc<ukj> wlc2, wlc<umf> wlc3, wlc<fpt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lup a(wlc<Activity> wlc, wlc<ukj> wlc2, wlc<umf> wlc3, wlc<fpt> wlc4) {
        return new lup(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new luo((Activity) this.a.get(), (ukj) this.b.get(), (umf) this.c.get(), (fpt) this.d.get());
    }
}
