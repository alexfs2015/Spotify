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

/* renamed from: xbc reason: default package */
public final class xbc {
    public static final /* synthetic */ boolean g = (!xbc.class.desiredAssertionStatus());
    public xan a;
    public final wzt b;
    public final wzp c;
    public final wzz d;
    public xaz e;
    public xbf f;
    private wzl h;
    private defpackage.xbb.a i;
    private final Object j;
    private final xbb k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* renamed from: xbc$a */
    public static final class a extends WeakReference<xbc> {
        public final Object a;

        a(xbc xbc, Object obj) {
            super(xbc);
            this.a = obj;
        }
    }

    public xbc(wzt wzt, wzl wzl, wzp wzp, wzz wzz, Object obj) {
        this.b = wzt;
        this.h = wzl;
        this.c = wzp;
        this.d = wzz;
        this.k = new xbb(wzl, g(), wzp, wzz);
        this.j = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.xaz a(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r1 = r18
            wzt r2 = r1.b
            monitor-enter(r2)
            boolean r0 = r1.n     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0143
            xbf r0 = r1.f     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x013b
            boolean r0 = r1.o     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0133
            boolean r0 = g     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0024
            wzt r0 = r1.b     // Catch:{ all -> 0x014b }
            boolean r0 = java.lang.Thread.holdsLock(r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x0024:
            xaz r0 = r1.e     // Catch:{ all -> 0x014b }
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
            xaz r6 = r1.e     // Catch:{ all -> 0x014b }
            if (r6 == 0) goto L_0x003c
            xaz r6 = r1.e     // Catch:{ all -> 0x014b }
            goto L_0x003d
        L_0x003c:
            r6 = r3
        L_0x003d:
            if (r6 != 0) goto L_0x0054
            xao r7 = defpackage.xao.a     // Catch:{ all -> 0x014b }
            wzt r8 = r1.b     // Catch:{ all -> 0x014b }
            wzl r9 = r1.h     // Catch:{ all -> 0x014b }
            r7.a(r8, r9, r1, r3)     // Catch:{ all -> 0x014b }
            xaz r7 = r1.e     // Catch:{ all -> 0x014b }
            if (r7 == 0) goto L_0x0051
            xaz r6 = r1.e     // Catch:{ all -> 0x014b }
            r7 = r3
            r8 = 1
            goto L_0x0056
        L_0x0051:
            xan r7 = r1.a     // Catch:{ all -> 0x014b }
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            r8 = 0
        L_0x0056:
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            defpackage.xaq.a(r0)
            if (r6 == 0) goto L_0x0063
            xaz r0 = r1.e
            xan r0 = r0.a
            r1.a = r0
            return r6
        L_0x0063:
            if (r7 != 0) goto L_0x0079
            xbb$a r0 = r1.i
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0079
        L_0x006f:
            xbb r0 = r1.k
            xbb$a r0 = r0.b()
            r1.i = r0
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            wzt r9 = r1.b
            monitor-enter(r9)
            boolean r2 = r1.o     // Catch:{ all -> 0x0130 }
            if (r2 != 0) goto L_0x0128
            if (r0 == 0) goto L_0x00af
            xbb$a r0 = r1.i     // Catch:{ all -> 0x0130 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            java.util.List<xan> r0 = r0.a     // Catch:{ all -> 0x0130 }
            r2.<init>(r0)     // Catch:{ all -> 0x0130 }
            int r0 = r2.size()     // Catch:{ all -> 0x0130 }
            r10 = 0
        L_0x0091:
            if (r10 >= r0) goto L_0x00af
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x0130 }
            xan r11 = (defpackage.xan) r11     // Catch:{ all -> 0x0130 }
            xao r12 = defpackage.xao.a     // Catch:{ all -> 0x0130 }
            wzt r13 = r1.b     // Catch:{ all -> 0x0130 }
            wzl r14 = r1.h     // Catch:{ all -> 0x0130 }
            r12.a(r13, r14, r1, r11)     // Catch:{ all -> 0x0130 }
            xaz r12 = r1.e     // Catch:{ all -> 0x0130 }
            if (r12 == 0) goto L_0x00ac
            xaz r6 = r1.e     // Catch:{ all -> 0x0130 }
            r1.a = r11     // Catch:{ all -> 0x0130 }
            r8 = 1
            goto L_0x00af
        L_0x00ac:
            int r10 = r10 + 1
            goto L_0x0091
        L_0x00af:
            if (r8 != 0) goto L_0x00df
            if (r7 != 0) goto L_0x00d1
            xbb$a r0 = r1.i     // Catch:{ all -> 0x0130 }
            boolean r2 = r0.a()     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x00cb
            java.util.List<xan> r2 = r0.a     // Catch:{ all -> 0x0130 }
            int r6 = r0.b     // Catch:{ all -> 0x0130 }
            int r7 = r6 + 1
            r0.b = r7     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x0130 }
            r7 = r0
            xan r7 = (defpackage.xan) r7     // Catch:{ all -> 0x0130 }
            goto L_0x00d1
        L_0x00cb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x00d1:
            r1.a = r7     // Catch:{ all -> 0x0130 }
            r1.l = r5     // Catch:{ all -> 0x0130 }
            xaz r6 = new xaz     // Catch:{ all -> 0x0130 }
            wzt r0 = r1.b     // Catch:{ all -> 0x0130 }
            r6.<init>(r0, r7)     // Catch:{ all -> 0x0130 }
            r1.a(r6, r5)     // Catch:{ all -> 0x0130 }
        L_0x00df:
            monitor-exit(r9)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x00e3
            return r6
        L_0x00e3:
            wzp r0 = r1.c
            wzz r2 = r1.d
            r10 = r6
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r2
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            xba r0 = r18.g()
            xan r2 = r6.a
            r0.b(r2)
            wzt r2 = r1.b
            monitor-enter(r2)
            r1.m = r4     // Catch:{ all -> 0x0125 }
            xao r0 = defpackage.xao.a     // Catch:{ all -> 0x0125 }
            wzt r4 = r1.b     // Catch:{ all -> 0x0125 }
            r0.b(r4, r6)     // Catch:{ all -> 0x0125 }
            boolean r0 = r6.a()     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0120
            xao r0 = defpackage.xao.a     // Catch:{ all -> 0x0125 }
            wzt r3 = r1.b     // Catch:{ all -> 0x0125 }
            wzl r4 = r1.h     // Catch:{ all -> 0x0125 }
            java.net.Socket r3 = r0.a(r3, r4, r1)     // Catch:{ all -> 0x0125 }
            xaz r6 = r1.e     // Catch:{ all -> 0x0125 }
        L_0x0120:
            monitor-exit(r2)     // Catch:{ all -> 0x0125 }
            defpackage.xaq.a(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbc.a(int, int, int, int, boolean):xaz");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.xaz a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            xaz r0 = r3.a(r4, r5, r6, r7, r8)
            wzt r1 = r3.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbc.a(int, int, int, int, boolean, boolean):xaz");
    }

    private void a(xaz xaz) {
        int size = xaz.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Reference) xaz.j.get(i2)).get() == this) {
                xaz.j.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private xba g() {
        return xao.a.a(this.b);
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
            xaz xaz = this.e;
            if (xaz != null) {
                if (z) {
                    xaz.h = true;
                }
                if (this.f == null && (this.n || this.e.h)) {
                    a(this.e);
                    if (this.e.j.isEmpty()) {
                        this.e.k = System.nanoTime();
                        if (xao.a.a(this.b, this.e)) {
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

    public final xbf a() {
        xbf xbf;
        synchronized (this.b) {
            xbf = this.f;
        }
        return xbf;
    }

    public final xbf a(xah xah, defpackage.xae.a aVar, boolean z) {
        xbf xbf;
        try {
            xaz a2 = a(aVar.b(), aVar.c(), aVar.d(), xah.D, xah.y, z);
            if (a2.e != null) {
                xbf = new xbt(xah, aVar, this, a2.e);
            } else {
                a2.c.setSoTimeout(aVar.c());
                a2.f.a().a((long) aVar.c(), TimeUnit.MILLISECONDS);
                a2.g.a().a((long) aVar.d(), TimeUnit.MILLISECONDS);
                xbf = new xbp(xah, this, a2.f, a2.g);
            }
            synchronized (this.b) {
                this.f = xbf;
            }
            return xbf;
        } catch (IOException e2) {
            throw new RouteException(e2);
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
                            xbb xbb = this.k;
                            xan xan = this.a;
                            if (!(xan.b.type() == Type.DIRECT || xbb.a.f == null)) {
                                xbb.a.f.connectFailed(xbb.a.a.b(), xan.b.address(), iOException);
                            }
                            xbb.b.a(xan);
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
        xaq.a(a2);
    }

    public final void a(xaz xaz, boolean z) {
        if (!g && !Thread.holdsLock(this.b)) {
            throw new AssertionError();
        } else if (this.e == null) {
            this.e = xaz;
            this.m = z;
            xaz.j.add(new a(this, this.j));
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(boolean z, xbf xbf, long j2, IOException iOException) {
        Socket a2;
        boolean z2;
        this.d.b(j2);
        synchronized (this.b) {
            if (xbf != null) {
                if (xbf == this.f) {
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
            sb.append(xbf);
            throw new IllegalStateException(sb.toString());
        }
        xaq.a(a2);
        if (iOException != null) {
            xao.a.a(this.c, iOException);
            this.d.c();
            return;
        }
        if (z2) {
            xao.a.a(this.c, (IOException) null);
            this.d.b();
        }
    }

    public final synchronized xaz b() {
        return this.e;
    }

    public final void c() {
        xaz xaz;
        Socket a2;
        synchronized (this.b) {
            xaz = this.e;
            a2 = a(false, true, false);
            if (this.e != null) {
                xaz = null;
            }
        }
        xaq.a(a2);
        if (xaz != null) {
            xao.a.a(this.c, (IOException) null);
            this.d.b();
        }
    }

    public final void d() {
        Socket a2;
        synchronized (this.b) {
            a2 = a(true, false, false);
        }
        xaq.a(a2);
    }

    public final void e() {
        xbf xbf;
        xaz xaz;
        synchronized (this.b) {
            this.o = true;
            xbf = this.f;
            xaz = this.e;
        }
        if (xbf != null) {
            xbf.c();
            return;
        }
        if (xaz != null) {
            xaq.a(xaz.b);
        }
    }

    public final boolean f() {
        if (this.a == null) {
            defpackage.xbb.a aVar = this.i;
            if ((aVar == null || !aVar.a()) && !this.k.a()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        xaz b2 = b();
        return b2 != null ? b2.toString() : this.h.toString();
    }
}
