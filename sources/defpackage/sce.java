package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.observable.ObservablePublish;
import java.util.concurrent.Callable;

/* renamed from: sce reason: default package */
public final class sce<T, R> implements ObservableTransformer<T, R> {
    private final Function<T, Observable<R>> a;
    /* access modifiers changed from: private */
    public final Function3<T, T, T, Boolean> b;
    private final Observable<a<T, R>> c = Observable.b((Callable<? extends T>) new Callable<a<T, R>>() {
        public final /* synthetic */ Object call() {
            return new a(sce.this.b);
        }
    });

    /* renamed from: sce$a */
    static class a<T, R> implements BiFunction<T, b<T, R>, Optional<R>> {
        private final Function3<T, T, T, Boolean> a;
        private Optional<T> b = Optional.e();

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            b bVar = (b) obj2;
            if (this.b.b() && !((Boolean) this.a.apply(obj, this.b.c(), bVar.a)).booleanValue()) {
                return Optional.e();
            }
            this.b = Optional.b(bVar.a);
            return Optional.b(bVar.b);
        }

        a(Function3<T, T, T, Boolean> function3) {
            this.a = (Function3) fay.a(function3);
        }
    }

    /* renamed from: sce$b */
    static class b<T, R> {
        public final T a;
        public final R b;

        b(T t, R r) {
            this.a = fay.a(t);
            this.b = fay.a(r);
        }
    }

    public sce(Function<T, Observable<R>> function, Function3<T, T, T, Boolean> function3) {
        this.a = (Function) fay.a(function);
        this.b = (Function3) fay.a(function3);
    }

    /* access modifiers changed from: private */
    public Observable<b<T, R>> a(T t) {
        return Observable.a((ObservableSource<? extends T1>) Observable.b(t), (ObservableSource) this.a.apply(t), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$yFLelT43509g5c2RVykHfSFTTH4.INSTANCE);
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return this.c.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sce$B7zKnue4eympVJ1JhIlNTkXcqmY<Object,Object>(this, ObservablePublish.h(observable).a()), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(Observable observable, a aVar) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sce$LfviCMyrVvEvbS2Fs03ugBP_95s<Object,Object>(this), false), (BiFunction<? super T1, ? super T2, ? extends R>) aVar).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$AD0_4XGZ8D77ddDDQyYxBZ908MM.INSTANCE);
    }
}
