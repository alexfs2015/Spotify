package defpackage;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wwz reason: default package */
public final class wwz<V> extends wwv<V> implements wwy<V> {
    public static final long b = System.nanoTime();
    private static final AtomicLong d = new AtomicLong();
    private static /* synthetic */ boolean g = (!wwz.class.desiredAssertionStatus());
    public long c;
    private final long e;
    private final long f;

    wwz(wvw wvw, Runnable runnable, V v, long j) {
        this(wvw, a(runnable, null), j);
    }

    wwz(wvw wvw, Callable<V> callable, long j) {
        super(wvw, callable);
        this.e = d.getAndIncrement();
        this.c = j;
        this.f = 0;
    }

    wwz(wvw wvw, Callable<V> callable, long j, long j2) {
        super(wvw, callable);
        this.e = d.getAndIncrement();
        if (j2 != 0) {
            this.c = j;
            this.f = j2;
            return;
        }
        throw new IllegalArgumentException("period: 0 (expected: != 0)");
    }

    static long a(long j) {
        return (System.nanoTime() - b) + j;
    }

    static long k() {
        return System.nanoTime() - b;
    }

    /* access modifiers changed from: protected */
    public final wwc a() {
        return super.a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(boolean z) {
        return super.cancel(false);
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            ((wvw) super.a()).a(this);
        }
        return cancel;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (this == delayed) {
            return 0;
        }
        wwz wwz = (wwz) delayed;
        long j = this.c - wwz.c;
        if (j < 0) {
            return -1;
        }
        if (j <= 0) {
            long j2 = this.e;
            long j3 = wwz.e;
            if (j2 < j3) {
                return -1;
            }
            if (j2 == j3) {
                throw new Error();
            }
        }
        return 1;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(l(), TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: protected */
    public final StringBuilder j() {
        StringBuilder j = super.j();
        j.setCharAt(j.length() - 1, ',');
        j.append(" id: ");
        j.append(this.e);
        j.append(", deadline: ");
        j.append(this.c);
        j.append(", period: ");
        j.append(this.f);
        j.append(')');
        return j;
    }

    public final long l() {
        return Math.max(0, this.c - (System.nanoTime() - b));
    }

    public final void run() {
        if (g || super.a().j()) {
            try {
                if (this.f == 0) {
                    if (e()) {
                        c(this.a.call());
                    }
                } else if (!isCancelled()) {
                    this.a.call();
                    if (!super.a().isShutdown()) {
                        long j = this.f;
                        if (j > 0) {
                            this.c += j;
                        } else {
                            this.c = (System.nanoTime() - b) - j;
                        }
                        if (!isCancelled()) {
                            Queue<wwz<?>> queue = ((wvw) super.a()).e;
                            if (!g) {
                                if (queue == null) {
                                    throw new AssertionError();
                                }
                            }
                            queue.add(this);
                        }
                    }
                }
            } catch (Throwable th) {
                a(th);
            }
        } else {
            throw new AssertionError();
        }
    }
}
