package defpackage;

/* renamed from: tjt reason: default package */
public final class tjt implements vua<tjs> {
    private final wlc<ood> a;
    private final wlc<a<ooa>> b;
    private final wlc<oob> c;
    private final wlc<tjh> d;

    private tjt(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3, wlc<tjh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tjt a(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3, wlc<tjh> wlc4) {
        return new tjt(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tjs(this.a, this.b, this.c, this.d);
    }
}
