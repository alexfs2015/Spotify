package defpackage;

/* renamed from: gyt reason: default package */
public final class gyt implements vua<gys> {
    private final wlc<gyo> a;
    private final wlc<gxz> b;
    private final wlc<gyj> c;

    private gyt(wlc<gyo> wlc, wlc<gxz> wlc2, wlc<gyj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gyt a(wlc<gyo> wlc, wlc<gxz> wlc2, wlc<gyj> wlc3) {
        return new gyt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gys((gyo) this.a.get(), (gxz) this.b.get(), (gyj) this.c.get());
    }
}
