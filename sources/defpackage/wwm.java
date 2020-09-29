package defpackage;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wwm reason: default package */
public final class wwm extends wvw {
    public static final wwm a = new wwm();
    /* access modifiers changed from: private */
    public static final wyc d = wyd.a(wwm.class);
    private static final long f = TimeUnit.SECONDS.toNanos(1);
    final BlockingQueue<Runnable> b = new LinkedBlockingQueue();
    final wwz<Void> c;
    private ThreadFactory g;
    private final a h;
    /* access modifiers changed from: private */
    public final AtomicBoolean i;
    private volatile Thread j;
    private final wwi<?> k;

    /* renamed from: wwm$a */
    final class a implements Runnable {
        private static /* synthetic */ boolean a = (!wwm.class.desiredAssertionStatus());

        a() {
        }

        public final void run() {
            while (true) {
                Runnable a2 = wwm.this.a();
                if (a2 != null) {
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        wwm.d.d("Unexpected exception from the global event executor: ", th);
                    }
                    if (a2 != wwm.this.c) {
                        continue;
                    }
                }
                Queue queue = wwm.this.e;
                if (wwm.this.b.isEmpty() && (queue == null || queue.size() == 1)) {
                    boolean compareAndSet = wwm.this.i.compareAndSet(true, false);
                    if (!a && !compareAndSet) {
                        throw new AssertionError();
                    } else if ((wwm.this.b.isEmpty() && (queue == null || queue.size() == 1)) || !wwm.this.i.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }

    private wwm() {
        wwz wwz = new wwz((wvw) this, Executors.callable(new Runnable() {
            public final void run() {
            }
        }, null), wwz.a(f), -f);
        this.c = wwz;
        this.g = new wwb(wwb.a(getClass()), false, 5, null);
        this.h = new a();
        this.i = new AtomicBoolean();
        this.k = new wwf(this, new UnsupportedOperationException());
        m().add(this.c);
    }

    /* access modifiers changed from: 0000 */
    public final Runnable a() {
        Runnable runnable;
        Runnable runnable2;
        BlockingQueue<Runnable> blockingQueue = this.b;
        do {
            wwz o = o();
            if (o == null) {
                try {
                    runnable2 = (Runnable) blockingQueue.take();
                } catch (InterruptedException unused) {
                    runnable2 = null;
                }
                return runnable2;
            }
            long l = o.l();
            if (l > 0) {
                try {
                    runnable = (Runnable) blockingQueue.poll(l, TimeUnit.NANOSECONDS);
                } catch (InterruptedException unused2) {
                    return null;
                }
            } else {
                runnable = (Runnable) blockingQueue.poll();
            }
            if (runnable == null) {
                long k2 = wwz.k();
                Runnable a2 = a(k2);
                while (a2 != null) {
                    this.b.add(a2);
                    a2 = a(k2);
                }
                runnable = (Runnable) blockingQueue.poll();
                continue;
            }
        } while (runnable == null);
        return runnable;
    }

    public final wwi<?> a(long j2, long j3, TimeUnit timeUnit) {
        return this.k;
    }

    public final boolean a(Thread thread) {
        return thread == this.j;
    }

    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return false;
    }

    public final void execute(Runnable runnable) {
        String str = "task";
        if (runnable == null) {
            throw new NullPointerException(str);
        } else if (runnable != null) {
            this.b.add(runnable);
            if (!a(Thread.currentThread()) && this.i.compareAndSet(false, true)) {
                Thread newThread = this.g.newThread(this.h);
                this.j = newThread;
                newThread.start();
            }
        } else {
            throw new NullPointerException(str);
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final boolean q() {
        return false;
    }

    public final wwi<?> r() {
        return this.k;
    }

    @Deprecated
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
}
