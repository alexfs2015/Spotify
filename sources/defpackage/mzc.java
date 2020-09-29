package defpackage;

/* renamed from: mzc reason: default package */
public final class mzc implements vua<mzb> {
    private final wlc<gup> a;
    private final wlc<gur> b;
    private final wlc<mzd> c;
    private final wlc<gum> d;

    private mzc(wlc<gup> wlc, wlc<gur> wlc2, wlc<mzd> wlc3, wlc<gum> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mzc a(wlc<gup> wlc, wlc<gur> wlc2, wlc<mzd> wlc3, wlc<gum> wlc4) {
        return new mzc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mzb((gup) this.a.get(), (gur) this.b.get(), (mzd) this.c.get(), (gum) this.d.get());
    }
}
