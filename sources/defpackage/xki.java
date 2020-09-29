package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;

/* renamed from: xki reason: default package */
public final class xki<T> implements b<T, T> {
    private final xil a;
    private final boolean b;
    private final int c;

    /* renamed from: xki$a */
    static final class a<T> extends xio<T> implements xir {
        final xio<? super T> a;
        final defpackage.xil.a b;
        final AtomicLong c = new AtomicLong();
        private boolean d;
        private Queue<Object> e;
        private int f;
        private volatile boolean g;
        private AtomicLong h = new AtomicLong();
        private Throwable i;
        private long j;

        public a(xil xil, xio<? super T> xio, boolean z, int i2) {
            this.a = xio;
            this.b = xil.c();
            this.d = z;
            if (i2 <= 0) {
                i2 = xlx.b;
            }
            this.f = i2 - (i2 >> 2);
            if (xnm.a()) {
                this.e = new xmy(i2);
            } else {
                this.e = new xmd(i2);
            }
            request((long) i2);
        }

        private boolean a(boolean z, boolean z2, xio<? super T> xio, Queue<Object> queue) {
            if (xio.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                if (!this.d) {
                    Throwable th = this.i;
                    if (th != null) {
                        queue.clear();
                        try {
                            xio.onError(th);
                            return true;
                        } finally {
                            this.b.unsubscribe();
                        }
                    } else if (z2) {
                        try {
                            xio.onCompleted();
                            return true;
                        } finally {
                            this.b.unsubscribe();
                        }
                    }
                } else if (z2) {
                    Throwable th2 = this.i;
                    if (th2 != null) {
                        try {
                            xio.onError(th2);
                        } catch (Throwable th3) {
                            this.b.unsubscribe();
                            throw th3;
                        }
                    } else {
                        xio.onCompleted();
                    }
                    this.b.unsubscribe();
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            if (this.h.getAndIncrement() == 0) {
                this.b.a(this);
            }
        }

        public final void call() {
            long j2 = this.j;
            Queue<Object> queue = this.e;
            xio<? super T> xio = this.a;
            long j3 = j2;
            long j4 = 1;
            do {
                long j5 = this.c.get();
                while (j5 != j3) {
                    boolean z = this.g;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, xio, queue)) {
                        if (z2) {
                            break;
                        }
                        xio.onNext(NotificationLite.e(poll));
                        j3++;
                        if (j3 == ((long) this.f)) {
                            j5 = xje.b(this.c, j3);
                            request(j3);
                            j3 = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (j5 != j3 || !a(this.g, queue.isEmpty(), xio, queue)) {
                    this.j = j3;
                    j4 = this.h.addAndGet(-j4);
                } else {
                    return;
                }
            } while (j4 != 0);
        }

        public final void onCompleted() {
            if (!isUnsubscribed() && !this.g) {
                this.g = true;
                a();
            }
        }

        public final void onError(Throwable th) {
            if (isUnsubscribed() || this.g) {
                xnx.a(th);
                return;
            }
            this.i = th;
            this.g = true;
            a();
        }

        public final void onNext(T t) {
            if (!isUnsubscribed() && !this.g) {
                if (!this.e.offer(NotificationLite.a(t))) {
                    onError(new MissingBackpressureException());
                    return;
                }
                a();
            }
        }
    }

    public xki(xil xil, boolean z, int i) {
        this.a = xil;
        this.b = z;
        if (i <= 0) {
            i = xlx.b;
        }
        this.c = i;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        xil xil = this.a;
        if ((xil instanceof xlj) || (xil instanceof xlp)) {
            return xio;
        }
        a aVar = new a(xil, xio, this.b, this.c);
        xio<? super T> xio2 = aVar.a;
        xio2.setProducer(new xik() {
            public final void a(long j) {
                if (j > 0) {
                    xje.a(a.this.c, j);
                    a.this.a();
                }
            }
        });
        xio2.add(aVar.b);
        xio2.add(aVar);
        return aVar;
    }
}
