package defpackage;

import java.util.Random;

/* renamed from: hfv reason: default package */
public final class hfv implements vua<hfu> {
    private final wlc<hft> a;
    private final wlc<jrp> b;
    private final wlc<Random> c;

    private hfv(wlc<hft> wlc, wlc<jrp> wlc2, wlc<Random> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hfv a(wlc<hft> wlc, wlc<jrp> wlc2, wlc<Random> wlc3) {
        return new hfv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hfu((hft) this.a.get(), (jrp) this.b.get(), (Random) this.c.get());
    }
}
