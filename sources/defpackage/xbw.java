package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: xbw reason: default package */
public final class xbw {
    static final /* synthetic */ boolean l = (!xbw.class.desiredAssertionStatus());
    long a = 0;
    long b;
    final int c;
    final xbu d;
    /* access modifiers changed from: 0000 */
    public final Deque<xac> e = new ArrayDeque();
    boolean f;
    final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    ErrorCode k = null;

    /* renamed from: xbw$a */
    final class a implements xdf {
        private static /* synthetic */ boolean d = (!xbw.class.desiredAssertionStatus());
        boolean a;
        boolean b;
        private final xcq c = new xcq();

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) {
            long min;
            synchronized (xbw.this) {
                xbw.this.j.bf_();
                while (xbw.this.b <= 0 && !this.b && !this.a && xbw.this.k == null) {
                    try {
                        xbw.this.h();
                    } catch (Throwable th) {
                        xbw.this.j.b();
                        throw th;
                    }
                }
                xbw.this.j.b();
                xbw.this.g();
                min = Math.min(xbw.this.b, this.c.b);
                xbw.this.b -= min;
            }
            xbw.this.j.bf_();
            try {
                xbw.this.d.a(xbw.this.c, z && min == this.c.b, this.c, min);
            } finally {
                xbw.this.j.b();
            }
        }

        public final xdh a() {
            return xbw.this.j;
        }

