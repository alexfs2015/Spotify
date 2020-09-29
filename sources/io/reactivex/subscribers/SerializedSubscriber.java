package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;

public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, wrh {
    private wrg<? super T> a;
    private boolean b;
    private wrh c;
    private boolean d;
    private AppendOnlyLinkedArrayList<Object> e;
    private volatile boolean f;

    public SerializedSubscriber(wrg<? super T> wrg) {
        this(wrg, false);
    }

    private SerializedSubscriber(wrg<? super T> wrg, boolean z) {
        this.a = wrg;
        this.b = false;
    }

    public final void a(wrh wrh) {
        if (SubscriptionHelper.a(this.c, wrh)) {
            this.c = wrh;
            this.a.a(this);
        }
    }

    public final void b_(T t) {
        if (!this.f) {
            if (t == null) {
                this.c.a();
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
                    this.a.b_(t);
                    b();
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
            wrg<? super T> r0 = r3.a
            r0.onError(r4)
            return
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subscribers.SerializedSubscriber.onError(java.lang.Throwable):void");
    }

    public final void c() {
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
                    this.a.c();
                }
            }
        }
    }

    private void b() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.e;
                if (appendOnlyLinkedArrayList == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        } while (!appendOnlyLinkedArrayList.a(this.a));
    }

    public final void a(long j) {
        this.c.a(j);
    }

    public final void a() {
        this.c.a();
    }
}
