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

/* renamed from: sml reason: default package */
public final class sml<T, R> implements ObservableTransformer<T, R> {
    private final Function<T, Observable<R>> a;
    /* access modifiers changed from: private */
    public final Function3<T, T, T, Boolean> b;
    private final Observable<a<T, R>> c = Observable.b((Callable<? extends T>) new Callable<a<T, R>>() {
        public final /* synthetic */ Object call() {
            return new a(sml.this.b);
        }
    });

    /* renamed from: sml$a */
    static class a<T, R> implements BiFunction<T, b<T, R>, Optional<R>> {
        private final Function3<T, T, T, Boolean> a;
        private Optional<T> b = Optional.e();

        a(Function3<T, T, T, Boolean> function3) {
            this.a = (Function3) fbp.a(function3);
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            b bVar = (b) obj2;
            if (this.b.b() && !((Boolean) this.a.apply(obj, this.b.c(), bVar.a)).booleanValue()) {
                return Optional.e();
            }
            this.b = Optional.b(bVar.a);
            return Optional.b(bVar.b);
        }
    }

    /* renamed from: sml$b */
    static class b<T, R> {
        public final T a;
        public final R b;

        b(T t, R r) {
            this.a = fbp.a(t);
            this.b = fbp.a(r);
        }
    }

    public sml(Function<T, Observable<R>> function, Function3<T, T, T, Boolean> function3) {
        this.a = (Function) fbp.a(function);
        this.b = (Function3) fbp.a(function3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(Observable observable, a aVar) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sml$IL9DIuxOTPU7gbx1GVledZ3koXk<Object,Object>(this), false), (BiFunction<? super T1, ? super T2, ? extends R>) aVar).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$AD0_4XGZ8D77ddDDQyYxBZ908MM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public Observable<b<T, R>> a(T t) {
        return Observable.a((ObservableSource<? extends T1>) Observable.b(t), (ObservableSource) this.a.apply(t), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$USKiu2RAY4l8iH76uQ6sDoEoU5E.INSTANCE);
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return this.c.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sml$SJl4_6fwOUiWN7r4Jy4W5JgV2Vg<Object,Object>(this, ObservablePublish.h(observable).a()), false);
    }
}
