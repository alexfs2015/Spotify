package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.operators.NotificationLite;

/* renamed from: wwg reason: default package */
public final class wwg<R, T> implements b<R, T> {
    private static final Object c = new Object();
    final wuu<R, ? super T, R> a;
    private final wus<R> b;

    /* renamed from: wwg$a */
    static final class a<R> implements wue<R>, wuf {
        long a;
        final AtomicLong b;
        volatile wuf c;
        private wuj<? super R> d;
        private Queue<Object> e;
        private boolean f;
        private boolean g;
        private volatile boolean h;
        private Throwable i;

        public a(R r, wuj<? super R> wuj) {
            Queue<Object> queue;
            this.d = wuj;
            if (wzh.a()) {
                queue = new wza<>();
            } else {
                queue = new wya<>();
            }
            this.e = queue;
            queue.offer(NotificationLite.a(r));
            this.b = new AtomicLong();
        }

        public final void onNext(R r) {
            this.e.offer(NotificationLite.a(r));
            a();
        }

        private boolean a(boolean z, boolean z2, wuj<? super R> wuj) {
            if (wuj.isUnsubscribed()) {
                return true;
            }
            if (z) {
                Throwable th = this.i;
                if (th != null) {
                    wuj.onError(th);
                    return true;
                } else if (z2) {
                    wuj.onCompleted();
                    return true;
                }
            }
            return false;
        }

        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            a();
        }

        public final void onCompleted() {
            this.h = true;
            a();
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0) {
                wuz.a(this.b, j);
                wuf wuf = this.c;
                if (wuf == null) {
                    synchronized (this.b) {
                        wuf = this.c;
                        if (wuf == null) {
                            this.a = wuz.a(this.a, j);
                        }
                    }
                }
                if (wuf != null) {
                    wuf.a(j);
                }
                a();
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

        private void b() {
            wuj<? super R> wuj = this.d;
            Queue<Object> queue = this.e;
            AtomicLong atomicLong = this.b;
            long j = atomicLong.get();
            while (!a(this.h, queue.isEmpty(), wuj)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.h;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, wuj)) {
                        if (z2) {
                            break;
                        }
                        Object e2 = NotificationLite.e(poll);
                        try {
                            wuj.onNext(e2);
                            j2++;
                        } catch (Throwable th) {
                            wul.a(th, wuj, e2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    j = wuz.b(atomicLong, j2);
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
    }

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        final Object call = this.b.call();
        if (call == c) {
            return new wuj<T>(wuj) {
                private boolean a;
                private R b;

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
                        wwg r1 = defpackage.wwg.this     // Catch:{ all -> 0x001a }
                        wuu<R, ? super T, R> r1 = r1.a     // Catch:{ all -> 0x001a }
                        java.lang.Object r3 = r1.call(r0, r3)     // Catch:{ all -> 0x001a }
                    L_0x0012:
                        r2.b = r3
                        wuj r0 = r4
                        r0.onNext(r3)
                        return
                    L_0x001a:
                        r0 = move-exception
                        wuj r1 = r4
                        defpackage.wul.a(r0, r1, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wwg.AnonymousClass2.onNext(java.lang.Object):void");
                }

                public final void onError(Throwable th) {
                    wuj.onError(th);
                }

                public final void onCompleted() {
                    wuj.onCompleted();
                }
            };
        }
        final a aVar = new a(call, wuj);
        AnonymousClass3 r2 = new wuj<T>() {
            private R a = call;

            public final void onNext(T t) {
                try {
                    R call = wwg.this.a.call(this.a, t);
                    this.a = call;
                    aVar.onNext(call);
                } catch (Throwable th) {
                    wul.a(th, this, t);
                }
            }

            public final void onError(Throwable th) {
                aVar.onError(th);
            }

            public final void onCompleted() {
                aVar.onCompleted();
            }

            public final void setProducer(wuf wuf) {
                long j;
                a aVar = aVar;
                if (wuf != null) {
                    synchronized (aVar.b) {
                        if (aVar.c == null) {
                            j = aVar.a;
                            if (j != Long.MAX_VALUE) {
                                j--;
                            }
                            aVar.a = 0;
                            aVar.c = wuf;
                        } else {
                            throw new IllegalStateException("Can't set more than one Producer!");
                        }
                    }
                    if (j > 0) {
                        wuf.a(j);
                    }
                    aVar.a();
                    return;
                }
                throw new NullPointerException();
            }
        };
        wuj.add(r2);
        wuj.setProducer(aVar);
        return r2;
    }

    public wwg(final R r, wuu<R, ? super T, R> wuu) {
        this((wus<R>) new wus<R>() {
            public final R call() {
                return r;
            }
        }, wuu);
    }

    private wwg(wus<R> wus, wuu<R, ? super T, R> wuu) {
        this.b = wus;
        this.a = wuu;
    }

    public wwg(wuu<R, ? super T, R> wuu) {
        this((R) c, wuu);
    }
}
