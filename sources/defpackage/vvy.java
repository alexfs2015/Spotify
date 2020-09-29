package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: vvy reason: default package */
public final class vvy<T> implements ObservableTransformer<T, T> {
    private final int a;
    private final T b;
    private final Scheduler c;

    /* renamed from: vvy$a */
    public static final class a<T> {
        public int a = 800;
        private final T b;
        private final Scheduler c;

        public a(T t, Scheduler scheduler) {
            this.b = t;
            this.c = scheduler;
        }

        public final vvy<T> a() {
            return new vvy<>(this.a, this.b, this.c, 0);
        }
    }

    private vvy(int i, T t, Scheduler scheduler) {
        this.a = i;
        this.b = fbp.a(t);
        this.c = (Scheduler) fbp.a(scheduler);
    }

    /* synthetic */ vvy(int i, Object obj, Scheduler scheduler, byte b2) {
        this(i, obj, scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.a((ObservableSource<U>) Observable.a((long) this.a, TimeUnit.MILLISECONDS, this.c), (Function<? super T, ? extends ObservableSource<V>>) $$Lambda$vvy$3BnnoynQOgwFBbH8IycKs7h4bY.INSTANCE, (ObservableSource<? extends T>) Observable.b((ObservableSource<? extends T>) observable, (ObservableSource<? extends T>) Observable.b(this.b)));
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.f((Function<? super Observable<T>, ? extends ObservableSource<R>>) new $$Lambda$vvy$9A7UUaWMDZcIF3pwe1kJUTmJOLA<Object,Object>(this));
    }
}
