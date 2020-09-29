package defpackage;

/* renamed from: mxu reason: default package */
public final class mxu implements vua<mxt> {
    private final wlc<mxv> a;
    private final wlc<rgz> b;
    private final wlc<twu> c;
    private final wlc<fpt> d;

    private mxu(wlc<mxv> wlc, wlc<rgz> wlc2, wlc<twu> wlc3, wlc<fpt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mxu a(wlc<mxv> wlc, wlc<rgz> wlc2, wlc<twu> wlc3, wlc<fpt> wlc4) {
        return new mxu(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mxt((mxv) this.a.get(), (rgz) this.b.get(), (twu) this.c.get(), (fpt) this.d.get());
    }
}
