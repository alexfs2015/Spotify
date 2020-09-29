package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wwo reason: default package */
public abstract class wwo extends wvu {
    /* access modifiers changed from: private */
    public final wwc[] a;
    private final Set<wwc> b;
    /* access modifiers changed from: private */
    public final AtomicInteger c;
    /* access modifiers changed from: private */
    public final wws<?> d;
    private final a e;

    private wwo(int i, Executor executor, wwd wwd, Object... objArr) {
        this.c = new AtomicInteger();
        this.d = new wwa(wwm.a);
        int i2 = 0;
        if (i > 0) {
            if (executor == null) {
                executor = new wxc(a());
            }
            this.a = new wwc[i];
            int i3 = 0;
            while (i3 < i) {
                try {
                    this.a[i3] = b(executor, objArr);
                    i3++;
                } catch (Exception e2) {
                    throw new IllegalStateException("failed to create a child event loop", e2);
                } catch (Throwable th) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.a[i4].k();
                    }
                    while (i2 < i3) {
                        wwc wwc = this.a[i2];
                        while (!wwc.isTerminated()) {
                            try {
                                wwc.awaitTermination(2147483647L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw th;
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
            this.e = wwd.a(this.a);
            AnonymousClass1 r5 = new wwj<Object>() {
                public final void operationComplete(wwi<Object> wwi) {
                    if (wwo.this.c.incrementAndGet() == wwo.this.a.length) {
                        wwo.this.d.a(null);
                    }
                }
            };
            wwc[] wwcArr = this.a;
            int length = wwcArr.length;
            while (i2 < length) {
                wwcArr[i2].r().b(r5);
                i2++;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.a.length);
            Collections.addAll(linkedHashSet, this.a);
            this.b = Collections.unmodifiableSet(linkedHashSet);
            return;
        }
        throw new IllegalArgumentException(String.format("nThreads: %d (expected: > 0)", new Object[]{Integer.valueOf(i)}));
    }

    protected wwo(int i, Executor executor, Object... objArr) {
        this(i, executor, wvy.a, objArr);
    }

    /* access modifiers changed from: protected */
    public ThreadFactory a() {
        return new wwb(getClass());
    }

    public final wwi<?> a(long j, long j2, TimeUnit timeUnit) {
        for (wwc a2 : this.a) {
            a2.a(j, j2, timeUnit);
        }
        return this.d;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        wwc[] wwcArr;
        long nanoTime;
        long nanoTime2 = System.nanoTime() + timeUnit.toNanos(j);
        loop0:
        for (wwc wwc : this.a) {
            do {
                nanoTime = nanoTime2 - System.nanoTime();
                if (nanoTime <= 0) {
                    break loop0;
                }
            } while (!wwc.awaitTermination(nanoTime, TimeUnit.NANOSECONDS));
        }
        return isTerminated();
    }

    public wwc b() {
        return this.e.a();
    }

    /* access modifiers changed from: protected */
    public abstract wwc b(Executor executor, Object... objArr);

    public boolean isShutdown() {
        for (wwc isShutdown : this.a) {
            if (!isShutdown.isShutdown()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTerminated() {
        for (wwc isTerminated : this.a) {
            if (!isTerminated.isTerminated()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<wwc> iterator() {
        return this.b.iterator();
    }

    public final boolean q() {
        for (wwc q : this.a) {
            if (!q.q()) {
                return false;
            }
        }
        return true;
    }

    public final wwi<?> r() {
        return this.d;
    }

    @Deprecated
    public void shutdown() {
        for (wwc shutdown : this.a) {
            shutdown.shutdown();
        }
    }
}
