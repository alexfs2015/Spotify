package defpackage;

import android.content.Context;
import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: twh reason: default package */
public final class twh implements vua<twg> {
    private final wlc<Context> a;
    private final wlc<tuc> b;
    private final wlc<Boolean> c;
    private final wlc<tvx> d;
    private final wlc<twc> e;
    private final wlc<tuf> f;
    private final wlc<twi> g;
    private final wlc<jmf<ttu>> h;
    private final wlc<tsw> i;
    private final wlc<ttd> j;
    private final wlc<tsv> k;
    private final wlc<tsu> l;
    private final wlc<PlaySourceProvider> m;
    private final wlc<sih> n;

    private twh(wlc<Context> wlc, wlc<tuc> wlc2, wlc<Boolean> wlc3, wlc<tvx> wlc4, wlc<twc> wlc5, wlc<tuf> wlc6, wlc<twi> wlc7, wlc<jmf<ttu>> wlc8, wlc<tsw> wlc9, wlc<ttd> wlc10, wlc<tsv> wlc11, wlc<tsu> wlc12, wlc<PlaySourceProvider> wlc13, wlc<sih> wlc14) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
        this.n = wlc14;
    }

    public static twh a(wlc<Context> wlc, wlc<tuc> wlc2, wlc<Boolean> wlc3, wlc<tvx> wlc4, wlc<twc> wlc5, wlc<tuf> wlc6, wlc<twi> wlc7, wlc<jmf<ttu>> wlc8, wlc<tsw> wlc9, wlc<ttd> wlc10, wlc<tsv> wlc11, wlc<tsu> wlc12, wlc<PlaySourceProvider> wlc13, wlc<sih> wlc14) {
        twh twh = new twh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14);
        return twh;
    }

    public final /* synthetic */ Object get() {
        twg twg = new twg((Context) this.a.get(), vtz.b(this.b), ((Boolean) this.c.get()).booleanValue(), (tvx) this.d.get(), (twc) this.e.get(), (tuf) this.f.get(), (twi) this.g.get(), (jmf) this.h.get(), (tsw) this.i.get(), (ttd) this.j.get(), (tsv) this.k.get(), (tsu) this.l.get(), (PlaySourceProvider) this.m.get(), (sih) this.n.get());
        return twg;
    }
}
