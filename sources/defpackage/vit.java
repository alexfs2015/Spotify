package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: vit reason: default package */
public final class vit<T> implements ObservableTransformer<T, T> {
    private final int a;
    private final T b;
    private final Scheduler c;

    /* renamed from: vit$a */
    public static final class a<T> {
        public int a = 800;
        private final T b;
        private final Scheduler c;

        public a(T t, Scheduler scheduler) {
            this.b = t;
            this.c = scheduler;
        }

        public final vit<T> a() {
            return new vit<>(this.a, this.b, this.c, 0);
        }
    }

    /* synthetic */ vit(int i, Object obj, Scheduler scheduler, byte b2) {
        this(i, obj, scheduler);
    }

    private vit(int i, T t, Scheduler scheduler) {
        this.a = i;
        this.b = fay.a(t);
        this.c = (Scheduler) fay.a(scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        Observable a2 = Observable.a((long) this.a, TimeUnit.MILLISECONDS, this.c);
        $$Lambda$vit$E84PuuqmyUX7Z4lh7rFnQXXjM r1 = $$Lambda$vit$E84PuuqmyUX7Z4lh7rFnQXXjM.INSTANCE;
        Observable a3 = Observable.a((ObservableSource<? extends T>) observable, (ObservableSource<? extends T>) Observable.b(this.b));
        ObjectHelper.a(a2, "firstTimeoutIndicator is null");
        ObjectHelper.a(a3, "other is null");
        ObjectHelper.a(r1, "itemTimeoutIndicator is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableTimeout<T>(observable, a2, r1, a3));
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.f((Function<? super Observable<T>, ? extends ObservableSource<R>>) new $$Lambda$vit$pBy52qKz0YeVhHSrPfGhnDjwC8<Object,Object>(this));
    }
}
