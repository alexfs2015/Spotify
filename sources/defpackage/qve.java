package defpackage;

/* renamed from: qve reason: default package */
public final class qve implements vua<qvd> {
    private final wlc<qsr> a;
    private final wlc<ioo> b;
    private final wlc<qxq> c;
    private final wlc<ims> d;

    private qve(wlc<qsr> wlc, wlc<ioo> wlc2, wlc<qxq> wlc3, wlc<ims> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qve a(wlc<qsr> wlc, wlc<ioo> wlc2, wlc<qxq> wlc3, wlc<ims> wlc4) {
        return new qve(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qvd((qsr) this.a.get(), (ioo) this.b.get(), (qxq) this.c.get(), (ims) this.d.get());
    }
}
