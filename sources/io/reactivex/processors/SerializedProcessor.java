package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;

final class SerializedProcessor<T> extends FlowableProcessor<T> {
    private FlowableProcessor<T> b;
    private boolean c;
    private AppendOnlyLinkedArrayList<Object> d;
    private volatile boolean e;

    SerializedProcessor(FlowableProcessor<T> flowableProcessor) {
        this.b = flowableProcessor;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.b(wrg);
    }

    public final void a(wrh wrh) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a(wrh));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if (z) {
            wrh.a();
            return;
        }
        this.b.a(wrh);
        k();
    }

    public final void b_(T t) {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a(t));
                        return;
                    }
                    this.c = true;
                    this.b.b_(t);
                    k();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        io.reactivex.plugins.RxJavaPlugins.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r3.b.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.e
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.e     // Catch:{ all -> 0x003c }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = 1
            goto L_0x002f
        L_0x0011:
            r3.e = r2     // Catch:{ all -> 0x003c }
            boolean r0 = r3.c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x002d
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r3.d     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0023
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x003c }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x003c }
            r3.d = r0     // Catch:{ all -> 0x003c }
        L_0x0023:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.a(r4)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r0 = r0.b     // Catch:{ all -> 0x003c }
            r0[r1] = r4     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            return
        L_0x002d:
            r3.c = r2     // Catch:{ all -> 0x003c }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0036
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0036:
            io.reactivex.processors.FlowableProcessor<T> r0 = r3.b
            r0.onError(r4)
            return
        L_0x003c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.SerializedProcessor.onError(java.lang.Throwable):void");
    }

    public final void c() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    this.e = true;
                    if (this.c) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a());
                        return;
                    }
                    this.c = true;
                    this.b.c();
                }
            }
        }
    }

    private void k() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.d;
                if (appendOnlyLinkedArrayList == null) {
                    this.c = false;
                    return;
                }
                this.d = null;
            }
            appendOnlyLinkedArrayList.a((wrg<? super U>) this.b);
        }
        while (true) {
        }
    }
}
