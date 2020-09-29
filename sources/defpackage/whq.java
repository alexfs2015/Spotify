package defpackage;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: whq reason: default package */
public abstract class whq extends whn {
    private static /* synthetic */ boolean a = (!whq.class.desiredAssertionStatus());
    Queue<wit<?>> e;

    protected whq() {
    }

    protected whq(why why) {
        super(why);
    }

    /* access modifiers changed from: 0000 */
    public final Queue<wit<?>> m() {
        if (this.e == null) {
            this.e = new PriorityQueue();
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        if (a || a(Thread.currentThread())) {
            Queue<wit<?>> queue = this.e;
            if (!(queue == null || queue.isEmpty())) {
                for (wit a2 : (wit[]) queue.toArray(new wit[queue.size()])) {
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
    public final Runnable a(long j) {
        wit wit;
        if (a || a(Thread.currentThread())) {
            Queue<wit<?>> queue = this.e;
            if (queue == null) {
                wit = null;
            } else {
                wit = (wit) queue.peek();
            }
            if (wit == null || wit.c > j) {
                return null;
            }
            queue.remove();
            return wit;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final wit<?> o() {
        Queue<wit<?>> queue = this.e;
        if (queue == null) {
            return null;
        }
        return (wit) queue.peek();
    }

    /* access modifiers changed from: protected */
    public final boolean p() {
        wit wit;
        Queue<wit<?>> queue = this.e;
        if (queue == null) {
            wit = null;
        } else {
            wit = (wit) queue.peek();
        }
        return wit != null && wit.c <= wit.k();
    }

    /* renamed from: a */
    public final wis<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        wjk.a(runnable, "command");
        wjk.a(timeUnit, "unit");
        if (j >= 0) {
            wit wit = new wit(this, runnable, null, wit.a(timeUnit.toNanos(j)));
            return b(wit);
        }
        throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
    }

    /* renamed from: a */
    public final <V> wis<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        wjk.a(callable, "callable");
        wjk.a(timeUnit, "unit");
        if (j >= 0) {
            return b(new wit(this, callable, wit.a(timeUnit.toNanos(j))));
        }
        throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
    }

    /* renamed from: a */
    public final wis<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnable2 = runnable;
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        wjk.a(runnable2, "command");
        wjk.a(timeUnit2, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
        } else if (j4 > 0) {
            wit wit = new wit(this, Executors.callable(runnable2, null), wit.a(timeUnit2.toNanos(j3)), timeUnit2.toNanos(j4));
            return b(wit);
        } else {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", new Object[]{Long.valueOf(j2)}));
        }
    }

    /* renamed from: b */
    public final wis<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnable2 = runnable;
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        wjk.a(runnable2, "command");
        wjk.a(timeUnit2, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j)}));
        } else if (j4 > 0) {
            wit wit = new wit(this, Executors.callable(runnable2, null), wit.a(timeUnit2.toNanos(j3)), -timeUnit2.toNanos(j4));
            return b(wit);
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", new Object[]{Long.valueOf(j2)}));
        }
    }

    private <V> wis<V> b(final wit<V> wit) {
        if (a(Thread.currentThread())) {
            m().add(wit);
        } else {
            execute(new Runnable() {
                public final void run() {
                    whq.this.m().add(wit);
                }
            });
        }
        return wit;
    }

    /* access modifiers changed from: 0000 */
    public final void a(final wit<?> wit) {
        if (a(Thread.currentThread())) {
            m().remove(wit);
        } else {
            execute(new Runnable() {
                public final void run() {
                    whq.this.a(wit);
                }
            });
        }
    }
}
