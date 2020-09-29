package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDefer;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableError;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableNever;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTimeout;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.CompletableToObservable;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class Completable implements CompletableSource {
    public static Completable a() {
        return RxJavaPlugins.a(CompletableEmpty.a);
    }

    public static Completable a(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Completable) new CompletableTimer(j, timeUnit, scheduler));
    }

    private Completable a(long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        CompletableTimeout completableTimeout = new CompletableTimeout(this, j, timeUnit, scheduler, null);
        return RxJavaPlugins.a((Completable) completableTimeout);
    }

    private Completable a(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        CompletableDelay completableDelay = new CompletableDelay(this, j, timeUnit, scheduler, false);
        return RxJavaPlugins.a((Completable) completableDelay);
    }

    public static Completable a(CompletableOnSubscribe completableOnSubscribe) {
        ObjectHelper.a(completableOnSubscribe, "source is null");
        return RxJavaPlugins.a((Completable) new CompletableCreate(completableOnSubscribe));
    }

    public static Completable a(Action action) {
        ObjectHelper.a(action, "run is null");
        return RxJavaPlugins.a((Completable) new CompletableFromAction(action));
    }

    private Completable a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        ObjectHelper.a(consumer, "onSubscribe is null");
        ObjectHelper.a(consumer2, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        ObjectHelper.a(action2, "onTerminate is null");
        ObjectHelper.a(action3, "onAfterTerminate is null");
        ObjectHelper.a(action4, "onDispose is null");
        CompletablePeek completablePeek = new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4);
        return RxJavaPlugins.a((Completable) completablePeek);
    }

    public static Completable a(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.a(iterable, "sources is null");
        return RxJavaPlugins.a((Completable) new CompletableConcatIterable(iterable));
    }

    public static Completable a(Runnable runnable) {
        ObjectHelper.a(runnable, "run is null");
        return RxJavaPlugins.a((Completable) new CompletableFromRunnable(runnable));
    }

    public static Completable a(Throwable th) {
        ObjectHelper.a(th, "error is null");
        return RxJavaPlugins.a((Completable) new CompletableError(th));
    }

    public static Completable a(Callable<? extends CompletableSource> callable) {
        ObjectHelper.a(callable, "completableSupplier");
        return RxJavaPlugins.a((Completable) new CompletableDefer(callable));
    }

    public static <T> Completable a(xfk<T> xfk) {
        ObjectHelper.a(xfk, "publisher is null");
        return RxJavaPlugins.a((Completable) new CompletableFromPublisher(xfk));
    }

    public static Completable a(CompletableSource... completableSourceArr) {
        ObjectHelper.a(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? RxJavaPlugins.a(CompletableEmpty.a) : completableSourceArr.length == 1 ? d(completableSourceArr[0]) : RxJavaPlugins.a((Completable) new CompletableConcatArray(completableSourceArr));
    }

    public static Completable b() {
        return RxJavaPlugins.a(CompletableNever.a);
    }

    public static Completable b(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.a(iterable, "sources is null");
        return RxJavaPlugins.a((Completable) new CompletableMergeIterable(iterable));
    }

    public static Completable b(Callable<?> callable) {
        ObjectHelper.a(callable, "callable is null");
        return RxJavaPlugins.a((Completable) new CompletableFromCallable(callable));
    }

    public static Completable b(CompletableSource... completableSourceArr) {
        ObjectHelper.a(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? RxJavaPlugins.a(CompletableEmpty.a) : completableSourceArr.length == 1 ? d(completableSourceArr[0]) : RxJavaPlugins.a((Completable) new CompletableMergeArray(completableSourceArr));
    }

    private static NullPointerException b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    private static Completable d(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "source is null");
        return completableSource instanceof Completable ? RxJavaPlugins.a((Completable) completableSource) : RxJavaPlugins.a((Completable) new CompletableFromUnsafeSource(completableSource));
    }

    public final Completable a(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "next is null");
        return RxJavaPlugins.a((Completable) new CompletableAndThenCompletable(this, completableSource));
    }

    public final Completable a(CompletableTransformer completableTransformer) {
        return d(((CompletableTransformer) ObjectHelper.a(completableTransformer, "transformer is null")).apply(this));
    }

    public final Completable a(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Completable) new CompletableObserveOn(this, scheduler));
    }

    public final Completable a(Consumer<? super Throwable> consumer) {
        Consumer b = Functions.b();
        Action action = Functions.b;
        Action action2 = Functions.b;
        return a(b, consumer, action, action, action2, action2);
    }

    public final Completable a(Function<? super Throwable, ? extends CompletableSource> function) {
        ObjectHelper.a(function, "errorMapper is null");
        return RxJavaPlugins.a((Completable) new CompletableResumeNext(this, function));
    }

    public final Completable a(Predicate<? super Throwable> predicate) {
        ObjectHelper.a(predicate, "predicate is null");
        return RxJavaPlugins.a((Completable) new CompletableOnErrorComplete(this, predicate));
    }

    public final <T> Observable<T> a(Observable<T> observable) {
        ObjectHelper.a(observable, "other is null");
        return observable.c((ObservableSource<? extends T>) e());
    }

    public final <T> Observable<T> a(ObservableSource<T> observableSource) {
        ObjectHelper.a(observableSource, "next is null");
        return RxJavaPlugins.a((Observable<T>) new CompletableAndThenObservable<T>(this, observableSource));
    }

    public final <T> Single<T> a(SingleSource<T> singleSource) {
        ObjectHelper.a(singleSource, "next is null");
        return RxJavaPlugins.a((Single<T>) new SingleDelayWithCompletable<T>(singleSource, this));
    }

    public final <T> Single<T> a(T t) {
        ObjectHelper.a(t, "completionValue is null");
        return RxJavaPlugins.a((Single<T>) new CompletableToSingle<T>(this, null, t));
    }

    public final Disposable a(Action action, Consumer<? super Throwable> consumer) {
        ObjectHelper.a(consumer, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        a((CompletableObserver) callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final void a(CompletableObserver completableObserver) {
        ObjectHelper.a(completableObserver, "observer is null");
        try {
            CompletableObserver a = RxJavaPlugins.a(this, completableObserver);
            ObjectHelper.a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
            throw b(th);
        }
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        ObjectHelper.a(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        a((CompletableObserver) blockingMultiObserver);
        return blockingMultiObserver.a(j, timeUnit);
    }

    public final Completable b(long j, TimeUnit timeUnit) {
        return a(2, timeUnit, Schedulers.a(), false);
    }

    public final Completable b(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "other is null");
        return RxJavaPlugins.a((Completable) new CompletableAndThenCompletable(this, completableSource));
    }

    public final Completable b(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Completable) new CompletableSubscribeOn(this, scheduler));
    }

    public final Completable b(Action action) {
        Consumer b = Functions.b();
        Consumer b2 = Functions.b();
        Action action2 = Functions.b;
        return a(b, b2, action, action2, action2, Functions.b);
    }

    /* access modifiers changed from: protected */
    public abstract void b(CompletableObserver completableObserver);

    public final Completable c(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, Schedulers.a(), (CompletableSource) null);
    }

    public final Completable c(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "other is null");
        return a(completableSource, this);
    }

    public final Disposable c(Action action) {
        ObjectHelper.a(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action);
        a((CompletableObserver) callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final void c() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        a((CompletableObserver) blockingMultiObserver);
        blockingMultiObserver.a();
    }

    public final Disposable d() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        a((CompletableObserver) emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public final <T> Observable<T> e() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).be_() : RxJavaPlugins.a((Observable<T>) new CompletableToObservable<T>(this));
    }
}
