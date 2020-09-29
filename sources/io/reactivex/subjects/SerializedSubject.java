package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.NotificationLite;

public final class SerializedSubject<T> extends Subject<T> implements NonThrowingPredicate<Object> {
    private Subject<T> a;
    private boolean b;
    private AppendOnlyLinkedArrayList<Object> c;
    private volatile boolean d;

    public SerializedSubject(Subject<T> subject) {
        this.a = subject;
    }

    private void a() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.c;
                if (appendOnlyLinkedArrayList == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            appendOnlyLinkedArrayList.a((NonThrowingPredicate<? super T>) this);
        }
        while (true) {
        }
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(observer);
    }

    public final void onComplete() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                    if (this.b) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a());
                        return;
                    }
                    this.b = true;
                    this.a.onComplete();
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
        r3.a.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.d     // Catch:{ all -> 0x003c }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = 1
            goto L_0x002f
        L_0x0011:
            r3.d = r2     // Catch:{ all -> 0x003c }
            boolean r0 = r3.b     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x002d
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r3.c     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0023
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x003c }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x003c }
            r3.c = r0     // Catch:{ all -> 0x003c }
        L_0x0023:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.a(r4)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r0 = r0.b     // Catch:{ all -> 0x003c }
            r0[r1] = r4     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            return
        L_0x002d:
            r3.b = r2     // Catch:{ all -> 0x003c }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0036
            io.reactivex.plugins.RxJavaPlugins.a(r4)
            return
        L_0x0036:
            io.reactivex.subjects.Subject<T> r0 = r3.a
            r0.onError(r4)
            return
        L_0x003c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.SerializedSubject.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a(t));
                        return;
                    }
                    this.b = true;
                    this.a.onNext(t);
                    a();
                }
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a(NotificationLite.a(disposable));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.bd_();
            return;
        }
        this.a.onSubscribe(disposable);
        a();
    }

    public final boolean test(Object obj) {
        return NotificationLite.b(obj, (Observer<? super T>) this.a);
    }
}
