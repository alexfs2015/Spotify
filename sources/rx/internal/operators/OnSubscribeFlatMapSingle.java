package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.ExceptionsUtils;

public final class OnSubscribeFlatMapSingle<T, R> implements a<R> {
    private wud<T> a;
    private wut<? super T, ? extends wuh<? extends R>> b;
    private boolean c;
    private int d;

    static final class FlatMapSingleSubscriber<T, R> extends wuj<T> {
        final AtomicInteger a = new AtomicInteger();
        final xag b = new xag();
        final Queue<Object> c;
        final Requested d = new Requested<>();
        volatile boolean e;
        private wuj<? super R> f;
        private wut<? super T, ? extends wuh<? extends R>> g;
        private boolean h;
        private int i;
        private AtomicInteger j = new AtomicInteger();
        private AtomicReference<Throwable> k = new AtomicReference<>();
        private volatile boolean l;

        final class Requested extends AtomicLong implements wuf, wuk {
            private static final long serialVersionUID = -887187595446742742L;

            Requested() {
            }

            public final void a(long j) {
                if (j > 0) {
                    wuz.a((AtomicLong) this, j);
                    FlatMapSingleSubscriber.this.a();
                }
            }

            public final void unsubscribe() {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.e = true;
                flatMapSingleSubscriber.unsubscribe();
                if (FlatMapSingleSubscriber.this.a.getAndIncrement() == 0) {
                    FlatMapSingleSubscriber.this.c.clear();
                }
            }

            public final boolean isUnsubscribed() {
                return FlatMapSingleSubscriber.this.e;
            }
        }

        final class a extends wui<R> {
            a() {
            }

            public final void a(R r) {
                FlatMapSingleSubscriber.this.a(this, r);
            }

            public final void a(Throwable th) {
                FlatMapSingleSubscriber.this.a(this, th);
            }
        }

        FlatMapSingleSubscriber(wuj<? super R> wuj, wut<? super T, ? extends wuh<? extends R>> wut, boolean z, int i2) {
            this.f = wuj;
            this.g = wut;
            this.h = z;
            this.i = i2;
            if (wzh.a()) {
                this.c = new wyj();
            } else {
                this.c = new wxx();
            }
            request(i2 != Integer.MAX_VALUE ? (long) i2 : Long.MAX_VALUE);
        }

        public final void onNext(T t) {
            try {
                wuh wuh = (wuh) this.g.call(t);
                if (wuh != null) {
                    a aVar = new a();
                    this.b.a((wuk) aVar);
                    this.j.incrementAndGet();
                    wuh.a((wui<? super T>) aVar);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th) {
                wul.b(th);
                unsubscribe();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.h) {
                ExceptionsUtils.a(this.k, th);
            } else {
                this.b.unsubscribe();
                if (!this.k.compareAndSet(null, th)) {
                    wzs.a(th);
                    return;
                }
            }
            this.l = true;
            a();
        }

        public final void onCompleted() {
            this.l = true;
            a();
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
                    wzs.a(th);
                    return;
                }
                this.l = true;
            }
            this.j.decrementAndGet();
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.a.getAndIncrement() == 0) {
                wuj<? super R> wuj = this.f;
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
                                wuj.onNext(NotificationLite.e(poll));
                                j3++;
                            } else if (((Throwable) this.k.get()) != null) {
                                wuj.onError(ExceptionsUtils.a(this.k));
                                return;
                            } else {
                                wuj.onCompleted();
                                return;
                            }
                        } else {
                            queue.clear();
                            wuj.onError(ExceptionsUtils.a(this.k));
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
                                        wuj.onError(ExceptionsUtils.a(this.k));
                                        return;
                                    } else {
                                        wuj.onCompleted();
                                        return;
                                    }
                                }
                            } else if (((Throwable) this.k.get()) != null) {
                                queue.clear();
                                wuj.onError(ExceptionsUtils.a(this.k));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                wuj.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        wuz.b(this.d, j3);
                        if (!this.l && this.i != Integer.MAX_VALUE) {
                            request(j3);
                        }
                    }
                    i2 = this.a.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        FlatMapSingleSubscriber flatMapSingleSubscriber = new FlatMapSingleSubscriber(wuj, this.b, this.c, this.d);
        wuj.add(flatMapSingleSubscriber.b);
        wuj.add(flatMapSingleSubscriber.d);
        wuj.setProducer(flatMapSingleSubscriber.d);
        this.a.a((wuj<? super T>) flatMapSingleSubscriber);
    }

    public OnSubscribeFlatMapSingle(wud<T> wud, wut<? super T, ? extends wuh<? extends R>> wut, boolean z, int i) {
        if (wut == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.a = wud;
            this.b = wut;
            this.c = z;
            this.d = i;
        } else {
            StringBuilder sb = new StringBuilder("maxConcurrency > 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
