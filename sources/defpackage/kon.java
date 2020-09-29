package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: kon reason: default package */
public final class kon {
    static <F, E> ObservableTransformer<F, E> a(final Action action, final Scheduler scheduler) {
        return new ObservableTransformer<F, E>() {
            public final ObservableSource<E> apply(Observable<F> observable) {
                return observable.b((Function<? super T, ? extends CompletableSource>) new Function<F, CompletableSource>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        return scheduler == null ? Completable.a(action) : Completable.a(action).b(scheduler);
                    }
                }, false).e();
            }
        };
    }

    static <F, E> ObservableTransformer<F, E> a(final Consumer<F> consumer, final Scheduler scheduler) {
        return new ObservableTransformer<F, E>() {
            public final ObservableSource<E> apply(Observable<F> observable) {
                return observable.b((Function<? super T, ? extends CompletableSource>) new Function<F, CompletableSource>() {
                    public final /* synthetic */ Object apply(final Object obj) {
                        Completable a2 = Completable.a((Action) new Action() {
                            public final void run() {
                                consumer.accept(obj);
                            }
                        });
                        return scheduler == null ? a2 : a2.b(scheduler);
                    }
                }, false).e();
            }
        };
    }

    public static <F, E> ObservableTransformer<F, E> a(final Function<F, E> function, final Scheduler scheduler) {
        return new ObservableTransformer<F, E>() {
            public final ObservableSource<E> apply(Observable<F> observable) {
                return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function<F, ObservableSource<E>>() {
                    public final /* synthetic */ Object apply(final Object obj) {
                        Observable b = Observable.b((Callable<? extends T>) new Callable<E>() {
                            public final E call() {
                                return function.apply(obj);
                            }
                        });
                        return scheduler == null ? b : b.b(scheduler);
                    }
                }, false);
            }
        };
    }
}
