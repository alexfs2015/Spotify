package defpackage;

/* renamed from: qva reason: default package */
public final class qva implements vua<quz> {
    private final wlc<qsr> a;
    private final wlc<uxn> b;
    private final wlc<qxq> c;
    private final wlc<jpb> d;

    private qva(wlc<qsr> wlc, wlc<uxn> wlc2, wlc<qxq> wlc3, wlc<jpb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qva a(wlc<qsr> wlc, wlc<uxn> wlc2, wlc<qxq> wlc3, wlc<jpb> wlc4) {
        return new qva(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new quz(this.a, this.b, this.c, this.d);
    }
}
