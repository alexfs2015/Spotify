package io.reactivex.plugins;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.Callable;

public final class RxJavaPlugins {
    private static volatile Consumer<? super Throwable> a;
    private static volatile BiFunction<? super Flowable, ? super wrg, ? extends wrg> b;
    private static volatile BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> c;
    private static volatile BiFunction<? super Observable, ? super Observer, ? extends Observer> d;
    private static volatile BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> e;
    private static volatile BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> f;
    private static volatile boolean g;

    public static Completable a(Completable completable) {
        return completable;
    }

    public static <T> Flowable<T> a(Flowable<T> flowable) {
        return flowable;
    }

    public static <T> Maybe<T> a(Maybe<T> maybe) {
        return maybe;
    }

    public static <T> Observable<T> a(Observable<T> observable) {
        return observable;
    }

    public static Scheduler a(Scheduler scheduler) {
        return scheduler;
    }

    public static <T> Single<T> a(Single<T> single) {
        return single;
    }

    public static <T> ConnectableFlowable<T> a(ConnectableFlowable<T> connectableFlowable) {
        return connectableFlowable;
    }

    public static <T> ConnectableObservable<T> a(ConnectableObservable<T> connectableObservable) {
        return connectableObservable;
    }

    public static Scheduler b(Scheduler scheduler) {
        return scheduler;
    }

    public static Scheduler c(Scheduler scheduler) {
        return scheduler;
    }

    public static boolean c() {
        return false;
    }

    public static boolean a() {
        return g;
    }

    public static Consumer<? super Throwable> b() {
        return a;
    }

    public static Scheduler a(Callable<Scheduler> callable) {
        ObjectHelper.a(callable, "Scheduler Callable can't be null");
        return e(callable);
    }

    public static Scheduler b(Callable<Scheduler> callable) {
        ObjectHelper.a(callable, "Scheduler Callable can't be null");
        return e(callable);
    }

    public static Scheduler c(Callable<Scheduler> callable) {
        ObjectHelper.a(callable, "Scheduler Callable can't be null");
        return e(callable);
    }

    public static Scheduler d(Callable<Scheduler> callable) {
        ObjectHelper.a(callable, "Scheduler Callable can't be null");
        return e(callable);
    }

    public static void a(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static Runnable a(Runnable runnable) {
        ObjectHelper.a(runnable, "run is null");
        return runnable;
    }

    public static void a(BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction) {
        f = biFunction;
    }

    public static void b(BiFunction<? super Flowable, ? super wrg, ? extends wrg> biFunction) {
        b = biFunction;
    }

    public static void c(BiFunction<? super Maybe, MaybeObserver, ? extends MaybeObserver> biFunction) {
        c = biFunction;
    }

    public static void d(BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction) {
        d = biFunction;
    }

    public static void e(BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction) {
        e = biFunction;
    }

    public static <T> wrg<? super T> a(Flowable<T> flowable, wrg<? super T> wrg) {
        BiFunction<? super Flowable, ? super wrg, ? extends wrg> biFunction = b;
        return biFunction != null ? (wrg) a(biFunction, flowable, wrg) : wrg;
    }

    public static <T> Observer<? super T> a(Observable<T> observable, Observer<? super T> observer) {
        BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction = d;
        return biFunction != null ? (Observer) a(biFunction, observable, observer) : observer;
    }

    public static <T> SingleObserver<? super T> a(Single<T> single, SingleObserver<? super T> singleObserver) {
        BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction = e;
        return biFunction != null ? (SingleObserver) a(biFunction, single, singleObserver) : singleObserver;
    }

    public static CompletableObserver a(Completable completable, CompletableObserver completableObserver) {
        BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction = f;
        return biFunction != null ? (CompletableObserver) a(biFunction, completable, completableObserver) : completableObserver;
    }

    public static <T> MaybeObserver<? super T> a(Maybe<T> maybe, MaybeObserver<? super T> maybeObserver) {
        BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> biFunction = c;
        return biFunction != null ? (MaybeObserver) a(biFunction, maybe, maybeObserver) : maybeObserver;
    }

    private static <T, U, R> R a(BiFunction<T, U, R> biFunction, T t, U u) {
        try {
            return biFunction.apply(t, u);
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }

    private static Scheduler e(Callable<Scheduler> callable) {
        try {
            return (Scheduler) ObjectHelper.a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }
}
