package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xju reason: default package */
public final class xju<T, U, V> implements defpackage.xii.a<T> {
    private xii<T> a;
    private xii<U> b;
    private xiy<? super T, ? extends xii<V>> c;
    private xii<? extends T> d;

    /* renamed from: xju$a */
    static final class a<T> extends xio<T> {
        final xio<? super T> a;
        final xlg b = new xlg();
        final AtomicLong c = new AtomicLong();
        final SequentialSubscription d = new SequentialSubscription();
        final SequentialSubscription e = new SequentialSubscription(this);
        private xiy<? super T, ? extends xii<?>> f;
        private xii<? extends T> g;
        private long h;

        /* renamed from: xju$a$a reason: collision with other inner class name */
        final class C0091a extends xio<Object> {
            private long a;
            private boolean b;

            C0091a(long j) {
                this.a = j;
            }

            public final void onCompleted() {
                if (!this.b) {
                    this.b = true;
                    a.this.a(this.a);
                }
            }

            public final void onError(Throwable th) {
                if (!this.b) {
                    this.b = true;
                    a aVar = a.this;
                    if (aVar.c.compareAndSet(this.a, Long.MAX_VALUE)) {
                        aVar.unsubscribe();
                        aVar.a.onError(th);
                    } else {
                        xnx.a(th);
                    }
                } else {
                    xnx.a(th);
                }
            }

            public final void onNext(Object obj) {
                if (!this.b) {
                    this.b = true;
                    unsubscribe();
                    a.this.a(this.a);
                }
            }
        }

        a(xio<? super T> xio, xiy<? super T, ? extends xii<?>> xiy, xii<? extends T> xii) {
            this.a = xio;
            this.f = xiy;
            this.g = xii;
            add(this.d);
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            if (this.c.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.g == null) {
                    this.a.onError(new TimeoutException());
                    return;
                }
                long j2 = this.h;
                if (j2 != 0) {
                    this.b.b(j2);
                }
                a aVar = new a(this.a, this.b);
                if (this.e.b(aVar)) {
                    xii.a((xio<? super T>) aVar, this.g);
                }
            }
        }

        public final void onCompleted() {
            if (this.c.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.d.unsubscribe();
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (this.c.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.d.unsubscribe();
                this.a.onError(th);
                return;
            }
            xnx.a(th);
        }

        public final void onNext(T t) {
            long j = this.c.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.c.compareAndSet(j, j2)) {
                    xip xip = (xip) this.d.get();
                    if (xip != null) {
                        xip.unsubscribe();
                    }
                    this.a.onNext(t);
                    this.h++;
                    try {
                        xii xii = (xii) this.f.call(t);
                        if (xii != null) {
                            C0091a aVar = new C0091a(j2);
                            if (this.d.b(aVar)) {
                                xii.a((xio<? super T>) aVar, xii);
                            }
                            return;
                        }
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    } catch (Throwable th) {
                        xiq.b(th);
                        unsubscribe();
                        this.c.getAndSet(Long.MAX_VALUE);
                        this.a.onError(th);
                    }
                }
            }
        }

        public final void setProducer(xik xik) {
            this.b.a(xik);
        }
    }

    public xju(xii<T> xii, xii<U> xii2, xiy<? super T, ? extends xii<V>> xiy, xii<? extends T> xii3) {
        this.a = xii;
        this.b = xii2;
        this.c = xiy;
        this.d = xii3;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        a aVar = new a(xio, this.c, this.d);
        xio.add(aVar.e);
        xio.setProducer(aVar.b);
        xii<U> xii = this.b;
        if (xii != null) {
            C0091a aVar2 = new C0091a(0);
            if (aVar.d.b(aVar2)) {
                xii.a((xio<? super T>) aVar2, xii);
            }
        }
        xii.a((xio<? super T>) aVar, this.a);
    }
}
