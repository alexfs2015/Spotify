package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.operators.NotificationLite;

/* renamed from: xkl reason: default package */
public final class xkl<R, T> implements b<R, T> {
    private static final Object c = new Object();
    final xiz<R, ? super T, R> a;
    private final xix<R> b;

    /* renamed from: xkl$a */
    static final class a<R> implements xij<R>, xik {
        long a;
        final AtomicLong b;
        volatile xik c;
        private xio<? super R> d;
        private Queue<Object> e;
        private boolean f;
        private boolean g;
        private volatile boolean h;
        private Throwable i;

        public a(R r, xio<? super R> xio) {
            this.d = xio;
            Queue<Object> xnf = xnm.a() ? new xnf<>() : new xmf<>();
            this.e = xnf;
            xnf.offer(NotificationLite.a(r));
            this.b = new AtomicLong();
        }

        private boolean a(boolean z, boolean z2, xio<? super R> xio) {
            if (xio.isUnsubscribed()) {
                return true;
            }
            if (z) {
                Throwable th = this.i;
                if (th != null) {
                    xio.onError(th);
                    return true;
                } else if (z2) {
                    xio.onCompleted();
                    return true;
                }
            }
            return false;
        }

        private void b() {
            xio<? super R> xio = this.d;
            Queue<Object> queue = this.e;
            AtomicLong atomicLong = this.b;
            long j = atomicLong.get();
            while (!a(this.h, queue.isEmpty(), xio)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.h;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, xio)) {
                        if (z2) {
                            break;
                        }
                        Object e2 = NotificationLite.e(poll);
                        try {
                            xio.onNext(e2);
                            j2++;
                        } catch (Throwable th) {
                            xiq.a(th, xio, e2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    j = xje.b(atomicLong, j2);
                }
                synchronized (this) {
                    if (!this.g) {
                        this.f = false;
                        return;
                    }
                    this.g = false;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            synchronized (this) {
                if (this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
                b();
            }
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0) {
                xje.a(this.b, j);
                xik xik = this.c;
                if (xik == null) {
                    synchronized (this.b) {
                        xik = this.c;
                        if (xik == null) {
                            this.a = xje.a(this.a, j);
                        }
                    }
                }
                if (xik != null) {
                    xik.a(j);
                }
                a();
            }
        }

        public final void onCompleted() {
            this.h = true;
            a();
        }

        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            a();
        }

        public final void onNext(R r) {
            this.e.offer(NotificationLite.a(r));
            a();
        }
    }

    public xkl(final R r, xiz<R, ? super T, R> xiz) {
        this((xix<R>) new xix<R>() {
            public final R call() {
                return r;
            }
        }, xiz);
    }

    private xkl(xix<R> xix, xiz<R, ? super T, R> xiz) {
        this.b = xix;
        this.a = xiz;
    }

    public xkl(xiz<R, ? super T, R> xiz) {
        this((R) c, xiz);
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        final Object call = this.b.call();
        if (call == c) {
            return new xio<T>(xio) {
                private boolean a;
                private R b;

                public final void onCompleted() {
                    xio.onCompleted();
                }

                public final void onError(Throwable th) {
                    xio.onError(th);
                }

                /* JADX WARNING: Incorrect type for immutable var: ssa=T, code=java.lang.Object, for r3v0, types: [T, java.lang.Object] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onNext(java.lang.Object r3) {
                    /*
                        r2 = this;
                        boolean r0 = r2.a
                        if (r0 != 0) goto L_0x0008
                        r0 = 1
                        r2.a = r0
                        goto L_0x0012
                    L_0x0008:
                        R r0 = r2.b
                        xkl r1 = defpackage.xkl.this     // Catch:{ all -> 0x001a }
                        xiz<R, ? super T, R> r1 = r1.a     // Catch:{ all -> 0x001a }
                        java.lang.Object r3 = r1.call(r0, r3)     // Catch:{ all -> 0x001a }
                    L_0x0012:
                        r2.b = r3
                        xio r0 = r4
                        r0.onNext(r3)
                        return
                    L_0x001a:
                        r0 = move-exception
                        xio r1 = r4
                        defpackage.xiq.a(r0, r1, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.xkl.AnonymousClass2.onNext(java.lang.Object):void");
                }
            };
        }
        final a aVar = new a(call, xio);
        AnonymousClass3 r2 = new xio<T>() {
            private R a = call;

            public final void onCompleted() {
                aVar.onCompleted();
            }

            public final void onError(Throwable th) {
                aVar.onError(th);
            }

            public final void onNext(T t) {
                try {
                    R call = xkl.this.a.call(this.a, t);
                    this.a = call;
                    aVar.onNext(call);
                } catch (Throwable th) {
                    xiq.a(th, this, t);
                }
            }

            public final void setProducer(xik xik) {
                long j;
                a aVar = aVar;
                if (xik != null) {
                    synchronized (aVar.b) {
                        if (aVar.c == null) {
                            j = aVar.a;
                            if (j != Long.MAX_VALUE) {
                                j--;
                            }
                            aVar.a = 0;
                            aVar.c = xik;
                        } else {
                            throw new IllegalStateException("Can't set more than one Producer!");
                        }
                    }
                    if (j > 0) {
                        xik.a(j);
                    }
                    aVar.a();
                    return;
                }
                throw new NullPointerException();
            }
        };
        xio.add(r2);
        xio.setProducer(aVar);
        return r2;
    }
}
