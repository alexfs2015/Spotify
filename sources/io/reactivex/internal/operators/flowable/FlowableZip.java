package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableZip<T, R> extends Flowable<R> {
    private xfk<? extends T>[] b;
    private Iterable<? extends xfk<? extends T>> c = null;
    private Function<? super Object[], ? extends R> d;
    private int e;
    private boolean f;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements xfm {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final xfl<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        ZipCoordinator(xfl<? super R> xfl, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = xfl;
            this.zipper = function;
            this.delayErrors = z;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        private void c() {
            for (ZipSubscriber<T, R> a : this.subscribers) {
                a.a();
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                c();
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                zipSubscriber.done = true;
                b();
                return;
            }
            RxJavaPlugins.a(th);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (getAndIncrement() == 0) {
                xfl<? super R> xfl = this.downstream;
                ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
                int length = zipSubscriberArr.length;
                Object[] objArr = this.current;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i2];
                                    if (objArr[i2] == null) {
                                        try {
                                            boolean z2 = zipSubscriber.done;
                                            SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                            Object ba_ = simpleQueue != null ? simpleQueue.ba_() : null;
                                            boolean z3 = ba_ == null;
                                            if (!z2 || !z3) {
                                                if (!z3) {
                                                    objArr[i2] = ba_;
                                                }
                                                z = true;
                                            } else {
                                                c();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                    return;
                                                } else {
                                                    xfl.c();
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.b(th);
                                            ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                                            if (!this.delayErrors) {
                                                c();
                                                xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                try {
                                    xfl.b_(ObjectHelper.a(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, null);
                                } catch (Throwable th2) {
                                    Exceptions.b(th2);
                                    c();
                                    ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th2);
                                    xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                    return;
                                }
                            } else {
                                c();
                                xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j == j2) {
                        if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z4 = zipSubscriber2.done;
                                            SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                            Object ba_2 = simpleQueue2 != null ? simpleQueue2.ba_() : null;
                                            boolean z5 = ba_2 == null;
                                            if (z4 && z5) {
                                                c();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                    return;
                                                } else {
                                                    xfl.c();
                                                    return;
                                                }
                                            } else if (!z5) {
                                                objArr[i3] = ba_2;
                                            }
                                        } catch (Throwable th3) {
                                            Exceptions.b(th3);
                                            ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th3);
                                            if (!this.delayErrors) {
                                                c();
                                                xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                c();
                                xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (ZipSubscriber<T, R> a : zipSubscriberArr) {
                            a.a(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class ZipSubscriber<T, R> extends AtomicReference<xfm> implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void a() {
            SubscriptionHelper.a((AtomicReference<xfm>) this);
        }

        public final void a(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((xfm) get()).a(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a((AtomicReference<xfm>) this, xfm)) {
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a = queueSubscription.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.b();
                        return;
                    } else if (a == 2) {
                        this.sourceMode = a;
                        this.queue = queueSubscription;
                        xfm.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                xfm.a((long) this.prefetch);
            }
        }

        public final void b_(T t) {
            if (this.sourceMode != 2) {
                this.queue.a(t);
            }
            this.parent.b();
        }

        public final void c() {
            this.done = true;
            this.parent.b();
        }

        public final void onError(Throwable th) {
            this.parent.a(this, th);
        }
    }

    public FlowableZip(xfk<? extends T>[] xfkArr, Iterable<? extends xfk<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.b = xfkArr;
        this.d = function;
        this.e = i;
        this.f = z;
    }

    public final void a(xfl<? super R> xfl) {
        int i;
        xfk<? extends T>[] xfkArr = this.b;
        if (xfkArr == null) {
            xfkArr = new xfk[8];
            i = 0;
            for (xfk<? extends T> xfk : this.c) {
                if (i == xfkArr.length) {
                    xfk<? extends T>[] xfkArr2 = new xfk[((i >> 2) + i)];
                    System.arraycopy(xfkArr, 0, xfkArr2, 0, i);
                    xfkArr = xfkArr2;
                }
                int i2 = i + 1;
                xfkArr[i] = xfk;
                i = i2;
            }
        } else {
            i = xfkArr.length;
        }
        if (i == 0) {
            EmptySubscription.a(xfl);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(xfl, this.d, i, this.e, this.f);
        xfl.a(zipCoordinator);
        ZipSubscriber<T, R>[] zipSubscriberArr = zipCoordinator.subscribers;
        for (int i3 = 0; i3 < i && !zipCoordinator.cancelled && (zipCoordinator.delayErrors || zipCoordinator.errors.get() == null); i3++) {
            xfkArr[i3].b(zipSubscriberArr[i3]);
        }
    }
}
