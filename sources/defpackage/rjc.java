package defpackage;

import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;

/* renamed from: rjc reason: default package */
public final class rjc implements vua<HomePromotionPlayButtonLogger> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<sih> c;
    private final wlc<jrp> d;

    private rjc(wlc<jjf> wlc, wlc<udr> wlc2, wlc<sih> wlc3, wlc<jrp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rjc a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<sih> wlc3, wlc<jrp> wlc4) {
        return new rjc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new HomePromotionPlayButtonLogger((jjf) this.a.get(), (udr) this.b.get(), (sih) this.c.get(), (jrp) this.d.get());
    }
}
