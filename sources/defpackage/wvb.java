package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.NotificationLite;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: wvb reason: default package */
public final class wvb<T, R> implements defpackage.wud.a<R> {
    private wud<? extends T> a;
    private wut<? super T, ? extends wud<? extends R>> b;
    private int c = 2;
    private int d = 0;

    /* renamed from: wvb$a */
    static final class a<T, R> implements wuf {
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

    /* renamed from: wvb$b */
    static final class b<T, R> extends wuj<R> {
        private c<T, R> a;
        private long b;

        public b(c<T, R> cVar) {
            this.a = cVar;
        }

        public final void setProducer(wuf wuf) {
            this.a.c.a(wuf);
        }

        public final void onNext(R r) {
            this.b++;
            this.a.a(r);
        }

        public final void onError(Throwable th) {
            c<T, R> cVar = this.a;
            long j = this.b;
            if (!ExceptionsUtils.a(cVar.d, th)) {
                wzs.a(th);
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

        public final void onCompleted() {
            this.a.a(this.b);
        }
    }

    /* renamed from: wvb$c */
    static final class c<T, R> extends wuj<T> {
        final wuj<? super R> a;
        final int b;
        final wxb c = new wxb();
        final AtomicReference<Throwable> d = new AtomicReference<>();
        final xai e;
        volatile boolean f;
        private wut<? super T, ? extends wud<? extends R>> g;
        private Queue<Object> h;
        private AtomicInteger i = new AtomicInteger();
        private volatile boolean j;

        public c(wuj<? super R> wuj, wut<? super T, ? extends wud<? extends R>> wut, int i2, int i3) {
            Queue<Object> queue;
            this.a = wuj;
            this.g = wut;
            this.b = i3;
            if (wzh.a()) {
                queue = new wyt<>(i2);
            } else {
                queue = new wxy<>(i2);
            }
            this.h = queue;
            this.e = new xai();
            request((long) i2);
        }

        public final void onNext(T t) {
            if (!this.h.offer(NotificationLite.a(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
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
            wzs.a(th);
        }

        public final void onCompleted() {
            this.j = true;
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a(R r) {
            this.a.onNext(r);
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
                                    wud wud = (wud) this.g.call(NotificationLite.e(poll));
                                    if (wud == null) {
                                        a((Throwable) new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (wud != EmptyObservableHolder.a()) {
                                        if (wud instanceof ScalarSynchronousObservable) {
                                            ScalarSynchronousObservable scalarSynchronousObservable = (ScalarSynchronousObservable) wud;
                                            this.f = true;
                                            this.c.a((wuf) new a(scalarSynchronousObservable.a, this));
                                        } else {
                                            b bVar = new b(this);
                                            this.e.a(bVar);
                                            if (!bVar.isUnsubscribed()) {
                                                this.f = true;
                                                wud.a((wuj<? super T>) bVar);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable th) {
                                    wul.b(th);
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

        private void a(Throwable th) {
            unsubscribe();
            if (ExceptionsUtils.a(this.d, th)) {
                Throwable a2 = ExceptionsUtils.a(this.d);
                if (!ExceptionsUtils.a(a2)) {
                    this.a.onError(a2);
                }
                return;
            }
            wzs.a(th);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        final c cVar = new c(this.d == 0 ? new wzo(wuj) : wuj, this.b, this.c, this.d);
        wuj.add(cVar);
        wuj.add(cVar.e);
        wuj.setProducer(new wuf() {
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
        if (!wuj.isUnsubscribed()) {
            this.a.a((wuj<? super T>) cVar);
        }
    }

    public wvb(wud<? extends T> wud, wut<? super T, ? extends wud<? extends R>> wut, int i, int i2) {
        this.a = wud;
        this.b = wut;
    }
}
