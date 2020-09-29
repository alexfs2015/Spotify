package defpackage;

/* renamed from: mwi reason: default package */
public final class mwi implements vua<mwh> {
    private final wlc<gup> a;
    private final wlc<gur> b;
    private final wlc<mwg> c;
    private final wlc<gum> d;

    private mwi(wlc<gup> wlc, wlc<gur> wlc2, wlc<mwg> wlc3, wlc<gum> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mwi a(wlc<gup> wlc, wlc<gur> wlc2, wlc<mwg> wlc3, wlc<gum> wlc4) {
        return new mwi(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mwh((gup) this.a.get(), (gur) this.b.get(), (mwg) this.c.get(), (gum) this.d.get());
    }
}
