package rx.subjects;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.operators.NotificationLite;

public final class SubjectSubscriptionManager<T> extends AtomicReference<a<T>> implements defpackage.wud.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    public boolean active = true;
    public volatile Object latest;
    public wun<b<T>> onAdded = wuq.a();
    wun<b<T>> onStart = wuq.a();
    public wun<b<T>> onTerminated = wuq.a();

    public static final class a<T> {
        static final b[] c = new b[0];
        static final a d = new a(true, c);
        static final a e = new a(false, c);
        final boolean a;
        public final b[] b;

        public a(boolean z, b[] bVarArr) {
            this.a = z;
            this.b = bVarArr;
        }

        public final a a(b bVar) {
            b[] bVarArr;
            b[] bVarArr2 = this.b;
            if (r1 == 1 && bVarArr2[0] == bVar) {
                return e;
            }
            if (r1 == 0) {
                return this;
            }
            int i = r1 - 1;
            b[] bVarArr3 = new b[i];
            int i2 = 0;
            for (b bVar2 : bVarArr2) {
                if (bVar2 != bVar) {
                    if (i2 == i) {
                        return this;
                    }
                    int i3 = i2 + 1;
                    bVarArr3[i2] = bVar2;
                    i2 = i3;
                }
            }
            if (i2 == 0) {
                return e;
            }
            if (i2 < i) {
                bVarArr = new b[i2];
                System.arraycopy(bVarArr3, 0, bVarArr, 0, i2);
            } else {
                bVarArr = bVarArr3;
            }
            return new a(this.a, bVarArr);
        }
    }

    public static final class b<T> implements wue<T> {
        public final wuj<? super T> a;
        public boolean b = true;
        public boolean c;
        private List<Object> d;
        private boolean e;

        public b(wuj<? super T> wuj) {
            this.a = wuj;
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onCompleted() {
            this.a.onCompleted();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.e = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r1.e
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.b = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.c     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r0 = r1.d     // Catch:{ all -> 0x0023 }
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r0.<init>()     // Catch:{ all -> 0x0023 }
                r1.d = r0     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r0 = r1.d     // Catch:{ all -> 0x0023 }
                r0.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                return
            L_0x001e:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                r0 = 1
                r1.e = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                throw r2
            L_0x0026:
                wuj<? super T> r0 = r1.a
                rx.internal.operators.NotificationLite.a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.SubjectSubscriptionManager.b.a(java.lang.Object):void");
        }

        public final void a(List<Object> list, Object obj) {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        for (Object b2 : list) {
                            b(b2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.c = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    b(obj);
                    z2 = false;
                }
                synchronized (this) {
                    try {
                        list = this.d;
                        this.d = null;
                        if (list == null) {
                            this.c = false;
                            try {
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
            }
        }

        private void b(Object obj) {
            if (obj != null) {
                NotificationLite.a(this.a, obj);
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        boolean z;
        wuj wuj = (wuj) obj;
        final b bVar = new b(wuj);
        wuj.add(xaj.a((wum) new wum() {
            public final void call() {
                SubjectSubscriptionManager.this.a(bVar);
            }
        }));
        this.onStart.call(bVar);
        if (!wuj.isUnsubscribed()) {
            while (true) {
                a aVar = (a) get();
                z = false;
                if (!aVar.a) {
                    int length = aVar.b.length;
                    b[] bVarArr = new b[(length + 1)];
                    System.arraycopy(aVar.b, 0, bVarArr, 0, length);
                    bVarArr[length] = bVar;
                    if (compareAndSet(aVar, new a(aVar.a, bVarArr))) {
                        this.onAdded.call(bVar);
                        z = true;
                        break;
                    }
                } else {
                    this.onTerminated.call(bVar);
                    break;
                }
            }
            if (z && wuj.isUnsubscribed()) {
                a(bVar);
            }
        }
    }

    public SubjectSubscriptionManager() {
        super(a.e);
    }

    /* access modifiers changed from: 0000 */
    public final void a(b<T> bVar) {
        a aVar;
        a a2;
        do {
            aVar = (a) get();
            if (!aVar.a) {
                a2 = aVar.a(bVar);
                if (a2 == aVar) {
                    break;
                }
            } else {
                return;
            }
        } while (!compareAndSet(aVar, a2));
    }

    public final b<T>[] a(Object obj) {
        this.latest = obj;
        this.active = false;
        if (((a) get()).a) {
            return a.c;
        }
        return ((a) getAndSet(a.d)).b;
    }
}
