package defpackage;

import android.content.Context;

/* renamed from: mev reason: default package */
public final class mev implements vua<meu> {
    private final wlc<Context> a;
    private final wlc<String> b;
    private final wlc<mew> c;
    private final wlc<mey> d;

    private mev(wlc<Context> wlc, wlc<String> wlc2, wlc<mew> wlc3, wlc<mey> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mev a(wlc<Context> wlc, wlc<String> wlc2, wlc<mew> wlc3, wlc<mey> wlc4) {
        return new mev(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new meu((Context) this.a.get(), (String) this.b.get(), (mew) this.c.get(), (mey) this.d.get());
    }
}
