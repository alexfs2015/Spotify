package defpackage;

import android.content.Context;

/* renamed from: szi reason: default package */
public final class szi implements vua<szh> {
    private final wlc<Context> a;
    private final wlc<sih> b;
    private final wlc<jmq> c;
    private final wlc<szl> d;
    private final wlc<szj> e;

    private szi(wlc<Context> wlc, wlc<sih> wlc2, wlc<jmq> wlc3, wlc<szl> wlc4, wlc<szj> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static szi a(wlc<Context> wlc, wlc<sih> wlc2, wlc<jmq> wlc3, wlc<szl> wlc4, wlc<szj> wlc5) {
        szi szi = new szi(wlc, wlc2, wlc3, wlc4, wlc5);
        return szi;
    }

    public final /* synthetic */ Object get() {
        szh szh = new szh((Context) this.a.get(), (sih) this.b.get(), (jmq) this.c.get(), vtz.b(this.d), vtz.b(this.e));
        return szh;
    }
}
