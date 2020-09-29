package defpackage;

import android.os.Looper;

/* renamed from: jyw reason: default package */
public final class jyw implements vua<kbp> {
    private final wlc<Looper> a;
    private final wlc<jyh> b;
    private final wlc<kaz> c;
    private final wlc<rnf> d;
    private final wlc<jjf> e;

    private jyw(wlc<Looper> wlc, wlc<jyh> wlc2, wlc<kaz> wlc3, wlc<rnf> wlc4, wlc<jjf> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static jyw a(wlc<Looper> wlc, wlc<jyh> wlc2, wlc<kaz> wlc3, wlc<rnf> wlc4, wlc<jjf> wlc5) {
        jyw jyw = new jyw(wlc, wlc2, wlc3, wlc4, wlc5);
        return jyw;
    }

    public final /* synthetic */ Object get() {
        kbp kbp = new kbp((Looper) this.a.get(), (jyh) this.b.get(), (kaz) this.c.get(), (rnf) this.d.get(), (jjf) this.e.get());
        return (kbp) vuf.a(kbp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
