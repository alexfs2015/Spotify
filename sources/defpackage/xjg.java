package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.NotificationLite;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: xjg reason: default package */
public final class xjg<T, R> implements defpackage.xii.a<R> {
    private xii<? extends T> a;
    private xiy<? super T, ? extends xii<? extends R>> b;
    private int c = 2;
    private int d = 0;

    /* renamed from: xjg$a */
    static final class a<T, R> implements xik {
        private R a;
        private c<T, R> b;
        private boolean c;

        public a(R r, c<T, R> cVar) {
            this.a = r;
            this.b = cVar;
        }

        public final void a(long j) {
            if (!this.c && j > 0) {
                this.c = true;
                c<T, R> cVar = this.b;
                cVar.a(this.a);
                cVar.a(1);
            }
        }
    }

    /* renamed from: xjg$b */
    static final class b<T, R> extends xio<R> {
        private c<T, R> a;
        private long b;

        public b(c<T, R> cVar) {
            this.a = cVar;
        }

        public final void onCompleted() {
            this.a.a(this.b);
        }

        public final void onError(Throwable th) {
            c<T, R> cVar = this.a;
            long j = this.b;
            if (!ExceptionsUtils.a(cVar.d, th)) {
                xnx.a(th);
            } else if (cVar.b == 0) {
                Throwable a2 = ExceptionsUtils.a(cVar.d);
                if (!ExceptionsUtils.a(a2)) {
                    cVar.a.onError(a2);
                }
                cVar.unsubscribe();
            } else {
                if (j != 0) {
                    cVar.c.b(j);
                }
                cVar.f = false;
                cVar.a();
            }
        }

        public final void onNext(R r) {
            this.b++;
            this.a.a(r);
        }

        public final void setProducer(xik xik) {
            this.a.c.a(xik);
        }
    }

    /* renamed from: xjg$c */
    static final class c<T, R> extends xio<T> {
        final xio<? super R> a;
        final int b;
        final xlg c = new xlg();
        final AtomicReference<Throwable> d = new AtomicReference<>();
        final xom e;
        volatile boolean f;
        private xiy<? super T, ? extends xii<? extends R>> g;
        private Queue<Object> h;
        private AtomicInteger i = new AtomicInteger();
        private volatile boolean j;

        public c(xio<? super R> xio, xiy<? super T, ? extends xii<? extends R>> xiy, int i2, int i3) {
            this.a = xio;
            this.g = xiy;
            this.b = i3;
            this.h = xnm.a() ? new xmy<>(i2) : new xmd<>(i2);
            this.e = new xom();
            request((long) i2);
        }

        private void a(Throwable th) {
            unsubscribe();
            if (ExceptionsUtils.a(this.d, th)) {
                Throwable a2 = ExceptionsUtils.a(this.d);
                if (!ExceptionsUtils.a(a2)) {
                    this.a.onError(a2);
                }
                return;
            }
            xnx.a(th);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.i.getAndIncrement() == 0) {
                int i2 = this.b;
                while (!this.a.isUnsubscribed()) {
                    if (!this.f) {
                        if (i2 != 1 || this.d.get() == null) {
                            boolean z = this.j;
                            Object poll = this.h.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable a2 = ExceptionsUtils.a(this.d);
                                if (a2 == null) {
                                    this.a.onCompleted();
                                    return;
                                }
                                if (!ExceptionsUtils.a(a2)) {
                                    this.a.onError(a2);
                                }
                                return;
                            } else if (!z2) {
                                try {
                                    xii xii = (xii) this.g.call(NotificationLite.e(poll));
                                    if (xii == null) {
                                        a((Throwable) new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (xii != EmptyObservableHolder.a()) {
                                        if (xii instanceof ScalarSynchronousObservable) {
                                            ScalarSynchronousObservable scalarSynchronousObservable = (ScalarSynchronousObservable) xii;
                                            this.f = true;
                                            this.c.a((xik) new a(scalarSynchronousObservable.a, this));
                                        } else {
                                            b bVar = new b(this);
                                            this.e.a(bVar);
                                            if (!bVar.isUnsubscribed()) {
                                                this.f = true;
                                                xii.a((xio<? super T>) bVar);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable th) {
                                    xiq.b(th);
                                    a(th);
                                    return;
                                }
                            }
                        } else {
                            Throwable a3 = ExceptionsUtils.a(this.d);
                            if (!ExceptionsUtils.a(a3)) {
                                this.a.onError(a3);
                            }
                            return;
                        }
                    }
                    if (this.i.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j2) {
            if (j2 != 0) {
                this.c.b(j2);
            }
            this.f = false;
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a(R r) {
            this.a.onNext(r);
        }

        public final void onCompleted() {
            this.j = true;
            a();
        }

        public final void onError(Throwable th) {
            if (ExceptionsUtils.a(this.d, th)) {
                this.j = true;
                if (this.b == 0) {
                    Throwable a2 = ExceptionsUtils.a(this.d);
                    if (!ExceptionsUtils.a(a2)) {
                        this.a.onError(a2);
                    }
                    this.e.unsubscribe();
                    return;
                }
                a();
                return;
            }
            xnx.a(th);
        }

        public final void onNext(T t) {
            if (!this.h.offer(NotificationLite.a(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            a();
        }
    }

    public xjg(xii<? extends T> xii, xiy<? super T, ? extends xii<? extends R>> xiy, int i, int i2) {
        this.a = xii;
        this.b = xiy;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        final c cVar = new c(this.d == 0 ? new xnt(xio) : xio, this.b, this.c, this.d);
        xio.add(cVar);
        xio.add(cVar.e);
        xio.setProducer(new xik() {
            public final void a(long j) {
                c cVar = cVar;
                if (j > 0) {
                    cVar.c.a(j);
                } else if (j < 0) {
                    StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        });
        if (!xio.isUnsubscribed()) {
            this.a.a((xio<? super T>) cVar);
        }
    }
}
