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

/* renamed from: esl reason: default package */
public final class esl extends etm {
    /* access modifiers changed from: private */
    public static final AtomicLong j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    public eso a;
    /* access modifiers changed from: private */
    public eso b;
    private final PriorityBlockingQueue<esn<?>> c = new PriorityBlockingQueue<>();
    private final BlockingQueue<esn<?>> d = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler e = new esm(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler f = new esm(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object g = new Object();
    /* access modifiers changed from: private */
    public final Semaphore h = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean i;

    esl(esp esp) {
        super(esp);
    }

    private final void a(esn<?> esn) {
        synchronized (this.g) {
            this.c.add(esn);
            if (this.a == null) {
                this.a = new eso(this, "Measurement Worker", this.c);
                this.a.setUncaughtExceptionHandler(this.e);
                this.a.start();
            } else {
                this.a.a();
            }
        }
    }

    public final <V> Future<V> a(Callable<V> callable) {
        w();
        bxo.a(callable);
        esn esn = new esn(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            if (!this.c.isEmpty()) {
                q().f.a("Callable skipped the worker queue.");
            }
            esn.run();
        } else {
            a(esn);
        }
        return esn;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Runnable runnable) {
        w();
        bxo.a(runnable);
        a(new esn<>(this, runnable, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        w();
        bxo.a(callable);
        esn esn = new esn(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            esn.run();
        } else {
            a(esn);
        }
        return esn;
    }

    public final void b() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void b(Runnable runnable) {
        w();
        bxo.a(runnable);
        esn esn = new esn(this, runnable, "Task exception on network thread");
        synchronized (this.g) {
            this.d.add(esn);
            if (this.b == null) {
                this.b = new eso(this, "Measurement Network", this.d);
                this.b.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    public final void c() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final boolean f() {
        return Thread.currentThread() == this.a;
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }
}
