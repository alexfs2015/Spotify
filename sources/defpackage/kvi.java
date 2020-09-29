package defpackage;

/* renamed from: kvi reason: default package */
public final class kvi implements vua<kvh> {
    private final wlc<kvu> a;
    private final wlc<kwa> b;
    private final wlc<kvb> c;

    private kvi(wlc<kvu> wlc, wlc<kwa> wlc2, wlc<kvb> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kvi a(wlc<kvu> wlc, wlc<kwa> wlc2, wlc<kvb> wlc3) {
        return new kvi(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kvh((kvu) this.a.get(), (kwa) this.b.get(), (kvb) this.c.get());
    }
}
