package defpackage;

/* renamed from: mgh reason: default package */
public final class mgh implements vua<mgg> {
    private final wlc<mhr> a;
    private final wlc<mid> b;
    private final wlc<mif> c;
    private final wlc<mia> d;

    private mgh(wlc<mhr> wlc, wlc<mid> wlc2, wlc<mif> wlc3, wlc<mia> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mgh a(wlc<mhr> wlc, wlc<mid> wlc2, wlc<mif> wlc3, wlc<mia> wlc4) {
        return new mgh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mgg((mhr) this.a.get(), (mid) this.b.get(), (mif) this.c.get(), (mia) this.d.get());
    }
}
