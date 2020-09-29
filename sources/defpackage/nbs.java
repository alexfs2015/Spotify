package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: nbs reason: default package */
public final class nbs {
    public final nbu a;
    private final xii<hcs> b;
    private final nbq c;
    private final String d;
    private final roa e;
    private final ndk f;
    private final suo g;
    private final ndm h;
    private final rmq i;
    private final heg j;
    private final lny k;

    public nbs(lny lny, nbu nbu, nbq nbq, nbn nbn, String str, roa roa, ndk ndk, suo suo, ndm ndm, rmq rmq, heg heg) {
        this.k = lny;
        this.d = str;
        this.f = ndk;
        this.g = suo;
        this.h = ndm;
        this.i = rmq;
        this.j = heg;
        this.b = nbn.a(str);
        this.a = nbu;
        this.c = nbq;
        this.e = roa;
    }

    /* access modifiers changed from: private */
    public xii<hcs> a(xii<hcs> xii) {
        return this.j.a() ? (!jvi.b(this.k.a) || jvi.c(this.k.a)) ? xii.a((c<? super T, ? extends R>) this.i) : xii : xii;
    }

    /* access modifiers changed from: private */
    public xii<hcs> b(xii<hcs> xii) {
        return (!jvi.c(this.k.a) || !jvi.b(this.k.a)) ? xii : xii.a((c<? super T, ? extends R>) this.f);
    }

    public final xii<ho<hcs, roq>> a(hcs hcs) {
        xii a2 = (hcs != null ? ScalarSynchronousObservable.d(hcs) : this.b).a((c<? super T, ? extends R>) this.e).a(wit.a((ObservableTransformer<T, R>) this.h, BackpressureStrategy.BUFFER)).a((c<? super T, ? extends R>) this.g).a((c<? super T, ? extends R>) new $$Lambda$nbs$wtXWMcknw9F8wu98xdS_OgRk9po<Object,Object>(this)).a((c<? super T, ? extends R>) new $$Lambda$nbs$1LyRuAbBtxwbTCmbzK8FPgdOgTw<Object,Object>(this));
        nbq nbq = this.c;
        return a2.a((c<? super T, ? extends R>) new nbp<Object,Object>((String) nbq.a(this.d, 1), (ipf) nbq.a(nbq.a.get(), 2), (nbu) nbq.a(nbq.b.get(), 3)));
    }
}
