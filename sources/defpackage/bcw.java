package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: bcw reason: default package */
public final class bcw implements bce {
    private final Cache a;
    private final bce b;
    private final bce c;
    private final bce d;
    private final bcz e;
    private final a f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private bce j;
    private boolean k;
    private Uri l;
    private Uri m;
    private int n;
    private int o;
    private String p;
    private long q;
    private long r;
    private bda s;
    private boolean t;
    private boolean u;
    private long v;
    private long w;

    /* renamed from: bcw$a */
    public interface a {
    }

    public bcw(Cache cache, bce bce, bce bce2, bcd bcd, int i2, a aVar) {
        this(cache, bce, bce2, bcd, i2, aVar, null);
    }

    private bcw(Cache cache, bce bce, bce bce2, bcd bcd, int i2, a aVar, bcz bcz) {
        this.a = cache;
        this.b = bce2;
        this.e = bdb.a;
        boolean z = false;
        this.g = (i2 & 1) != 0;
        this.h = (i2 & 2) != 0;
        if ((i2 & 4) != 0) {
            z = true;
        }
        this.i = z;
        this.d = bce;
        if (bcd != null) {
            this.c = new bct(bce, bcd);
        } else {
            this.c = null;
        }
        this.f = aVar;
    }

    private void a(IOException iOException) {
        if (g() || (iOException instanceof CacheException)) {
            this.t = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r20) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1.u
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r2
            goto L_0x002f
        L_0x0009:
            boolean r0 = r1.g
            if (r0 == 0) goto L_0x0025
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.a     // Catch:{ InterruptedException -> 0x0018 }
            java.lang.String r3 = r1.p     // Catch:{ InterruptedException -> 0x0018 }
            long r4 = r1.q     // Catch:{ InterruptedException -> 0x0018 }
            bda r0 = r0.a(r3, r4)     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x002f
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0025:
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.a
            java.lang.String r3 = r1.p
            long r4 = r1.q
            bda r0 = r0.b(r3, r4)
        L_0x002f:
            r3 = -1
            if (r0 != 0) goto L_0x0050
            bce r2 = r1.d
            bcg r17 = new bcg
            android.net.Uri r6 = r1.l
            int r7 = r1.n
            r8 = 0
            long r11 = r1.q
            long r13 = r1.r
            java.lang.String r15 = r1.p
            int r9 = r1.o
            r5 = r17
            r16 = r9
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16)
            r6 = r2
        L_0x004d:
            r2 = r0
            goto L_0x00b7
        L_0x0050:
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x007f
            java.io.File r2 = r0.e
            android.net.Uri r6 = android.net.Uri.fromFile(r2)
            long r7 = r1.q
            long r9 = r0.b
            long r9 = r7 - r9
            long r7 = r0.c
            long r7 = r7 - r9
            long r11 = r1.r
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            long r7 = java.lang.Math.min(r7, r11)
        L_0x006d:
            r11 = r7
            bcg r2 = new bcg
            long r7 = r1.q
            java.lang.String r13 = r1.p
            int r14 = r1.o
            r5 = r2
            r5.<init>(r6, r7, r9, r11, r13, r14)
            bce r5 = r1.b
            r6 = r5
            r5 = r2
            goto L_0x004d
        L_0x007f:
            boolean r5 = r0.a()
            if (r5 == 0) goto L_0x0088
            long r5 = r1.r
            goto L_0x0094
        L_0x0088:
            long r5 = r0.c
            long r7 = r1.r
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0094
            long r5 = java.lang.Math.min(r5, r7)
        L_0x0094:
            r15 = r5
            bcg r5 = new bcg
            android.net.Uri r8 = r1.l
            int r9 = r1.n
            r10 = 0
            long r13 = r1.q
            java.lang.String r6 = r1.p
            int r11 = r1.o
            r7 = r5
            r18 = r11
            r11 = r13
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r13, r15, r17, r18)
            bce r6 = r1.c
            if (r6 == 0) goto L_0x00b0
            goto L_0x004d
        L_0x00b0:
            bce r6 = r1.d
            com.google.android.exoplayer2.upstream.cache.Cache r7 = r1.a
            r7.a(r0)
        L_0x00b7:
            boolean r0 = r1.u
            if (r0 != 0) goto L_0x00c6
            bce r0 = r1.d
            if (r6 != r0) goto L_0x00c6
            long r7 = r1.q
            r9 = 102400(0x19000, double:5.05923E-319)
            long r7 = r7 + r9
            goto L_0x00cb
        L_0x00c6:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00cb:
            r1.w = r7
            if (r20 == 0) goto L_0x00ed
            boolean r0 = r19.f()
            defpackage.bdl.b(r0)
            bce r0 = r1.d
            if (r6 != r0) goto L_0x00db
            return
        L_0x00db:
            r19.i()     // Catch:{ all -> 0x00df }
            goto L_0x00ed
        L_0x00df:
            r0 = move-exception
            r3 = r0
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x00ec
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.a
            r0.a(r2)
        L_0x00ec:
            throw r3
        L_0x00ed:
            if (r2 == 0) goto L_0x00f7
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x00f7
            r1.s = r2
        L_0x00f7:
            r1.j = r6
            long r7 = r5.f
            r0 = 1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            r2 = 1
            goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            r1.k = r2
            long r5 = r6.a(r5)
            bdg r2 = new bdg
            r2.<init>()
            boolean r7 = r1.k
            if (r7 == 0) goto L_0x0120
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0120
            r1.r = r5
            long r3 = r1.q
            long r5 = r1.r
            long r3 = r3 + r5
            defpackage.bdf.a(r2, r3)
        L_0x0120:
            boolean r3 = r19.e()
            if (r3 == 0) goto L_0x0144
            bce r3 = r1.j
            android.net.Uri r3 = r3.a()
            r1.m = r3
            android.net.Uri r3 = r1.l
            android.net.Uri r4 = r1.m
            boolean r3 = r3.equals(r4)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x013f
            android.net.Uri r0 = r1.m
            defpackage.bdf.a(r2, r0)
            goto L_0x0144
        L_0x013f:
            java.lang.String r0 = "exo_redir"
            r2.a(r0)
        L_0x0144:
            boolean r0 = r19.h()
            if (r0 == 0) goto L_0x0151
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.a
            java.lang.String r3 = r1.p
            r0.a(r3, r2)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcw.a(boolean):void");
    }

    private void d() {
        this.r = 0;
        if (h()) {
            this.a.c(this.p, this.q);
        }
    }

    private boolean e() {
        return !g();
    }

    private boolean f() {
        return this.j == this.d;
    }

    private boolean g() {
        return this.j == this.b;
    }

    private boolean h() {
        return this.j == this.c;
    }

    private void i() {
        bce bce = this.j;
        if (bce != null) {
            try {
                bce.c();
            } finally {
                this.j = null;
                this.k = false;
                bda bda = this.s;
                if (bda != null) {
                    this.a.a(bda);
                    this.s = null;
                }
            }
        }
    }

    public final int a(byte[] bArr, int i2, int i3) {
        boolean z = false;
        if (i3 == 0) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        try {
            if (this.q >= this.w) {
                a(true);
            }
            int a2 = this.j.a(bArr, i2, i3);
            if (a2 != -1) {
                if (g()) {
                    this.v += (long) a2;
                }
                long j2 = (long) a2;
                this.q += j2;
                if (this.r != -1) {
                    this.r -= j2;
                }
            } else if (this.k) {
                d();
            } else {
                if (this.r <= 0) {
                    if (this.r == -1) {
                    }
                }
                i();
                a(false);
                return a(bArr, i2, i3);
            }
            return a2;
        } catch (IOException e2) {
            if (this.k) {
                Throwable th = e2;
                while (true) {
                    if (th != 0) {
                        if ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 0) {
                            z = true;
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
                if (z) {
                    d();
                    return -1;
                }
            }
            a(e2);
            throw e2;
        }
    }

    public final long a(bcg bcg) {
        try {
            this.p = this.e.buildCacheKey(bcg);
            this.l = bcg.a;
            Cache cache = this.a;
            String str = this.p;
            Uri uri = this.l;
            String a2 = cache.b(str).a("exo_redir", (String) null);
            Uri parse = a2 == null ? null : Uri.parse(a2);
            if (parse == null) {
                parse = uri;
            }
            this.m = parse;
            this.n = bcg.b;
            this.o = bcg.h;
            this.q = bcg.e;
            boolean z = true;
            char c2 = (!this.h || !this.t) ? (!this.i || bcg.f != -1) ? (char) 65535 : 1 : 0;
            if (c2 == 65535) {
                z = false;
            }
            this.u = z;
            if (bcg.f == -1) {
                if (!this.u) {
                    this.r = this.a.a(this.p);
                    if (this.r != -1) {
                        this.r -= bcg.e;
                        if (this.r <= 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    a(false);
                    return this.r;
                }
            }
            this.r = bcg.f;
            a(false);
            return this.r;
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    public final Uri a() {
        return this.m;
    }

    public final void a(bcu bcu) {
        this.b.a(bcu);
        this.d.a(bcu);
    }

    public final Map<String, List<String>> b() {
        return e() ? this.d.b() : CC.$default$b(this);
    }

    public final void c() {
        this.l = null;
        this.m = null;
        this.n = 1;
        if (this.f != null && this.v > 0) {
            this.a.a();
            this.v = 0;
        }
        try {
            i();
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }
}
