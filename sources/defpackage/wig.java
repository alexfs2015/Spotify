package defpackage;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wig reason: default package */
public final class wig extends whq {
    public static final wig a = new wig();
    /* access modifiers changed from: private */
    public static final wjw d = wjx.a(wig.class);
    private static final long f = TimeUnit.SECONDS.toNanos(1);
    final BlockingQueue<Runnable> b = new LinkedBlockingQueue();
    final wit<Void> c;
    private ThreadFactory g;
    private final a h;
    /* access modifiers changed from: private */
    public final AtomicBoolean i;
    private volatile Thread j;
    private final wic<?> k;

    /* renamed from: wig$a */
    final class a implements Runnable {
        private static /* synthetic */ boolean a = (!wig.class.desiredAssertionStatus());

        a() {
        }

        public final void run() {
            while (true) {
                Runnable a2 = wig.this.a();
                if (a2 != null) {
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        wig.d.d("Unexpected exception from the global event executor: ", th);
                    }
                    if (a2 != wig.this.c) {
                        continue;
                    }
                }
                Queue queue = wig.this.e;
                if (wig.this.b.isEmpty() && (queue == null || queue.size() == 1)) {
                    boolean compareAndSet = wig.this.i.compareAndSet(true, false);
                    if (!a && !compareAndSet) {
                        throw new AssertionError();
                    } else if ((wig.this.b.isEmpty() && (queue == null || queue.size() == 1)) || !wig.this.i.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return false;
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

    private wig() {
        wit wit = new wit((whq) this, Executors.callable(new Runnable() {
            public final void run() {
            }
        }, null), wit.a(f), -f);
        this.c = wit;
        this.g = new whv(whv.a(getClass()), false, 5, null);
        this.h = new a();
        this.i = new AtomicBoolean();
        this.k = new whz(this, new UnsupportedOperationException());
        m().add(this.c);
    }

    /* access modifiers changed from: 0000 */
    public final Runnable a() {
        Runnable runnable;
        Runnable runnable2;
        BlockingQueue<Runnable> blockingQueue = this.b;
        do {
            wit o = o();
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
                long k2 = wit.k();
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

    public final boolean a(Thread thread) {
        return thread == this.j;
    }

    public final wic<?> r() {
        return this.k;
    }

    @Deprecated
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final wic<?> a(long j2, long j3, TimeUnit timeUnit) {
        return this.k;
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
}
