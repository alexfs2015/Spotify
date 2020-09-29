package defpackage;

/* renamed from: nji reason: default package */
public final class nji implements vua<njh> {
    private final wlc<kxz> a;
    private final wlc<njj> b;
    private final wlc<nja> c;
    private final wlc<heq<gzz>> d;
    private final wlc<njd> e;

    private nji(wlc<kxz> wlc, wlc<njj> wlc2, wlc<nja> wlc3, wlc<heq<gzz>> wlc4, wlc<njd> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static nji a(wlc<kxz> wlc, wlc<njj> wlc2, wlc<nja> wlc3, wlc<heq<gzz>> wlc4, wlc<njd> wlc5) {
        nji nji = new nji(wlc, wlc2, wlc3, wlc4, wlc5);
        return nji;
    }

    public final /* synthetic */ Object get() {
        njh njh = new njh((kxz) this.a.get(), (njj) this.b.get(), (nja) this.c.get(), (heq) this.d.get(), (njd) this.e.get());
        return njh;
    }
}
