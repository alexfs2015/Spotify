package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: wmw reason: default package */
public final class wmw {
    public static final /* synthetic */ boolean g = (!wmw.class.desiredAssertionStatus());
    public wmh a;
    public final wln b;
    public final wlj c;
    public final wlt d;
    public wmt e;
    public wmz f;
    private wlf h;
    private defpackage.wmv.a i;
    private final Object j;
    private final wmv k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* renamed from: wmw$a */
    public static final class a extends WeakReference<wmw> {
        public final Object a;

        a(wmw wmw, Object obj) {
            super(wmw);
            this.a = obj;
        }
    }

    public wmw(wln wln, wlf wlf, wlj wlj, wlt wlt, Object obj) {
        this.b = wln;
        this.h = wlf;
        this.c = wlj;
        this.d = wlt;
        this.k = new wmv(wlf, g(), wlj, wlt);
        this.j = obj;
    }

    public final wmz a(wmb wmb, defpackage.wly.a aVar, boolean z) {
        wmz wmz;
        try {
            wmt a2 = a(aVar.b(), aVar.c(), aVar.d(), wmb.D, wmb.y, z);
            if (a2.e != null) {
                wmz = new wnn(wmb, aVar, this, a2.e);
            } else {
                a2.c.setSoTimeout(aVar.c());
                a2.f.a().a((long) aVar.c(), TimeUnit.MILLISECONDS);
                a2.g.a().a((long) aVar.d(), TimeUnit.MILLISECONDS);
                wmz = new wnj(wmb, this, a2.f, a2.g);
            }
            synchronized (this.b) {
                this.f = wmz;
            }
            return wmz;
        } catch (IOException e2) {
            throw new RouteException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.wmt a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            wmt r0 = r3.a(r4, r5, r6, r7, r8)
            wln r1 = r3.b
            monitor-enter(r1)
            int r2 = r0.i     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.a(r9)
            if (r1 != 0) goto L_0x0018
            r3.d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x001c:
            throw r4
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmw.a(int, int, int, int, boolean, boolean):wmt");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.wmt a(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r1 = r18
            wln r2 = r1.b
            monitor-enter(r2)
            boolean r0 = r1.n     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0143
            wmz r0 = r1.f     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x013b
            boolean r0 = r1.o     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0133
            boolean r0 = g     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0024
            wln r0 = r1.b     // Catch:{ all -> 0x014b }
            boolean r0 = java.lang.Thread.holdsLock(r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x0024:
            wmt r0 = r1.e     // Catch:{ all -> 0x014b }
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.h     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0034
            java.net.Socket r0 = r1.a(r5, r5, r4)     // Catch:{ all -> 0x014b }
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            wmt r6 = r1.e     // Catch:{ all -> 0x014b }
            if (r6 == 0) goto L_0x003c
            wmt r6 = r1.e     // Catch:{ all -> 0x014b }
            goto L_0x003d
        L_0x003c:
            r6 = r3
        L_0x003d:
            if (r6 != 0) goto L_0x0054
            wmi r7 = defpackage.wmi.a     // Catch:{ all -> 0x014b }
            wln r8 = r1.b     // Catch:{ all -> 0x014b }
            wlf r9 = r1.h     // Catch:{ all -> 0x014b }
            r7.a(r8, r9, r1, r3)     // Catch:{ all -> 0x014b }
            wmt r7 = r1.e     // Catch:{ all -> 0x014b }
            if (r7 == 0) goto L_0x0051
            wmt r6 = r1.e     // Catch:{ all -> 0x014b }
            r7 = r3
            r8 = 1
            goto L_0x0056
        L_0x0051:
            wmh r7 = r1.a     // Catch:{ all -> 0x014b }
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            r8 = 0
        L_0x0056:
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            defpackage.wmk.a(r0)
            if (r6 == 0) goto L_0x0063
            wmt r0 = r1.e
            wmh r0 = r0.a
            r1.a = r0
            return r6
        L_0x0063:
            if (r7 != 0) goto L_0x0079
            wmv$a r0 = r1.i
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0079
        L_0x006f:
            wmv r0 = r1.k
            wmv$a r0 = r0.b()
            r1.i = r0
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            wln r9 = r1.b
            monitor-enter(r9)
            boolean r2 = r1.o     // Catch:{ all -> 0x0130 }
            if (r2 != 0) goto L_0x0128
            if (r0 == 0) goto L_0x00af
            wmv$a r0 = r1.i     // Catch:{ all -> 0x0130 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            java.util.List<wmh> r0 = r0.a     // Catch:{ all -> 0x0130 }
            r2.<init>(r0)     // Catch:{ all -> 0x0130 }
            int r0 = r2.size()     // Catch:{ all -> 0x0130 }
            r10 = 0
        L_0x0091:
            if (r10 >= r0) goto L_0x00af
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x0130 }
            wmh r11 = (defpackage.wmh) r11     // Catch:{ all -> 0x0130 }
            wmi r12 = defpackage.wmi.a     // Catch:{ all -> 0x0130 }
            wln r13 = r1.b     // Catch:{ all -> 0x0130 }
            wlf r14 = r1.h     // Catch:{ all -> 0x0130 }
            r12.a(r13, r14, r1, r11)     // Catch:{ all -> 0x0130 }
            wmt r12 = r1.e     // Catch:{ all -> 0x0130 }
            if (r12 == 0) goto L_0x00ac
            wmt r6 = r1.e     // Catch:{ all -> 0x0130 }
            r1.a = r11     // Catch:{ all -> 0x0130 }
            r8 = 1
            goto L_0x00af
        L_0x00ac:
            int r10 = r10 + 1
            goto L_0x0091
        L_0x00af:
            if (r8 != 0) goto L_0x00df
            if (r7 != 0) goto L_0x00d1
            wmv$a r0 = r1.i     // Catch:{ all -> 0x0130 }
            boolean r2 = r0.a()     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x00cb
            java.util.List<wmh> r2 = r0.a     // Catch:{ all -> 0x0130 }
            int r6 = r0.b     // Catch:{ all -> 0x0130 }
            int r7 = r6 + 1
            r0.b = r7     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x0130 }
            r7 = r0
            wmh r7 = (defpackage.wmh) r7     // Catch:{ all -> 0x0130 }
            goto L_0x00d1
        L_0x00cb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x00d1:
            r1.a = r7     // Catch:{ all -> 0x0130 }
            r1.l = r5     // Catch:{ all -> 0x0130 }
            wmt r6 = new wmt     // Catch:{ all -> 0x0130 }
            wln r0 = r1.b     // Catch:{ all -> 0x0130 }
            r6.<init>(r0, r7)     // Catch:{ all -> 0x0130 }
            r1.a(r6, r5)     // Catch:{ all -> 0x0130 }
        L_0x00df:
            monitor-exit(r9)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x00e3
            return r6
        L_0x00e3:
            wlj r0 = r1.c
            wlt r2 = r1.d
            r10 = r6
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r2
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            wmu r0 = r18.g()
            wmh r2 = r6.a
            r0.b(r2)
            wln r2 = r1.b
            monitor-enter(r2)
            r1.m = r4     // Catch:{ all -> 0x0125 }
            wmi r0 = defpackage.wmi.a     // Catch:{ all -> 0x0125 }
            wln r4 = r1.b     // Catch:{ all -> 0x0125 }
            r0.b(r4, r6)     // Catch:{ all -> 0x0125 }
            boolean r0 = r6.a()     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0120
            wmi r0 = defpackage.wmi.a     // Catch:{ all -> 0x0125 }
            wln r3 = r1.b     // Catch:{ all -> 0x0125 }
            wlf r4 = r1.h     // Catch:{ all -> 0x0125 }
            java.net.Socket r3 = r0.a(r3, r4, r1)     // Catch:{ all -> 0x0125 }
            wmt r6 = r1.e     // Catch:{ all -> 0x0125 }
        L_0x0120:
            monitor-exit(r2)     // Catch:{ all -> 0x0125 }
            defpackage.wmk.a(r3)
            return r6
        L_0x0125:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0125 }
            throw r0
        L_0x0128:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0130 }
            throw r0
        L_0x0133:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x013b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014e:
            throw r0
        L_0x014f:
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmw.a(int, int, int, int, boolean):wmt");
    }

    public final void a(boolean z, wmz wmz, long j2, IOException iOException) {
        Socket a2;
        boolean z2;
        this.d.b(j2);
        synchronized (this.b) {
            if (wmz != null) {
                if (wmz == this.f) {
                    if (!z) {
                        this.e.i++;
                    }
                    a2 = a(z, false, true);
                    z2 = this.n;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.f);
            sb.append(" but was ");
            sb.append(wmz);
            throw new IllegalStateException(sb.toString());
        }
        wmk.a(a2);
        if (iOException != null) {
            wmi.a.a(this.c, iOException);
            this.d.c();
            return;
        }
        if (z2) {
            wmi.a.a(this.c, (IOException) null);
            this.d.b();
        }
    }

    public final wmz a() {
        wmz wmz;
        synchronized (this.b) {
            wmz = this.f;
        }
        return wmz;
    }

    private wmu g() {
        return wmi.a.a(this.b);
    }

    public final synchronized wmt b() {
        return this.e;
    }

    public final void c() {
        wmt wmt;
        Socket a2;
        synchronized (this.b) {
            wmt = this.e;
            a2 = a(false, true, false);
            if (this.e != null) {
                wmt = null;
            }
        }
        wmk.a(a2);
        if (wmt != null) {
            wmi.a.a(this.c, (IOException) null);
            this.d.b();
        }
    }

    public final void d() {
        Socket a2;
        synchronized (this.b) {
            a2 = a(true, false, false);
        }
        wmk.a(a2);
    }

    public Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (g || Thread.holdsLock(this.b)) {
            if (z3) {
                this.f = null;
            }
            if (z2) {
                this.n = true;
            }
            wmt wmt = this.e;
            if (wmt != null) {
                if (z) {
                    wmt.h = true;
                }
                if (this.f == null && (this.n || this.e.h)) {
                    a(this.e);
                    if (this.e.j.isEmpty()) {
                        this.e.k = System.nanoTime();
                        if (wmi.a.a(this.b, this.e)) {
                            socket = this.e.c;
                            this.e = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.e = null;
                    return socket;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    public final void e() {
        wmz wmz;
        wmt wmt;
        synchronized (this.b) {
            this.o = true;
            wmz = this.f;
            wmt = this.e;
        }
        if (wmz != null) {
            wmz.c();
            return;
        }
        if (wmt != null) {
            wmk.a(wmt.b);
        }
    }

    public final void a(IOException iOException) {
        boolean z;
        Socket a2;
        synchronized (this.b) {
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    this.l++;
                    if (this.l > 1) {
                        this.a = null;
                    }
                    z = false;
                    a2 = a(z, false, true);
                } else {
                    if (errorCode != ErrorCode.CANCEL) {
                        this.a = null;
                    }
                    z = false;
                    a2 = a(z, false, true);
                }
            } else {
                if (this.e != null && (!this.e.a() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.e.i == 0) {
                        if (!(this.a == null || iOException == null)) {
                            wmv wmv = this.k;
                            wmh wmh = this.a;
                            if (!(wmh.b.type() == Type.DIRECT || wmv.a.f == null)) {
                                wmv.a.f.connectFailed(wmv.a.a.b(), wmh.b.address(), iOException);
                            }
                            wmv.b.a(wmh);
                        }
                        this.a = null;
                    }
                }
                z = false;
                a2 = a(z, false, true);
            }
            z = true;
            a2 = a(z, false, true);
        }
        wmk.a(a2);
    }

    public final void a(wmt wmt, boolean z) {
        if (!g && !Thread.holdsLock(this.b)) {
            throw new AssertionError();
        } else if (this.e == null) {
            this.e = wmt;
            this.m = z;
            wmt.j.add(new a(this, this.j));
        } else {
            throw new IllegalStateException();
        }
    }

    private void a(wmt wmt) {
        int size = wmt.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Reference) wmt.j.get(i2)).get() == this) {
                wmt.j.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean f() {
        if (this.a == null) {
            defpackage.wmv.a aVar = this.i;
            if ((aVar == null || !aVar.a()) && !this.k.a()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        wmt b2 = b();
        return b2 != null ? b2.toString() : this.h.toString();
    }
}
