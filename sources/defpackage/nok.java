package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: nok reason: default package */
public final class nok implements nis {
    private final boolean a;
    private final wzi<rog> b;
    private final njg c;
    private final njc d;
    private final nme e;
    private final xiy<hcs, xii<hcs>> f = new $$Lambda$nok$pcAIODJ_9i7BiWaKBH8ExP_vrU(this);
    private final xiy<hcs, xii<hcs>> g = new $$Lambda$nok$E8imi961jXHlMeLy_McTmssMO8w(this);

    public nok(boolean z, wzi<rog> wzi, njg njg, njc njc, nme nme) {
        this.a = z;
        this.b = wzi;
        this.c = njg;
        this.d = njc;
        this.e = nme;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(hcs hcs) {
        return nkh.a(hcs) ? wit.a((ObservableSource<T>) this.e.a(hcs).a(Observable.b(hcs)), BackpressureStrategy.BUFFER) : ScalarSynchronousObservable.d(hcs);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(hcs hcs) {
        return (!nkh.a(hcs) || !nkh.a(hcs.custom())) ? ScalarSynchronousObservable.d(hcs) : wit.a((ObservableSource<T>) this.e.a(hcs).a(Observable.b(hcs)), BackpressureStrategy.BUFFER);
    }

    public final xii<hcs> a() {
        return this.a ? wit.a((xfk<T>) ((rog) this.b.get()).a()).d(this.g) : this.c.a().a((c<? super T, ? extends R>) this.d).d(this.f);
    }
}
