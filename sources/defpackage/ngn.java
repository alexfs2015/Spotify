package defpackage;

/* renamed from: ngn reason: default package */
public final class ngn implements vua<ngm> {
    private final wlc<uzi> a;
    private final wlc<rfe> b;
    private final wlc<ndn> c;
    private final wlc<ndr> d;
    private final wlc<Boolean> e;
    private final wlc<Boolean> f;

    private ngn(wlc<uzi> wlc, wlc<rfe> wlc2, wlc<ndn> wlc3, wlc<ndr> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ngn a(wlc<uzi> wlc, wlc<rfe> wlc2, wlc<ndn> wlc3, wlc<ndr> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        ngn ngn = new ngn(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ngn;
    }

    public final /* synthetic */ Object get() {
        ngm ngm = new ngm((uzi) this.a.get(), this.b, (ndn) this.c.get(), (ndr) this.d.get(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return ngm;
    }
}
