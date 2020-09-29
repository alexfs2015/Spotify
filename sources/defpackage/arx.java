package defpackage;

import defpackage.arv;
import defpackage.arw;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: arx reason: default package */
public abstract class arx<I extends arv, O extends arw, E extends Exception> implements art<I, O, E> {
    protected final I[] a;
    protected int b;
    private final Thread c;
    private final Object d = new Object();
    private final ArrayDeque<I> e = new ArrayDeque<>();
    private final ArrayDeque<O> f = new ArrayDeque<>();
    private final O[] g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    /* access modifiers changed from: protected */
    public abstract E a(I i2, O o, boolean z);

    /* access modifiers changed from: protected */
    public abstract E a(Throwable th);

    /* access modifiers changed from: protected */
    public abstract I f();

    /* access modifiers changed from: protected */
    public abstract O g();

    public final /* synthetic */ void a(Object obj) {
        I i2 = (arv) obj;
        synchronized (this.d) {
            bcu.a(i2 == this.i);
            this.e.addLast(i2);
            j();
            this.i = null;
        }
    }

    protected arx(I[] iArr, O[] oArr) {
        this.a = iArr;
        this.b = 2;
        for (int i2 = 0; i2 < this.b; i2++) {
            this.a[i2] = f();
        }
        this.g = oArr;
        this.h = 2;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.g[i3] = g();
        }
        this.c = new Thread() {
            public final void run() {
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (arx.this.e());
            }
        };
        this.c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public I a() {
        I i2;
        I i3;
        synchronized (this.d) {
            bcu.b(this.i == null);
            if (this.b == 0) {
                i2 = null;
            } else {
                I[] iArr = this.a;
                int i4 = this.b - 1;
                this.b = i4;
                i2 = iArr[i4];
            }
            this.i = i2;
            i3 = this.i;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public O b() {
        synchronized (this.d) {
            if (this.f.isEmpty()) {
                return null;
            }
            O o = (arw) this.f.removeFirst();
            return o;
        }
    }

    /* access modifiers changed from: protected */
    public void a(O o) {
        synchronized (this.d) {
            o.a();
            O[] oArr = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            oArr[i2] = o;
            j();
        }
    }

    public final void c() {
        synchronized (this.d) {
            this.k = true;
            this.m = 0;
            if (this.i != null) {
                a(this.i);
                this.i = null;
            }
            while (!this.e.isEmpty()) {
                a((I) (arv) this.e.removeFirst());
            }
            while (!this.f.isEmpty()) {
                ((arw) this.f.removeFirst()).e();
            }
        }
    }

    public final void d() {
        synchronized (this.d) {
            this.l = true;
            this.d.notify();
        }
        try {
            this.c.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void j() {
        if (k()) {
            this.d.notify();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.c() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.a(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.n_() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.a(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.j = a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r6.j = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6.j = a((java.lang.Throwable) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.k()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.d     // Catch:{ all -> 0x0096 }
            r1.wait()     // Catch:{ all -> 0x0096 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.l     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.e     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0096 }
            arv r1 = (defpackage.arv) r1     // Catch:{ all -> 0x0096 }
            O[] r3 = r6.g     // Catch:{ all -> 0x0096 }
            int r4 = r6.h     // Catch:{ all -> 0x0096 }
            r5 = 1
            int r4 = r4 - r5
            r6.h = r4     // Catch:{ all -> 0x0096 }
            r3 = r3[r4]     // Catch:{ all -> 0x0096 }
            boolean r4 = r6.k     // Catch:{ all -> 0x0096 }
            r6.k = r2     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.a(r0)
            goto L_0x0069
        L_0x003c:
            boolean r0 = r1.n_()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.a(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.a(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            r6.j = r0     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r0 = move-exception
            java.lang.Exception r0 = r6.a(r0)
            r6.j = r0
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            java.lang.Exception r0 = r6.a(r0)
            r6.j = r0
        L_0x005d:
            E r0 = r6.j
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r1
        L_0x0069:
            java.lang.Object r4 = r6.d
            monitor-enter(r4)
            boolean r0 = r6.k     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0074
            r3.e()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0074:
            boolean r0 = r3.n_()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0083
            int r0 = r6.m     // Catch:{ all -> 0x0093 }
            int r0 = r0 + r5
            r6.m = r0     // Catch:{ all -> 0x0093 }
            r3.e()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0083:
            int r0 = r6.m     // Catch:{ all -> 0x0093 }
            r3.c = r0     // Catch:{ all -> 0x0093 }
            r6.m = r2     // Catch:{ all -> 0x0093 }
            java.util.ArrayDeque<O> r0 = r6.f     // Catch:{ all -> 0x0093 }
            r0.addLast(r3)     // Catch:{ all -> 0x0093 }
        L_0x008e:
            r6.a((I) r1)     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            return r5
        L_0x0093:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0099:
            throw r1
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arx.e():boolean");
    }

    private boolean k() {
        return !this.e.isEmpty() && this.h > 0;
    }

    private void a(I i2) {
        i2.a();
        I[] iArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr[i3] = i2;
    }
}
