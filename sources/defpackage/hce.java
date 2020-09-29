package defpackage;

import android.app.Activity;

/* renamed from: hce reason: default package */
public final class hce implements vua<hcd> {
    private final wlc<Activity> a;
    private final wlc<sih> b;
    private final wlc<fpt> c;
    private final wlc<Integer> d;
    private final wlc<jmq> e;

    private hce(wlc<Activity> wlc, wlc<sih> wlc2, wlc<fpt> wlc3, wlc<Integer> wlc4, wlc<jmq> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hce a(wlc<Activity> wlc, wlc<sih> wlc2, wlc<fpt> wlc3, wlc<Integer> wlc4, wlc<jmq> wlc5) {
        hce hce = new hce(wlc, wlc2, wlc3, wlc4, wlc5);
        return hce;
    }

    public final /* synthetic */ Object get() {
        hcd hcd = new hcd(this.a, this.b, this.c, this.d, this.e);
        return hcd;
    }
}
