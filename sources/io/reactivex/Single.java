package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnEvent;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleError;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleFromCallable;
import io.reactivex.internal.operators.single.SingleFromUnsafeSource;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class Single<T> implements SingleSource<T> {
    /* access modifiers changed from: protected */
    public abstract void a(SingleObserver<? super T> singleObserver);

    public static <T> Flowable<T> a(Iterable<? extends SingleSource<? extends T>> iterable) {
        Flowable a = Flowable.a(iterable);
        ObjectHelper.a(a, "sources is null");
        ObjectHelper.a(2, "prefetch");
        return RxJavaPlugins.a((Flowable<T>) new FlowableConcatMapPublisher<T>(a, SingleInternalHelper.a(), 2, ErrorMode.IMMEDIATE));
    }

    public static <T> Single<T> a(SingleOnSubscribe<T> singleOnSubscribe) {
        ObjectHelper.a(singleOnSubscribe, "source is null");
        return RxJavaPlugins.a((Single<T>) new SingleCreate<T>(singleOnSubscribe));
    }

    public static <T> Single<T> a(Throwable th) {
        ObjectHelper.a(th, "exception is null");
        Callable a = Functions.a(th);
        ObjectHelper.a(a, "errorSupplier is null");
        return RxJavaPlugins.a((Single<T>) new SingleError<T>(a));
    }

    public static <T> Single<T> a(Callable<? extends T> callable) {
        ObjectHelper.a(callable, "callable is null");
        return RxJavaPlugins.a((Single<T>) new SingleFromCallable<T>(callable));
    }

    public static <T> Single<T> a(ObservableSource<? extends T> observableSource) {
        ObjectHelper.a(observableSource, "observableSource is null");
        return RxJavaPlugins.a((Single<T>) new ObservableSingleSingle<T>(observableSource, null));
    }

    public static <T> Single<T> b(T t) {
        ObjectHelper.a(t, "item is null");
        return RxJavaPlugins.a((Single<T>) new SingleJust<T>(t));
    }

    private static <T> Single<T> a(SingleSource<T> singleSource) {
        ObjectHelper.a(singleSource, "source is null");
        if (singleSource instanceof Single) {
            return RxJavaPlugins.a((Single) singleSource);
        }
        return RxJavaPlugins.a((Single<T>) new SingleFromUnsafeSource<T>(singleSource));
    }

    public static <T1, T2, R> Single<R> a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(singleSource, "source1 is null");
        ObjectHelper.a(singleSource2, "source2 is null");
        return a(Functions.a(biFunction), (SingleSource<? extends T>[]) new SingleSource[]{singleSource, singleSource2});
    }

    public static <T1, T2, T3, R> Single<R> a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.a(singleSource, "source1 is null");
        ObjectHelper.a(singleSource2, "source2 is null");
        ObjectHelper.a(singleSource3, "source3 is null");
        return a(Functions.a(function3), (SingleSource<? extends T>[]) new SingleSource[]{singleSource, singleSource2, singleSource3});
    }

    private static <T, R> Single<R> a(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        ObjectHelper.a(function, "zipper is null");
        ObjectHelper.a(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return a((Throwable) new NoSuchElementException());
        }
        return RxJavaPlugins.a((Single<T>) new SingleZipArray<T>(singleSourceArr, function));
    }

    public final <R> Single<R> a(SingleTransformer<? super T, ? extends R> singleTransformer) {
        return a(((SingleTransformer) ObjectHelper.a(singleTransformer, "transformer is null")).a(this));
    }

    public final Single<T> a(Consumer<? super Disposable> consumer) {
        ObjectHelper.a(consumer, "onSubscribe is null");
        return RxJavaPlugins.a((Single<T>) new SingleDoOnSubscribe<T>(this, consumer));
    }

    public final Single<T> b(Consumer<? super T> consumer) {
        ObjectHelper.a(consumer, "onSuccess is null");
        return RxJavaPlugins.a((Single<T>) new SingleDoOnSuccess<T>(this, consumer));
    }

    public final Single<T> a(BiConsumer<? super T, ? super Throwable> biConsumer) {
        ObjectHelper.a(biConsumer, "onEvent is null");
        return RxJavaPlugins.a((Single<T>) new SingleDoOnEvent<T>(this, biConsumer));
    }

    public final Single<T> c(Consumer<? super Throwable> consumer) {
        ObjectHelper.a(consumer, "onError is null");
        return RxJavaPlugins.a((Single<T>) new SingleDoOnError<T>(this, consumer));
    }

    public final Maybe<T> a(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "predicate is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeFilterSingle<T>(this, predicate));
    }

    public final <R> Single<R> a(Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Single<T>) new SingleFlatMap<T>(this, function));
    }

    public final <R> Flowable<R> b(Function<? super T, ? extends wrf<? extends R>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Flowable<T>) new SingleFlatMapPublisher<T>(this, function));
    }

    public final <U> Observable<U> c(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new SingleFlatMapIterableObservable<T>(this, function));
    }

    public final <R> Observable<R> d(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new SingleFlatMapObservable<T>(this, function));
    }

    public final Completable e(Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Completable) new SingleFlatMapCompletable(this, function));
    }

    public final <R> Single<R> f(Function<? super T, ? extends R> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Single<T>) new SingleMap<T>(this, function));
    }

    public final Single<T> a(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Single<T>) new SingleObserveOn<T>(this, scheduler));
    }

    public final Single<T> g(Function<Throwable, ? extends T> function) {
        ObjectHelper.a(function, "resumeFunction is null");
        return RxJavaPlugins.a((Single<T>) new SingleOnErrorReturn<T>(this, function, null));
    }

    public final Single<T> c(T t) {
        ObjectHelper.a(t, "value is null");
        return RxJavaPlugins.a((Single<T>) new SingleOnErrorReturn<T>(this, null, t));
    }

    public final Single<T> a(Single<? extends T> single) {
        ObjectHelper.a(single, "resumeSingleInCaseOfError is null");
        return h(Functions.b(single));
    }

    public final Single<T> h(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        ObjectHelper.a(function, "resumeFunctionInCaseOfError is null");
        return RxJavaPlugins.a((Single<T>) new SingleResumeNext<T>(this, function));
    }

    public final Single<T> a(long j) {
        return a(c().b(j));
    }

    public final Disposable d(Consumer<? super T> consumer) {
        return a(consumer, Functions.c);
    }

    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObjectHelper.a(consumer, "onSuccess is null");
        ObjectHelper.a(consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        b((SingleObserver<? super T>) consumerSingleObserver);
        return consumerSingleObserver;
    }

    public final void b(SingleObserver<? super T> singleObserver) {
        ObjectHelper.a(singleObserver, "observer is null");
        SingleObserver a = RxJavaPlugins.a(this, singleObserver);
        ObjectHelper.a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final Single<T> b(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Single<T>) new SingleSubscribeOn<T>(this, scheduler));
    }

    public final Single<T> a(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, Schedulers.a(), null);
    }

    public final Single<T> a(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return b(j, timeUnit, scheduler, null);
    }

    public final Single<T> a(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        ObjectHelper.a(singleSource, "other is null");
        return b(j, timeUnit, scheduler, singleSource);
    }

    private Single<T> b(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        SingleTimeout singleTimeout = new SingleTimeout(this, j, timeUnit, scheduler, singleSource);
        return RxJavaPlugins.a((Single<T>) singleTimeout);
    }

    @Deprecated
    public final Completable bd_() {
        return RxJavaPlugins.a((Completable) new CompletableFromSingle(this));
    }

    public final Completable b() {
        return RxJavaPlugins.a((Completable) new CompletableFromSingle(this));
    }

    public final Flowable<T> c() {
        if (this instanceof FuseToFlowable) {
            return ((FuseToFlowable) this).be_();
        }
        return RxJavaPlugins.a((Flowable<T>) new SingleToFlowable<T>(this));
    }

    public final Observable<T> d() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).bg_();
        }
        return RxJavaPlugins.a((Observable<T>) new SingleToObservable<T>(this));
    }

    private static <T> Single<T> a(Flowable<T> flowable) {
        return RxJavaPlugins.a((Single<T>) new FlowableSingleSingle<T>(flowable, null));
    }
}
