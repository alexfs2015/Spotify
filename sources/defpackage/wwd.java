package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;

/* renamed from: wwd reason: default package */
public final class wwd<T> implements b<T, T> {
    private final wug a;
    private final boolean b;
    private final int c;

    /* renamed from: wwd$a */
    static final class a<T> extends wuj<T> implements wum {
        final wuj<? super T> a;
        final defpackage.wug.a b;
        final AtomicLong c = new AtomicLong();
        private boolean d;
        private Queue<Object> e;
        private int f;
        private volatile boolean g;
        private AtomicLong h = new AtomicLong();
        private Throwable i;
        private long j;

        public a(wug wug, wuj<? super T> wuj, boolean z, int i2) {
            this.a = wuj;
            this.b = wug.c();
            this.d = z;
            if (i2 <= 0) {
                i2 = wxs.b;
            }
            this.f = i2 - (i2 >> 2);
            if (wzh.a()) {
                this.e = new wyt(i2);
            } else {
                this.e = new wxy(i2);
            }
            request((long) i2);
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

        public final void onCompleted() {
            if (!isUnsubscribed() && !this.g) {
                this.g = true;
                a();
            }
        }

        public final void onError(Throwable th) {
            if (isUnsubscribed() || this.g) {
                wzs.a(th);
                return;
            }
            this.i = th;
            this.g = true;
            a();
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
            wuj<? super T> wuj = this.a;
            long j3 = j2;
            long j4 = 1;
            do {
                long j5 = this.c.get();
                while (j5 != j3) {
                    boolean z = this.g;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, wuj, queue)) {
                        if (z2) {
                            break;
                        }
                        wuj.onNext(NotificationLite.e(poll));
                        j3++;
                        if (j3 == ((long) this.f)) {
                            j5 = wuz.b(this.c, j3);
                            request(j3);
                            j3 = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (j5 != j3 || !a(this.g, queue.isEmpty(), wuj, queue)) {
                    this.j = j3;
                    j4 = this.h.addAndGet(-j4);
                } else {
                    return;
                }
            } while (j4 != 0);
        }

        private boolean a(boolean z, boolean z2, wuj<? super T> wuj, Queue<Object> queue) {
            if (wuj.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                if (!this.d) {
                    Throwable th = this.i;
                    if (th != null) {
                        queue.clear();
                        try {
                            wuj.onError(th);
                            return true;
                        } finally {
                            this.b.unsubscribe();
                        }
                    } else if (z2) {
                        try {
                            wuj.onCompleted();
                            return true;
                        } finally {
                            this.b.unsubscribe();
                        }
                    }
                } else if (z2) {
                    Throwable th2 = this.i;
                    if (th2 != null) {
                        try {
                            wuj.onError(th2);
                        } catch (Throwable th3) {
                            this.b.unsubscribe();
                            throw th3;
                        }
                    } else {
                        wuj.onCompleted();
                    }
                    this.b.unsubscribe();
                }
            }
            return false;
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        wug wug = this.a;
        if ((wug instanceof wxe) || (wug instanceof wxk)) {
            return wuj;
        }
        a aVar = new a(wug, wuj, this.b, this.c);
        wuj<? super T> wuj2 = aVar.a;
        wuj2.setProducer(new wuf() {
            public final void a(long j) {
                if (j > 0) {
                    wuz.a(a.this.c, j);
                    a.this.a();
                }
            }
        });
        wuj2.add(aVar.b);
        wuj2.add(aVar);
        return aVar;
    }

    public wwd(wug wug, boolean z, int i) {
        this.a = wug;
        this.b = z;
        if (i <= 0) {
            i = wxs.b;
        }
        this.c = i;
    }
}
