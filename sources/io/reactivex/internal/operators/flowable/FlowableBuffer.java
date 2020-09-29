package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    private int c;
    private int d;
    private Callable<C> e;

    static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, wrh {
        private wrg<? super C> a;
        private Callable<C> b;
        private int c;
        private C d;
        private wrh e;
        private boolean f;
        private int g;

        PublisherBufferExactSubscriber(wrg<? super C> wrg, int i, Callable<C> callable) {
            this.a = wrg;
            this.c = i;
            this.b = callable;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                this.e.a(BackpressureHelper.b(j, (long) this.c));
            }
        }

        public final void a() {
            this.e.a();
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.e, wrh)) {
                this.e = wrh;
                this.a.a(this);
            }
        }

        public final void b_(T t) {
            if (!this.f) {
                C c2 = this.d;
                if (c2 == null) {
                    try {
                        c2 = (Collection) ObjectHelper.a(this.b.call(), "The bufferSupplier returned a null buffer");
                        this.d = c2;
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        a();
                        onError(th);
                        return;
                    }
                }
                c2.add(t);
                int i = this.g + 1;
                if (i == this.c) {
                    this.g = 0;
                    this.d = null;
                    this.a.b_(c2);
                    return;
                }
                this.g = i;
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.a(th);
                return;
            }
            this.f = true;
            this.a.onError(th);
        }

        public final void c() {
            if (!this.f) {
                this.f = true;
                C c2 = this.d;
                if (c2 != null && !c2.isEmpty()) {
                    this.a.b_(c2);
                }
                this.a.c();
            }
        }
    }

    static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, BooleanSupplier, wrh {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        final ArrayDeque<C> buffers = new ArrayDeque<>();
        volatile boolean cancelled;
        boolean done;
        final wrg<? super C> downstream;
        int index;
        final AtomicBoolean once = new AtomicBoolean();
        long produced;
        final int size;
        final int skip;
        wrh upstream;

        PublisherBufferOverlappingSubscriber(wrg<? super C> wrg, int i, int i2, Callable<C> callable) {
            this.downstream = wrg;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                if (!QueueDrainHelper.a(j, this.downstream, (Queue<T>) this.buffers, (AtomicLong) this, (BooleanSupplier) this)) {
                    if (this.once.get() || !this.once.compareAndSet(false, true)) {
                        this.upstream.a(BackpressureHelper.b((long) this.skip, j));
                    } else {
                        this.upstream.a(BackpressureHelper.a((long) this.size, BackpressureHelper.b((long) this.skip, j - 1)));
                    }
                }
            }
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                ArrayDeque<C> arrayDeque = this.buffers;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        arrayDeque.offer((Collection) ObjectHelper.a(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        a();
                        onError(th);
                        return;
                    }
                }
                Collection collection = (Collection) arrayDeque.peek();
                if (collection != null && collection.size() + 1 == this.size) {
                    arrayDeque.poll();
                    collection.add(t);
                    this.produced++;
                    this.downstream.b_(collection);
                }
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(t);
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                long j = this.produced;
                if (j != 0) {
                    BackpressureHelper.c(this, j);
                }
                QueueDrainHelper.a(this.downstream, this.buffers, this, this);
            }
        }
    }

    static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final wrg<? super C> downstream;
        int index;
        final int size;
        final int skip;
        wrh upstream;

        PublisherBufferSkipSubscriber(wrg<? super C> wrg, int i, int i2, Callable<C> callable) {
            this.downstream = wrg;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.a(BackpressureHelper.b((long) this.skip, j));
                } else {
                    this.upstream.a(BackpressureHelper.a(BackpressureHelper.b(j, (long) this.size), BackpressureHelper.b((long) (this.skip - this.size), j - 1)));
                }
            }
        }

        public final void a() {
            this.upstream.a();
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                C c = this.buffer;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        c = (Collection) ObjectHelper.a(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                        this.buffer = c;
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        a();
                        onError(th);
                        return;
                    }
                }
                if (c != null) {
                    c.add(t);
                    if (c.size() == this.size) {
                        this.buffer = null;
                        this.downstream.b_(c);
                    }
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                C c = this.buffer;
                this.buffer = null;
                if (c != null) {
                    this.downstream.b_(c);
                }
                this.downstream.c();
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i, int i2, Callable<C> callable) {
        super(flowable);
        this.c = i;
        this.d = i2;
        this.e = callable;
    }

    public final void a(wrg<? super C> wrg) {
        int i = this.c;
        int i2 = this.d;
        if (i == i2) {
            this.b.a((FlowableSubscriber<? super T>) new PublisherBufferExactSubscriber<Object>(wrg, this.c, this.e));
        } else if (i2 > i) {
            this.b.a((FlowableSubscriber<? super T>) new PublisherBufferSkipSubscriber<Object>(wrg, this.c, this.d, this.e));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new PublisherBufferOverlappingSubscriber<Object>(wrg, this.c, this.d, this.e));
        }
    }
}
