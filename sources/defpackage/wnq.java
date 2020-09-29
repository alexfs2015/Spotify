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

/* renamed from: wnq reason: default package */
public final class wnq {
    static final /* synthetic */ boolean l = (!wnq.class.desiredAssertionStatus());
    long a = 0;
    long b;
    final int c;
    final wno d;
    /* access modifiers changed from: 0000 */
    public final Deque<wlw> e = new ArrayDeque();
    boolean f;
    final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    ErrorCode k = null;

    /* renamed from: wnq$a */
    final class a implements woz {
        private static /* synthetic */ boolean d = (!wnq.class.desiredAssertionStatus());
        boolean a;
        boolean b;
        private final wok c = new wok();

        a() {
        }

        public final void a_(wok wok, long j) {
            if (d || !Thread.holdsLock(wnq.this)) {
                this.c.a_(wok, j);
                while (this.c.b >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) {
            long min;
            synchronized (wnq.this) {
                wnq.this.j.bh_();
                while (wnq.this.b <= 0 && !this.b && !this.a && wnq.this.k == null) {
                    try {
                        wnq.this.h();
                    } catch (Throwable th) {
                        wnq.this.j.b();
                        throw th;
                    }
                }
                wnq.this.j.b();
                wnq.this.g();
                min = Math.min(wnq.this.b, this.c.b);
                wnq.this.b -= min;
            }
            wnq.this.j.bh_();
            try {
                wnq.this.d.a(wnq.this.c, z && min == this.c.b, this.c, min);
            } finally {
                wnq.this.j.b();
            }
        }

        public final void flush() {
            if (d || !Thread.holdsLock(wnq.this)) {
                synchronized (wnq.this) {
                    wnq.this.g();
                }
                while (this.c.b > 0) {
                    a(false);
                    wnq.this.d.n.b();
                }
                return;
            }
            throw new AssertionError();
        }

        public final wpb a() {
            return wnq.this.j;
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
                wnq r0 = defpackage.wnq.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                wnq r0 = defpackage.wnq.this
                monitor-enter(r0)
                boolean r1 = r8.a     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x001c:
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                wnq r0 = defpackage.wnq.this
                wnq$a r0 = r0.h
                boolean r0 = r0.b
                r1 = 1
                if (r0 != 0) goto L_0x004b
                wok r0 = r8.c
                long r2 = r0.b
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
            L_0x0030:
                wok r0 = r8.c
                long r2 = r0.b
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004b
                r8.a(r1)
                goto L_0x0030
            L_0x003c:
                wnq r0 = defpackage.wnq.this
                wno r2 = r0.d
                wnq r0 = defpackage.wnq.this
                int r3 = r0.c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x004b:
                wnq r2 = defpackage.wnq.this
                monitor-enter(r2)
                r8.a = r1     // Catch:{ all -> 0x0060 }
                monitor-exit(r2)     // Catch:{ all -> 0x0060 }
                wnq r0 = defpackage.wnq.this
                wno r0 = r0.d
                wnr r0 = r0.n
                r0.b()
                wnq r0 = defpackage.wnq.this
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wnq.a.close():void");
        }
    }

    /* renamed from: wnq$b */
    final class b implements wpa {
        private static /* synthetic */ boolean f = (!wnq.class.desiredAssertionStatus());
        boolean a;
        boolean b;
        private final wok c = new wok();
        private final wok d = new wok();
        private final long e;

        b(long j) {
            this.e = j;
        }

        public final long a(wok wok, long j) {
            ErrorCode errorCode;
            wlw wlw;
            long j2;
            a aVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (wnq.this) {
                        wnq.this.i.bh_();
                        try {
                            errorCode = wnq.this.k != null ? wnq.this.k : null;
                            if (!this.a) {
                                if (wnq.this.e.isEmpty() || wnq.b(wnq.this) == null) {
                                    if (this.d.b > 0) {
                                        j2 = this.d.a(wok, Math.min(j3, this.d.b));
                                        wnq.this.a += j2;
                                        if (errorCode == null && wnq.this.a >= ((long) (wnq.this.d.k.b() / 2))) {
                                            wnq.this.d.a(wnq.this.c, wnq.this.a);
                                            wnq.this.a = 0;
                                        }
                                    } else {
                                        wok wok2 = wok;
                                        if (this.b || errorCode != null) {
                                            j2 = -1;
                                        } else {
                                            wnq.this.h();
                                            wnq.this.i.b();
                                        }
                                    }
                                    aVar = null;
                                    wlw = null;
                                } else {
                                    wlw wlw2 = (wlw) wnq.this.e.removeFirst();
                                    aVar = wnq.b(wnq.this);
                                    wok wok3 = wok;
                                    wlw = wlw2;
                                    j2 = -1;
                                }
                                if (wlw == null || aVar == null) {
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            wnq.this.i.b();
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

        private void a(long j) {
            if (f || !Thread.holdsLock(wnq.this)) {
                wnq.this.d.a(j);
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final void a(wom wom, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            if (f || !Thread.holdsLock(wnq.this)) {
                while (j > 0) {
                    synchronized (wnq.this) {
                        z = this.b;
                        z2 = true;
                        z3 = this.d.b + j > this.e;
                    }
                    if (z3) {
                        wom.i(j);
                        wnq.this.b(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        wom.i(j);
                        return;
                    } else {
                        long a2 = wom.a(this.c, j);
                        if (a2 != -1) {
                            j -= a2;
                            synchronized (wnq.this) {
                                if (this.d.b != 0) {
                                    z2 = false;
                                }
                                this.d.a((wpa) this.c);
                                if (z2) {
                                    wnq.this.notifyAll();
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

        public final wpb a() {
            return wnq.this.i;
        }

        public final void close() {
            long j;
            ArrayList arrayList;
            a aVar;
            synchronized (wnq.this) {
                this.a = true;
                j = this.d.b;
                this.d.r();
                arrayList = null;
                if (wnq.this.e.isEmpty() || wnq.b(wnq.this) == null) {
                    aVar = null;
                } else {
                    arrayList = new ArrayList(wnq.this.e);
                    wnq.this.e.clear();
                    aVar = wnq.b(wnq.this);
                }
                wnq.this.notifyAll();
            }
            if (j > 0) {
                a(j);
            }
            wnq.this.f();
            if (aVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: wnq$c */
    class c extends woi {
        c() {
        }

        public final void a() {
            wnq.this.b(ErrorCode.CANCEL);
        }

        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void b() {
            if (bi_()) {
                throw a(null);
            }
        }
    }

    static /* synthetic */ a b(wnq wnq) {
        return null;
    }

    wnq(int i2, wno wno, boolean z, boolean z2, wlw wlw) {
        if (wno != null) {
            this.c = i2;
            this.d = wno;
            this.b = (long) wno.l.b();
            this.g = new b((long) wno.k.b());
            this.h = new a();
            this.g.b = z2;
            this.h.b = z;
            if (wlw != null) {
                this.e.add(wlw);
            }
            if (b() && wlw != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!b() && wlw == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public final synchronized boolean a() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.b || this.g.a) && ((this.h.b || this.h.a) && this.f)) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        return this.d.a == ((this.c & 1) == 1);
    }

    /* JADX INFO: finally extract failed */
    public final synchronized wlw c() {
        this.i.bh_();
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
        return (wlw) this.e.removeFirst();
    }

    public final woz d() {
        synchronized (this) {
            if (!this.f) {
                if (!b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    public final void a(ErrorCode errorCode) {
        if (d(errorCode)) {
            this.d.b(this.c, errorCode);
        }
    }

    public final void b(ErrorCode errorCode) {
        if (d(errorCode)) {
            this.d.a(this.c, errorCode);
        }
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
    public final synchronized void c(ErrorCode errorCode) {
        if (this.k == null) {
            this.k = errorCode;
            notifyAll();
        }
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
    public final void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
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
