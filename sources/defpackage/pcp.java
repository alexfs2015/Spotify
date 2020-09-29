package defpackage;

import android.content.Context;

/* renamed from: pcp reason: default package */
public final class pcp implements vua<pco> {
    private final wlc<Context> a;
    private final wlc<fyz> b;
    private final wlc<uhs> c;
    private final wlc<a> d;

    private pcp(wlc<Context> wlc, wlc<fyz> wlc2, wlc<uhs> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pcp a(wlc<Context> wlc, wlc<fyz> wlc2, wlc<uhs> wlc3, wlc<a> wlc4) {
        return new pcp(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pco((Context) this.a.get(), (fyz) this.b.get(), (uhs) this.c.get(), vtz.b(this.d));
    }
}
