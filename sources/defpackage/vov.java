package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: vov reason: default package */
public final class vov implements vua<vos> {
    private final wlc<vrh> a;
    private final wlc<vpt> b;
    private final wlc<vre> c;
    private final wlc<vqp> d;
    private final wlc<rnf> e;
    private final wlc<Flowable<PlayerState>> f;
    private final wlc<vph> g;
    private final wlc<Cosmonaut> h;
    private final wlc<RxRouter> i;
    private final wlc<Observable<kxx>> j;
    private final wlc<jti> k;
    private final wlc<Callable<Boolean>> l;

    private vov(wlc<vrh> wlc, wlc<vpt> wlc2, wlc<vre> wlc3, wlc<vqp> wlc4, wlc<rnf> wlc5, wlc<Flowable<PlayerState>> wlc6, wlc<vph> wlc7, wlc<Cosmonaut> wlc8, wlc<RxRouter> wlc9, wlc<Observable<kxx>> wlc10, wlc<jti> wlc11, wlc<Callable<Boolean>> wlc12) {
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
    }

    public static vov a(wlc<vrh> wlc, wlc<vpt> wlc2, wlc<vre> wlc3, wlc<vqp> wlc4, wlc<rnf> wlc5, wlc<Flowable<PlayerState>> wlc6, wlc<vph> wlc7, wlc<Cosmonaut> wlc8, wlc<RxRouter> wlc9, wlc<Observable<kxx>> wlc10, wlc<jti> wlc11, wlc<Callable<Boolean>> wlc12) {
        vov vov = new vov(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12);
        return vov;
    }

    public static vos a(vrh vrh, vpt vpt, vre vre, vqp vqp, rnf rnf, Flowable<PlayerState> flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<kxx> observable, jti jti, Callable<Boolean> callable) {
        return (vos) vuf.a(CC.a(vrh, vpt, vre, vqp, rnf, flowable, vph, cosmonaut, rxRouter, observable, jti, callable), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vrh) this.a.get(), (vpt) this.b.get(), (vre) this.c.get(), (vqp) this.d.get(), (rnf) this.e.get(), (Flowable) this.f.get(), (vph) this.g.get(), (Cosmonaut) this.h.get(), (RxRouter) this.i.get(), (Observable) this.j.get(), (jti) this.k.get(), (Callable) this.l.get());
    }
}
