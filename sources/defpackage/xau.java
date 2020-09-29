package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: xau reason: default package */
public final class xau implements Closeable, Flushable {
    private static Pattern k = Pattern.compile("[a-z0-9_-]{1,120}");
    private static /* synthetic */ boolean v = (!xau.class.desiredAssertionStatus());
    final xcb a;
    final File b;
    final int c;
    xcr d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    private final File l;
    private final File m;
    private final File n;
    private final int o;
    private long p;
    private long q = 0;
    private LinkedHashMap<String, b> r = new LinkedHashMap<>(0, 0.75f, true);
    private long s = 0;
    private final Executor t;
    private final Runnable u = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.a.j = true;
            r5.a.d = defpackage.xda.a(defpackage.xda.a());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                xau r0 = defpackage.xau.this
                monitor-enter(r0)
                xau r1 = defpackage.xau.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.g     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                xau r4 = defpackage.xau.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.h     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                xau r1 = defpackage.xau.this     // Catch:{ IOException -> 0x001d }
                r1.c()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                xau r1 = defpackage.xau.this     // Catch:{ all -> 0x0045 }
                r1.i = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                xau r1 = defpackage.xau.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.b()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                xau r1 = defpackage.xau.this     // Catch:{ IOException -> 0x0033 }
                r1.a()     // Catch:{ IOException -> 0x0033 }
                xau r1 = defpackage.xau.this     // Catch:{ IOException -> 0x0033 }
                r1.e = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                xau r1 = defpackage.xau.this     // Catch:{ all -> 0x0045 }
                r1.j = r3     // Catch:{ all -> 0x0045 }
                xau r1 = defpackage.xau.this     // Catch:{ all -> 0x0045 }
                xdf r2 = defpackage.xda.a()     // Catch:{ all -> 0x0045 }
                xcr r2 = defpackage.xda.a(r2)     // Catch:{ all -> 0x0045 }
                r1.d = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.AnonymousClass1.run():void");
        }
    };

    /* renamed from: xau$a */
    public final class a {
        final b a;
        final boolean[] b;
        private boolean d;

        a(b bVar) {
            this.a = bVar;
            this.b = bVar.e ? null : new boolean[xau.this.c];
        }

        public final xdf a(int i) {
            synchronized (xau.this) {
                if (this.d) {
                    throw new IllegalStateException();
                } else if (this.a.f != this) {
                    xdf a2 = xda.a();
                    return a2;
                } else {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    try {
                        AnonymousClass1 r1 = new xav(xau.this.a.b(this.a.d[i])) {
                            /* access modifiers changed from: protected */
                            public final void b() {
                                synchronized (xau.this) {
                                    a.this.a();
                                }
                            }
                        };
                        return r1;
                    } catch (FileNotFoundException unused) {
                        return xda.a();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.a.f == this) {
                for (int i = 0; i < xau.this.c; i++) {
                    try {
                        xau.this.a.d(this.a.d[i]);
                    } catch (IOException unused) {
                    }
                }
                this.a.f = null;
            }
        }

        public final void b() {
            synchronized (xau.this) {
                if (!this.d) {
                    if (this.a.f == this) {
                        xau.this.a(this, true);
                    }
                    this.d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public final void c() {
            synchronized (xau.this) {
                if (!this.d) {
                    if (this.a.f == this) {
                        xau.this.a(this, false);
                    }
                    this.d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: xau$b */
    final class b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;
        long g;

        b(String str) {
            this.a = str;
            this.b = new long[xau.this.c];
            this.c = new File[xau.this.c];
            this.d = new File[xau.this.c];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < xau.this.c; i++) {
                sb.append(i);
                this.c[i] = new File(xau.this.b, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(xau.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        private static IOException b(String[] strArr) {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public final c a() {
            if (Thread.holdsLock(xau.this)) {
                xdg[] xdgArr = new xdg[xau.this.c];
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < xau.this.c) {
                    try {
                        xdgArr[i2] = xau.this.a.a(this.c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < xau.this.c && xdgArr[i] != null) {
                            xaq.a((Closeable) xdgArr[i]);
                            i++;
                        }
                        try {
                            xau.this.a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                c cVar = new c(this.a, this.g, xdgArr, jArr);
                return cVar;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final void a(xcr xcr) {
            for (long n : this.b) {
                xcr.j(32).n(n);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(String[] strArr) {
            if (strArr.length == xau.this.c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }
    }

    /* renamed from: xau$c */
    public final class c implements Closeable {
        public final String a;
        public final long b;
        public final xdg[] c;
        private final long[] e;

        c(String str, long j, xdg[] xdgArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = xdgArr;
            this.e = jArr;
        }

        public final void close() {
            for (xdg a2 : this.c) {
                xaq.a((Closeable) a2);
            }
        }
    }

    private xau(xcb xcb, File file, int i2, int i3, long j2, Executor executor) {
        this.a = xcb;
        this.b = file;
        this.o = i2;
        this.l = new File(file, "journal");
        this.m = new File(file, "journal.tmp");
        this.n = new File(file, "journal.bkp");
        this.c = i3;
        this.p = j2;
        this.t = executor;
    }

    public static xau a(xcb xcb, File file, int i2, int i3, long j2) {
        if (j2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), xaq.a("OkHttp DiskLruCache", true));
            xau xau = new xau(xcb, file, 201105, 2, j2, threadPoolExecutor);
            return xau;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static void c(String str) {
        if (!k.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private synchronized void e() {
        if (!v) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.g) {
            if (this.a.e(this.n)) {
                if (this.a.e(this.l)) {
                    this.a.d(this.n);
                } else {
                    this.a.a(this.n, this.l);
                }
            }
            if (this.a.e(this.l)) {
                try {
                    f();
                    h();
                    this.g = true;
                    return;
                } catch (IOException e2) {
                    xch c2 = xch.c();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.b);
                    sb.append(" is corrupt: ");
                    sb.append(e2.getMessage());
                    sb.append(", removing");
                    c2.a(5, sb.toString(), (Throwable) e2);
                    close();
                    this.a.g(this.b);
                    this.h = false;
                } catch (Throwable th) {
                    this.h = false;
                    throw th;
                }
            }
            a();
            this.g = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:51|52|(1:54)(1:55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10.e = r0 - r10.r.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r1.c() == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r10.d = g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0103 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0120=Splitter:B:58:0x0120, B:51:0x0103=Splitter:B:51:0x0103} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            xcb r1 = r10.a
            java.io.File r2 = r10.l
            xdg r1 = r1.a(r2)
            xcs r1 = defpackage.xda.a(r1)
            java.lang.String r2 = r1.p()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = r1.p()     // Catch:{ all -> 0x014b }
            java.lang.String r4 = r1.p()     // Catch:{ all -> 0x014b }
            java.lang.String r5 = r1.p()     // Catch:{ all -> 0x014b }
            java.lang.String r6 = r1.p()     // Catch:{ all -> 0x014b }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x014b }
            if (r7 == 0) goto L_0x0120
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x014b }
            if (r7 == 0) goto L_0x0120
            int r7 = r10.o     // Catch:{ all -> 0x014b }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x014b }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0120
            int r4 = r10.c     // Catch:{ all -> 0x014b }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x014b }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0120
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.p()     // Catch:{ EOFException -> 0x0103 }
            r3 = 32
            int r4 = r2.indexOf(r3)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r5 = "unexpected journal line: "
            r6 = -1
            if (r4 == r6) goto L_0x00f1
            int r7 = r4 + 1
            int r3 = r2.indexOf(r3, r7)     // Catch:{ EOFException -> 0x0103 }
            if (r3 != r6) goto L_0x007f
            java.lang.String r7 = r2.substring(r7)     // Catch:{ EOFException -> 0x0103 }
            r8 = 6
            if (r4 != r8) goto L_0x0083
            java.lang.String r8 = "REMOVE"
            boolean r8 = r2.startsWith(r8)     // Catch:{ EOFException -> 0x0103 }
            if (r8 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, xau$b> r2 = r10.r     // Catch:{ EOFException -> 0x0103 }
            r2.remove(r7)     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00db
        L_0x007f:
            java.lang.String r7 = r2.substring(r7, r3)     // Catch:{ EOFException -> 0x0103 }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, xau$b> r8 = r10.r     // Catch:{ EOFException -> 0x0103 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ EOFException -> 0x0103 }
            xau$b r8 = (defpackage.xau.b) r8     // Catch:{ EOFException -> 0x0103 }
            if (r8 != 0) goto L_0x0097
            xau$b r8 = new xau$b     // Catch:{ EOFException -> 0x0103 }
            r8.<init>(r7)     // Catch:{ EOFException -> 0x0103 }
            java.util.LinkedHashMap<java.lang.String, xau$b> r9 = r10.r     // Catch:{ EOFException -> 0x0103 }
            r9.put(r7, r8)     // Catch:{ EOFException -> 0x0103 }
        L_0x0097:
            r7 = 5
            if (r3 == r6) goto L_0x00ba
            if (r4 != r7) goto L_0x00ba
            java.lang.String r9 = "CLEAN"
            boolean r9 = r2.startsWith(r9)     // Catch:{ EOFException -> 0x0103 }
            if (r9 == 0) goto L_0x00ba
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ EOFException -> 0x0103 }
            r3 = 1
            r8.e = r3     // Catch:{ EOFException -> 0x0103 }
            r3 = 0
            r8.f = r3     // Catch:{ EOFException -> 0x0103 }
            r8.a(r2)     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00db
        L_0x00ba:
            if (r3 != r6) goto L_0x00ce
            if (r4 != r7) goto L_0x00ce
            java.lang.String r7 = "DIRTY"
            boolean r7 = r2.startsWith(r7)     // Catch:{ EOFException -> 0x0103 }
            if (r7 == 0) goto L_0x00ce
            xau$a r2 = new xau$a     // Catch:{ EOFException -> 0x0103 }
            r2.<init>(r8)     // Catch:{ EOFException -> 0x0103 }
            r8.f = r2     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00db
        L_0x00ce:
            if (r3 != r6) goto L_0x00df
            r3 = 4
            if (r4 != r3) goto L_0x00df
            java.lang.String r3 = "READ"
            boolean r3 = r2.startsWith(r3)     // Catch:{ EOFException -> 0x0103 }
            if (r3 == 0) goto L_0x00df
        L_0x00db:
            int r0 = r0 + 1
            goto L_0x0053
        L_0x00df:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0103 }
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0103 }
            r4.append(r2)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r2 = r4.toString()     // Catch:{ EOFException -> 0x0103 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0103 }
            throw r3     // Catch:{ EOFException -> 0x0103 }
        L_0x00f1:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0103 }
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0103 }
            r4.append(r2)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r2 = r4.toString()     // Catch:{ EOFException -> 0x0103 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0103 }
            throw r3     // Catch:{ EOFException -> 0x0103 }
        L_0x0103:
            java.util.LinkedHashMap<java.lang.String, xau$b> r2 = r10.r     // Catch:{ all -> 0x014b }
            int r2 = r2.size()     // Catch:{ all -> 0x014b }
            int r0 = r0 - r2
            r10.e = r0     // Catch:{ all -> 0x014b }
            boolean r0 = r1.c()     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0116
            r10.a()     // Catch:{ all -> 0x014b }
            goto L_0x011c
        L_0x0116:
            xcr r0 = r10.g()     // Catch:{ all -> 0x014b }
            r10.d = r0     // Catch:{ all -> 0x014b }
        L_0x011c:
            defpackage.xaq.a(r1)
            return
        L_0x0120:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x014b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x014b }
            r7.append(r2)     // Catch:{ all -> 0x014b }
            r7.append(r0)     // Catch:{ all -> 0x014b }
            r7.append(r3)     // Catch:{ all -> 0x014b }
            r7.append(r0)     // Catch:{ all -> 0x014b }
            r7.append(r5)     // Catch:{ all -> 0x014b }
            r7.append(r0)     // Catch:{ all -> 0x014b }
            r7.append(r6)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x014b }
            r4.<init>(r0)     // Catch:{ all -> 0x014b }
            throw r4     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            defpackage.xaq.a(r1)
            goto L_0x0151
        L_0x0150:
            throw r0
        L_0x0151:
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.f():void");
    }

    private xcr g() {
        return xda.a((xdf) new xav(this.a.c(this.l)) {
            private static /* synthetic */ boolean a = (!xau.class.desiredAssertionStatus());

            /* access modifiers changed from: protected */
            public final void b() {
                if (a || Thread.holdsLock(xau.this)) {
                    xau.this.f = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    private void h() {
        this.a.d(this.m);
        Iterator it = this.r.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = 0;
            if (bVar.f == null) {
                while (i2 < this.c) {
                    this.q += bVar.b[i2];
                    i2++;
                }
            } else {
                bVar.f = null;
                while (i2 < this.c) {
                    this.a.d(bVar.c[i2]);
                    this.a.d(bVar.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    private synchronized boolean i() {
        return this.h;
    }

    private synchronized void j() {
        if (i()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.xau.a a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.e()     // Catch:{ all -> 0x0074 }
            r5.j()     // Catch:{ all -> 0x0074 }
            c(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, xau$b> r0 = r5.r     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            xau$b r0 = (defpackage.xau.b) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            xau$a r7 = r0.f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.i     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.j     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            xcr r7 = r5.d     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            xcr r7 = r7.b(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            xcr r7 = r7.j(r8)     // Catch:{ all -> 0x0074 }
            xcr r7 = r7.b(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.j(r8)     // Catch:{ all -> 0x0074 }
            xcr r7 = r5.d     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            xau$b r0 = new xau$b     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, xau$b> r7 = r5.r     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            xau$a r6 = new xau$a     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.t     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.u     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.a(java.lang.String, long):xau$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.xau.c a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.e()     // Catch:{ all -> 0x0050 }
            r3.j()     // Catch:{ all -> 0x0050 }
            c(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, xau$b> r0 = r3.r     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            xau$b r0 = (defpackage.xau.b) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            xau$c r0 = r0.a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.e     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.e = r1     // Catch:{ all -> 0x0050 }
            xcr r1 = r3.d     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            xcr r1 = r1.b(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            xcr r1 = r1.j(r2)     // Catch:{ all -> 0x0050 }
            xcr r4 = r1.b(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.j(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.b()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.t     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.u     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.a(java.lang.String):xau$c");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (this.d != null) {
            this.d.close();
        }
        xcr a2 = xda.a(this.a.b(this.m));
        try {
            a2.b("libcore.io.DiskLruCache").j(10);
            a2.b("1").j(10);
            a2.n((long) this.o).j(10);
            a2.n((long) this.c).j(10);
            a2.j(10);
            for (b bVar : this.r.values()) {
                if (bVar.f != null) {
                    a2.b("DIRTY").j(32);
                    a2.b(bVar.a);
                    a2.j(10);
                } else {
                    a2.b("CLEAN").j(32);
                    a2.b(bVar.a);
                    bVar.a(a2);
                    a2.j(10);
                }
            }
            a2.close();
            if (this.a.e(this.l)) {
                this.a.a(this.l, this.n);
            }
            this.a.a(this.m, this.l);
            this.a.d(this.n);
            this.d = g();
            this.f = false;
            this.j = false;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.xau.a r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            xau$b r0 = r10.a     // Catch:{ all -> 0x00f8 }
            xau$a r1 = r0.f     // Catch:{ all -> 0x00f8 }
            if (r1 != r10) goto L_0x00f2
            r1 = 0
            if (r11 == 0) goto L_0x0044
            boolean r2 = r0.e     // Catch:{ all -> 0x00f8 }
            if (r2 != 0) goto L_0x0044
            r2 = 0
        L_0x000f:
            int r3 = r9.c     // Catch:{ all -> 0x00f8 }
            if (r2 >= r3) goto L_0x0044
            boolean[] r3 = r10.b     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f8 }
            if (r3 == 0) goto L_0x002d
            xcb r3 = r9.a     // Catch:{ all -> 0x00f8 }
            java.io.File[] r4 = r0.d     // Catch:{ all -> 0x00f8 }
            r4 = r4[r2]     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3.e(r4)     // Catch:{ all -> 0x00f8 }
            if (r3 != 0) goto L_0x002a
            r10.c()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.c()     // Catch:{ all -> 0x00f8 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f8 }
            r11.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f8 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x0044:
            int r10 = r9.c     // Catch:{ all -> 0x00f8 }
            if (r1 >= r10) goto L_0x007c
            java.io.File[] r10 = r0.d     // Catch:{ all -> 0x00f8 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x0074
            xcb r2 = r9.a     // Catch:{ all -> 0x00f8 }
            boolean r2 = r2.e(r10)     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x0079
            java.io.File[] r2 = r0.c     // Catch:{ all -> 0x00f8 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f8 }
            xcb r3 = r9.a     // Catch:{ all -> 0x00f8 }
            r3.a(r10, r2)     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.b     // Catch:{ all -> 0x00f8 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f8 }
            xcb r10 = r9.a     // Catch:{ all -> 0x00f8 }
            long r5 = r10.f(r2)     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.b     // Catch:{ all -> 0x00f8 }
            r10[r1] = r5     // Catch:{ all -> 0x00f8 }
            long r7 = r9.q     // Catch:{ all -> 0x00f8 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.q = r7     // Catch:{ all -> 0x00f8 }
            goto L_0x0079
        L_0x0074:
            xcb r2 = r9.a     // Catch:{ all -> 0x00f8 }
            r2.d(r10)     // Catch:{ all -> 0x00f8 }
        L_0x0079:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x007c:
            int r10 = r9.e     // Catch:{ all -> 0x00f8 }
            r1 = 1
            int r10 = r10 + r1
            r9.e = r10     // Catch:{ all -> 0x00f8 }
            r10 = 0
            r0.f = r10     // Catch:{ all -> 0x00f8 }
            boolean r10 = r0.e     // Catch:{ all -> 0x00f8 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b8
            r0.e = r1     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "CLEAN"
            xcr r10 = r10.b(r1)     // Catch:{ all -> 0x00f8 }
            r10.j(r3)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x00f8 }
            r10.b(r1)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            r0.a(r10)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            r10.j(r2)     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x00d6
            long r10 = r9.s     // Catch:{ all -> 0x00f8 }
            r1 = 1
            long r1 = r1 + r10
            r9.s = r1     // Catch:{ all -> 0x00f8 }
            r0.g = r10     // Catch:{ all -> 0x00f8 }
            goto L_0x00d6
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, xau$b> r10 = r9.r     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00f8 }
            r10.remove(r11)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = "REMOVE"
            xcr r10 = r10.b(r11)     // Catch:{ all -> 0x00f8 }
            r10.j(r3)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00f8 }
            r10.b(r11)     // Catch:{ all -> 0x00f8 }
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            r10.j(r2)     // Catch:{ all -> 0x00f8 }
        L_0x00d6:
            xcr r10 = r9.d     // Catch:{ all -> 0x00f8 }
            r10.flush()     // Catch:{ all -> 0x00f8 }
            long r10 = r9.q     // Catch:{ all -> 0x00f8 }
            long r0 = r9.p     // Catch:{ all -> 0x00f8 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e9
            boolean r10 = r9.b()     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00f0
        L_0x00e9:
            java.util.concurrent.Executor r10 = r9.t     // Catch:{ all -> 0x00f8 }
            java.lang.Runnable r11 = r9.u     // Catch:{ all -> 0x00f8 }
            r10.execute(r11)     // Catch:{ all -> 0x00f8 }
        L_0x00f0:
            monitor-exit(r9)
            return
        L_0x00f2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            r10.<init>()     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00fc
        L_0x00fb:
            throw r10
        L_0x00fc:
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.a(xau$a, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(b bVar) {
        if (bVar.f != null) {
            bVar.f.a();
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            this.a.d(bVar.c[i2]);
            this.q -= bVar.b[i2];
            bVar.b[i2] = 0;
        }
        this.e++;
        this.d.b("REMOVE").j(32).b(bVar.a).j(10);
        this.r.remove(bVar.a);
        if (b()) {
            this.t.execute(this.u);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        int i2 = this.e;
        return i2 >= 2000 && i2 >= this.r.size();
    }

    public final synchronized boolean b(String str) {
        e();
        j();
        c(str);
        b bVar = (b) this.r.get(str);
        if (bVar == null) {
            return false;
        }
        a(bVar);
        if (this.q <= this.p) {
            this.i = false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        while (this.q > this.p) {
            a((b) this.r.values().iterator().next());
        }
        this.i = false;
    }

    public final synchronized void close() {
        b[] bVarArr;
        if (this.g) {
            if (!this.h) {
                for (b bVar : (b[]) this.r.values().toArray(new b[this.r.size()])) {
                    if (bVar.f != null) {
                        bVar.f.c();
                    }
                }
                c();
                this.d.close();
                this.d = null;
                this.h = true;
                return;
            }
        }
        this.h = true;
    }

    public final synchronized void d() {
        e();
        for (b a2 : (b[]) this.r.values().toArray(new b[this.r.size()])) {
            a(a2);
        }
        this.i = false;
    }

    public final synchronized void flush() {
        if (this.g) {
            j();
            c();
            this.d.flush();
        }
    }
}
