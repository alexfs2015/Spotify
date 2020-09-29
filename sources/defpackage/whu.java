package defpackage;

import io.netty.util.Signal;
import io.netty.util.concurrent.BlockingOperationException;
import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: whu reason: default package */
public class whu<V> extends whp<V> implements wim<V> {
    private static final wjw a;
    private static final wjw b;
    private static final int c = Math.min(8, wjo.a("io.netty.defaultPromise.maxListenerStackDepth", 8));
    private static final AtomicReferenceFieldUpdater<whu, Object> d;
    private static final Signal e;
    private static final Signal f;
    private static final a g;
    private volatile Object h;
    private final whw i;
    private Object j;
    private short k;
    private boolean l;

    /* renamed from: whu$a */
    static final class a {
        final Throwable a;

        a(Throwable th) {
            this.a = th;
        }
    }

    static {
        Class<whu> cls = whu.class;
        a = wjx.a(cls);
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(".rejectedExecution");
        b = wjx.a(sb.toString());
        e = Signal.a(cls, "SUCCESS");
        f = Signal.a(cls, "UNCANCELLABLE");
        g = new a(wjp.a(new CancellationException(), cls, "cancel(...)"));
        AtomicReferenceFieldUpdater<whu, Object> a2 = PlatformDependent.a(cls, "result");
        if (a2 == null) {
            a2 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "h");
        }
        d = a2;
    }

    public whu(whw whw) {
        this.i = (whw) wjk.a(whw, "executor");
    }

    protected whu() {
        this.i = null;
    }

    public wim<V> a(V v) {
        if (c(v)) {
            e();
            return this;
        }
        StringBuilder sb = new StringBuilder("complete already: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public boolean b(V v) {
        if (!c(v)) {
            return false;
        }
        e();
        return true;
    }

    public wim<V> c(Throwable th) {
        if (a(th)) {
            e();
            return this;
        }
        StringBuilder sb = new StringBuilder("complete already: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString(), th);
    }

    public boolean b(Throwable th) {
        if (!a(th)) {
            return false;
        }
        e();
        return true;
    }

    public boolean aY_() {
        if (d.compareAndSet(this, null, f)) {
            return true;
        }
        Object obj = this.h;
        if (!f(obj) || !e(obj)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        Object obj = this.h;
        return (obj == null || obj == f || (obj instanceof a)) ? false : true;
    }

    public final Throwable f() {
        Object obj = this.h;
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: c */
    public wim<V> b(wie<? extends wic<? super V>> wie) {
        wjk.a(wie, "listener");
        synchronized (this) {
            if (this.j == null) {
                this.j = wie;
            } else if (this.j instanceof wht) {
                wht wht = (wht) this.j;
                wie<? extends wic<?>>[] wieArr = wht.a;
                int i2 = wht.b;
                if (i2 == wieArr.length) {
                    wieArr = (wie[]) Arrays.copyOf(wieArr, i2 << 1);
                    wht.a = wieArr;
                }
                wieArr[i2] = wie;
                wht.b = i2 + 1;
                if (wie instanceof wif) {
                    wht.c++;
                }
            } else {
                this.j = new wht((wie) this.j, wie);
            }
        }
        if (isDone()) {
            e();
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public wim<V> c() {
        if (isDone()) {
            return this;
        }
        if (!Thread.interrupted()) {
            aV_();
            synchronized (this) {
                while (!isDone()) {
                    m();
                    try {
                        wait();
                        n();
                    } catch (Throwable th) {
                        n();
                        throw th;
                    }
                }
            }
            return this;
        }
        throw new InterruptedException(toString());
    }

    public wim<V> h() {
        if (isDone()) {
            return this;
        }
        aV_();
        boolean z = false;
        synchronized (this) {
            while (!isDone()) {
                m();
                try {
                    wait();
                    n();
                } catch (InterruptedException unused) {
                    z = true;
                    n();
                } catch (Throwable th) {
                    n();
                    throw th;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    public final boolean a(long j2, TimeUnit timeUnit) {
        return a(timeUnit.toNanos(j2), true);
    }

    public final V d() {
        V v = this.h;
        if ((v instanceof a) || v == e) {
            return null;
        }
        return v;
    }

    public boolean cancel(boolean z) {
        if (!d.compareAndSet(this, null, g)) {
            return false;
        }
        l();
        e();
        return true;
    }

    public boolean isCancelled() {
        return e(this.h);
    }

    public boolean isDone() {
        return f(this.h);
    }

    /* renamed from: aW_ */
    public wim<V> aX_() {
        h();
        Throwable f2 = f();
        if (f2 != null) {
            PlatformDependent.a(f2);
        }
        return this;
    }

    public String toString() {
        return j().toString();
    }

    /* access modifiers changed from: protected */
    public StringBuilder j() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(wjn.a((Object) this));
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        Object obj = this.h;
        if (obj == e) {
            sb.append("(success)");
        } else if (obj == f) {
            sb.append("(uncancellable)");
        } else if (obj instanceof a) {
            sb.append("(failure: ");
            sb.append(((a) obj).a);
            sb.append(')');
        } else if (obj != null) {
            sb.append("(success: ");
            sb.append(obj);
            sb.append(')');
        } else {
            sb.append("(incomplete)");
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    public whw a() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void aV_() {
        whw a2 = a();
        if (a2 != null && a2.j()) {
            throw new BlockingOperationException(toString());
        }
    }

    protected static void a(whw whw, final wic<?> wic, final wie<?> wie) {
        wjk.a(whw, "eventExecutor");
        wjk.a(wic, "future");
        wjk.a(wie, "listener");
        if (whw.j()) {
            wjc b2 = wjc.b();
            int i2 = b2.e;
            if (i2 < c) {
                b2.e = i2 + 1;
                try {
                    b(wic, wie);
                    return;
                } finally {
                    b2.e = i2;
                }
            }
        }
        a(whw, (Runnable) new Runnable() {
            public final void run() {
                whu.b(wic, wie);
            }
        });
    }

    private void e() {
        whw a2 = a();
        if (a2.j()) {
            wjc b2 = wjc.b();
            int i2 = b2.e;
            if (i2 < c) {
                b2.e = i2 + 1;
                try {
                    k();
                    return;
                } finally {
                    b2.e = i2;
                }
            }
        }
        a(a2, (Runnable) new Runnable() {
            public final void run() {
                whu.this.k();
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if ((r0 instanceof defpackage.wht) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        a((defpackage.wht) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        b(r3, (defpackage.wie) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r3.j != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        r3.l = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r0 = r3.j;
        r3.j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        monitor-exit(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.l     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.Object r0 = r3.j     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0035
        L_0x000a:
            r0 = 1
            r3.l = r0     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = r3.j     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.j = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
        L_0x0013:
            boolean r2 = r0 instanceof defpackage.wht
            if (r2 == 0) goto L_0x001d
            wht r0 = (defpackage.wht) r0
            r3.a(r0)
            goto L_0x0022
        L_0x001d:
            wie r0 = (defpackage.wie) r0
            b(r3, r0)
        L_0x0022:
            monitor-enter(r3)
            java.lang.Object r0 = r3.j     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002c
            r0 = 0
            r3.l = r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x002c:
            java.lang.Object r0 = r3.j     // Catch:{ all -> 0x0032 }
            r3.j = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0013
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x003a:
            throw r0
        L_0x003b:
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whu.k():void");
    }

    /* access modifiers changed from: private */
    public static void b(wic wic, wie wie) {
        try {
            wie.operationComplete(wic);
        } catch (Throwable th) {
            wjw wjw = a;
            StringBuilder sb = new StringBuilder("An exception was thrown by ");
            sb.append(wie.getClass().getName());
            sb.append(".operationComplete()");
            wjw.d(sb.toString(), th);
        }
    }

    private boolean c(V v) {
        if (v == null) {
            v = e;
        }
        return d(v);
    }

    private boolean a(Throwable th) {
        return d(new a((Throwable) wjk.a(th, "cause")));
    }

    private boolean d(Object obj) {
        if (!d.compareAndSet(this, null, obj) && !d.compareAndSet(this, f, obj)) {
            return false;
        }
        l();
        return true;
    }

    private synchronized void l() {
        if (this.k > 0) {
            notifyAll();
        }
    }

    private void m() {
        short s = this.k;
        if (s != Short.MAX_VALUE) {
            this.k = (short) (s + 1);
            return;
        }
        StringBuilder sb = new StringBuilder("too many waiters: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    private void n() {
        this.k = (short) (this.k - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (isDone() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        r5 = r12 - (java.lang.System.nanoTime() - r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(long r12, boolean r14) {
        /*
            r11 = this;
            boolean r14 = r11.isDone()
            r0 = 1
            if (r14 == 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x0013
            boolean r12 = r11.isDone()
            return r12
        L_0x0013:
            boolean r14 = java.lang.Thread.interrupted()
            if (r14 != 0) goto L_0x005f
            r11.aV_()
            long r3 = java.lang.System.nanoTime()
            r5 = r12
        L_0x0021:
            monitor-enter(r11)     // Catch:{ all -> 0x005d }
            boolean r14 = r11.isDone()     // Catch:{ all -> 0x005a }
            if (r14 == 0) goto L_0x002a
            monitor-exit(r11)     // Catch:{ all -> 0x005a }
            return r0
        L_0x002a:
            r11.m()     // Catch:{ all -> 0x005a }
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r5 / r7
            long r5 = r5 % r7
            int r14 = (int) r5     // Catch:{ InterruptedException -> 0x0054 }
            r11.wait(r9, r14)     // Catch:{ InterruptedException -> 0x0054 }
            r11.n()     // Catch:{ all -> 0x005a }
            monitor-exit(r11)     // Catch:{ all -> 0x005a }
            boolean r14 = r11.isDone()     // Catch:{ all -> 0x005d }
            if (r14 == 0) goto L_0x0042
            return r0
        L_0x0042:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x005d }
            long r5 = r5 - r3
            long r5 = r12 - r5
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x0021
            boolean r12 = r11.isDone()     // Catch:{ all -> 0x005d }
            return r12
        L_0x0052:
            r12 = move-exception
            goto L_0x0056
        L_0x0054:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0052 }
        L_0x0056:
            r11.n()     // Catch:{ all -> 0x005a }
            throw r12     // Catch:{ all -> 0x005a }
        L_0x005a:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x005a }
            throw r12     // Catch:{ all -> 0x005d }
        L_0x005d:
            r12 = move-exception
            throw r12
        L_0x005f:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException
            java.lang.String r13 = r11.toString()
            r12.<init>(r13)
            goto L_0x006a
        L_0x0069:
            throw r12
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whu.a(long, boolean):boolean");
    }

    private static boolean e(Object obj) {
        return (obj instanceof a) && (((a) obj).a instanceof CancellationException);
    }

    private static boolean f(Object obj) {
        return (obj == null || obj == f) ? false : true;
    }

    private static void a(whw whw, Runnable runnable) {
        try {
            whw.execute(runnable);
        } catch (Throwable th) {
            b.e("Failed to submit a listener notification task. Event loop shut down?", th);
        }
    }

    private void a(wht wht) {
        wie<? extends wic<?>>[] wieArr = wht.a;
        int i2 = wht.b;
        for (int i3 = 0; i3 < i2; i3++) {
            b(this, wieArr[i3]);
        }
    }
}
