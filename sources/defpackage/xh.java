package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: xh reason: default package */
public final class xh<T> {
    private static Executor a = Executors.newCachedThreadPool();
    private Thread b;
    private final Set<xe<T>> c;
    private final Set<xe<Throwable>> d;
    private final Handler e;
    /* access modifiers changed from: private */
    public final FutureTask<xg<T>> f;
    /* access modifiers changed from: private */
    public volatile xg<T> g;

    public xh(Callable<xg<T>> callable) {
        this(callable, false);
    }

    private xh(Callable<xg<T>> callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.g = null;
        this.f = new FutureTask<>(callable);
        a.execute(this.f);
        a();
    }

    public final synchronized xh<T> a(xe<T> xeVar) {
        if (!(this.g == null || this.g.a == null)) {
            xeVar.a(this.g.a);
        }
        this.c.add(xeVar);
        a();
        return this;
    }

    public final synchronized xh<T> b(xe<T> xeVar) {
        this.c.remove(xeVar);
        b();
        return this;
    }

    public final synchronized xh<T> c(xe<Throwable> xeVar) {
        if (!(this.g == null || this.g.b == null)) {
            xeVar.a(this.g.b);
        }
        this.d.add(xeVar);
        a();
        return this;
    }

    public final synchronized xh<T> d(xe<Throwable> xeVar) {
        this.d.remove(xeVar);
        b();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.c()     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            xg<T> r0 = r2.g     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            xh$2 r0 = new xh$2     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x0023 }
            r2.b = r0     // Catch:{ all -> 0x0023 }
            java.lang.Thread r0 = r2.b     // Catch:{ all -> 0x0023 }
            r0.start()     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "Starting TaskObserver thread"
            defpackage.wz.a(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.a():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.c()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.util.Set<xe<T>> r0 = r1.c     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0015
            xg<T> r0 = r1.g     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
        L_0x0015:
            java.lang.Thread r0 = r1.b     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            r0 = 0
            r1.b = r0     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Stopping TaskObserver thread"
            defpackage.wz.a(r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.b():void");
    }

    private boolean c() {
        Thread thread = this.b;
        return thread != null && thread.isAlive();
    }

    static /* synthetic */ void a(xh xhVar, Object obj) {
        for (xe a2 : new ArrayList(xhVar.c)) {
            a2.a(obj);
        }
    }

    static /* synthetic */ void a(xh xhVar, Throwable th) {
        ArrayList<xe> arrayList = new ArrayList<>(xhVar.d);
        if (!arrayList.isEmpty()) {
            for (xe a2 : arrayList) {
                a2.a(th);
            }
        }
    }

    static /* synthetic */ void a(xh xhVar, xg xgVar) {
        if (xhVar.g == null) {
            xhVar.g = xgVar;
            xhVar.e.post(new Runnable() {
                public final void run() {
                    if (xh.this.g != null && !xh.this.f.isCancelled()) {
                        xg a2 = xh.this.g;
                        if (a2.a != null) {
                            xh.a(xh.this, (Object) a2.a);
                            return;
                        }
                        xh.a(xh.this, a2.b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
