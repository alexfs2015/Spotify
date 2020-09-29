package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: wbz reason: default package */
final class wbz implements wcb {
    private final wdx a;
    private final wep b;
    private final Observable<lbg> c;
    private final jvq d;
    private final gcr<Void, Boolean> e;
    private wzi<String> f;
    private wzi<wcu> g;
    private wzi<rwl> h;
    private wzi<ObjectMapper> i;
    private wzi<Flowable<PlayerState>> j;
    private wzi<Cosmonaut> k;
    private wzi<RxRouter> l;
    private wzi<wcn> m;
    private wzi<wci> n;
    private wzi<wck> o;
    private wzi<wep> p;
    private wzi<Single<weo>> q;
    private wzi<String> r;
    private wzi<wem> s;
    private wzi<xii<wot>> t;
    private wzi<ObjectMapper> u;
    private wzi<wcp> v;
    private wzi<xii<weq>> w;
    private wzi<wdx> x;
    private wzi<xii<?>> y;

    /* renamed from: wbz$a */
    static final class a implements defpackage.wcb.a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final wcb a(wep wep, wcu wcu, wem wem, wdx wdx, rwl rwl, Flowable<PlayerState> flowable, wci wci, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<lbg> observable, jvq jvq, gcr<Void, Boolean> gcr) {
            wil.a(wep);
            wil.a(wcu);
            wil.a(wem);
            wil.a(wdx);
            wil.a(rwl);
            wil.a(flowable);
            wil.a(wci);
            wil.a(cosmonaut);
            wil.a(rxRouter);
            wil.a(observable);
            wil.a(jvq);
            wil.a(gcr);
            wbz wbz = new wbz(wcu, wep, wem, wdx, rwl, flowable, wci, cosmonaut, rxRouter, observable, jvq, gcr, 0);
            return wbz;
        }
    }

    private wbz(wcu wcu, wep wep, wem wem, wdx wdx, rwl rwl, Flowable<PlayerState> flowable, wci wci, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<lbg> observable, jvq jvq, gcr<Void, Boolean> gcr) {
        this.a = wdx;
        this.b = wep;
        this.c = observable;
        this.d = jvq;
        this.e = gcr;
        this.f = wio.a(wdn.a());
        this.g = wih.a(wcu);
        this.h = wih.a(rwl);
        this.i = wdd.a(this.h);
        this.j = wih.a(flowable);
        this.k = wih.a(cosmonaut);
        this.l = wih.a(rxRouter);
        this.m = wdj.a(this.k, this.l);
        this.n = wih.a(wci);
        this.o = wcl.a(this.m, this.n);
        this.p = wih.a(wep);
        this.q = wdk.a(this.j, this.o, this.p);
        this.r = wio.a(wdg.a());
        this.s = wih.a(wem);
        this.t = wio.a(wdh.a(this.g, this.i, wdm.a(), wdi.a(), this.q, this.p, this.f, this.r, this.s));
        this.u = wde.a(this.h);
        this.v = wcq.a(this.u);
        this.w = wio.a(wdo.a(this.t, this.v, this.g));
        this.x = wih.a(wdx);
        this.y = wio.a(wdl.a(this.f, this.x, this.p, this.t, this.g, this.w));
    }

    /* synthetic */ wbz(wcu wcu, wep wep, wem wem, wdx wdx, rwl rwl, Flowable flowable, wci wci, Cosmonaut cosmonaut, RxRouter rxRouter, Observable observable, jvq jvq, gcr gcr, byte b2) {
        this(wcu, wep, wem, wdx, rwl, flowable, wci, cosmonaut, rxRouter, observable, jvq, gcr);
    }

    public final wcc a() {
        wcc wcc = new wcc((String) this.f.get(), (xii) this.w.get(), (xii) this.y.get(), this.a, this.b, this.c, this.d, this.e);
        return wcc;
    }
}
