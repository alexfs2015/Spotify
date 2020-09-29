package defpackage;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: fnz reason: default package */
public final class fnz<T> extends foa<T> {
    private static final a[] e = new a[0];
    public final AtomicReference<T> a;
    final Lock b;
    long c;
    private final AtomicReference<a<T>[]> d;
    private final Lock f;

    /* renamed from: fnz$a */
    static final class a<T> implements defpackage.fny.a<T>, Disposable {
        final fnz<T> a;
        boolean b;
        boolean c;
        fny<T> d;
        boolean e;
        volatile boolean f;
        long g;
        private Observer<? super T> h;

        a(Observer<? super T> observer, fnz<T> fnz) {
            this.h = observer;
            this.a = fnz;
        }

        public final void bf_() {
            if (!this.f) {
                this.f = true;
                this.a.a(this);
            }
        }

        public final boolean b() {
            return this.f;
        }

        public final boolean test(T t) {
            if (!this.f) {
                this.h.onNext(t);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.a(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                fny<T> r0 = r2.d     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.c = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.d = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                goto L_0x001b
            L_0x001a:
                throw r0
            L_0x001b:
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fnz.a.c():void");
        }
    }

    public static <T> fnz<T> a() {
        return new fnz<>();
    }

    public static <T> fnz<T> a(T t) {
        return new fnz<>(t);
    }

    private fnz() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference<>(e);
        this.a = new AtomicReference<>();
    }

    private fnz(T t) {
        this();
        if (t != null) {
            this.a.lazySet(t);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r7 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r0.test(r7);
        r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(io.reactivex.Observer<? super T> r7) {
        /*
            r6 = this;
            fnz$a r0 = new fnz$a
            r0.<init>(r7, r6)
            r7.onSubscribe(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<fnz$a<T>[]> r7 = r6.d
            java.lang.Object r7 = r7.get()
            fnz$a[] r7 = (defpackage.fnz.a[]) r7
            int r1 = r7.length
            int r2 = r1 + 1
            fnz$a[] r2 = new defpackage.fnz.a[r2]
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r2, r3, r1)
            r2[r1] = r0
            java.util.concurrent.atomic.AtomicReference<fnz$a<T>[]> r1 = r6.d
            boolean r7 = r1.compareAndSet(r7, r2)
            if (r7 != 0) goto L_0x0024
            goto L_0x0008
        L_0x0024:
            boolean r7 = r0.f
            if (r7 == 0) goto L_0x002c
            r6.a(r0)
            return
        L_0x002c:
            boolean r7 = r0.f
            if (r7 != 0) goto L_0x0066
            monitor-enter(r0)
            boolean r7 = r0.f     // Catch:{ all -> 0x0063 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0037:
            boolean r7 = r0.b     // Catch:{ all -> 0x0063 }
            if (r7 == 0) goto L_0x003d
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x003d:
            fnz<T> r7 = r0.a     // Catch:{ all -> 0x0063 }
            java.util.concurrent.locks.Lock r1 = r7.b     // Catch:{ all -> 0x0063 }
            r1.lock()     // Catch:{ all -> 0x0063 }
            long r4 = r7.c     // Catch:{ all -> 0x0063 }
            r0.g = r4     // Catch:{ all -> 0x0063 }
            java.util.concurrent.atomic.AtomicReference<T> r7 = r7.a     // Catch:{ all -> 0x0063 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0063 }
            r1.unlock()     // Catch:{ all -> 0x0063 }
            r1 = 1
            if (r7 == 0) goto L_0x0055
            r3 = 1
        L_0x0055:
            r0.c = r3     // Catch:{ all -> 0x0063 }
            r0.b = r1     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            if (r7 == 0) goto L_0x0066
            r0.test(r7)
            r0.c()
            goto L_0x0066
        L_0x0063:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r7
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnz.a(io.reactivex.Observer):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            if (aVarArr != e) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = e;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
    }

    /* JADX INFO: finally extract failed */
    public final void accept(T t) {
        a[] aVarArr;
        if (t != null) {
            this.f.lock();
            try {
                this.c++;
                this.a.lazySet(t);
                this.f.unlock();
                for (a aVar : (a[]) this.d.get()) {
                    long j = this.c;
                    if (!aVar.f) {
                        if (!aVar.e) {
                            synchronized (aVar) {
                                if (!aVar.f) {
                                    if (aVar.g != j) {
                                        if (aVar.c) {
                                            fny<T> fny = aVar.d;
                                            if (fny == null) {
                                                fny = new fny<>(4);
                                                aVar.d = fny;
                                            }
                                            int i = fny.a;
                                            int i2 = fny.c;
                                            if (i2 == i) {
                                                Object[] objArr = new Object[(i + 1)];
                                                fny.b[i] = objArr;
                                                fny.b = objArr;
                                                i2 = 0;
                                            }
                                            fny.b[i2] = t;
                                            fny.c = i2 + 1;
                                        } else {
                                            aVar.b = true;
                                            aVar.e = true;
                                        }
                                    }
                                }
                            }
                        }
                        aVar.test(t);
                    }
                }
            } catch (Throwable th) {
                this.f.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("value == null");
        }
    }
}