        public final void a_(xcq xcq, long j) {
            if (d || !Thread.holdsLock(xbw.this)) {
                this.c.a_(xcq, j);
                while (this.c.b >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.e.h.b != false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            if (r8.c.b <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
            if (r8.c.b <= 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
            r8.e.d.a(r8.e.c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
            r2 = r8.e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r8.e.d.n.b();
            r8.e.f();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r8 = this;
                boolean r0 = d
                if (r0 != 0) goto L_0x0013
                xbw r0 = defpackage.xbw.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                xbw r0 = defpackage.xbw.this
                monitor-enter(r0)
                boolean r1 = r8.a     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x001c:
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                xbw r0 = defpackage.xbw.this
                xbw$a r0 = r0.h
                boolean r0 = r0.b
                r1 = 1
                if (r0 != 0) goto L_0x004b
                xcq r0 = r8.c
                long r2 = r0.b
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
            L_0x0030:
                xcq r0 = r8.c
                long r2 = r0.b
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004b
                r8.a(r1)
                goto L_0x0030
            L_0x003c:
                xbw r0 = defpackage.xbw.this
                xbu r2 = r0.d
                xbw r0 = defpackage.xbw.this
                int r3 = r0.c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x004b:
                xbw r2 = defpackage.xbw.this
                monitor-enter(r2)
                r8.a = r1     // Catch:{ all -> 0x0060 }
                monitor-exit(r2)     // Catch:{ all -> 0x0060 }
                xbw r0 = defpackage.xbw.this
                xbu r0 = r0.d
                xbx r0 = r0.n
                r0.b()
                xbw r0 = defpackage.xbw.this
                r0.f()
                return
            L_0x0060:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0060 }
                throw r0
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                goto L_0x0067
            L_0x0066:
                throw r1
            L_0x0067:
                goto L_0x0066
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbw.a.close():void");
        }

        public final void flush() {
            if (d || !Thread.holdsLock(xbw.this)) {
                synchronized (xbw.this) {
                    xbw.this.g();
                }
                while (this.c.b > 0) {
                    a(false);
                    xbw.this.d.n.b();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: xbw$b */
    final class b implements xdg {
        private static /* synthetic */ boolean f = (!xbw.class.desiredAssertionStatus());
        boolean a;
        boolean b;
        private final xcq c = new xcq();
        private final xcq d = new xcq();
        private final long e;

        b(long j) {
            this.e = j;
        }

        private void a(long j) {
            if (f || !Thread.holdsLock(xbw.this)) {
                xbw.this.d.a(j);
                return;
            }
            throw new AssertionError();
        }

        public final long a(xcq xcq, long j) {
            ErrorCode errorCode;
            xac xac;
            long j2;
            a aVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (xbw.this) {
                        xbw.this.i.bf_();
                        try {
                            errorCode = xbw.this.k != null ? xbw.this.k : null;
                            if (!this.a) {
                                if (xbw.this.e.isEmpty() || xbw.b(xbw.this) == null) {
                                    if (this.d.b > 0) {
                                        j2 = this.d.a(xcq, Math.min(j3, this.d.b));
                                        xbw.this.a += j2;
                                        if (errorCode == null && xbw.this.a >= ((long) (xbw.this.d.k.b() / 2))) {
                                            xbw.this.d.a(xbw.this.c, xbw.this.a);
                                            xbw.this.a = 0;
                                        }
                                    } else {
                                        xcq xcq2 = xcq;
                                        if (this.b || errorCode != null) {
                                            j2 = -1;
                                        } else {
                                            xbw.this.h();
                                            xbw.this.i.b();
                                        }
                                    }
                                    aVar = null;
                                    xac = null;
                                } else {
                                    xac xac2 = (xac) xbw.this.e.removeFirst();
                                    aVar = xbw.b(xbw.this);
                                    xcq xcq3 = xcq;
                                    xac = xac2;
                                    j2 = -1;
                                }
                                if (xac == null || aVar == null) {
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            xbw.this.i.b();
                        }
                    }
                }
                if (j2 != -1) {
                    a(j2);
                    return j2;
                } else if (errorCode == null) {
                    return -1;
                } else {
                    throw new StreamResetException(errorCode);
                }
            } else {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final xdh a() {
            return xbw.this.i;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xcs xcs, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            if (f || !Thread.holdsLock(xbw.this)) {
                while (j > 0) {
                    synchronized (xbw.this) {
                        z = this.b;
                        z2 = true;
                        z3 = this.d.b + j > this.e;
                    }
                    if (z3) {
                        xcs.i(j);
                        xbw.this.b(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        xcs.i(j);
                        return;
                    } else {
                        long a2 = xcs.a(this.c, j);
                        if (a2 != -1) {
                            j -= a2;
                            synchronized (xbw.this) {
                                if (this.d.b != 0) {
                                    z2 = false;
                                }
                                this.d.a((xdg) this.c);
                                if (z2) {
                                    xbw.this.notifyAll();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public final void close() {
            long j;
            ArrayList arrayList;
            a aVar;
            synchronized (xbw.this) {
                this.a = true;
                j = this.d.b;
                this.d.r();
                arrayList = null;
                if (xbw.this.e.isEmpty() || xbw.b(xbw.this) == null) {
                    aVar = null;
                } else {
                    arrayList = new ArrayList(xbw.this.e);
                    xbw.this.e.clear();
                    aVar = xbw.b(xbw.this);
                }
                xbw.this.notifyAll();
            }
            if (j > 0) {
                a(j);
            }
            xbw.this.f();
            if (aVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: xbw$c */
    class c extends xco {
        c() {
        }

        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void a() {
            xbw.this.b(ErrorCode.CANCEL);
        }

        public final void b() {
            if (bg_()) {
                throw a(null);
            }
        }
    }

    xbw(int i2, xbu xbu, boolean z, boolean z2, xac xac) {
        if (xbu != null) {
            this.c = i2;
            this.d = xbu;
            this.b = (long) xbu.l.b();
            this.g = new b((long) xbu.k.b());
            this.h = new a();
            this.g.b = z2;
            this.h.b = z;
            if (xac != null) {
                this.e.add(xac);
            }
            if (b() && xac != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!b() && xac == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    static /* synthetic */ a b(xbw xbw) {
        return null;
    }

    private boolean d(ErrorCode errorCode) {
        if (l || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.k != null) {
                    return false;
                }
                if (this.g.b && this.h.b) {
                    return false;
                }
                this.k = errorCode;
                notifyAll();
                this.d.b(this.c);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void a(ErrorCode errorCode) {
        if (d(errorCode)) {
            this.d.b(this.c, errorCode);
        }
    }

    public final synchronized boolean a() {
        if (this.k != null) {
            return false;
        }
        return (!this.g.b && !this.g.a) || (!this.h.b && !this.h.a) || !this.f;
    }

    public final void b(ErrorCode errorCode) {
        if (d(errorCode)) {
            this.d.a(this.c, errorCode);
        }
    }

    public final boolean b() {
        return this.d.a == ((this.c & 1) == 1);
    }

    /* JADX INFO: finally extract failed */
    public final synchronized xac c() {
        this.i.bf_();
        while (this.e.isEmpty() && this.k == null) {
            try {
                h();
            } catch (Throwable th) {
                this.i.b();
                throw th;
            }
        }
        this.i.b();
        if (!this.e.isEmpty()) {
        } else {
            throw new StreamResetException(this.k);
        }
        return (xac) this.e.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void c(ErrorCode errorCode) {
        if (this.k == null) {
            this.k = errorCode;
            notifyAll();
        }
    }

    public final xdf d() {
        synchronized (this) {
            if (!this.f) {
                if (!b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        boolean a2;
        if (l || !Thread.holdsLock(this)) {
            synchronized (this) {
                this.g.b = true;
                a2 = a();
                notifyAll();
            }
            if (!a2) {
                this.d.b(this.c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        boolean z;
        boolean a2;
        if (l || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.g.b && this.g.a && (this.h.b || this.h.a);
                a2 = a();
            }
            if (z) {
                a(ErrorCode.CANCEL);
                return;
            }
            if (!a2) {
                this.d.b(this.c);
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        if (this.h.a) {
            throw new IOException("stream closed");
        } else if (!this.h.b) {
            ErrorCode errorCode = this.k;
            if (errorCode != null) {
                throw new StreamResetException(errorCode);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
