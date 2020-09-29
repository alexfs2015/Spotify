package defpackage;

import io.netty.util.Signal;
import io.netty.util.concurrent.BlockingOperationException;
import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wwa reason: default package */
public class wwa<V> extends wvv<V> implements wws<V> {
    private static final wyc a;
    private static final wyc b;
    private static final int c = Math.min(8, wxu.a("io.netty.defaultPromise.maxListenerStackDepth", 8));
    private static final AtomicReferenceFieldUpdater<wwa, Object> d;
    private static final Signal e;
    private static final Signal f;
    private static final a g;
    private volatile Object h;
    private final wwc i;
    private Object j;
    private short k;
    private boolean l;

    /* renamed from: wwa$a */
    static final class a {
        final Throwable a;

        a(Throwable th) {
            this.a = th;
        }
    }

    static {
        Class<wwa> cls = wwa.class;
        a = wyd.a(cls);
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(".rejectedExecution");
        b = wyd.a(sb.toString());
        e = Signal.a(cls, "SUCCESS");
        f = Signal.a(cls, "UNCANCELLABLE");
        g = new a(wxv.a(new CancellationException(), cls, "cancel(...)"));
        AtomicReferenceFieldUpdater<wwa, Object> a2 = PlatformDependent.a(cls, "result");
        if (a2 == null) {
            a2 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "h");
        }
        d = a2;
    }

    protected wwa() {
        this.i = null;
    }

    public wwa(wwc wwc) {
        this.i = (wwc) wxq.a(wwc, "executor");
    }

    private void a(wvz wvz) {
        wwk<? extends wwi<?>>[] wwkArr = wvz.a;
        int i2 = wvz.b;
        for (int i3 = 0; i3 < i2; i3++) {
            b(this, wwkArr[i3]);
        }
    }

    private static void a(wwc wwc, Runnable runnable) {
        try {
            wwc.execute(runnable);
        } catch (Throwable th) {
            b.e("Failed to submit a listener notification task. Event loop shut down?", th);
        }
    }

    protected static void a(wwc wwc, final wwi<?> wwi, final wwk<?> wwk) {
        wxq.a(wwc, "eventExecutor");
        wxq.a(wwi, "future");
        wxq.a(wwk, "listener");
        if (wwc.j()) {
            wxi b2 = wxi.b();
            int i2 = b2.e;
            if (i2 < c) {
                b2.e = i2 + 1;
                try {
                    b(wwi, wwk);
                    return;
                } finally {
                    b2.e = i2;
                }
            }
        }
        a(wwc, (Runnable) new Runnable() {
            public final void run() {
                wwa.b(wwi, wwk);
            }
        });
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
            r11.aT_()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwa.a(long, boolean):boolean");
    }

    private boolean a(Throwable th) {
        return d(new a((Throwable) wxq.a(th, "cause")));
    }

    /* access modifiers changed from: private */
    public static void b(wwi wwi, wwk wwk) {
        try {
            wwk.operationComplete(wwi);
        } catch (Throwable th) {
            wyc wyc = a;
            StringBuilder sb = new StringBuilder("An exception was thrown by ");
            sb.append(wwk.getClass().getName());
            sb.append(".operationComplete()");
            wyc.d(sb.toString(), th);
        }
    }

    private boolean c(V v) {
        if (v == null) {
            v = e;
        }
        return d(v);
    }

    private boolean d(Object obj) {
        if (!d.compareAndSet(this, null, obj) && !d.compareAndSet(this, f, obj)) {
            return false;
        }
        l();
        return true;
    }

    private void e() {
        wwc a2 = a();
        if (a2.j()) {
            wxi b2 = wxi.b();
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
                wwa.this.k();
            }
        });
    }

    private static boolean e(Object obj) {
        return (obj instanceof a) && (((a) obj).a instanceof CancellationException);
    }

    private static boolean f(Object obj) {
        return (obj == null || obj == f) ? false : true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if ((r0 instanceof defpackage.wvz) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        a((defpackage.wvz) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        b(r3, (defpackage.wwk) r0);
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
            boolean r2 = r0 instanceof defpackage.wvz
            if (r2 == 0) goto L_0x001d
            wvz r0 = (defpackage.wvz) r0
            r3.a(r0)
            goto L_0x0022
        L_0x001d:
            wwk r0 = (defpackage.wwk) r0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwa.k():void");
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

    /* access modifiers changed from: protected */
    public wwc a() {
        return this.i;
    }

    public wws<V> a(V v) {
        if (c(v)) {
            e();
            return this;
        }
        StringBuilder sb = new StringBuilder("complete already: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean a(long j2, TimeUnit timeUnit) {
        return a(timeUnit.toNanos(j2), true);
    }

    /* access modifiers changed from: protected */
    public void aT_() {
        wwc a2 = a();
        if (a2 != null && a2.j()) {
            throw new BlockingOperationException(toString());
        }
    }

    /* renamed from: aU_ */
    public wws<V> aV_() {
        h();
        Throwable f2 = f();
        if (f2 != null) {
            PlatformDependent.a(f2);
        }
        return this;
    }

    public boolean aW_() {
        if (d.compareAndSet(this, null, f)) {
            return true;
        }
        Object obj = this.h;
        return !f(obj) || !e(obj);
    }

    public boolean b(V v) {
        if (!c(v)) {
            return false;
        }
        e();
        return true;
    }

    public boolean b(Throwable th) {
        if (!a(th)) {
            return false;
        }
        e();
        return true;
    }

    public wws<V> c(Throwable th) {
        if (a(th)) {
            e();
            return this;
        }
        StringBuilder sb = new StringBuilder("complete already: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* renamed from: c */
    public wws<V> b(wwk<? extends wwi<? super V>> wwk) {
        wxq.a(wwk, "listener");
        synchronized (this) {
            if (this.j == null) {
                this.j = wwk;
            } else if (this.j instanceof wvz) {
                wvz wvz = (wvz) this.j;
                wwk<? extends wwi<?>>[] wwkArr = wvz.a;
                int i2 = wvz.b;
                if (i2 == wwkArr.length) {
                    wwkArr = (wwk[]) Arrays.copyOf(wwkArr, i2 << 1);
                    wvz.a = wwkArr;
                }
                wwkArr[i2] = wwk;
                wvz.b = i2 + 1;
                if (wwk instanceof wwl) {
                    wvz.c++;
                }
            } else {
                this.j = new wvz((wwk) this.j, wwk);
            }
        }
        if (isDone()) {
            e();
        }
        return this;
    }

    public boolean cancel(boolean z) {
        if (!d.compareAndSet(this, null, g)) {
            return false;
        }
        l();
        e();
        return true;
    }

    public final V d() {
        V v = this.h;
        if ((v instanceof a) || v == e) {
            return null;
        }
        return v;
    }

    public final Throwable f() {
        Object obj = this.h;
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }

    public final boolean g() {
        Object obj = this.h;
        return (obj == null || obj == f || (obj instanceof a)) ? false : true;
    }

    public wws<V> h() {
        if (isDone()) {
            return this;
        }
        aT_();
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

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public wws<V> c() {
        if (isDone()) {
            return this;
        }
        if (!Thread.interrupted()) {
            aT_();
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

    public boolean isCancelled() {
        return e(this.h);
    }

    public boolean isDone() {
        return f(this.h);
    }

    /* access modifiers changed from: protected */
    public StringBuilder j() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(wxt.a((Object) this));
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

    public String toString() {
        return j().toString();
    }
}
