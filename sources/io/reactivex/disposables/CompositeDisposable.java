package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDisposable implements Disposable, DisposableContainer {
    private OpenHashSet<Disposable> a;
    private volatile boolean b;

    public final void bf_() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    OpenHashSet<Disposable> openHashSet = this.a;
                    this.a = null;
                    a(openHashSet);
                }
            }
        }
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean a(Disposable disposable) {
        ObjectHelper.a(disposable, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    OpenHashSet<Disposable> openHashSet = this.a;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet<>();
                        this.a = openHashSet;
                    }
                    openHashSet.a(disposable);
                    return true;
                }
            }
        }
        disposable.bf_();
        return false;
    }

    public final boolean a(Disposable... disposableArr) {
        ObjectHelper.a(disposableArr, "disposables is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    OpenHashSet<Disposable> openHashSet = this.a;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet<>(3);
                        this.a = openHashSet;
                    }
                    for (int i = 0; i < 2; i++) {
                        Disposable disposable = disposableArr[i];
                        ObjectHelper.a(disposable, "A Disposable in the disposables array is null");
                        openHashSet.a(disposable);
                    }
                    return true;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            disposableArr[i2].bf_();
        }
        return false;
    }

    public final boolean b(Disposable disposable) {
        if (!c(disposable)) {
            return false;
        }
        disposable.bf_();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(io.reactivex.disposables.Disposable r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            io.reactivex.internal.functions.ObjectHelper.a(r8, r0)
            boolean r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.b     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r1
        L_0x0012:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r7.a     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x004b
            T[] r2 = r0.c     // Catch:{ all -> 0x004d }
            int r3 = r0.a     // Catch:{ all -> 0x004d }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004d }
            int r4 = io.reactivex.internal.util.OpenHashSet.a(r4)     // Catch:{ all -> 0x004d }
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004d }
            r6 = 1
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r8 = 0
            goto L_0x0046
        L_0x002a:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0035
            boolean r8 = r0.a(r4, r2, r3)     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004d }
            if (r5 != 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0035
            boolean r8 = r0.a(r4, r2, r3)     // Catch:{ all -> 0x004d }
        L_0x0046:
            if (r8 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r6
        L_0x004b:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r1
        L_0x004d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x0050:
            throw r8
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.c(io.reactivex.disposables.Disposable):boolean");
    }

    public final void c() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    OpenHashSet<Disposable> openHashSet = this.a;
                    this.a = null;
                    a(openHashSet);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r2 = this;
            boolean r0 = r2.b
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x000d:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.a     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            int r1 = r0.b     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.d():int");
    }

    private static void a(OpenHashSet<Disposable> openHashSet) {
        T[] tArr;
        if (openHashSet != null) {
            List list = null;
            for (T t : openHashSet.c) {
                if (t instanceof Disposable) {
                    try {
                        ((Disposable) t).bf_();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw ExceptionHelper.a((Throwable) list.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) list);
        }
    }
}
