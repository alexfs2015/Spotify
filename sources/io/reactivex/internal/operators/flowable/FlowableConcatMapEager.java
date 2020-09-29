package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private Function<? super T, ? extends wrf<? extends R>> c;
    private int d;
    private int e;
    private ErrorMode f;

    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InnerQueuedSubscriberSupport<R>, wrh {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final wrg<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends wrf<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final AtomicLong requested = new AtomicLong();
        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        wrh upstream;

        ConcatMapEagerDelayErrorSubscriber(wrg<? super R> wrg, Function<? super T, ? extends wrf<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
            this.downstream = wrg;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i2, i));
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                int i = this.maxConcurrency;
                wrh.a(i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i);
            }
        }

        public final void b_(T t) {
            try {
                wrf wrf = (wrf) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null Publisher");
                InnerQueuedSubscriber innerQueuedSubscriber = new InnerQueuedSubscriber(this, this.prefetch);
                if (!this.cancelled) {
                    this.subscribers.a(innerQueuedSubscriber);
                    wrf.b(innerQueuedSubscriber);
                    if (this.cancelled) {
                        innerQueuedSubscriber.a();
                        d();
                    }
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.a();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                this.done = true;
                b();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            this.done = true;
            b();
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                d();
            }
        }

        private void d() {
            if (getAndIncrement() == 0) {
                do {
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        private void e() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.a();
            }
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.subscribers.bc_();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber2.a();
                } else {
                    return;
                }
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                innerQueuedSubscriber.done = true;
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.a();
                }
                b();
                return;
            }
            RxJavaPlugins.a(th);
        }

        /* JADX WARNING: Removed duplicated region for block: B:81:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r19 = this;
                r1 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r0 = r1.current
                wrg<? super R> r2 = r1.downstream
                io.reactivex.internal.util.ErrorMode r3 = r1.errorMode
                r5 = 1
            L_0x0010:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                if (r0 != 0) goto L_0x0056
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.END
                if (r3 == r0) goto L_0x0033
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0033
                r19.e()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0033:
                boolean r0 = r1.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> r8 = r1.subscribers
                java.lang.Object r8 = r8.bc_()
                io.reactivex.internal.subscribers.InnerQueuedSubscriber r8 = (io.reactivex.internal.subscribers.InnerQueuedSubscriber) r8
                if (r0 == 0) goto L_0x0051
                if (r8 != 0) goto L_0x0051
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                if (r0 == 0) goto L_0x004d
                r2.onError(r0)
                return
            L_0x004d:
                r2.c()
                return
            L_0x0051:
                if (r8 == 0) goto L_0x0057
                r1.current = r8
                goto L_0x0057
            L_0x0056:
                r8 = r0
            L_0x0057:
                r9 = 0
                r11 = 0
                if (r8 == 0) goto L_0x010d
                io.reactivex.internal.fuseable.SimpleQueue<T> r12 = r8.queue
                if (r12 == 0) goto L_0x010d
                r16 = r5
                r13 = r9
            L_0x0063:
                r4 = 1
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 == 0) goto L_0x00c8
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L_0x0071
                r19.e()
                return
            L_0x0071:
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L_0x0091
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0091
                r1.current = r11
                r8.a()
                r19.e()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0091:
                boolean r0 = r8.done
                java.lang.Object r15 = r12.bc_()     // Catch:{ all -> 0x00b7 }
                if (r15 != 0) goto L_0x009c
                r18 = 1
                goto L_0x009e
            L_0x009c:
                r18 = 0
            L_0x009e:
                if (r0 == 0) goto L_0x00ad
                if (r18 == 0) goto L_0x00ad
                r1.current = r11
                wrh r0 = r1.upstream
                r0.a(r4)
                r8 = r11
                r17 = 1
                goto L_0x00ca
            L_0x00ad:
                if (r18 != 0) goto L_0x00c8
                r2.b_(r15)
                long r13 = r13 + r4
                r8.b()
                goto L_0x0063
            L_0x00b7:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.b(r3)
                r1.current = r11
                r8.a()
                r19.e()
                r2.onError(r3)
                return
            L_0x00c8:
                r17 = 0
            L_0x00ca:
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x010b
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L_0x00d6
                r19.e()
                return
            L_0x00d6:
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L_0x00f6
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x00f6
                r1.current = r11
                r8.a()
                r19.e()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                boolean r0 = r8.done
                boolean r12 = r12.d()
                if (r0 == 0) goto L_0x010b
                if (r12 == 0) goto L_0x010b
                r1.current = r11
                wrh r0 = r1.upstream
                r0.a(r4)
                r0 = r11
                r17 = 1
                goto L_0x0113
            L_0x010b:
                r0 = r8
                goto L_0x0113
            L_0x010d:
                r16 = r5
                r0 = r8
                r13 = r9
                r17 = 0
            L_0x0113:
                int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r4 == 0) goto L_0x0126
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x0126
                java.util.concurrent.atomic.AtomicLong r4 = r1.requested
                long r5 = -r13
                r4.addAndGet(r5)
            L_0x0126:
                r4 = r16
                if (r17 != 0) goto L_0x0134
                int r4 = -r4
                int r5 = r1.addAndGet(r4)
                if (r5 == 0) goto L_0x0133
                goto L_0x0010
            L_0x0133:
                return
            L_0x0134:
                r5 = r4
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber.b():void");
        }

        public final void a(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.queue.a(r)) {
                b();
                return;
            }
            innerQueuedSubscriber.a();
            a(innerQueuedSubscriber, (Throwable) new MissingBackpressureException());
        }

        public final void a(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.done = true;
            b();
        }
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends wrf<? extends R>> function, int i, int i2, ErrorMode errorMode) {
        super(flowable);
        this.c = function;
        this.d = i;
        this.e = i2;
        this.f = errorMode;
    }

    public final void a(wrg<? super R> wrg) {
        Flowable flowable = this.b;
        ConcatMapEagerDelayErrorSubscriber concatMapEagerDelayErrorSubscriber = new ConcatMapEagerDelayErrorSubscriber(wrg, this.c, this.d, this.e, this.f);
        flowable.a((FlowableSubscriber<? super T>) concatMapEagerDelayErrorSubscriber);
    }
}
