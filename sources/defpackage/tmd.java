package defpackage;

import android.content.Context;
import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: tmd reason: default package */
public final class tmd implements vua<tmc> {
    private final wlc<Context> a;
    private final wlc<jmf<ttu>> b;
    private final wlc<tvx> c;
    private final wlc<tme> d;
    private final wlc<ttd> e;
    private final wlc<twi> f;
    private final wlc<PlaySourceProvider> g;
    private final wlc<sih> h;

    private tmd(wlc<Context> wlc, wlc<jmf<ttu>> wlc2, wlc<tvx> wlc3, wlc<tme> wlc4, wlc<ttd> wlc5, wlc<twi> wlc6, wlc<PlaySourceProvider> wlc7, wlc<sih> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static tmd a(wlc<Context> wlc, wlc<jmf<ttu>> wlc2, wlc<tvx> wlc3, wlc<tme> wlc4, wlc<ttd> wlc5, wlc<twi> wlc6, wlc<PlaySourceProvider> wlc7, wlc<sih> wlc8) {
        tmd tmd = new tmd(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return tmd;
    }

    public final /* synthetic */ Object get() {
        tmc tmc = new tmc((Context) this.a.get(), (jmf) this.b.get(), (tvx) this.c.get(), (tme) this.d.get(), (ttd) this.e.get(), (twi) this.f.get(), (PlaySourceProvider) this.g.get(), (sih) this.h.get());
        return tmc;
    }
}
