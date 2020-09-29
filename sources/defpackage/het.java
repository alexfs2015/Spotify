package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* renamed from: het reason: default package */
public final class het<T, R> implements FlowableTransformer<T, R> {
    private final Function<T, Flowable<R>> a;
    /* access modifiers changed from: private */
    public final Function3<T, T, T, Boolean> b;
    private final Flowable<a<T, R>> c = Flowable.b((Callable<? extends T>) new Callable<a<T, R>>() {
        public final /* synthetic */ Object call() {
            return new a(het.this.b);
        }
    });

    /* renamed from: het$a */
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

    /* renamed from: het$b */
    static class b<T, R> {
        public final T a;
        public final R b;

        b(T t, R r) {
            this.a = fay.a(t);
            this.b = fay.a(r);
        }
    }

    public het(Function<T, Flowable<R>> function, Function3<T, T, T, Boolean> function3) {
        this.a = (Function) fay.a(function);
        this.b = (Function3) fay.a(function3);
    }

    /* access modifiers changed from: private */
    public Flowable<b<T, R>> a(T t) {
        return Flowable.a((wrf<? extends T1>) Flowable.b(t), (wrf) this.a.apply(t), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$Bk5iOFzpQrxsco_ub6gaZR_Ggq8.INSTANCE);
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return this.c.b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$het$bAppk7oA4KQjCwJLCBdKJSJFY<Object,Object>(this, flowable.h().c()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(Flowable flowable, a aVar) {
        return Flowable.a((wrf<? extends T1>) flowable, (wrf<? extends T2>) flowable.b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$het$UDtozy4S1XOWJxhf0aVHFh7B0U<Object,Object>(this)), (BiFunction<? super T1, ? super T2, ? extends R>) aVar).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$AD0_4XGZ8D77ddDDQyYxBZ908MM.INSTANCE);
    }
}
