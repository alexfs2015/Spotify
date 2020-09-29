package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wii reason: default package */
public abstract class wii extends who {
    /* access modifiers changed from: private */
    public final whw[] a;
    private final Set<whw> b;
    /* access modifiers changed from: private */
    public final AtomicInteger c;
    /* access modifiers changed from: private */
    public final wim<?> d;
    private final a e;

    /* access modifiers changed from: protected */
    public abstract whw b(Executor executor, Object... objArr);

    protected wii(int i, Executor executor, Object... objArr) {
        this(i, executor, whs.a, objArr);
    }

    private wii(int i, Executor executor, whx whx, Object... objArr) {
        this.c = new AtomicInteger();
        this.d = new whu(wig.a);
        int i2 = 0;
        if (i > 0) {
            if (executor == null) {
                executor = new wiw(a());
            }
            this.a = new whw[i];
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
                        whw whw = this.a[i2];
                        while (!whw.isTerminated()) {
                            try {
                                whw.awaitTermination(2147483647L, TimeUnit.SECONDS);
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
            this.e = whx.a(this.a);
            AnonymousClass1 r5 = new wid<Object>() {
                public final void operationComplete(wic<Object> wic) {
                    if (wii.this.c.incrementAndGet() == wii.this.a.length) {
                        wii.this.d.a(null);
                    }
                }
            };
            whw[] whwArr = this.a;
            int length = whwArr.length;
            while (i2 < length) {
                whwArr[i2].r().b(r5);
                i2++;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.a.length);
            Collections.addAll(linkedHashSet, this.a);
            this.b = Collections.unmodifiableSet(linkedHashSet);
            return;
        }
        throw new IllegalArgumentException(String.format("nThreads: %d (expected: > 0)", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: protected */
    public ThreadFactory a() {
        return new whv(getClass());
    }

    public whw b() {
        return this.e.a();
    }

    public Iterator<whw> iterator() {
        return this.b.iterator();
    }

    public final wic<?> a(long j, long j2, TimeUnit timeUnit) {
        for (whw a2 : this.a) {
            a2.a(j, j2, timeUnit);
        }
        return this.d;
    }

    public final wic<?> r() {
        return this.d;
    }

    @Deprecated
    public void shutdown() {
        for (whw shutdown : this.a) {
            shutdown.shutdown();
        }
    }

    public final boolean q() {
        for (whw q : this.a) {
            if (!q.q()) {
                return false;
            }
        }
        return true;
    }

    public boolean isShutdown() {
        for (whw isShutdown : this.a) {
            if (!isShutdown.isShutdown()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTerminated() {
        for (whw isTerminated : this.a) {
            if (!isTerminated.isTerminated()) {
                return false;
            }
        }
        return true;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        whw[] whwArr;
        long nanoTime;
        long nanoTime2 = System.nanoTime() + timeUnit.toNanos(j);
        loop0:
        for (whw whw : this.a) {
            do {
                nanoTime = nanoTime2 - System.nanoTime();
                if (nanoTime <= 0) {
                    break loop0;
                }
            } while (!whw.awaitTermination(nanoTime, TimeUnit.NANOSECONDS));
        }
        return isTerminated();
    }
}
