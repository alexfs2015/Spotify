package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* renamed from: kog reason: default package */
final class kog<T, R> implements ObservableTransformer<T, R> {
    /* access modifiers changed from: private */
    public final Iterable<ObservableTransformer<T, R>> a;

    public kog(Iterable<ObservableTransformer<T, R>> iterable) {
        this.a = (Iterable) koa.a(iterable);
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.f((Function<? super Observable<T>, ? extends ObservableSource<R>>) new Function<Observable<T>, Observable<R>>() {
            public final /* synthetic */ Object apply(Object obj) {
                Observable observable = (Observable) obj;
                ArrayList arrayList = new ArrayList();
                for (ObservableTransformer a2 : kog.this.a) {
                    arrayList.add(observable.a(a2));
                }
                return Observable.b((Iterable<? extends ObservableSource<? extends T>>) arrayList);
            }
        });
    }
}
