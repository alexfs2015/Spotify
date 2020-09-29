package defpackage;

import android.app.Activity;

/* renamed from: jdz reason: default package */
public final class jdz implements vua<jdy> {
    private final wlc<jfr> a;
    private final wlc<jed> b;
    private final wlc<jry> c;
    private final wlc<Activity> d;

    private jdz(wlc<jfr> wlc, wlc<jed> wlc2, wlc<jry> wlc3, wlc<Activity> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static jdz a(wlc<jfr> wlc, wlc<jed> wlc2, wlc<jry> wlc3, wlc<Activity> wlc4) {
        return new jdz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new jdy((jfr) this.a.get(), (jed) this.b.get(), (jry) this.c.get(), (Activity) this.d.get());
    }
}
