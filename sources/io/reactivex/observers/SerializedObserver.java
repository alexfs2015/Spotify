package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;

public final class SerializedObserver<T> implements Observer<T>, Disposable {
    private Observer<? super T> a;
    private boolean b;
    private Disposable c;
    private boolean d;
    private AppendOnlyLinkedArrayList<Object> e;
    private volatile boolean f;

    public SerializedObserver(Observer<? super T> observer) {
        this(observer, false);
    }

    private SerializedObserver(Observer<? super T> observer, boolean z) {
        this.a = observer;
        this.b = false;
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.a(this.c, disposable)) {
            this.c = disposable;
            this.a.onSubscribe(this);
        }
    }

    public final void bf_() {
        this.c.bf_();
    }

    public final boolean b() {
        return this.c.b();
    }

    public final void onNext(T t) {
        if (!this.f) {
            if (t == null) {
                this.c.bf_();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f) {
                    if (this.d) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.e;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.e = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a(t));
                        return;
                    }
                    this.d = true;
                    this.a.onNext(t);
                    c();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r1 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        io.reactivex.plugins.RxJavaPlugins.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r3.a.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f     // Catch:{ all -> 0x0046 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = 1
            goto L_0x0039
        L_0x0011:
            boolean r0 = r3.d     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0035
            r3.f = r2     // Catch:{ all -> 0x0046 }
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r3.e     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0023
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0046 }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x0046 }
            r3.e = r0     // Catch:{ all -> 0x0046 }
        L_0x0023:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.a(r4)     // Catch:{ all -> 0x0046 }
            boolean r2 = r3.b     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x002f
            r0.a(r4)     // Catch:{ all -> 0x0046 }
            goto L_0x0033
        L_0x002f:
            java.lang.Object[] r0 = r0.b     // Catch:{ all -> 0x0046 }
            r0[r1] = r4     // Catch:{ all -> 0x0046 }
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            return
        L_0x0035:
            r3.f = r2     // Catch:{ all -> 0x0046 }
            r3.d = r2     // Catch:{ all -> 0x0046 }
        L_0x0039:
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0040
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0040:
            io.reactivex.Observer<? super T> r0 = r3.a
            r0.onError(r4)
            return
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.SerializedObserver.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    if (this.d) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.e;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.e = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a());
                        return;
                    }
                    this.f = true;
                    this.d = true;
                    this.a.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r3 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r4 >= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r5 = r3[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r5 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (io.reactivex.internal.util.NotificationLite.b((java.lang.Object) r5, r2) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r3 = r3[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r2 = r6.a;
        r3 = r0.b;
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r6.e     // Catch:{ all -> 0x0030 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r6.d = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            return
        L_0x000a:
            r2 = 0
            r6.e = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            io.reactivex.Observer<? super T> r2 = r6.a
            java.lang.Object[] r3 = r0.b
            int r0 = r0.a
        L_0x0014:
            if (r3 == 0) goto L_0x002d
            r4 = 0
        L_0x0017:
            if (r4 >= r0) goto L_0x0028
            r5 = r3[r4]
            if (r5 == 0) goto L_0x0028
            boolean r5 = io.reactivex.internal.util.NotificationLite.b(r5, r2)
            if (r5 == 0) goto L_0x0025
            r1 = 1
            goto L_0x002d
        L_0x0025:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0028:
            r3 = r3[r0]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L_0x0014
        L_0x002d:
            if (r1 == 0) goto L_0x0000
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0034
        L_0x0033:
            throw r0
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.SerializedObserver.c():void");
    }
}
