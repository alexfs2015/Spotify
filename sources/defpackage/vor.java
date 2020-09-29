package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.concurrent.Callable;

/* renamed from: vor reason: default package */
final class vor implements voz {
    private final vqp a;
    private final vrh b;
    private final Observable<kxx> c;
    private final jti d;
    private final Callable<Boolean> e;
    private wlc<String> f;
    private wlc<vpt> g;
    private wlc<rnf> h;
    private wlc<ObjectMapper> i;
    private wlc<Flowable<PlayerState>> j;
    private wlc<Cosmonaut> k;
    private wlc<RxRouter> l;
    private wlc<vpm> m;
    private wlc<vph> n;
    private wlc<vpj> o;
    private wlc<vrh> p;
    private wlc<Single<vrg>> q;
    private wlc<String> r;
    private wlc<vre> s;
    private wlc<wud<wan>> t;
    private wlc<ObjectMapper> u;
    private wlc<vpo> v;
    private wlc<wud<vri>> w;
    private wlc<vqp> x;
    private wlc<wud<?>> y;

    /* renamed from: vor$a */
    static final class a implements defpackage.voz.a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final voz a(vrh vrh, vpt vpt, vre vre, vqp vqp, rnf rnf, Flowable<PlayerState> flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<kxx> observable, jti jti, Callable<Boolean> callable) {
            vuf.a(vrh);
            vuf.a(vpt);
            vuf.a(vre);
            vuf.a(vqp);
            vuf.a(rnf);
            vuf.a(flowable);
            vuf.a(vph);
            vuf.a(cosmonaut);
            vuf.a(rxRouter);
            vuf.a(observable);
            vuf.a(jti);
            vuf.a(callable);
            vor vor = new vor(vpt, vrh, vre, vqp, rnf, flowable, vph, cosmonaut, rxRouter, observable, jti, callable, 0);
            return vor;
        }
    }

    /* synthetic */ vor(vpt vpt, vrh vrh, vre vre, vqp vqp, rnf rnf, Flowable flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable observable, jti jti, Callable callable, byte b2) {
        this(vpt, vrh, vre, vqp, rnf, flowable, vph, cosmonaut, rxRouter, observable, jti, callable);
    }

    private vor(vpt vpt, vrh vrh, vre vre, vqp vqp, rnf rnf, Flowable<PlayerState> flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<kxx> observable, jti jti, Callable<Boolean> callable) {
        this.a = vqp;
        this.b = vrh;
        this.c = observable;
        this.d = jti;
        this.e = callable;
        this.f = vui.a(vqm.a());
        this.g = vub.a(vpt);
        this.h = vub.a(rnf);
        this.i = vqc.a(this.h);
        this.j = vub.a(flowable);
        this.k = vub.a(cosmonaut);
        this.l = vub.a(rxRouter);
        this.m = vqi.a(this.k, this.l);
        this.n = vub.a(vph);
        this.o = vpk.a(this.m, this.n);
        this.p = vub.a(vrh);
        this.q = vqj.a(this.j, this.o, this.p);
        this.r = vui.a(vqf.a());
        this.s = vub.a(vre);
        this.t = vui.a(vqg.a(this.g, this.i, vql.a(), vqh.a(), this.q, this.p, this.f, this.r, this.s));
        this.u = vqd.a(this.h);
        this.v = vpp.a(this.u);
        this.w = vui.a(vqn.a(this.t, this.v, this.g));
        this.x = vub.a(vqp);
        this.y = vui.a(vqk.a(this.f, this.x, this.p, this.t, this.g, this.w));
    }

    public final vot a() {
        vot vot = new vot((String) this.f.get(), (wud) this.w.get(), (wud) this.y.get(), this.a, this.b, this.c, this.d, this.e);
        return vot;
    }
}
