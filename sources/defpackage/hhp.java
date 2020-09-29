package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* renamed from: hhp reason: default package */
public final class hhp<T, R> implements FlowableTransformer<T, R> {
    private final Function<T, Flowable<R>> a;
    /* access modifiers changed from: private */
    public final Function3<T, T, T, Boolean> b;
    private final Flowable<a<T, R>> c = Flowable.b((Callable<? extends T>) new Callable<a<T, R>>() {
        public final /* synthetic */ Object call() {
            return new a(hhp.this.b);
        }
    });

    /* renamed from: hhp$a */
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

    /* renamed from: hhp$b */
    static class b<T, R> {
        public final T a;
        public final R b;

        b(T t, R r) {
            this.a = fbp.a(t);
            this.b = fbp.a(r);
        }
    }

    public hhp(Function<T, Flowable<R>> function, Function3<T, T, T, Boolean> function3) {
        this.a = (Function) fbp.a(function);
        this.b = (Function3) fbp.a(function3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(Flowable flowable, a aVar) {
        return Flowable.a((xfk<? extends T1>) flowable, (xfk<? extends T2>) flowable.b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$hhp$c6osvFOe_uDxtd_0Qx7wrT7BP4<Object,Object>(this)), (BiFunction<? super T1, ? super T2, ? extends R>) aVar).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$AD0_4XGZ8D77ddDDQyYxBZ908MM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public Flowable<b<T, R>> a(T t) {
        return Flowable.a((xfk<? extends T1>) Flowable.b(t), (xfk) this.a.apply(t), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$M1YKgE1GqDemQjsG9E6OpEd9DPA.INSTANCE);
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return this.c.b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$hhp$KEkwIAL8t0fpUTCLgUmJWzwHhZw<Object,Object>(this, flowable.h().c()));
    }
}
