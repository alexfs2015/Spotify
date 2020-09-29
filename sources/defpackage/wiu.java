package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wiu reason: default package */
public abstract class wiu extends whq implements wij {
    /* access modifiers changed from: private */
    public static final wjw a;
    private static final Runnable b = new Runnable() {
        public final void run() {
        }
    };
    /* access modifiers changed from: private */
    public static final AtomicIntegerFieldUpdater<wiu> c;
    protected static final long g = TimeUnit.SECONDS.toNanos(1);
    private static /* synthetic */ boolean v;
    /* access modifiers changed from: private */
    public final Queue<Runnable> d;
    long f;
    /* access modifiers changed from: private */
    public volatile Thread h;
    private volatile wix i;
    private final Executor j;
    /* access modifiers changed from: private */
    public volatile boolean k;
    /* access modifiers changed from: private */
    public final Semaphore l = new Semaphore(0);
    private final Set<Runnable> m = new LinkedHashSet();
    private final boolean n;
    private final int o;
    private final wiq p;
    private volatile int q = 1;
    private volatile long r;
    private volatile long s;
    /* access modifiers changed from: private */
    public long t;
    /* access modifiers changed from: private */
    public final wim<?> u = new whu(wig.a);

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public boolean a(Runnable runnable) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public void g() {
    }

