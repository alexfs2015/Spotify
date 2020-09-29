package defpackage;

/* renamed from: qud reason: default package */
public final class qud implements vua<quc> {
    private final wlc<qsr> a;
    private final wlc<ioc> b;
    private final wlc<qxq> c;
    private final wlc<jpb> d;

    private qud(wlc<qsr> wlc, wlc<ioc> wlc2, wlc<qxq> wlc3, wlc<jpb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qud a(wlc<qsr> wlc, wlc<ioc> wlc2, wlc<qxq> wlc3, wlc<jpb> wlc4) {
        return new qud(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new quc((qsr) this.a.get(), (ioc) this.b.get(), (qxq) this.c.get(), (jpb) this.d.get());
    }
}
