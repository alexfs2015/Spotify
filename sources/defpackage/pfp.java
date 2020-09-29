package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import io.reactivex.Single;

/* renamed from: pfp reason: default package */
public final class pfp implements vua<Single<String>> {
    private final wlc<Context> a;
    private final wlc<wud<Offer>> b;
    private final wlc<pgd> c;
    private final wlc<wug> d;
    private final wlc<wud<Offer>> e;
    private final wlc<String> f;
    private final wlc<String> g;
    private final wlc<String> h;
    private final wlc<String> i;
    private final wlc<String> j;
    private final wlc<pgr> k;
    private final wlc<ghm> l;
    private final wlc<fpt> m;
    private final wlc<Boolean> n;
    private final wlc<Boolean> o;
    private final wlc<String> p;
    private final wlc<String> q;
    private final wlc<String> r;

    private pfp(wlc<Context> wlc, wlc<wud<Offer>> wlc2, wlc<pgd> wlc3, wlc<wug> wlc4, wlc<wud<Offer>> wlc5, wlc<String> wlc6, wlc<String> wlc7, wlc<String> wlc8, wlc<String> wlc9, wlc<String> wlc10, wlc<pgr> wlc11, wlc<ghm> wlc12, wlc<fpt> wlc13, wlc<Boolean> wlc14, wlc<Boolean> wlc15, wlc<String> wlc16, wlc<String> wlc17, wlc<String> wlc18) {
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
        this.o = wlc15;
        this.p = wlc16;
        this.q = wlc17;
        this.r = wlc18;
    }

    public static pfp a(wlc<Context> wlc, wlc<wud<Offer>> wlc2, wlc<pgd> wlc3, wlc<wug> wlc4, wlc<wud<Offer>> wlc5, wlc<String> wlc6, wlc<String> wlc7, wlc<String> wlc8, wlc<String> wlc9, wlc<String> wlc10, wlc<pgr> wlc11, wlc<ghm> wlc12, wlc<fpt> wlc13, wlc<Boolean> wlc14, wlc<Boolean> wlc15, wlc<String> wlc16, wlc<String> wlc17, wlc<String> wlc18) {
        pfp pfp = new pfp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18);
        return pfp;
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Context) this.a.get(), (wud) this.b.get(), (pgd) this.c.get(), (wug) this.d.get(), (wud) this.e.get(), (String) this.f.get(), (String) this.g.get(), (String) this.h.get(), (String) this.i.get(), (String) this.j.get(), (pgr) this.k.get(), (ghm) this.l.get(), (fpt) this.m.get(), ((Boolean) this.n.get()).booleanValue(), ((Boolean) this.o.get()).booleanValue(), (String) this.p.get(), (String) this.q.get(), (String) this.r.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
