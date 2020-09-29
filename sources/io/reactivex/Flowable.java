package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function6;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDefer;
import io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.internal.operators.flowable.FlowableEmpty;
import io.reactivex.internal.operators.flowable.FlowableError;
import io.reactivex.internal.operators.flowable.FlowableFilter;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableJust;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.operators.flowable.FlowableNever;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class Flowable<T> implements xfk<T> {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int a() {
        return a;
    }

    public static Flowable<Integer> a(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return RxJavaPlugins.a(FlowableEmpty.b);
        } else {
            if (i2 == 1) {
                return b((T) Integer.valueOf(1));
            }
            if (((long) (i2 - 1)) + 1 <= 2147483647L) {
                return RxJavaPlugins.a((Flowable<T>) new FlowableRange<T>(1, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    private <U extends Collection<? super T>> Flowable<U> a(int i, int i2, Callable<U> callable) {
        ObjectHelper.a(i, "count");
        ObjectHelper.a(i2, "skip");
        ObjectHelper.a(callable, "bufferSupplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableBuffer<T>(this, i, i2, callable));
    }

    private Flowable<T> a(int i, boolean z, boolean z2) {
        ObjectHelper.a(i, "capacity");
        FlowableOnBackpressureBuffer flowableOnBackpressureBuffer = new FlowableOnBackpressureBuffer(this, i, true, false, Functions.b);
        return RxJavaPlugins.a((Flowable<T>) flowableOnBackpressureBuffer);
    }

    private static Flowable<Long> a(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableInterval flowableInterval = new FlowableInterval(Math.max(0, j), Math.max(0, j2), timeUnit, scheduler);
        return RxJavaPlugins.a((Flowable<T>) flowableInterval);
    }

    public static Flowable<Long> a(long j, TimeUnit timeUnit) {
        return a(1, 1, timeUnit, Schedulers.a());
    }

    public static Flowable<Long> a(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return a(j, j, timeUnit, scheduler);
    }

    private Flowable<T> a(long j, TimeUnit timeUnit, xfk<? extends T> xfk, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "timeUnit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableTimeoutTimed flowableTimeoutTimed = new FlowableTimeoutTimed(this, j, timeUnit, scheduler, null);
        return RxJavaPlugins.a((Flowable<T>) flowableTimeoutTimed);
    }

    public static <T> Flowable<T> a(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(flowableOnSubscribe, "source is null");
        ObjectHelper.a(backpressureStrategy, "mode is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableCreate<T>(flowableOnSubscribe, backpressureStrategy));
    }

    private Flowable<T> a(Scheduler scheduler, boolean z) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableSubscribeOn<T>(this, scheduler, z));
    }

    private Flowable<T> a(Scheduler scheduler, boolean z, int i) {
        ObjectHelper.a(scheduler, "scheduler is null");
        ObjectHelper.a(i, "bufferSize");
        return RxJavaPlugins.a((Flowable<T>) new FlowableObserveOn<T>(this, scheduler, false, i));
    }

    private <R> Flowable<R> a(Function<? super T, ? extends xfk<? extends R>> function, int i, boolean z) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.a((Flowable<T>) new FlowableSwitchMap<T>(this, function, i, false));
        }
        Object call = ((ScalarCallable) this).call();
        return call == null ? RxJavaPlugins.a(FlowableEmpty.b) : FlowableScalarXMap.a(call, function);
    }

    private <R> Flowable<R> a(Function<? super T, ? extends xfk<? extends R>> function, boolean z, int i) {
        return a(function, false, i, a);
    }

    private <R> Flowable<R> a(Function<? super T, ? extends xfk<? extends R>> function, boolean z, int i, int i2) {
        ObjectHelper.a(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            return call == null ? RxJavaPlugins.a(FlowableEmpty.b) : FlowableScalarXMap.a(call, function);
        }
        FlowableFlatMap flowableFlatMap = new FlowableFlatMap(this, function, z, i, i2);
        return RxJavaPlugins.a((Flowable<T>) flowableFlatMap);
    }

    private static <T, R> Flowable<R> a(Function<? super Object[], ? extends R> function, xfk<? extends T>... xfkArr) {
        int i = a;
        ObjectHelper.a(xfkArr, "sources is null");
        if (xfkArr.length == 0) {
            return RxJavaPlugins.a(FlowableEmpty.b);
        }
        ObjectHelper.a(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        return RxJavaPlugins.a((Flowable<T>) new FlowableCombineLatest<T>(xfkArr, function, i, false));
    }

    public static <T> Flowable<T> a(Iterable<? extends T> iterable) {
        ObjectHelper.a(iterable, "source is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableFromIterable<T>(iterable));
    }

    public static <T> Flowable<T> a(Throwable th) {
        ObjectHelper.a(th, "throwable is null");
        Callable a2 = Functions.a(th);
        ObjectHelper.a(a2, "supplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableError<T>(a2));
    }

    public static <T> Flowable<T> a(Callable<? extends xfk<? extends T>> callable) {
        ObjectHelper.a(callable, "supplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDefer<T>(callable));
    }

    private <R> Flowable<R> a(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.a(callable, "seedSupplier is null");
        ObjectHelper.a(biFunction, "accumulator is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableScanSeed<T>(this, callable, biFunction));
    }

    public static <T, D> Flowable<T> a(Callable<? extends D> callable, Function<? super D, ? extends xfk<? extends T>> function, Consumer<? super D> consumer) {
        ObjectHelper.a(callable, "resourceSupplier is null");
        ObjectHelper.a(function, "sourceSupplier is null");
        ObjectHelper.a(consumer, "resourceDisposer is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableUsing<T>(callable, function, consumer, true));
    }

    public static <T> Flowable<T> a(xfk<? extends T> xfk, xfk<? extends T> xfk2) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        return a((T[]) new xfk[]{xfk, xfk2}).a(Functions.a(), false, 2);
    }

    public static <T1, T2, R> Flowable<R> a(xfk<? extends T1> xfk, xfk<? extends T2> xfk2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        return a(Functions.a(biFunction), (xfk<? extends T>[]) new xfk[]{xfk, xfk2});
    }

    public static <T> Flowable<T> a(xfk<? extends T> xfk, xfk<? extends T> xfk2, xfk<? extends T> xfk3) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        ObjectHelper.a(xfk3, "source3 is null");
        return a((T[]) new xfk[]{xfk, xfk2, xfk3}).a(Functions.a(), false, 3);
    }

    public static <T1, T2, T3, R> Flowable<R> a(xfk<? extends T1> xfk, xfk<? extends T2> xfk2, xfk<? extends T3> xfk3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        ObjectHelper.a(xfk3, "source3 is null");
        return a(Functions.a(function3), (xfk<? extends T>[]) new xfk[]{xfk, xfk2, xfk3});
    }

    public static <T> Flowable<T> a(xfk<? extends T> xfk, xfk<? extends T> xfk2, xfk<? extends T> xfk3, xfk<? extends T> xfk4) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        ObjectHelper.a(xfk3, "source3 is null");
        ObjectHelper.a(xfk4, "source4 is null");
        return a((T[]) new xfk[]{xfk, xfk2, xfk3, xfk4}).a(Functions.a(), false, 4);
    }

    public static <T1, T2, T3, T4, R> Flowable<R> a(xfk<? extends T1> xfk, xfk<? extends T2> xfk2, xfk<? extends T3> xfk3, xfk<? extends T4> xfk4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        ObjectHelper.a(xfk3, "source3 is null");
        ObjectHelper.a(xfk4, "source4 is null");
        return a(Functions.a(function4), (xfk<? extends T>[]) new xfk[]{xfk, xfk2, xfk3, xfk4});
    }

    public static <T1, T2, T3, T4, T5, T6, R> Flowable<R> a(xfk<? extends T1> xfk, xfk<? extends T2> xfk2, xfk<? extends T3> xfk3, xfk<? extends T4> xfk4, xfk<? extends T5> xfk5, xfk<? extends T6> xfk6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        ObjectHelper.a(xfk3, "source3 is null");
        ObjectHelper.a(xfk4, "source4 is null");
        ObjectHelper.a(xfk5, "source5 is null");
        ObjectHelper.a(xfk6, "source6 is null");
        return a(Functions.a(function6), (xfk<? extends T>[]) new xfk[]{xfk, xfk2, xfk3, xfk4, xfk5, xfk6});
    }

    private static <T> Flowable<T> a(T... tArr) {
        ObjectHelper.a(tArr, "items is null");
        return tArr.length == 0 ? RxJavaPlugins.a(FlowableEmpty.b) : tArr.length == 1 ? b(tArr[0]) : RxJavaPlugins.a((Flowable<T>) new FlowableFromArray<T>(tArr));
    }

    private static <T> Flowable<T> a(xfk<? extends T>... xfkArr) {
        return RxJavaPlugins.a((Flowable<T>) new FlowableConcatArray<T>(xfkArr, false));
    }

    private Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super xfm> consumer3) {
        ObjectHelper.a(consumer, "onNext is null");
        ObjectHelper.a(consumer2, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        ObjectHelper.a(consumer3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action, consumer3);
        a((FlowableSubscriber<? super T>) lambdaSubscriber);
        return lambdaSubscriber;
    }

    public static <T> Flowable<T> b() {
        return RxJavaPlugins.a(FlowableEmpty.b);
    }

    public static Flowable<Long> b(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, Schedulers.a());
    }

    public static Flowable<Long> b(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableTimer<T>(Math.max(0, j), timeUnit, scheduler));
    }

    public static <T> Flowable<T> b(T t) {
        ObjectHelper.a(t, "item is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableJust<T>(t));
    }

    public static <T> Flowable<T> b(Callable<? extends T> callable) {
        ObjectHelper.a(callable, "supplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableFromCallable<T>(callable));
    }

    private static <T> Flowable<T> b(xfk<? extends T> xfk, xfk<? extends T> xfk2) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        return a((xfk<? extends T>[]) new xfk[]{xfk, xfk2});
    }

    public static <T1, T2, R> Flowable<R> b(xfk<? extends T1> xfk, xfk<? extends T2> xfk2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(xfk, "source1 is null");
        ObjectHelper.a(xfk2, "source2 is null");
        Function a2 = Functions.a(biFunction);
        int i = a;
        xfk[] xfkArr = {xfk, xfk2};
        ObjectHelper.a(a2, "zipper is null");
        ObjectHelper.a(i, "bufferSize");
        FlowableZip flowableZip = new FlowableZip(xfkArr, null, a2, i, false);
        return RxJavaPlugins.a((Flowable<T>) flowableZip);
    }

    public static <T> Flowable<T> d() {
        return RxJavaPlugins.a(FlowableNever.b);
    }

    private static <T> Flowable<T> d(xfk<? extends T> xfk) {
        if (xfk instanceof Flowable) {
            return RxJavaPlugins.a((Flowable) xfk);
        }
        ObjectHelper.a(xfk, "source is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableFromPublisher<T>(xfk));
    }

    private Flowable<T> g(Function<? super Throwable, ? extends xfk<? extends T>> function) {
        ObjectHelper.a(function, "resumeFunction is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableOnErrorNext<T>(this, function, false));
    }

    public final <R> Flowable<R> a(FlowableTransformer<? super T, ? extends R> flowableTransformer) {
        return d(((FlowableTransformer) ObjectHelper.a(flowableTransformer, "composer is null")).apply(this));
    }

    public final Flowable<T> a(Scheduler scheduler) {
        return a(scheduler, false, a);
    }

    public final Flowable<T> a(Action action) {
        ObjectHelper.a(action, "onFinally is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDoFinally<T>(this, action));
    }

    public final Flowable<T> a(Consumer<? super T> consumer) {
        Consumer b = Functions.b();
        Action action = Functions.b;
        return a(consumer, b, action, action);
    }

    public Flowable<T> a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        ObjectHelper.a(consumer, "onNext is null");
        ObjectHelper.a(consumer2, "onError is null");
        ObjectHelper.a(action, "onComplete is null");
        ObjectHelper.a(action2, "onAfterTerminate is null");
        FlowableDoOnEach flowableDoOnEach = new FlowableDoOnEach(this, consumer, consumer2, action, action2);
        return RxJavaPlugins.a((Flowable<T>) flowableDoOnEach);
    }

    public final Flowable<T> a(Consumer<? super xfm> consumer, LongConsumer longConsumer, Action action) {
        ObjectHelper.a(consumer, "onSubscribe is null");
        ObjectHelper.a(longConsumer, "onRequest is null");
        ObjectHelper.a(action, "onCancel is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDoOnLifecycle<T>(this, consumer, longConsumer, action));
    }

    public final <K> Flowable<T> a(Function<? super T, K> function) {
        ObjectHelper.a(function, "keySelector is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDistinctUntilChanged<T>(this, function, ObjectHelper.a()));
    }

    public final Flowable<T> a(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "predicate is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableFilter<T>(this, predicate));
    }

    public final <U> Flowable<U> a(Class<U> cls) {
        ObjectHelper.a(cls, "clazz is null");
        return c(Functions.a(cls));
    }

    public final <R> Flowable<R> a(R r, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.a(r, "initialValue is null");
        return a(Functions.a(r), biFunction);
    }

    public final Flowable<T> a(xfk<? extends T> xfk) {
        ObjectHelper.a(xfk, "other is null");
        return b((xfk<? extends T>) this, xfk);
    }

    public final <U, R> Flowable<R> a(xfk<? extends U> xfk, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.a(xfk, "other is null");
        ObjectHelper.a(biFunction, "combiner is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableWithLatestFrom<T>(this, biFunction, xfk));
    }

    public final Single<T> a(long j) {
        return RxJavaPlugins.a((Single<T>) new FlowableElementAtSingle<T>(this, 0, null));
    }

    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return a(consumer, consumer2, Functions.b, (Consumer<? super xfm>) RequestMax.INSTANCE);
    }

    public final ConnectableFlowable<T> a(int i) {
        ObjectHelper.a(1, "bufferSize");
        return FlowableReplay.a(this, 1);
    }

    public final void a(FlowableSubscriber<? super T> flowableSubscriber) {
        ObjectHelper.a(flowableSubscriber, "s is null");
        try {
            xfl a2 = RxJavaPlugins.a(this, (xfl<? super T>) flowableSubscriber);
            ObjectHelper.a(a2, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            a(a2);
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

    /* access modifiers changed from: protected */
    public abstract void a(xfl<? super T> xfl);

    public final Flowable<List<T>> b(int i, int i2) {
        return a(i, 1, ArrayListSupplier.a());
    }

    public final Flowable<T> b(long j) {
        Predicate c = Functions.c();
        if (j >= 0) {
            ObjectHelper.a(c, "predicate is null");
            return RxJavaPlugins.a((Flowable<T>) new FlowableRetryPredicate<T>(this, j, c));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Flowable<T> b(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return a(scheduler, !(this instanceof FlowableCreate));
    }

    public final Flowable<T> b(Consumer<? super xfm> consumer) {
        return a(consumer, Functions.d, Functions.b);
    }

    public final <R> Flowable<R> b(Function<? super T, ? extends xfk<? extends R>> function) {
        int i = a;
        return a(function, false, i, i);
    }

    public final Flowable<T> b(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "stopPredicate is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableTakeUntilPredicate<T>(this, predicate));
    }

    public final Flowable<T> b(xfk<? extends T> xfk) {
        ObjectHelper.a(xfk, "next is null");
        return g(Functions.b(xfk));
    }

    public final void b(xfl<? super T> xfl) {
        if (xfl instanceof FlowableSubscriber) {
            a((FlowableSubscriber) xfl);
            return;
        }
        ObjectHelper.a(xfl, "s is null");
        a((FlowableSubscriber<? super T>) new StrictSubscriber<Object>(xfl));
    }

    public final Flowable<T> c(long j) {
        if (j >= 0) {
            return RxJavaPlugins.a((Flowable<T>) new FlowableTake<T>(this, j));
        }
        StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Flowable<T> c(long j, TimeUnit timeUnit) {
        return c(j, timeUnit, Schedulers.a());
    }

    public final Flowable<T> c(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableDebounceTimed flowableDebounceTimed = new FlowableDebounceTimed(this, j, timeUnit, scheduler);
        return RxJavaPlugins.a((Flowable<T>) flowableDebounceTimed);
    }

    public final <R> Flowable<R> c(Function<? super T, ? extends R> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableMap<T>(this, function));
    }

    public final Flowable<T> c(T t) {
        ObjectHelper.a(t, "value is null");
        return a((xfk<? extends T>[]) new xfk[]{b(t), this});
    }

    public final Flowable<T> c(xfk<? extends T> xfk) {
        ObjectHelper.a(xfk, "other is null");
        return a((xfk<? extends T>[]) new xfk[]{xfk, this});
    }

    public final Disposable c(Consumer<? super T> consumer) {
        return a(consumer, Functions.c, Functions.b, (Consumer<? super xfm>) RequestMax.INSTANCE);
    }

    public final Flowable<T> d(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, Schedulers.a());
    }

    public final Flowable<T> d(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableSampleTimed flowableSampleTimed = new FlowableSampleTimed(this, j, timeUnit, scheduler, false);
        return RxJavaPlugins.a((Flowable<T>) flowableSampleTimed);
    }

    public final Flowable<T> d(Function<? super Throwable, ? extends T> function) {
        ObjectHelper.a(function, "valueSupplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableOnErrorReturn<T>(this, function));
    }

    public final Flowable<T> e() {
        return a(a, false, true);
    }

    public final Flowable<T> e(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return a(j, timeUnit, null, scheduler);
    }

    public final <R> Flowable<R> e(Function<? super T, ? extends xfk<? extends R>> function) {
        return a(function, a, false);
    }

    public final Flowable<T> f() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableOnBackpressureDrop<T>(this));
    }

    public final <R> Flowable<R> f(Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableSwitchMapSingle<T>(this, function, false));
    }

    public final Flowable<T> g() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableOnBackpressureLatest<T>(this));
    }

    public final ConnectableFlowable<T> h() {
        int i = a;
        ObjectHelper.a(i, "bufferSize");
        return FlowablePublish.a(this, i);
    }

    public final Single<T> i() {
        return RxJavaPlugins.a((Single<T>) new FlowableSingleSingle<T>(this, null));
    }

    public final Observable<T> j() {
        return RxJavaPlugins.a((Observable<T>) new ObservableFromPublisher<T>(this));
    }
}
