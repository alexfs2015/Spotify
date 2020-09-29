package defpackage;

import android.content.Context;

/* renamed from: tmn reason: default package */
public final class tmn implements vua<tmm> {
    private final wlc<Context> a;
    private final wlc<tmj> b;
    private final wlc<jmq> c;
    private final wlc<sih> d;

    private tmn(wlc<Context> wlc, wlc<tmj> wlc2, wlc<jmq> wlc3, wlc<sih> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tmn a(wlc<Context> wlc, wlc<tmj> wlc2, wlc<jmq> wlc3, wlc<sih> wlc4) {
        return new tmn(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tmm((Context) this.a.get(), (tmj) this.b.get(), (jmq) this.c.get(), (sih) this.d.get());
    }
}
