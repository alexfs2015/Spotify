package defpackage;

/* renamed from: qug reason: default package */
public final class qug implements vua<quf> {
    private final wlc<qsr> a;
    private final wlc<ioi> b;
    private final wlc<qxq> c;

    private qug(wlc<qsr> wlc, wlc<ioi> wlc2, wlc<qxq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qug a(wlc<qsr> wlc, wlc<ioi> wlc2, wlc<qxq> wlc3) {
        return new qug(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new quf(this.a, this.b, this.c);
    }
}
