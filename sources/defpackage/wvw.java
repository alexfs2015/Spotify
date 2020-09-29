package defpackage;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: wvw reason: default package */
public abstract class wvw extends wvt {
    private static /* synthetic */ boolean a = (!wvw.class.desiredAssertionStatus());
    Queue<wwz<?>> e;

    protected wvw() {
    }

    protected wvw(wwe wwe) {
        super(wwe);
    }

    private <V> wwy<V> b(final wwz<V> wwz) {
        if (a(Thread.currentThread())) {
            m().add(wwz);
        } else {
            execute(new Runnable() {
                public final void run() {
                    wvw.this.m().add(wwz);
                }
            });
        }
        return wwz;
    }

    /* access modifiers changed from: protected */
    public final Runnable a(long j) {
        if (a || a(Thread.currentThread())) {
            Queue<wwz<?>> queue = this.e;
            wwz wwz = queue == null ? null : (wwz) queue.peek();
            if (wwz == null || wwz.c > j) {
                return null;
            }
            queue.remove();
            return wwz;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final wwy<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnable2 = runnable;
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        wxq.a(runnable2, "command");
        wxq.a(timeUnit2, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
        } else if (j4 > 0) {
            wwz wwz = new wwz(this, Executors.callable(runnable2, null), wwz.a(timeUnit2.toNanos(j3)), timeUnit2.toNanos(j4));
            return b(wwz);
        } else {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", new Object[]{Long.valueOf(j2)}));
        }
    }

    /* renamed from: a */
    public final wwy<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        wxq.a(runnable, "command");
        wxq.a(timeUnit, "unit");
        if (j >= 0) {
            wwz wwz = new wwz(this, runnable, null, wwz.a(timeUnit.toNanos(j)));
            return b(wwz);
        }
        throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
    }

    /* renamed from: a */
    public final <V> wwy<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        wxq.a(callable, "callable");
        wxq.a(timeUnit, "unit");
        if (j >= 0) {
            return b(new wwz(this, callable, wwz.a(timeUnit.toNanos(j))));
        }
        throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
    }

    /* access modifiers changed from: 0000 */
    public final void a(final wwz<?> wwz) {
        if (a(Thread.currentThread())) {
            m().remove(wwz);
        } else {
            execute(new Runnable() {
                public final void run() {
                    wvw.this.a(wwz);
                }
            });
        }
    }

    /* renamed from: b */
    public final wwy<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnable2 = runnable;
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        wxq.a(runnable2, "command");
        wxq.a(timeUnit2, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
        } else if (j4 > 0) {
            wwz wwz = new wwz(this, Executors.callable(runnable2, null), wwz.a(timeUnit2.toNanos(j3)), -timeUnit2.toNanos(j4));
            return b(wwz);
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", new Object[]{Long.valueOf(j2)}));
        }
    }

    /* access modifiers changed from: 0000 */
    public final Queue<wwz<?>> m() {
        if (this.e == null) {
            this.e = new PriorityQueue();
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        if (a || a(Thread.currentThread())) {
            Queue<wwz<?>> queue = this.e;
            if (!(queue == null || queue.isEmpty())) {
                for (wwz a2 : (wwz[]) queue.toArray(new wwz[queue.size()])) {
                    a2.a(false);
                }
                queue.clear();
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final wwz<?> o() {
        Queue<wwz<?>> queue = this.e;
        if (queue == null) {
            return null;
        }
        return (wwz) queue.peek();
    }

    /* access modifiers changed from: protected */
    public final boolean p() {
        Queue<wwz<?>> queue = this.e;
        wwz wwz = queue == null ? null : (wwz) queue.peek();
        return wwz != null && wwz.c <= wwz.k();
    }
}
