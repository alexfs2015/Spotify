package defpackage;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: eru reason: default package */
public final class eru extends esv {
    /* access modifiers changed from: private */
    public static final AtomicLong j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    public erx a;
    /* access modifiers changed from: private */
    public erx b;
    private final PriorityBlockingQueue<erw<?>> c = new PriorityBlockingQueue<>();
    private final BlockingQueue<erw<?>> d = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler e = new erv(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler f = new erv(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object g = new Object();
    /* access modifiers changed from: private */
    public final Semaphore h = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean i;

    eru(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final void c() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void b() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean f() {
        return Thread.currentThread() == this.a;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        w();
        bwx.a(callable);
        erw erw = new erw(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            if (!this.c.isEmpty()) {
                q().f.a("Callable skipped the worker queue.");
            }
            erw.run();
        } else {
            a(erw);
        }
        return erw;
    }

    public final <V> Future<V> b(Callable<V> callable) {
        w();
        bwx.a(callable);
        erw erw = new erw(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            erw.run();
        } else {
            a(erw);
        }
        return erw;
    }

    public final void a(Runnable runnable) {
        w();
        bwx.a(runnable);
        a(new erw<>(this, runnable, "Task exception on worker thread"));
    }

    private final void a(erw<?> erw) {
        synchronized (this.g) {
            this.c.add(erw);
            if (this.a == null) {
                this.a = new erx(this, "Measurement Worker", this.c);
                this.a.setUncaughtExceptionHandler(this.e);
                this.a.start();
            } else {
                this.a.a();
            }
        }
    }

    public final void b(Runnable runnable) {
        w();
        bwx.a(runnable);
        erw erw = new erw(this, runnable, "Task exception on network thread");
        synchronized (this.g) {
            this.d.add(erw);
            if (this.b == null) {
                this.b = new erx(this, "Measurement Network", this.d);
                this.b.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