    static {
        Class<wiu> cls = wiu.class;
        v = !cls.desiredAssertionStatus();
        Math.max(16, wjo.a("io.netty.eventexecutor.maxPendingTasks", Integer.MAX_VALUE));
        a = wjx.a(cls);
        new Runnable() {
            public final void run() {
            }
        };
        AtomicIntegerFieldUpdater<wiu> b2 = PlatformDependent.b(cls, "state");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "q");
        }
        c = b2;
        if (PlatformDependent.a(cls, "threadProperties") == null) {
            AtomicReferenceFieldUpdater.newUpdater(cls, wix.class, "i");
        }
    }

    protected wiu(why why, Executor executor, boolean z, int i2, wiq wiq) {
        super(why);
        this.n = z;
        this.o = Math.max(16, i2);
        this.j = (Executor) wjk.a(executor, "executor");
        this.d = a(this.o);
        this.p = (wiq) wjk.a(wiq, "rejectedHandler");
    }

    /* access modifiers changed from: protected */
    public Queue<Runnable> a(int i2) {
        return new LinkedBlockingQueue(i2);
    }

    /* access modifiers changed from: protected */
    public Runnable h() {
        if (v || a(Thread.currentThread())) {
            return b(this.d);
        }
        throw new AssertionError();
    }

    private static Runnable b(Queue<Runnable> queue) {
        Runnable runnable;
        do {
            runnable = (Runnable) queue.poll();
        } while (runnable == b);
        return runnable;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (v || a(Thread.currentThread())) {
            return !this.d.isEmpty();
        }
        throw new AssertionError();
    }

    public int d() {
        return this.d.size();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        boolean e;
        if (v || a(Thread.currentThread())) {
            boolean z = false;
            do {
                e = e();
                if (a(this.d)) {
                    z = true;
                    continue;
                }
            } while (!e);
            if (z) {
                this.f = wit.k();
            }
            a();
            return z;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final boolean a(Queue<Runnable> queue) {
        Runnable b2 = b(queue);
        if (b2 == null) {
            return false;
        }
        do {
            c(b2);
            b2 = b(queue);
        } while (b2 != null);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j2) {
        long j3;
        e();
        Runnable h2 = h();
        if (h2 == null) {
            a();
            return false;
        }
        long k2 = wit.k() + j2;
        long j4 = 0;
        while (true) {
            c(h2);
            j4++;
            if ((63 & j4) == 0) {
                j3 = wit.k();
                if (j3 >= k2) {
                    break;
                }
            }
            h2 = h();
            if (h2 == null) {
                j3 = wit.k();
                break;
            }
        }
        a();
        this.f = j3;
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        if (!z || c.get(this) == 3) {
            this.d.offer(b);
        }
    }

    public final boolean a(Thread thread) {
        return thread == this.h;
    }

    private boolean i() {
        boolean z = false;
        while (!this.m.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.m);
            this.m.clear();
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Throwable th) {
                        a.d("Shutdown hook raised an exception.", th);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            this.f = wit.k();
        }
        return z;
    }

    public final wic<?> a(long j2, long j3, TimeUnit timeUnit) {
        boolean z;
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder("quietPeriod: ");
            sb.append(j2);
            sb.append(" (expected >= 0)");
            throw new IllegalArgumentException(sb.toString());
        } else if (j3 < j2) {
            StringBuilder sb2 = new StringBuilder("timeout: ");
            sb2.append(j3);
            sb2.append(" (expected >= quietPeriod (");
            sb2.append(j2);
            sb2.append("))");
            throw new IllegalArgumentException(sb2.toString());
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (q()) {
            return this.u;
        } else {
            boolean a2 = a(Thread.currentThread());
            while (!q()) {
                int i2 = c.get(this);
                int i3 = 3;
                if (a2 || i2 == 1 || i2 == 2) {
                    z = true;
                } else {
                    i3 = i2;
                    z = false;
                }
                if (c.compareAndSet(this, i2, i3)) {
                    this.r = timeUnit.toNanos(j2);
                    this.s = timeUnit.toNanos(j3);
                    if (i2 == 1) {
                        x();
                    }
                    if (z) {
                        a(a2);
                    }
                    return this.u;
                }
            }
            return this.u;
        }
    }

    public final wic<?> r() {
        return this.u;
    }

    @Deprecated
    public void shutdown() {
        boolean z;
        if (!isShutdown()) {
            boolean a2 = a(Thread.currentThread());
            while (!q()) {
                int i2 = c.get(this);
                int i3 = 4;
                if (a2 || i2 == 1 || i2 == 2 || i2 == 3) {
                    z = true;
                } else {
                    i3 = i2;
                    z = false;
                }
                if (c.compareAndSet(this, i2, i3)) {
                    if (i2 == 1) {
                        x();
                    }
                    if (z) {
                        a(a2);
                    }
                    return;
                }
            }
        }
    }

    public final boolean q() {
        return c.get(this) >= 3;
    }

    public boolean isShutdown() {
        return c.get(this) >= 4;
    }

    public boolean isTerminated() {
        return c.get(this) == 5;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        if (!q()) {
            return false;
        }
        if (a(Thread.currentThread())) {
            n();
            if (this.t == 0) {
                this.t = wit.k();
            }
            if (!s() && !i()) {
                long k2 = wit.k();
                if (isShutdown() || k2 - this.t > this.s || k2 - this.f > this.r) {
                    return true;
                }
                a(true);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                }
                return false;
            } else if (isShutdown() || this.r == 0) {
                return true;
            } else {
                a(true);
                return false;
            }
        } else {
            throw new IllegalStateException("must be invoked from an event loop");
        }
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        a("invokeAny");
        return super.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        a("invokeAny");
        return super.invokeAny(collection, j2, timeUnit);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        a("invokeAll");
        return super.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        a("invokeAll");
        return super.invokeAll(collection, j2, timeUnit);
    }

    private static void w() {
        throw new RejectedExecutionException("event executor terminated");
    }

    private void x() {
        if (v || this.h == null) {
            this.j.execute(new Runnable() {
                /* JADX WARNING: CFG modification limit reached, blocks count: 218 */
                /* JADX WARNING: Removed duplicated region for block: B:92:0x0353  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        java.lang.String r0 = "An event executor terminated with non-empty task queue ("
                        wiu r1 = defpackage.wiu.this
                        java.lang.Thread r2 = java.lang.Thread.currentThread()
                        r1.h = r2
                        wiu r1 = defpackage.wiu.this
                        boolean r1 = r1.k
                        if (r1 == 0) goto L_0x001c
                        wiu r1 = defpackage.wiu.this
                        java.lang.Thread r1 = r1.h
                        r1.interrupt()
                    L_0x001c:
                        wiu r1 = defpackage.wiu.this
                        long r2 = defpackage.wit.k()
                        r1.f = r2
                        r1 = 3
                        r2 = 41
                        r3 = 0
                        r4 = 5
                        wiu r5 = defpackage.wiu.this     // Catch:{ all -> 0x01b6 }
                        r5.f()     // Catch:{ all -> 0x01b6 }
                    L_0x002e:
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        int r5 = r5.get(r6)
                        if (r5 >= r1) goto L_0x0047
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.wiu.c
                        wiu r7 = defpackage.wiu.this
                        boolean r5 = r6.compareAndSet(r7, r5, r1)
                        if (r5 != 0) goto L_0x0047
                        goto L_0x002e
                    L_0x0047:
                        wiu r1 = defpackage.wiu.this
                        long r5 = r1.t
                        r7 = 0
                        int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r1 != 0) goto L_0x0081
                        wjw r1 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "Buggy "
                        r5.<init>(r6)
                        java.lang.Class<whw> r6 = defpackage.whw.class
                        java.lang.String r6 = r6.getSimpleName()
                        r5.append(r6)
                        java.lang.String r6 = " implementation; "
                        r5.append(r6)
                        java.lang.Class<wiu> r6 = defpackage.wiu.class
                        java.lang.String r6 = r6.getSimpleName()
                        r5.append(r6)
                        java.lang.String r6 = ".confirmShutdown() must be called before run() implementation terminates."
                        r5.append(r6)
                        java.lang.String r5 = r5.toString()
                        r1.e(r5)
                    L_0x0081:
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x011f }
                        boolean r1 = r1.t()     // Catch:{ all -> 0x011f }
                        if (r1 == 0) goto L_0x0081
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x00d6 }
                        r1.g()     // Catch:{ all -> 0x00d6 }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.wiu.c
                        wiu r5 = defpackage.wiu.this
                        r1.set(r5, r4)
                        wiu r1 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r1 = r1.l
                        r1.release()
                        wiu r1 = defpackage.wiu.this
                        java.util.Queue r1 = r1.d
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x00cc
                        wjw r1 = defpackage.wiu.a
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r4.append(r0)
                        r4.append(r2)
                        java.lang.String r0 = r4.toString()
                        r1.d(r0)
                    L_0x00cc:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        return
                    L_0x00d6:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x0115
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x0115:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x011f:
                        r1 = move-exception
                        wiu r5 = defpackage.wiu.this     // Catch:{ all -> 0x016d }
                        r5.g()     // Catch:{ all -> 0x016d }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x0163
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x0163:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x016d:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x01ac
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x01ac:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x01b6:
                        r5 = move-exception
                        wjw r6 = defpackage.wiu.a     // Catch:{ all -> 0x030e }
                        java.lang.String r7 = "Unexpected exception from an event executor: "
                        r6.d(r7, r5)     // Catch:{ all -> 0x030e }
                    L_0x01c0:
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        int r5 = r5.get(r6)
                        if (r5 >= r1) goto L_0x01d9
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.wiu.c
                        wiu r7 = defpackage.wiu.this
                        boolean r5 = r6.compareAndSet(r7, r5, r1)
                        if (r5 != 0) goto L_0x01d9
                        goto L_0x01c0
                    L_0x01d9:
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x0277 }
                        boolean r1 = r1.t()     // Catch:{ all -> 0x0277 }
                        if (r1 == 0) goto L_0x01d9
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x022e }
                        r1.g()     // Catch:{ all -> 0x022e }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.wiu.c
                        wiu r5 = defpackage.wiu.this
                        r1.set(r5, r4)
                        wiu r1 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r1 = r1.l
                        r1.release()
                        wiu r1 = defpackage.wiu.this
                        java.util.Queue r1 = r1.d
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x0224
                        wjw r1 = defpackage.wiu.a
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r4.append(r0)
                        r4.append(r2)
                        java.lang.String r0 = r4.toString()
                        r1.d(r0)
                    L_0x0224:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        return
                    L_0x022e:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x026d
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x026d:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x0277:
                        r1 = move-exception
                        wiu r5 = defpackage.wiu.this     // Catch:{ all -> 0x02c5 }
                        r5.g()     // Catch:{ all -> 0x02c5 }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x02bb
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x02bb:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x02c5:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x0304
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x0304:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x030e:
                        r5 = move-exception
                    L_0x030f:
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.wiu.c
                        wiu r7 = defpackage.wiu.this
                        int r6 = r6.get(r7)
                        if (r6 >= r1) goto L_0x0328
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.wiu.c
                        wiu r8 = defpackage.wiu.this
                        boolean r6 = r7.compareAndSet(r8, r6, r1)
                        if (r6 != 0) goto L_0x0328
                        goto L_0x030f
                    L_0x0328:
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x03c6 }
                        boolean r1 = r1.t()     // Catch:{ all -> 0x03c6 }
                        if (r1 == 0) goto L_0x0328
                        wiu r1 = defpackage.wiu.this     // Catch:{ all -> 0x037d }
                        r1.g()     // Catch:{ all -> 0x037d }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r1.set(r6, r4)
                        wiu r1 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r1 = r1.l
                        r1.release()
                        wiu r1 = defpackage.wiu.this
                        java.util.Queue r1 = r1.d
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x0373
                        wjw r1 = defpackage.wiu.a
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r4.append(r0)
                        r4.append(r2)
                        java.lang.String r0 = r4.toString()
                        r1.d(r0)
                    L_0x0373:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r5
                    L_0x037d:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x03bc
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x03bc:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x03c6:
                        r1 = move-exception
                        wiu r5 = defpackage.wiu.this     // Catch:{ all -> 0x0414 }
                        r5.g()     // Catch:{ all -> 0x0414 }
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x040a
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x040a:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        throw r1
                    L_0x0414:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.wiu.c
                        wiu r6 = defpackage.wiu.this
                        r5.set(r6, r4)
                        wiu r4 = defpackage.wiu.this
                        java.util.concurrent.Semaphore r4 = r4.l
                        r4.release()
                        wiu r4 = defpackage.wiu.this
                        java.util.Queue r4 = r4.d
                        boolean r4 = r4.isEmpty()
                        if (r4 != 0) goto L_0x0453
                        wjw r4 = defpackage.wiu.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r0)
                        wiu r0 = defpackage.wiu.this
                        java.util.Queue r0 = r0.d
                        int r0 = r0.size()
                        r5.append(r0)
                        r5.append(r2)
                        java.lang.String r0 = r5.toString()
                        r4.d(r0)
                    L_0x0453:
                        wiu r0 = defpackage.wiu.this
                        wim r0 = r0.u
                        r0.a(r3)
                        goto L_0x045e
                    L_0x045d:
                        throw r1
                    L_0x045e:
                        goto L_0x045d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wiu.AnonymousClass3.run():void");
                }
            });
            return;
        }
        throw new AssertionError();
    }

    private boolean e() {
        long k2 = wit.k();
        Runnable a2 = a(k2);
        while (a2 != null) {
            if (!this.d.offer(a2)) {
                m().add((wit) a2);
                return false;
            }
            a2 = a(k2);
        }
        return true;
    }

    private void d(Runnable runnable) {
        if (runnable != null) {
            if (isShutdown()) {
                w();
            }
            if (!this.d.offer(runnable)) {
                this.p.a();
                return;
            }
            return;
        }
        throw new NullPointerException("task");
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (!a(Thread.currentThread())) {
            if (this.l.tryAcquire(j2, timeUnit)) {
                this.l.release();
            }
            return isTerminated();
        } else {
            throw new IllegalStateException("cannot await termination of the current thread");
        }
    }

    public void execute(Runnable runnable) {
        String str = "task";
        if (runnable != null) {
            boolean a2 = a(Thread.currentThread());
            if (a2) {
                d(runnable);
            } else {
                if (c.get(this) == 1 && c.compareAndSet(this, 1, 2)) {
                    x();
                }
                d(runnable);
                if (isShutdown()) {
                    if (runnable == null) {
                        throw new NullPointerException(str);
                    } else if (this.d.remove(runnable)) {
                        w();
                    }
                }
            }
            if (!this.n && a(runnable)) {
                a(a2);
                return;
            }
            return;
        }
        throw new NullPointerException(str);
    }

    private void a(String str) {
        if (a(Thread.currentThread())) {
            StringBuilder sb = new StringBuilder("Calling ");
            sb.append(str);
            sb.append(" from within the EventLoop is not allowed");
            throw new RejectedExecutionException(sb.toString());
        }
    }
}
