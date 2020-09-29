package defpackage;

/* renamed from: ttc reason: default package */
public final class ttc implements vua<ttb> {
    private final wlc<kxs> a;
    private final wlc<tvw> b;
    private final wlc<ttp> c;
    private final wlc<tto> d;

    private ttc(wlc<kxs> wlc, wlc<tvw> wlc2, wlc<ttp> wlc3, wlc<tto> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ttc a(wlc<kxs> wlc, wlc<tvw> wlc2, wlc<ttp> wlc3, wlc<tto> wlc4) {
        return new ttc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ttb((kxs) this.a.get(), (tvw) this.b.get(), (ttp) this.c.get(), vtz.b(this.d));
    }
}
