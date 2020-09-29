package com.comscore.android.vce;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class v {
    static final String a = "Runner";
    static final int f = 1;
    static final int g = 2;
    static final int h = 3;
    static final int i = 4;
    static final int j = 5;
    final p b;
    final ScheduledThreadPoolExecutor c;
    final ScheduledThreadPoolExecutor d;
    final Handler e = new Handler(Looper.getMainLooper());
    boolean k = false;
    Runnable l;
    Runnable m;
    Runnable n;
    Runnable o;
    Runnable p;
    Map<Future, Integer> q;
    ArrayList<Future> r;
    boolean s = false;

    v(p pVar) {
        this.b = pVar;
        this.c = new ScheduledThreadPoolExecutor(1);
        this.d = new ScheduledThreadPoolExecutor(1);
        l();
    }

    /* access modifiers changed from: 0000 */
    public Boolean a(Integer num) {
        if (!this.q.containsValue(num)) {
            return Boolean.FALSE;
        }
        for (Entry entry : this.q.entrySet()) {
            if (((Integer) entry.getValue()).equals(num)) {
                if (!this.r.contains((Future) entry.getKey())) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: 0000 */
    public Runnable a(Runnable runnable) {
        if (this.s) {
            runnable.run();
            return runnable;
        }
        this.e.post(runnable);
        return runnable;
    }

    /* access modifiers changed from: 0000 */
    public ScheduledFuture a(Runnable runnable, long j2) {
        if (this.k) {
            return null;
        }
        return this.c.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    public ScheduledFuture a(Runnable runnable, long j2, long j3) {
        if (this.k) {
            return null;
        }
        return this.c.scheduleWithFixedDelay(runnable, j2, j3, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.k = true;
        c();
        e();
        j();
        g();
        this.l = null;
        this.p = null;
        this.o = null;
        this.n = null;
        this.d.shutdownNow();
        this.c.shutdownNow();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        for (Entry entry : this.q.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i2) {
                Future future = (Future) entry.getKey();
                future.cancel(true);
                this.r.add(future);
            }
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            Future future2 = (Future) this.r.get(i3);
            if (future2.isCancelled()) {
                this.q.remove(future2);
            }
        }
        this.r.clear();
    }

    /* access modifiers changed from: 0000 */
    public Future b(Runnable runnable) {
        if (this.k) {
            return null;
        }
        return this.c.submit(runnable);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Integer valueOf = Integer.valueOf(1);
        if (!a(valueOf).booleanValue()) {
            Runnable runnable = this.l;
            if (runnable != null) {
                this.q.put(this.c.scheduleWithFixedDelay(runnable, 0, (long) c.g.intValue(), TimeUnit.MILLISECONDS), valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Future c(Runnable runnable) {
        if (this.k) {
            return null;
        }
        return this.d.submit(runnable);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        a(1);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        Integer valueOf = Integer.valueOf(2);
        if (!a(valueOf).booleanValue()) {
            Runnable runnable = this.n;
            if (runnable != null) {
                this.q.put(this.c.scheduleWithFixedDelay(runnable, (long) c.i.intValue(), (long) c.i.intValue(), TimeUnit.MILLISECONDS), valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(Runnable runnable) {
        this.l = runnable;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        a(2);
    }

    /* access modifiers changed from: 0000 */
    public void e(Runnable runnable) {
        this.n = runnable;
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        Integer valueOf = Integer.valueOf(4);
        if (!a(valueOf).booleanValue()) {
            Runnable runnable = this.p;
            if (runnable != null) {
                this.q.put(this.c.scheduleWithFixedDelay(runnable, (long) c.j.intValue(), (long) c.j.intValue(), TimeUnit.MILLISECONDS), valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void f(Runnable runnable) {
        this.p = runnable;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        a(4);
    }

    /* access modifiers changed from: 0000 */
    public void g(Runnable runnable) {
        this.o = runnable;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        if (this.o != null) {
            a(3);
            this.q.put(this.c.scheduleWithFixedDelay(this.o, 0, (long) c.h.intValue(), TimeUnit.MILLISECONDS), Integer.valueOf(3));
        }
    }

    /* access modifiers changed from: 0000 */
    public void h(Runnable runnable) {
        this.m = runnable;
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        Integer valueOf = Integer.valueOf(3);
        if (!a(valueOf).booleanValue()) {
            Runnable runnable = this.o;
            if (runnable != null) {
                this.q.put(this.c.scheduleWithFixedDelay(runnable, 0, (long) c.h.intValue(), TimeUnit.MILLISECONDS), valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        a(3);
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.o != null;
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.q = new HashMap();
        this.r = new ArrayList<>();
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        Integer valueOf = Integer.valueOf(5);
        if (!a(valueOf).booleanValue()) {
            Runnable runnable = this.m;
            if (runnable != null) {
                this.q.put(this.c.scheduleWithFixedDelay(runnable, (long) c.k.intValue(), (long) c.k.intValue(), TimeUnit.MILLISECONDS), valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        a(5);
    }
}
