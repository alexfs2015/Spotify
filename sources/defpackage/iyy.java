package defpackage;

import android.content.Context;

/* renamed from: iyy reason: default package */
public final class iyy implements vua<iyx> {
    private final wlc<Context> a;
    private final wlc<b> b;
    private final wlc<a> c;
    private final wlc<jro> d;

    private iyy(wlc<Context> wlc, wlc<b> wlc2, wlc<a> wlc3, wlc<jro> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static iyy a(wlc<Context> wlc, wlc<b> wlc2, wlc<a> wlc3, wlc<jro> wlc4) {
        return new iyy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new iyx((Context) this.a.get(), (b) this.b.get(), (a) this.c.get(), (jro) this.d.get());
    }
}
