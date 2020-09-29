package defpackage;

/* renamed from: nip reason: default package */
public final class nip implements vua<nio> {
    private final wlc<Boolean> a;
    private final wlc<rfe> b;
    private final wlc<ndr> c;
    private final wlc<ndn> d;

    private nip(wlc<Boolean> wlc, wlc<rfe> wlc2, wlc<ndr> wlc3, wlc<ndn> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static nip a(wlc<Boolean> wlc, wlc<rfe> wlc2, wlc<ndr> wlc3, wlc<ndn> wlc4) {
        return new nip(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new nio(((Boolean) this.a.get()).booleanValue(), this.b, (ndr) this.c.get(), (ndn) this.d.get());
    }
}
