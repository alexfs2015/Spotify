package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mhn reason: default package */
public final class mhn implements vua<mhm> {
    private final wlc<mho> a;
    private final wlc<mhk> b;
    private final wlc<Flowable<PlayerState>> c;
    private final wlc<mhh> d;
    private final wlc<iqw> e;
    private final wlc<fbd<Integer>> f;
    private final wlc<mia> g;
    private final wlc<min> h;
    private final wlc<rpg> i;
    private final wlc<fpt> j;

    private mhn(wlc<mho> wlc, wlc<mhk> wlc2, wlc<Flowable<PlayerState>> wlc3, wlc<mhh> wlc4, wlc<iqw> wlc5, wlc<fbd<Integer>> wlc6, wlc<mia> wlc7, wlc<min> wlc8, wlc<rpg> wlc9, wlc<fpt> wlc10) {
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
    }

    public static mhn a(wlc<mho> wlc, wlc<mhk> wlc2, wlc<Flowable<PlayerState>> wlc3, wlc<mhh> wlc4, wlc<iqw> wlc5, wlc<fbd<Integer>> wlc6, wlc<mia> wlc7, wlc<min> wlc8, wlc<rpg> wlc9, wlc<fpt> wlc10) {
        mhn mhn = new mhn(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return mhn;
    }

    public final /* synthetic */ Object get() {
        mhm mhm = new mhm((mho) this.a.get(), (mhk) this.b.get(), (Flowable) this.c.get(), (mhh) this.d.get(), (iqw) this.e.get(), (fbd) this.f.get(), (mia) this.g.get(), (min) this.h.get(), (rpg) this.i.get(), (fpt) this.j.get());
        return mhm;
    }
}
