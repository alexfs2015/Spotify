package defpackage;

/* renamed from: ngo reason: default package */
public final class ngo implements vua<Boolean> {
    private final wlc<fpt> a;
    private final wlc<kvb> b;

    private ngo(wlc<fpt> wlc, wlc<kvb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngo a(wlc<fpt> wlc, wlc<kvb> wlc2) {
        return new ngo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        kvb kvb = (kvb) this.b.get();
        return Boolean.valueOf(kvb.c((fpt) this.a.get()));
    }
}
