package defpackage;

/* renamed from: mgr reason: default package */
public final class mgr implements vua<mgq> {
    private final wlc<mhr> a;
    private final wlc<mid> b;
    private final wlc<mif> c;

    private mgr(wlc<mhr> wlc, wlc<mid> wlc2, wlc<mif> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mgr a(wlc<mhr> wlc, wlc<mid> wlc2, wlc<mif> wlc3) {
        return new mgr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mgq((mhr) this.a.get(), (mid) this.b.get(), (mif) this.c.get());
    }
}
