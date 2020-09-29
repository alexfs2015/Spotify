package defpackage;

/* renamed from: hgp reason: default package */
public final class hgp implements vua<hgo> {
    private final wlc<kpn> a;
    private final wlc<huw> b;
    private final wlc<hva> c;
    private final wlc<hlh> d;

    private hgp(wlc<kpn> wlc, wlc<huw> wlc2, wlc<hva> wlc3, wlc<hlh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hgp a(wlc<kpn> wlc, wlc<huw> wlc2, wlc<hva> wlc3, wlc<hlh> wlc4) {
        return new hgp(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hgo((kpn) this.a.get(), (huw) this.b.get(), (hva) this.c.get(), (hlh) this.d.get());
    }
}
