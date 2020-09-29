package defpackage;

import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;

/* renamed from: rse reason: default package */
public final class rse implements wig<HomePromotionPlayButtonLogger> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<sso> c;
    private final wzi<jtz> d;

    private rse(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<sso> wzi3, wzi<jtz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rse a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<sso> wzi3, wzi<jtz> wzi4) {
        return new rse(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new HomePromotionPlayButtonLogger((jlr) this.a.get(), (uqm) this.b.get(), (sso) this.c.get(), (jtz) this.d.get());
    }
}
