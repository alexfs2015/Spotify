package defpackage;

import com.spotify.music.trendingsearch.TrendingSearchLogger;

/* renamed from: vac reason: default package */
public final class vac implements wig<TrendingSearchLogger> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<sso> c;
    private final wzi<jtz> d;
    private final wzi<roi> e;

    private vac(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<sso> wzi3, wzi<jtz> wzi4, wzi<roi> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static vac a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<sso> wzi3, wzi<jtz> wzi4, wzi<roi> wzi5) {
        vac vac = new vac(wzi, wzi2, wzi3, wzi4, wzi5);
        return vac;
    }

    public final /* synthetic */ Object get() {
        TrendingSearchLogger trendingSearchLogger = new TrendingSearchLogger((jlr) this.a.get(), (uqm) this.b.get(), (sso) this.c.get(), (jtz) this.d.get(), (roi) this.e.get());
        return trendingSearchLogger;
    }
}
