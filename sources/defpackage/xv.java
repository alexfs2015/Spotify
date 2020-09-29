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

/* renamed from: xv reason: default package */
public final class xv<T> {
    private static Executor a = Executors.newCachedThreadPool();
    private Thread b;
    private final Set<xs<T>> c;
    private final Set<xs<Throwable>> d;
    private final Handler e;
    /* access modifiers changed from: private */
    public final FutureTask<xu<T>> f;
    /* access modifiers changed from: private */
    public volatile xu<T> g;

    public xv(Callable<xu<T>> callable) {
        this(callable, false);
    }

    private xv(Callable<xu<T>> callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.g = null;
        this.f = new FutureTask<>(callable);
        a.execute(this.f);
        a();
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
            xu<T> r0 = r2.g     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            xv$2 r0 = new xv$2     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x0023 }
            r2.b = r0     // Catch:{ all -> 0x0023 }
            java.lang.Thread r0 = r2.b     // Catch:{ all -> 0x0023 }
            r0.start()     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "Starting TaskObserver thread"
            defpackage.xn.a(r0)     // Catch:{ all -> 0x0023 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv.a():void");
    }

    static /* synthetic */ void a(xv xvVar, Object obj) {
        for (xs a2 : new ArrayList(xvVar.c)) {
            a2.a(obj);
        }
    }

    static /* synthetic */ void a(xv xvVar, Throwable th) {
        ArrayList<xs> arrayList = new ArrayList<>(xvVar.d);
        if (!arrayList.isEmpty()) {
            for (xs a2 : arrayList) {
                a2.a(th);
            }
        }
    }

    static /* synthetic */ void a(xv xvVar, xu xuVar) {
        if (xvVar.g == null) {
            xvVar.g = xuVar;
            xvVar.e.post(new Runnable() {
                public final void run() {
                    if (xv.this.g != null && !xv.this.f.isCancelled()) {
                        xu a2 = xv.this.g;
                        if (a2.a != null) {
                            xv.a(xv.this, (Object) a2.a);
                            return;
                        }
                        xv.a(xv.this, a2.b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
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
            java.util.Set<xs<T>> r0 = r1.c     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0015
            xu<T> r0 = r1.g     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
        L_0x0015:
            java.lang.Thread r0 = r1.b     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            r0 = 0
            r1.b = r0     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Stopping TaskObserver thread"
            defpackage.xn.a(r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv.b():void");
    }

    private boolean c() {
        Thread thread = this.b;
        return thread != null && thread.isAlive();
    }

    public final synchronized xv<T> a(xs<T> xsVar) {
        if (!(this.g == null || this.g.a == null)) {
            xsVar.a(this.g.a);
        }
        this.c.add(xsVar);
        a();
        return this;
    }

    public final synchronized xv<T> b(xs<T> xsVar) {
        this.c.remove(xsVar);
        b();
        return this;
    }

    public final synchronized xv<T> c(xs<Throwable> xsVar) {
        if (!(this.g == null || this.g.b == null)) {
            xsVar.a(this.g.b);
        }
        this.d.add(xsVar);
        a();
        return this;
    }

    public final synchronized xv<T> d(xs<Throwable> xsVar) {
        this.d.remove(xsVar);
        b();
        return this;
    }
}
