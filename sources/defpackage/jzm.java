package defpackage;

import android.os.Looper;

/* renamed from: jzm reason: default package */
public final class jzm implements vua<kbp> {
    private final wlc<Looper> a;
    private final wlc<jyh> b;
    private final wlc<kaz> c;
    private final wlc<rnf> d;
    private final wlc<jjf> e;

    private jzm(wlc<Looper> wlc, wlc<jyh> wlc2, wlc<kaz> wlc3, wlc<rnf> wlc4, wlc<jjf> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static jzm a(wlc<Looper> wlc, wlc<jyh> wlc2, wlc<kaz> wlc3, wlc<rnf> wlc4, wlc<jjf> wlc5) {
        jzm jzm = new jzm(wlc, wlc2, wlc3, wlc4, wlc5);
        return jzm;
    }

    public final /* synthetic */ Object get() {
        kbp kbp = new kbp((Looper) this.a.get(), (jyh) this.b.get(), (kaz) this.c.get(), (rnf) this.d.get(), (jjf) this.e.get());
        return (kbp) vuf.a(kbp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
