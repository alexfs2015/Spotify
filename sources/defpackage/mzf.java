package defpackage;

/* renamed from: mzf reason: default package */
public final class mzf implements vua<mze> {
    private final wlc<hbj> a;
    private final wlc<gxz> b;

    private mzf(wlc<hbj> wlc, wlc<gxz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mzf a(wlc<hbj> wlc, wlc<gxz> wlc2) {
        return new mzf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mze((hbj) this.a.get(), (gxz) this.b.get());
    }
}
