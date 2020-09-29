package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class BehaviorSubject<T> extends Subject<T> {
    private static BehaviorDisposable[] e = new BehaviorDisposable[0];
    private static BehaviorDisposable[] f = new BehaviorDisposable[0];
    final AtomicReference<Object> a;
    final Lock b;
    long c;
    private AtomicReference<BehaviorDisposable<T>[]> d;
    private ReadWriteLock g;
    private Lock h;
    private AtomicReference<Throwable> i;

    static final class BehaviorDisposable<T> implements Disposable, NonThrowingPredicate<Object> {
        final BehaviorSubject<T> a;
        boolean b;
        boolean c;
        volatile boolean d;
        long e;
        private Observer<? super T> f;
        private AppendOnlyLinkedArrayList<Object> g;
        private boolean h;

        BehaviorDisposable(Observer<? super T> observer, BehaviorSubject<T> behaviorSubject) {
            this.f = observer;
            this.a = behaviorSubject;
        }

        public final void bf_() {
            if (!this.d) {
                this.d = true;
                this.a.a(this);
            }
        }

        public final boolean b() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.h = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.d
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.h
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.d     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.e     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.c     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r5 = r3.g     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.AppendOnlyLinkedArrayList r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.g = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.b = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.h = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.a(java.lang.Object, long):void");
        }

        public final boolean test(Object obj) {
            return this.d || NotificationLite.a(obj, this.f);
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.AppendOnlyLinkedArrayList.a(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.a((io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate) r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.d
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.g     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.c = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.g = r1     // Catch:{ all -> 0x0017 }
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.c():void");
        }
    }

    public static <T> BehaviorSubject<T> a() {
        return new BehaviorSubject<>();
    }

    public static <T> BehaviorSubject<T> a(T t) {
        return new BehaviorSubject<>(t);
    }

    BehaviorSubject() {
        this.g = new ReentrantReadWriteLock();
        this.b = this.g.readLock();
        this.h = this.g.writeLock();
        this.d = new AtomicReference<>(e);
        this.a = new AtomicReference<>();
        this.i = new AtomicReference<>();
    }

    private BehaviorSubject(T t) {
        this();
        this.a.lazySet(ObjectHelper.a(t, "defaultValue is null"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r8 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0.test(r8) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(io.reactivex.Observer<? super T> r8) {
        /*
            r7 = this;
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable r0 = new io.reactivex.subjects.BehaviorSubject$BehaviorDisposable
            r0.<init>(r8, r7)
            r8.onSubscribe(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r1 = r7.d
            java.lang.Object r1 = r1.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r2 = f
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            goto L_0x002b
        L_0x0018:
            int r2 = r1.length
            int r5 = r2 + 1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r5 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r2 = r7.d
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L_0x0008
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0072
            boolean r8 = r0.d
            if (r8 == 0) goto L_0x0035
            r7.a(r0)
            return
        L_0x0035:
            boolean r8 = r0.d
            if (r8 != 0) goto L_0x0071
            monitor-enter(r0)
            boolean r8 = r0.d     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0040:
            boolean r8 = r0.b     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0046:
            io.reactivex.subjects.BehaviorSubject<T> r8 = r0.a     // Catch:{ all -> 0x006e }
            java.util.concurrent.locks.Lock r1 = r8.b     // Catch:{ all -> 0x006e }
            r1.lock()     // Catch:{ all -> 0x006e }
            long r5 = r8.c     // Catch:{ all -> 0x006e }
            r0.e = r5     // Catch:{ all -> 0x006e }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.a     // Catch:{ all -> 0x006e }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x006e }
            r1.unlock()     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x005d
            r3 = 1
        L_0x005d:
            r0.c = r3     // Catch:{ all -> 0x006e }
            r0.b = r4     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0071
            boolean r8 = r0.test(r8)
            if (r8 != 0) goto L_0x0071
            r0.c()
            goto L_0x0071
        L_0x006e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r8
        L_0x0071:
            return
        L_0x0072:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.i
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a
            if (r0 != r1) goto L_0x0082
            r8.onComplete()
            return
        L_0x0082:
            r8.onError(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.BehaviorSubject.a(io.reactivex.Observer):void");
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.i.get() != null) {
            disposable.bf_();
        }
    }

    public final void onNext(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i.get() == null) {
            Object a2 = NotificationLite.a(t);
            g(a2);
            for (BehaviorDisposable a3 : (BehaviorDisposable[]) this.d.get()) {
                a3.a(a2, this.c);
            }
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.i.compareAndSet(null, th)) {
            RxJavaPlugins.a(th);
            return;
        }
        Object a2 = NotificationLite.a(th);
        for (BehaviorDisposable a3 : f(a2)) {
            a3.a(a2, this.c);
        }
    }

    public final void onComplete() {
        if (this.i.compareAndSet(null, ExceptionHelper.a)) {
            Object a2 = NotificationLite.a();
            for (BehaviorDisposable a3 : f(a2)) {
                a3.a(a2, this.c);
            }
        }
    }

    public final T j() {
        Object obj = this.a.get();
        if (NotificationLite.b(obj) || NotificationLite.c(obj)) {
            return null;
        }
        return NotificationLite.d(obj);
    }

    /* access modifiers changed from: 0000 */
    public final void a(BehaviorDisposable<T> behaviorDisposable) {
        BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = (BehaviorDisposable[]) this.d.get();
            int length = behaviorDisposableArr.length;
            if (length != 0) {
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (behaviorDisposableArr[i3] == behaviorDisposable) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        behaviorDisposableArr2 = e;
                    } else {
                        BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[(length - 1)];
                        System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i2);
                        System.arraycopy(behaviorDisposableArr, i2 + 1, behaviorDisposableArr3, i2, (length - i2) - 1);
                        behaviorDisposableArr2 = behaviorDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.d.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    private BehaviorDisposable<T>[] f(Object obj) {
        BehaviorDisposable<T>[] behaviorDisposableArr = (BehaviorDisposable[]) this.d.getAndSet(f);
        if (behaviorDisposableArr != f) {
            g(obj);
        }
        return behaviorDisposableArr;
    }

    private void g(Object obj) {
        this.h.lock();
        this.c++;
        this.a.lazySet(obj);
        this.h.unlock();
    }
}
