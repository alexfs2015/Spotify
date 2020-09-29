package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.observers.BlockingFirstObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.internal.operators.observable.ObservableDelay;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableError;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.internal.operators.observable.ObservableFromArray;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
import io.reactivex.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.internal.operators.observable.ObservableHide;
import io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableNever;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableScan;
import io.reactivex.internal.operators.observable.ObservableScanSeed;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.observable.ObservableSkip;
import io.reactivex.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTake;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableToListSingle;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class Observable<T> implements ObservableSource<T> {

    /* renamed from: io.reactivex.Observable$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BackpressureStrategy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.Observable.AnonymousClass1.<clinit>():void");
        }
    }

    public static Observable<Integer> a(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return c();
        } else {
            if (i2 == 1) {
                return b((T) Integer.valueOf(1));
            }
            if (((long) (i2 - 1)) + 1 <= 2147483647L) {
                return RxJavaPlugins.a((Observable<T>) new ObservableRange<T>(1, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public static Observable<Long> a(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        ObservableInterval observableInterval = new ObservableInterval(Math.max(0, 30), Math.max(0, 30), timeUnit, scheduler);
        return RxJavaPlugins.a((Observable<T>) observableInterval);
    }

    public static Observable<Long> a(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, Schedulers.a());
    }

    public static Observable<Long> a(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableTimer<T>(Math.max(j, 0), timeUnit, scheduler));
    }

    private Observable<T> a(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        ObservableDelay observableDelay = new ObservableDelay(this, j, timeUnit, scheduler, false);
        return RxJavaPlugins.a((Observable<T>) observableDelay);
    }

    public static <T> Observable<T> a(ObservableOnSubscribe<T> observableOnSubscribe) {
        ObjectHelper.a(observableOnSubscribe, "source is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableCreate<T>(observableOnSubscribe));
    }

    public static <T> Observable<T> a(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        int a = Flowable.a();
        ObjectHelper.a(observableSource, "sources is null");
        ObjectHelper.a(a, "bufferSize");
        return RxJavaPlugins.a((Observable<T>) new ObservableSwitchMap<T>(observableSource, Functions.a(), a, false));
    }

    public static <T> Observable<T> a(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        return c((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    public static <T> Observable<T> a(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        ObjectHelper.a(observableSource3, "source3 is null");
        return a((T[]) new ObservableSource[]{observableSource, observableSource2, observableSource3}).a(Functions.a(), false, 3);
    }

    public static <T1, T2, T3, T4, R> Observable<R> a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        ObjectHelper.a(observableSource3, "source3 is null");
        ObjectHelper.a(observableSource4, "source4 is null");
        return a(Functions.a(function4), Flowable.a(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4});
    }

    public static <T1, T2, T3, R> Observable<R> a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        ObjectHelper.a(observableSource3, "source3 is null");
        return a(Functions.a(function3), Flowable.a(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3});
    }

    public static <T1, T2, R> Observable<R> a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        return a(Functions.a(biFunction), Flowable.a(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    private Observable<T> a(Scheduler scheduler, boolean z, int i) {
        ObjectHelper.a(scheduler, "scheduler is null");
        ObjectHelper.a(i, "bufferSize");
        return RxJavaPlugins.a((Observable<T>) new ObservableObserveOn<T>(this, scheduler, false, i));
    }

    private Observable<T> a(Consumer<? super Disposable> consumer, Action action) {
        ObjectHelper.a(consumer, "onSubscribe is null");
        ObjectHelper.a(action, "onDispose is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableDoOnLifecycle<T>(this, consumer, action));
    }

    private Observable<T> a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        ObjectHelper.a(consumer, "onNext is null");
        ObjectHelper.a(consumer2, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        ObjectHelper.a(action2, "onAfterTerminate is null");
        ObservableDoOnEach observableDoOnEach = new ObservableDoOnEach(this, consumer, consumer2, action, action2);
        return RxJavaPlugins.a((Observable<T>) observableDoOnEach);
    }

    private static <T, R> Observable<R> a(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        ObjectHelper.a(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return c();
        }
        ObjectHelper.a(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        ObservableCombineLatest observableCombineLatest = new ObservableCombineLatest(observableSourceArr, null, function, i << 1, false);
        return RxJavaPlugins.a((Observable<T>) observableCombineLatest);
    }

    private <R> Observable<R> a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return a(function, z, i, Flowable.a());
    }

    private static <T, R> Observable<R> a(Function<? super Object[], ? extends R> function, boolean z, int i, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return c();
        }
        ObjectHelper.a(function, "zipper is null");
        ObjectHelper.a(i, "bufferSize");
        ObservableZip observableZip = new ObservableZip(observableSourceArr, null, function, i, false);
        return RxJavaPlugins.a((Observable<T>) observableZip);
    }

    public static <T> Observable<T> a(Iterable<? extends T> iterable) {
        ObjectHelper.a(iterable, "source is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFromIterable<T>(iterable));
    }

    public static <T, R> Observable<R> a(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        int a = Flowable.a();
        ObjectHelper.a(iterable, "sources is null");
        ObjectHelper.a(function, "combiner is null");
        ObjectHelper.a(a, "bufferSize");
        ObservableCombineLatest observableCombineLatest = new ObservableCombineLatest(null, iterable, function, a << 1, false);
        return RxJavaPlugins.a((Observable<T>) observableCombineLatest);
    }

    public static <T> Observable<T> a(T t, T t2) {
        ObjectHelper.a(t, "item1 is null");
        ObjectHelper.a(t2, "item2 is null");
        return a((T[]) new Object[]{t, t2});
    }

    public static <T> Observable<T> a(Throwable th) {
        ObjectHelper.a(th, "exception is null");
        Callable a = Functions.a(th);
        ObjectHelper.a(a, "errorSupplier is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableError<T>(a));
    }

    public static <T> Observable<T> a(Callable<? extends ObservableSource<? extends T>> callable) {
        ObjectHelper.a(callable, "supplier is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableDefer<T>(callable));
    }

    private <R> Observable<R> a(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.a(callable, "seedSupplier is null");
        ObjectHelper.a(biFunction, "accumulator is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableScanSeed<T>(this, callable, biFunction));
    }

    public static <T> Observable<T> a(ObservableSource<? extends T>... observableSourceArr) {
        ObjectHelper.a(observableSourceArr, "sources is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableAmb<T>(observableSourceArr, null));
    }

    private static <T> Observable<T> a(T... tArr) {
        ObjectHelper.a(tArr, "items is null");
        return tArr.length == 0 ? c() : tArr.length == 1 ? b(tArr[0]) : RxJavaPlugins.a((Observable<T>) new ObservableFromArray<T>(tArr));
    }

    public static int b() {
        return Flowable.a();
    }

    public static <T> Observable<T> b(ObservableSource<T> observableSource) {
        ObjectHelper.a(observableSource, "source is null");
        return observableSource instanceof Observable ? RxJavaPlugins.a((Observable) observableSource) : RxJavaPlugins.a((Observable<T>) new ObservableFromUnsafeSource<T>(observableSource));
    }

    public static <T> Observable<T> b(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        return a((T[]) new ObservableSource[]{observableSource, observableSource2}).a(Functions.a(), false, 2);
    }

    public static <T1, T2, T3, R> Observable<R> b(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        ObjectHelper.a(observableSource3, "source3 is null");
        return a(Functions.a(function3), false, Flowable.a(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3});
    }

    public static <T1, T2, R> Observable<R> b(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(observableSource, "source1 is null");
        ObjectHelper.a(observableSource2, "source2 is null");
        return a(Functions.a(biFunction), false, Flowable.a(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    private <U, V> Observable<T> b(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.a(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableTimeout<T>(this, observableSource, function, observableSource2));
    }

    public static <T> Observable<T> b(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return a(iterable).a(Functions.a(), false);
    }

    public static <T> Observable<T> b(T t) {
        ObjectHelper.a(t, "item is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableJust<T>(t));
    }

    public static <T> Observable<T> b(Callable<? extends T> callable) {
        ObjectHelper.a(callable, "supplier is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFromCallable<T>(callable));
    }

    public static <T> Observable<T> b(ObservableSource<? extends T>... observableSourceArr) {
        return a((T[]) observableSourceArr).c(Functions.a(), observableSourceArr.length);
    }

    public static <T> Observable<T> c() {
        return RxJavaPlugins.a(ObservableEmpty.a);
    }

    private static <T> Observable<T> c(ObservableSource<? extends T>... observableSourceArr) {
        return RxJavaPlugins.a((Observable<T>) new ObservableConcatMap<T>(a((T[]) observableSourceArr), Functions.a(), Flowable.a(), ErrorMode.BOUNDARY));
    }

    public static <T> Observable<T> d() {
        return RxJavaPlugins.a(ObservableNever.a);
    }

    private <R> Observable<R> d(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.a((Observable<T>) new ObservableSwitchMap<T>(this, function, i, false));
        }
        Object call = ((ScalarCallable) this).call();
        return call == null ? c() : ObservableScalarXMap.a(call, function);
    }

    public final Flowable<T> a(BackpressureStrategy backpressureStrategy) {
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int i = AnonymousClass1.a[backpressureStrategy.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? flowableFromObservable.e() : RxJavaPlugins.a((Flowable<T>) new FlowableOnBackpressureError<T>(flowableFromObservable)) : flowableFromObservable : flowableFromObservable.g() : flowableFromObservable.f();
    }

    public Observable<T> a(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "timeUnit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        ObservableTimeoutTimed observableTimeoutTimed = new ObservableTimeoutTimed(this, j, timeUnit, scheduler, observableSource);
        return RxJavaPlugins.a((Observable<T>) observableTimeoutTimed);
    }

    public final <U, R> Observable<R> a(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.a(observableSource, "other is null");
        ObjectHelper.a(biFunction, "combiner is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableWithLatestFrom<T>(this, biFunction, observableSource));
    }

    public final <U, V> Observable<T> a(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.a(observableSource, "firstTimeoutIndicator is null");
        ObjectHelper.a(observableSource2, "other is null");
        return b(observableSource, function, observableSource2);
    }

    public final <R> Observable<R> a(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        return b(((ObservableTransformer) ObjectHelper.a(observableTransformer, "composer is null")).apply(this));
    }

    public final Observable<T> a(Scheduler scheduler) {
        return a(scheduler, false, Flowable.a());
    }

    public final Observable<T> a(Action action) {
        return a(Functions.b(), action);
    }

    public final Observable<T> a(BiFunction<T, T, T> biFunction) {
        ObjectHelper.a(biFunction, "accumulator is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableScan<T>(this, biFunction));
    }

    public final Observable<T> a(BiPredicate<? super T, ? super T> biPredicate) {
        ObjectHelper.a(biPredicate, "comparer is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableDistinctUntilChanged<T>(this, Functions.a(), biPredicate));
    }

    public final Observable<T> a(Consumer<? super Throwable> consumer) {
        Consumer b = Functions.b();
        Action action = Functions.b;
        return a(b, consumer, action, action);
    }

    public final <K> Observable<T> a(Function<? super T, K> function) {
        ObjectHelper.a(function, "keySelector is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableDistinctUntilChanged<T>(this, function, ObjectHelper.a()));
    }

    public final <R> Observable<R> a(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(2, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.a((Observable<T>) new ObservableConcatMap<T>(this, function, 2, ErrorMode.IMMEDIATE));
        }
        Object call = ((ScalarCallable) this).call();
        return call == null ? c() : ObservableScalarXMap.a(call, function);
    }

    public final <R> Observable<R> a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return a(function, false, Integer.MAX_VALUE);
    }

    public final <R> Observable<R> a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            return call == null ? c() : ObservableScalarXMap.a(call, function);
        }
        ObservableFlatMap observableFlatMap = new ObservableFlatMap(this, function, z, i, i2);
        return RxJavaPlugins.a((Observable<T>) observableFlatMap);
    }

    public final Observable<T> a(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "predicate is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFilter<T>(this, predicate));
    }

    public final <U> Observable<U> a(Class<U> cls) {
        ObjectHelper.a(cls, "clazz is null");
        return c(Functions.a(cls));
    }

    public final <R> Observable<R> a(R r, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.a(r, "initialValue is null");
        return a(Functions.a(r), biFunction);
    }

    public final Single<T> a(long j) {
        return RxJavaPlugins.a((Single<T>) new ObservableElementAtSingle<T>(this, 0, null));
    }

    public final Single<T> a(long j, T t) {
        ObjectHelper.a(t, "defaultItem is null");
        return RxJavaPlugins.a((Single<T>) new ObservableElementAtSingle<T>(this, 0, t));
    }

    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return a(consumer, consumer2, Functions.b, Functions.b());
    }

    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        ObjectHelper.a(consumer, "onNext is null");
        ObjectHelper.a(consumer2, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        ObjectHelper.a(consumer3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, consumer3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    public final ConnectableObservable<T> a(int i) {
        ObjectHelper.a(1, "bufferSize");
        return ObservableReplay.a((ObservableSource<T>) this, 1);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Observer<? super T> observer);

    public final Completable b(Function<? super T, ? extends CompletableSource> function, int i) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(2, "capacityHint");
        return RxJavaPlugins.a((Completable) new ObservableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, 2));
    }

    public final Completable b(Function<? super T, ? extends CompletableSource> function, boolean z) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Completable) new ObservableFlatMapCompletableCompletable(this, function, false));
    }

    public final Observable<T> b(long j) {
        return j <= 0 ? RxJavaPlugins.a(this) : RxJavaPlugins.a((Observable<T>) new ObservableSkip<T>(this, j));
    }

    public final Observable<T> b(long j, TimeUnit timeUnit) {
        return b(200, timeUnit, Schedulers.a());
    }

    public final Observable<T> b(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        ObservableDebounceTimed observableDebounceTimed = new ObservableDebounceTimed(this, j, timeUnit, scheduler);
        return RxJavaPlugins.a((Observable<T>) observableDebounceTimed);
    }

    public final <U, R> Observable<R> b(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.a(observableSource, "other is null");
        return b((ObservableSource<? extends T1>) this, observableSource, biFunction);
    }

    public final Observable<T> b(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableSubscribeOn<T>(this, scheduler));
    }

    public final Observable<T> b(Action action) {
        return a(Functions.b(), Functions.b(), action, Functions.b);
    }

    public final Observable<T> b(Consumer<? super T> consumer) {
        Consumer b = Functions.b();
        Action action = Functions.b;
        return a(consumer, b, action, action);
    }

    public final <U> Observable<U> b(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFlattenIterable<T>(this, function));
    }

    public final Observable<T> b(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "stopPredicate is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableTakeUntilPredicate<T>(this, predicate));
    }

    public final Single<List<T>> b(int i) {
        ObjectHelper.a(16, "capacityHint");
        return RxJavaPlugins.a((Single<T>) new ObservableToListSingle<T>(this, 16));
    }

    public final Observable<T> c(long j) {
        return RxJavaPlugins.a((Observable<T>) new ObservableTake<T>(this, 1));
    }

    public final Observable<T> c(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, null, Schedulers.a());
    }

    public final Observable<T> c(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return a(j, timeUnit, scheduler, false);
    }

    public final Observable<T> c(ObservableSource<? extends T> observableSource) {
        ObjectHelper.a(observableSource, "other is null");
        return a((ObservableSource<? extends T>) this, observableSource);
    }

    public final Observable<T> c(Consumer<? super Disposable> consumer) {
        return a(consumer, Functions.b);
    }

    public final <R> Observable<R> c(Function<? super T, ? extends R> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableMap<T>(this, function));
    }

    public final <R> Observable<R> c(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        return a(function, false, i, Flowable.a());
    }

    public final <R> Observable<R> c(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFlatMapMaybe<T>(this, function, false));
    }

    public final Observable<T> c(T t) {
        ObjectHelper.a(t, "item is null");
        return e(Functions.b(t));
    }

    public final Observable<T> d(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return a(j, timeUnit, null, scheduler);
    }

    public final Observable<T> d(ObservableSource<? extends T> observableSource) {
        ObjectHelper.a(observableSource, "next is null");
        return d(Functions.b(observableSource));
    }

    public final Observable<T> d(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        ObjectHelper.a(function, "resumeFunction is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableOnErrorNext<T>(this, function, false));
    }

    public final <R> Observable<R> d(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableFlatMapSingle<T>(this, function, false));
    }

    public final Single<T> d(T t) {
        ObjectHelper.a(t, "defaultItem is null");
        return RxJavaPlugins.a((Single<T>) new ObservableSingleSingle<T>(this, t));
    }

    public final Disposable d(Consumer<? super T> consumer) {
        return a(consumer, Functions.c, Functions.b, Functions.b());
    }

    public final <U> Observable<T> e(ObservableSource<U> observableSource) {
        ObjectHelper.a(observableSource, "other is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableSkipUntil<T>(this, observableSource));
    }

    public final Observable<T> e(Function<? super Throwable, ? extends T> function) {
        ObjectHelper.a(function, "valueSupplier is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableOnErrorReturn<T>(this, function));
    }

    public final Observable<T> e(T t) {
        ObjectHelper.a(t, "item is null");
        return c((ObservableSource<? extends T>[]) new ObservableSource[]{b(t), this});
    }

    public final T e() {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T c = blockingFirstObserver.c();
        if (c != null) {
            return c;
        }
        throw new NoSuchElementException();
    }

    public final Observable<T> f() {
        return RxJavaPlugins.a((Observable<T>) new ObservableHide<T>(this));
    }

    public final Observable<T> f(ObservableSource<? extends T> observableSource) {
        ObjectHelper.a(observableSource, "other is null");
        return c((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, this});
    }

    public final <R> Observable<R> f(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        ObjectHelper.a(function, "selector is null");
        return RxJavaPlugins.a((Observable<T>) new ObservablePublishSelector<T>(this, function));
    }

    public final Completable g() {
        return RxJavaPlugins.a((Completable) new ObservableIgnoreElementsCompletable(this));
    }

    public final <U> Observable<T> g(ObservableSource<U> observableSource) {
        ObjectHelper.a(observableSource, "other is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableTakeUntil<T>(this, observableSource));
    }

    public final Observable<T> g(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        ObjectHelper.a(function, "handler is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableRetryWhen<T>(this, function));
    }

    public final <R> Observable<R> h(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return d(function, Flowable.a());
    }

    public final Single<T> h() {
        return RxJavaPlugins.a((Single<T>) new ObservableSingleSingle<T>(this, null));
    }

    public final Completable i(Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Completable) new ObservableSwitchMapCompletable(this, function, false));
    }

    public final Disposable i() {
        return a(Functions.b(), Functions.c, Functions.b, Functions.b());
    }

    public final <R> Observable<R> j(Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableSwitchMapSingle<T>(this, function, false));
    }

    public final <R> R k(Function<? super Observable<T>, R> function) {
        try {
            return ((Function) ObjectHelper.a(function, "converter is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.b(th);
            throw ExceptionHelper.a(th);
        }
    }

    public final void subscribe(Observer<? super T> observer) {
        ObjectHelper.a(observer, "observer is null");
        try {
            Observer a = RxJavaPlugins.a(this, observer);
            ObjectHelper.a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
