package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private Function<? super T, ? extends xfk<? extends R>> c;
    private int d;
    private ErrorMode e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ErrorMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                io.reactivex.internal.util.ErrorMode[] r0 = io.reactivex.internal.util.ErrorMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.BOUNDARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.<clinit>():void");
        }
    }

    static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, xfm {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final int limit;
        final Function<? super T, ? extends xfk<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        xfm upstream;

        BaseConcatMapSubscriber(Function<? super T, ? extends xfk<? extends R>> function, int i) {
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a = queueSubscription.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = queueSubscription;
                        this.done = true;
                        d();
                        b();
                        return;
                    } else if (a == 2) {
                        this.sourceMode = a;
                        this.queue = queueSubscription;
                        d();
                        xfm.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                d();
                xfm.a((long) this.prefetch);
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void b();

        public final void b_(T t) {
            if (this.sourceMode == 2 || this.queue.a(t)) {
                b();
                return;
            }
            this.upstream.a();
            onError(new IllegalStateException("Queue full?!"));
        }

        public final void c() {
            this.done = true;
            b();
        }

        /* access modifiers changed from: 0000 */
        public abstract void d();

        public final void e() {
            this.active = false;
            b();
        }
    }

    static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final xfl<? super R> downstream;
        final boolean veryEnd;

        ConcatMapDelayed(xfl<? super R> xfl, Function<? super T, ? extends xfk<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.downstream = xfl;
            this.veryEnd = z;
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.a();
                this.upstream.a();
            }
        }

        public final void a(long j) {
            this.inner.a(j);
        }

        public final void a(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                if (!this.veryEnd) {
                    this.upstream.a();
                    this.done = true;
                }
                this.active = false;
                b();
                return;
            }
            RxJavaPlugins.a(th);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        if (!z || this.veryEnd || ((Throwable) this.errors.get()) == null) {
                            try {
                                Object ba_ = this.queue.ba_();
                                boolean z2 = ba_ == null;
                                if (z && z2) {
                                    Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                                    if (a != null) {
                                        this.downstream.onError(a);
                                        return;
                                    } else {
                                        this.downstream.c();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        xfk xfk = (xfk) ObjectHelper.a(this.mapper.apply(ba_), "The mapper returned a null Publisher");
                                        if (this.sourceMode != 1) {
                                            int i = this.consumed + 1;
                                            if (i == this.limit) {
                                                this.consumed = 0;
                                                this.upstream.a((long) i);
                                            } else {
                                                this.consumed = i;
                                            }
                                        }
                                        if (xfk instanceof Callable) {
                                            try {
                                                Object call = ((Callable) xfk).call();
                                                if (call == null) {
                                                    continue;
                                                } else if (this.inner.b()) {
                                                    this.downstream.b_(call);
                                                } else {
                                                    this.active = true;
                                                    this.inner.b(new WeakScalarSubscription(call, this.inner));
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.b(th);
                                                this.upstream.a();
                                                ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                                                this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                return;
                                            }
                                        } else {
                                            this.active = true;
                                            xfk.b(this.inner);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.b(th2);
                                        this.upstream.a();
                                        ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th2);
                                        this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                Exceptions.b(th3);
                                this.upstream.a();
                                ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th3);
                                this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                return;
                            }
                        } else {
                            this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void b(R r) {
            this.downstream.b_(r);
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            this.downstream.a(this);
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                this.done = true;
                b();
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final xfl<? super R> downstream;
        final AtomicInteger wip = new AtomicInteger();

        ConcatMapImmediate(xfl<? super R> xfl, Function<? super T, ? extends xfk<? extends R>> function, int i) {
            super(function, i);
            this.downstream = xfl;
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.a();
                this.upstream.a();
            }
        }

        public final void a(long j) {
            this.inner.a(j);
        }

        public final void a(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                this.upstream.a();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                }
            } else {
                RxJavaPlugins.a(th);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            Object ba_ = this.queue.ba_();
                            boolean z2 = ba_ == null;
                            if (z && z2) {
                                this.downstream.c();
                                return;
                            } else if (!z2) {
                                try {
                                    xfk xfk = (xfk) ObjectHelper.a(this.mapper.apply(ba_), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.a((long) i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (xfk instanceof Callable) {
                                        try {
                                            Object call = ((Callable) xfk).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.inner.b()) {
                                                this.active = true;
                                                this.inner.b(new WeakScalarSubscription(call, this.inner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.b_(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.b(th);
                                            this.upstream.a();
                                            ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                                            this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        xfk.b(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.b(th2);
                                    this.upstream.a();
                                    ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th2);
                                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.b(th3);
                            this.upstream.a();
                            ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th3);
                            this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void b(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.b_(r);
                if (!compareAndSet(1, 0)) {
                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            this.downstream.a(this);
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                this.inner.a();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                }
            } else {
                RxJavaPlugins.a(th);
            }
        }
    }

    static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        public final void a(xfm xfm) {
            b(xfm);
        }

        public final void b_(R r) {
            this.produced++;
            this.parent.b(r);
        }

        public final void c() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                d(j);
            }
            this.parent.e();
        }

        public final void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                d(j);
            }
            this.parent.a(th);
        }
    }

    interface ConcatMapSupport<T> {
        void a(Throwable th);

        void b(T t);

        void e();
    }

    static final class WeakScalarSubscription<T> implements xfm {
        private xfl<? super T> a;
        private T b;
        private boolean c;

        WeakScalarSubscription(T t, xfl<? super T> xfl) {
            this.b = t;
            this.a = xfl;
        }

        public final void a() {
        }

        public final void a(long j) {
            if (j > 0 && !this.c) {
                this.c = true;
                xfl<? super T> xfl = this.a;
                xfl.b_(this.b);
                xfl.c();
            }
        }
    }

    public static <T, R> xfl<T> a(xfl<? super R> xfl, Function<? super T, ? extends xfk<? extends R>> function, int i, ErrorMode errorMode) {
        int i2 = AnonymousClass1.a[errorMode.ordinal()];
        return i2 != 1 ? i2 != 2 ? new ConcatMapImmediate(xfl, function, i) : new ConcatMapDelayed(xfl, function, i, true) : new ConcatMapDelayed(xfl, function, i, false);
    }

    public final void a(xfl<? super R> xfl) {
        if (!FlowableScalarXMap.a(this.b, xfl, this.c)) {
            this.b.b(a(xfl, this.c, this.d, this.e));
        }
    }
}
