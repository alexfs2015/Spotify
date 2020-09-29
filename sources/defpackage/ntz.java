package defpackage;

/* renamed from: ntz reason: default package */
public final class ntz implements vua<nty> {
    private final wlc<ood> a;
    private final wlc<a<ooa>> b;
    private final wlc<oob> c;

    private ntz(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ntz a(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3) {
        return new ntz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nty(this.a, this.b, this.c);
    }
}
