package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: scc reason: default package */
public final class scc implements ObservableTransformer<b, sbs> {
    private final ryz a;

    public scc(ryz ryz) {
        this.a = (ryz) fay.a(ryz);
    }

    public final ObservableSource<sbs> apply(Observable<b> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$scc$1kPslPEdOJCVK4NEw1TmFsjvP24<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$scc$LHe0FI16nucxX79zXyK77wlPt4g.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b b(b bVar) {
        this.a.b();
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sbs a(b bVar) {
        return new b();
    }
}
