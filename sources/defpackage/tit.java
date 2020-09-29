package defpackage;

/* renamed from: tit reason: default package */
public final class tit implements vua<tis> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;
    private final wlc<snx> c;

    private tit(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<snx> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tit a(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<snx> wlc3) {
        return new tit(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tis((fpt) this.a.get(), (rgz) this.b.get(), (snx) this.c.get());
    }
}
