package defpackage;

import android.app.Activity;

/* renamed from: jnb reason: default package */
public final class jnb implements vua<jna> {
    private final wlc<jmb> a;
    private final wlc<Activity> b;
    private final wlc<jsz> c;
    private final wlc<jyj> d;
    private final wlc<jyl> e;

    private jnb(wlc<jmb> wlc, wlc<Activity> wlc2, wlc<jsz> wlc3, wlc<jyj> wlc4, wlc<jyl> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static jnb a(wlc<jmb> wlc, wlc<Activity> wlc2, wlc<jsz> wlc3, wlc<jyj> wlc4, wlc<jyl> wlc5) {
        jnb jnb = new jnb(wlc, wlc2, wlc3, wlc4, wlc5);
        return jnb;
    }

    public final /* synthetic */ Object get() {
        jna jna = new jna((jmb) this.a.get(), (Activity) this.b.get(), (jsz) this.c.get(), (jyj) this.d.get(), (jyl) this.e.get());
        return jna;
    }
}
