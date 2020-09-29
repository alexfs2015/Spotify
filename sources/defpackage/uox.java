package defpackage;

import com.spotify.music.trendingsearch.TrendingSearchLogger;

/* renamed from: uox reason: default package */
public final class uox implements vua<TrendingSearchLogger> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<sih> c;
    private final wlc<jrp> d;
    private final wlc<rfg> e;

    private uox(wlc<jjf> wlc, wlc<udr> wlc2, wlc<sih> wlc3, wlc<jrp> wlc4, wlc<rfg> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static uox a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<sih> wlc3, wlc<jrp> wlc4, wlc<rfg> wlc5) {
        uox uox = new uox(wlc, wlc2, wlc3, wlc4, wlc5);
        return uox;
    }

    public final /* synthetic */ Object get() {
        TrendingSearchLogger trendingSearchLogger = new TrendingSearchLogger((jjf) this.a.get(), (udr) this.b.get(), (sih) this.c.get(), (jrp) this.d.get(), (rfg) this.e.get());
        return trendingSearchLogger;
    }
}
