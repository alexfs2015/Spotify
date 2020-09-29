package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xjv reason: default package */
public final class xjv<T> implements defpackage.xii.a<T> {
    private xii<T> a;
    private long b;
    private TimeUnit c;
    private xil d;
    private xii<? extends T> e;

    /* renamed from: xjv$a */
    static final class a<T> extends xio<T> {
        private xio<? super T> a;
        private xlg b;

        a(xio<? super T> xio, xlg xlg) {
            this.a = xio;
            this.b = xlg;
        }

        public final void onCompleted() {
            this.a.onCompleted();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void setProducer(xik xik) {
            this.b.a(xik);
        }
    }

    /* renamed from: xjv$b */
    static final class b<T> extends xio<T> {
        final xio<? super T> a;
        final xii<? extends T> b;
        final xlg c = new xlg();
        final AtomicLong d = new AtomicLong();
        final SequentialSubscription e = new SequentialSubscription(this);
        long f;
        private long g;
        private TimeUnit h;
        private defpackage.xil.a i;
        private SequentialSubscription j = new SequentialSubscription();

        /* renamed from: xjv$b$a */
        final class a implements xir {
            private long a;

            a(long j) {
                this.a = j;
            }

            public final void call() {
                b bVar = b.this;
                if (bVar.d.compareAndSet(this.a, Long.MAX_VALUE)) {
                    bVar.unsubscribe();
                    if (bVar.b == null) {
                        bVar.a.onError(new TimeoutException());
                        return;
                    }
                    long j = bVar.f;
                    if (j != 0) {
                        bVar.c.b(j);
                    }
                    a aVar = new a(bVar.a, bVar.c);
                    if (bVar.e.b(aVar)) {
                        xii.a((xio<? super T>) aVar, bVar.b);
                    }
                }
            }
        }

        b(xio<? super T> xio, long j2, TimeUnit timeUnit, defpackage.xil.a aVar, xii<? extends T> xii) {
            this.a = xio;
            this.g = j2;
            this.h = timeUnit;
            this.i = aVar;
            this.b = xii;
            add(aVar);
            add(this.j);
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j2) {
            this.j.b(this.i.a(new a(j2), this.g, this.h));
        }

        public final void onCompleted() {
            if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.j.unsubscribe();
                this.a.onCompleted();
                this.i.unsubscribe();
            }
        }

        public final void onError(Throwable th) {
            if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.j.unsubscribe();
                this.a.onError(th);
                this.i.unsubscribe();
                return;
            }
            xnx.a(th);
        }

        public final void onNext(T t) {
            long j2 = this.d.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.d.compareAndSet(j2, j3)) {
                    xip xip = (xip) this.j.get();
                    if (xip != null) {
                        xip.unsubscribe();
                    }
                    this.f++;
                    this.a.onNext(t);
                    a(j3);
                }
            }
        }

        public final void setProducer(xik xik) {
            this.c.a(xik);
        }
    }

    public xjv(xii<T> xii, long j, TimeUnit timeUnit, xil xil, xii<? extends T> xii2) {
        this.a = xii;
        this.b = j;
        this.c = timeUnit;
        this.d = xil;
        this.e = xii2;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        b bVar = new b(xio, this.b, this.c, this.d.c(), this.e);
        xio.add(bVar.e);
        xio.setProducer(bVar.c);
        bVar.a(0);
        xii.a((xio<? super T>) bVar, this.a);
    }
}
