package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.ExceptionsUtils;

public final class OnSubscribeFlatMapSingle<T, R> implements a<R> {
    private xii<T> a;
    private xiy<? super T, ? extends xim<? extends R>> b;
    private boolean c;
    private int d;

    static final class FlatMapSingleSubscriber<T, R> extends xio<T> {
        final AtomicInteger a = new AtomicInteger();
        final xok b = new xok();
        final Queue<Object> c;
        final Requested d = new Requested<>();
        volatile boolean e;
        private xio<? super R> f;
        private xiy<? super T, ? extends xim<? extends R>> g;
        private boolean h;
        private int i;
        private AtomicInteger j = new AtomicInteger();
        private AtomicReference<Throwable> k = new AtomicReference<>();
        private volatile boolean l;

        final class Requested extends AtomicLong implements xik, xip {
            private static final long serialVersionUID = -887187595446742742L;

            Requested() {
            }

            public final void a(long j) {
                if (j > 0) {
                    xje.a((AtomicLong) this, j);
                    FlatMapSingleSubscriber.this.a();
                }
            }

            public final boolean isUnsubscribed() {
                return FlatMapSingleSubscriber.this.e;
            }

            public final void unsubscribe() {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.e = true;
                flatMapSingleSubscriber.unsubscribe();
                if (FlatMapSingleSubscriber.this.a.getAndIncrement() == 0) {
                    FlatMapSingleSubscriber.this.c.clear();
                }
            }
        }

        final class a extends xin<R> {
            a() {
            }

            public final void a(R r) {
                FlatMapSingleSubscriber.this.a(this, r);
            }

            public final void a(Throwable th) {
                FlatMapSingleSubscriber.this.a(this, th);
            }
        }

        FlatMapSingleSubscriber(xio<? super R> xio, xiy<? super T, ? extends xim<? extends R>> xiy, boolean z, int i2) {
            this.f = xio;
            this.g = xiy;
            this.h = z;
            this.i = i2;
            if (xnm.a()) {
                this.c = new xmo();
            } else {
                this.c = new xmc();
            }
            request(i2 != Integer.MAX_VALUE ? (long) i2 : Long.MAX_VALUE);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.a.getAndIncrement() == 0) {
                xio<? super R> xio = this.f;
                Queue<Object> queue = this.c;
                boolean z = this.h;
                AtomicInteger atomicInteger = this.j;
                int i2 = 1;
                do {
                    long j2 = this.d.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.e) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = this.l;
                        if (z || !z2 || ((Throwable) this.k.get()) == null) {
                            Object poll = queue.poll();
                            boolean z3 = poll == null;
                            if (!z2 || atomicInteger.get() != 0 || !z3) {
                                if (z3) {
                                    break;
                                }
                                xio.onNext(NotificationLite.e(poll));
                                j3++;
                            } else if (((Throwable) this.k.get()) != null) {
                                xio.onError(ExceptionsUtils.a(this.k));
                                return;
                            } else {
                                xio.onCompleted();
                                return;
                            }
                        } else {
                            queue.clear();
                            xio.onError(ExceptionsUtils.a(this.k));
                            return;
                        }
                    }
                    if (j3 == j2) {
                        if (this.e) {
                            queue.clear();
                            return;
                        } else if (this.l) {
                            if (z) {
                                if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                    if (((Throwable) this.k.get()) != null) {
                                        xio.onError(ExceptionsUtils.a(this.k));
                                        return;
                                    } else {
                                        xio.onCompleted();
                                        return;
                                    }
                                }
                            } else if (((Throwable) this.k.get()) != null) {
                                queue.clear();
                                xio.onError(ExceptionsUtils.a(this.k));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                xio.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        xje.b(this.d, j3);
                        if (!this.l && this.i != Integer.MAX_VALUE) {
                            request(j3);
                        }
                    }
                    i2 = this.a.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(a aVar, R r) {
            this.c.offer(NotificationLite.a(r));
            this.b.b(aVar);
            this.j.decrementAndGet();
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a(a aVar, Throwable th) {
            if (this.h) {
                ExceptionsUtils.a(this.k, th);
                this.b.b(aVar);
                if (!this.l && this.i != Integer.MAX_VALUE) {
                    request(1);
                }
            } else {
                this.b.unsubscribe();
                unsubscribe();
                if (!this.k.compareAndSet(null, th)) {
                    xnx.a(th);
                    return;
                }
                this.l = true;
            }
            this.j.decrementAndGet();
            a();
        }

        public final void onCompleted() {
            this.l = true;
            a();
        }

        public final void onError(Throwable th) {
            if (this.h) {
                ExceptionsUtils.a(this.k, th);
            } else {
                this.b.unsubscribe();
                if (!this.k.compareAndSet(null, th)) {
                    xnx.a(th);
                    return;
                }
            }
            this.l = true;
            a();
        }

        public final void onNext(T t) {
            try {
                xim xim = (xim) this.g.call(t);
                if (xim != null) {
                    a aVar = new a();
                    this.b.a((xip) aVar);
                    this.j.incrementAndGet();
                    xim.a((xin<? super T>) aVar);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th) {
                xiq.b(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeFlatMapSingle(xii<T> xii, xiy<? super T, ? extends xim<? extends R>> xiy, boolean z, int i) {
        if (xiy == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.a = xii;
            this.b = xiy;
            this.c = z;
            this.d = i;
        } else {
            StringBuilder sb = new StringBuilder("maxConcurrency > 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        FlatMapSingleSubscriber flatMapSingleSubscriber = new FlatMapSingleSubscriber(xio, this.b, this.c, this.d);
        xio.add(flatMapSingleSubscriber.b);
        xio.add(flatMapSingleSubscriber.d);
        xio.setProducer(flatMapSingleSubscriber.d);
        this.a.a((xio<? super T>) flatMapSingleSubscriber);
    }
}
