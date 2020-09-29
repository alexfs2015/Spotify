package defpackage;

/* renamed from: ieh reason: default package */
public final class ieh implements vua<ieg> {
    private final wlc<iep> a;
    private final wlc<ies> b;
    private final wlc<tcn> c;
    private final wlc<hzb> d;

    private ieh(wlc<iep> wlc, wlc<ies> wlc2, wlc<tcn> wlc3, wlc<hzb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ieh a(wlc<iep> wlc, wlc<ies> wlc2, wlc<tcn> wlc3, wlc<hzb> wlc4) {
        return new ieh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ieg(this.a, this.b, this.c, this.d);
    }
}
