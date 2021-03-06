package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private Function<? super T, ? extends Iterable<? extends R>> c;
    private int d;

    static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final wrg<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        int fusionMode;
        final int limit;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        wrh upstream;

        FlattenIterableSubscriber(wrg<? super R> wrg, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
            this.downstream = wrg;
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                if (wrh instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) wrh;
                    int a = queueSubscription.a(3);
                    if (a == 1) {
                        this.fusionMode = a;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.a(this);
                        return;
                    } else if (a == 2) {
                        this.fusionMode = a;
                        this.queue = queueSubscription;
                        this.downstream.a(this);
                        wrh.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.a(this);
                wrh.a((long) this.prefetch);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                if (this.fusionMode != 0 || this.queue.a(t)) {
                    b();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a(this.error, th)) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            b();
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0121, code lost:
            if (r6 != null) goto L_0x0123;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b() {
            /*
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                wrg<? super R> r2 = r1.downstream
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r1.queue
                int r0 = r1.fusionMode
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L_0x0015
                r0 = 1
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.util.Iterator<? extends R> r6 = r1.current
                r7 = 0
                r8 = 1
            L_0x001a:
                if (r6 != 0) goto L_0x0080
                boolean r9 = r1.done
                java.lang.Object r10 = r3.bc_()     // Catch:{ all -> 0x0062 }
                if (r10 != 0) goto L_0x0026
                r11 = 1
                goto L_0x0027
            L_0x0026:
                r11 = 0
            L_0x0027:
                boolean r9 = r1.a(r9, r11, r2, r3)
                if (r9 == 0) goto L_0x002e
                return
            L_0x002e:
                if (r10 == 0) goto L_0x0080
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.mapper     // Catch:{ all -> 0x004a }
                java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x004a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x004a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004a }
                boolean r9 = r6.hasNext()     // Catch:{ all -> 0x004a }
                if (r9 != 0) goto L_0x0047
                r1.a(r0)
                r6 = r7
                goto L_0x001a
            L_0x0047:
                r1.current = r6
                goto L_0x0080
            L_0x004a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.b(r0)
                wrh r3 = r1.upstream
                r3.a()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0062:
                r0 = move-exception
                r4 = r0
                io.reactivex.exceptions.Exceptions.b(r4)
                wrh r0 = r1.upstream
                r0.a()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.a(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r1.current = r7
                r3.e()
                r2.onError(r0)
                return
            L_0x0080:
                if (r6 == 0) goto L_0x0123
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L_0x008b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f6
                boolean r15 = r1.done
                boolean r15 = r1.a(r15, r4, r2, r3)
                if (r15 == 0) goto L_0x0098
                return
            L_0x0098:
                java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00dc }
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.a(r15, r5)     // Catch:{ all -> 0x00dc }
                r2.b_(r5)
                boolean r5 = r1.done
                boolean r5 = r1.a(r5, r4, r2, r3)
                if (r5 == 0) goto L_0x00ae
                return
            L_0x00ae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch:{ all -> 0x00c1 }
                if (r5 != 0) goto L_0x00bf
                r1.a(r0)
                r1.current = r7
                r6 = r7
                goto L_0x00f6
            L_0x00bf:
                r5 = 1
                goto L_0x008b
            L_0x00c1:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.b(r3)
                r1.current = r7
                wrh r0 = r1.upstream
                r0.a()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.a(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x00dc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.b(r0)
                r1.current = r7
                wrh r3 = r1.upstream
                r3.a()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x010e
                boolean r5 = r1.done
                boolean r15 = r3.d()
                if (r15 == 0) goto L_0x0106
                if (r6 != 0) goto L_0x0106
                r15 = 1
                goto L_0x0107
            L_0x0106:
                r15 = 0
            L_0x0107:
                boolean r5 = r1.a(r5, r15, r2, r3)
                if (r5 == 0) goto L_0x010e
                return
            L_0x010e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r9 = -r13
                r5.addAndGet(r9)
            L_0x0121:
                if (r6 == 0) goto L_0x012b
            L_0x0123:
                int r5 = -r8
                int r8 = r1.addAndGet(r5)
                if (r8 != 0) goto L_0x012b
                return
            L_0x012b:
                r5 = 1
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.b():void");
        }

        private void a(boolean z) {
            if (z) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.a((long) i);
                    return;
                }
                this.consumed = i;
            }
        }

        private boolean a(boolean z, boolean z2, wrg<?> wrg, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.e();
                return true;
            }
            if (z) {
                if (((Throwable) this.error.get()) != null) {
                    Throwable a = ExceptionHelper.a(this.error);
                    this.current = null;
                    simpleQueue.e();
                    wrg.onError(a);
                    return true;
                } else if (z2) {
                    wrg.c();
                    return true;
                }
            }
            return false;
        }

        public final void e() {
            this.current = null;
            this.queue.e();
        }

        public final boolean d() {
            return this.current == null && this.queue.d();
        }

        public final R bc_() {
            Iterator<? extends R> it = this.current;
            while (true) {
                if (it != null) {
                    break;
                }
                Object bc_ = this.queue.bc_();
                if (bc_ != null) {
                    it = ((Iterable) this.mapper.apply(bc_)).iterator();
                    if (it.hasNext()) {
                        this.current = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R a = ObjectHelper.a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return a;
        }

        public final int a(int i) {
            return ((i & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
        super(flowable);
        this.c = function;
        this.d = i;
    }

    public final void a(wrg<? super R> wrg) {
        if (this.b instanceof Callable) {
            try {
                Object call = ((Callable) this.b).call();
                if (call == null) {
                    EmptySubscription.a(wrg);
                    return;
                }
                try {
                    FlowableFromIterable.a(wrg, ((Iterable) this.c.apply(call)).iterator());
                } catch (Throwable th) {
                    Exceptions.b(th);
                    EmptySubscription.a(th, wrg);
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                EmptySubscription.a(th2, wrg);
            }
        } else {
            this.b.a((FlowableSubscriber<? super T>) new FlattenIterableSubscriber<Object>(wrg, this.c, this.d));
        }
    }
}
