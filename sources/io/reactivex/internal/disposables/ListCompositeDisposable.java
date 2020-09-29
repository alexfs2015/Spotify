package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.LinkedList;
import java.util.List;

public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    private List<Disposable> a;
    private volatile boolean b;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((io.reactivex.disposables.Disposable) r1.next()).bf_();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        io.reactivex.exceptions.Exceptions.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r2 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r2.size() != 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw io.reactivex.internal.util.ExceptionHelper.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw new io.reactivex.exceptions.CompositeException((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bf_() {
        /*
            r4 = this;
            boolean r0 = r4.b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x000c:
            r0 = 1
            r4.b = r0     // Catch:{ all -> 0x0055 }
            java.util.List<io.reactivex.disposables.Disposable> r1 = r4.a     // Catch:{ all -> 0x0055 }
            r2 = 0
            r4.a = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
            r3.bf_()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.b(r3)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r3)
            goto L_0x001b
        L_0x003a:
            if (r2 == 0) goto L_0x0054
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
            throw r0
        L_0x004e:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            r0.<init>(r2)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0058:
            throw r0
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.ListCompositeDisposable.bf_():void");
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean a(Disposable disposable) {
        ObjectHelper.a(disposable, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.bf_();
        return false;
    }

    public final boolean b(Disposable disposable) {
        if (!c(disposable)) {
            return false;
        }
        disposable.bf_();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(io.reactivex.disposables.Disposable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.a(r3, r0)
            boolean r0 = r2.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.ListCompositeDisposable.c(io.reactivex.disposables.Disposable):boolean");
    }
}
