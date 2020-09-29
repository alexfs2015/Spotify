package defpackage;

import android.app.Activity;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: pnl reason: default package */
public final class pnl implements vua<pnk> {
    private final wlc<pnr> a;
    private final wlc<pnp> b;
    private final wlc<poh> c;
    private final wlc<pnn> d;
    private final wlc<ppc> e;
    private final wlc<pol> f;
    private final wlc<pon> g;
    private final wlc<Activity> h;
    private final wlc<psg> i;
    private final wlc<ToastieManager> j;
    private final wlc<poj> k;

    private pnl(wlc<pnr> wlc, wlc<pnp> wlc2, wlc<poh> wlc3, wlc<pnn> wlc4, wlc<ppc> wlc5, wlc<pol> wlc6, wlc<pon> wlc7, wlc<Activity> wlc8, wlc<psg> wlc9, wlc<ToastieManager> wlc10, wlc<poj> wlc11) {
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
    }

    public static pnl a(wlc<pnr> wlc, wlc<pnp> wlc2, wlc<poh> wlc3, wlc<pnn> wlc4, wlc<ppc> wlc5, wlc<pol> wlc6, wlc<pon> wlc7, wlc<Activity> wlc8, wlc<psg> wlc9, wlc<ToastieManager> wlc10, wlc<poj> wlc11) {
        pnl pnl = new pnl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return pnl;
    }

    public final /* synthetic */ Object get() {
        pnk pnk = new pnk((pnr) this.a.get(), (pnp) this.b.get(), (poh) this.c.get(), (pnn) this.d.get(), (ppc) this.e.get(), (pol) this.f.get(), (pon) this.g.get(), (Activity) this.h.get(), (psg) this.i.get(), (ToastieManager) this.j.get(), (poj) this.k.get());
        return pnk;
    }
}
