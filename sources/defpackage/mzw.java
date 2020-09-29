package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;

/* renamed from: mzw reason: default package */
public final class mzw implements vua<mzv> {
    private final wlc<mzg> a;
    private final wlc<CollectionStateProvider> b;
    private final wlc<kxc> c;
    private final wlc<kxi> d;
    private final wlc<rfk> e;
    private final wlc<sih> f;
    private final wlc<rfd> g;
    private final wlc<spi> h;
    private final wlc<hbj> i;
    private final wlc<iww> j;
    private final wlc<sje> k;
    private final wlc<tiu> l;
    private final wlc<kvk> m;
    private final wlc<Callable<Boolean>> n;
    private final wlc<Scheduler> o;
    private final wlc<tcn> p;
    private final wlc<tio> q;
    private final wlc<ToastieManager> r;
    private final wlc<Flowable<PlayerState>> s;

    private mzw(wlc<mzg> wlc, wlc<CollectionStateProvider> wlc2, wlc<kxc> wlc3, wlc<kxi> wlc4, wlc<rfk> wlc5, wlc<sih> wlc6, wlc<rfd> wlc7, wlc<spi> wlc8, wlc<hbj> wlc9, wlc<iww> wlc10, wlc<sje> wlc11, wlc<tiu> wlc12, wlc<kvk> wlc13, wlc<Callable<Boolean>> wlc14, wlc<Scheduler> wlc15, wlc<tcn> wlc16, wlc<tio> wlc17, wlc<ToastieManager> wlc18, wlc<Flowable<PlayerState>> wlc19) {
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
        this.s = wlc19;
    }

    public static mzw a(wlc<mzg> wlc, wlc<CollectionStateProvider> wlc2, wlc<kxc> wlc3, wlc<kxi> wlc4, wlc<rfk> wlc5, wlc<sih> wlc6, wlc<rfd> wlc7, wlc<spi> wlc8, wlc<hbj> wlc9, wlc<iww> wlc10, wlc<sje> wlc11, wlc<tiu> wlc12, wlc<kvk> wlc13, wlc<Callable<Boolean>> wlc14, wlc<Scheduler> wlc15, wlc<tcn> wlc16, wlc<tio> wlc17, wlc<ToastieManager> wlc18, wlc<Flowable<PlayerState>> wlc19) {
        mzw mzw = new mzw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18, wlc19);
        return mzw;
    }

    public final /* synthetic */ Object get() {
        mzv mzv = new mzv((mzg) this.a.get(), (CollectionStateProvider) this.b.get(), (kxc) this.c.get(), (kxi) this.d.get(), (rfk) this.e.get(), (sih) this.f.get(), (rfd) this.g.get(), (spi) this.h.get(), (hbj) this.i.get(), (iww) this.j.get(), (sje) this.k.get(), (tiu) this.l.get(), (kvk) this.m.get(), (Callable) this.n.get(), (Scheduler) this.o.get(), (tcn) this.p.get(), (tio) this.q.get(), (ToastieManager) this.r.get(), (Flowable) this.s.get());
        return mzv;
    }
}
