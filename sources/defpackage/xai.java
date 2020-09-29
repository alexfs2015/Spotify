package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: xai reason: default package */
public final class xai implements wzp {
    final xah a;
    final xco b = new xco() {
        public final void a() {
            xai.this.c();
        }
    };
    final xaj c;
    final boolean d;
    private xbm e;
    /* access modifiers changed from: private */
    public wzz f;
    private boolean g;

    /* renamed from: xai$a */
    final class a extends xap {
        static final /* synthetic */ boolean b = (!xai.class.desiredAssertionStatus());
        final wzq a;

        a(wzq wzq) {
            super("OkHttp %s", xai.this.e());
            this.a = wzq;
        }

        /* access modifiers changed from: 0000 */
        public final String a() {
            return xai.this.c.a.b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[Catch:{ all -> 0x0022 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ all -> 0x0022 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r7 = this;
                xai r0 = defpackage.xai.this
                xco r0 = r0.b
                r0.bf_()
                r0 = 0
                xai r1 = defpackage.xai.this     // Catch:{ IOException -> 0x0024 }
                xal r0 = r1.f()     // Catch:{ IOException -> 0x0024 }
                r1 = 1
                wzq r2 = r7.a     // Catch:{ IOException -> 0x0020 }
                xai r3 = defpackage.xai.this     // Catch:{ IOException -> 0x0020 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0020 }
                xai r0 = defpackage.xai.this
                xah r0 = r0.a
                wzx r0 = r0.c
            L_0x001c:
                r0.a(r7)
                return
            L_0x0020:
                r0 = move-exception
                goto L_0x0027
            L_0x0022:
                r0 = move-exception
                goto L_0x008e
            L_0x0024:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0027:
                xai r2 = defpackage.xai.this     // Catch:{ all -> 0x0022 }
                java.io.IOException r0 = r2.a(r0)     // Catch:{ all -> 0x0022 }
                if (r1 == 0) goto L_0x0077
                xch r1 = defpackage.xch.c()     // Catch:{ all -> 0x0022 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x0022 }
                xai r4 = defpackage.xai.this     // Catch:{ all -> 0x0022 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
                r5.<init>()     // Catch:{ all -> 0x0022 }
                boolean r6 = r4.d()     // Catch:{ all -> 0x0022 }
                if (r6 == 0) goto L_0x004b
                java.lang.String r6 = "canceled "
                goto L_0x004d
            L_0x004b:
                java.lang.String r6 = ""
            L_0x004d:
                r5.append(r6)     // Catch:{ all -> 0x0022 }
                boolean r6 = r4.d     // Catch:{ all -> 0x0022 }
                if (r6 == 0) goto L_0x0057
                java.lang.String r6 = "web socket"
                goto L_0x0059
            L_0x0057:
                java.lang.String r6 = "call"
            L_0x0059:
                r5.append(r6)     // Catch:{ all -> 0x0022 }
                java.lang.String r6 = " to "
                r5.append(r6)     // Catch:{ all -> 0x0022 }
                java.lang.String r4 = r4.e()     // Catch:{ all -> 0x0022 }
                r5.append(r4)     // Catch:{ all -> 0x0022 }
                java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0022 }
                r3.append(r4)     // Catch:{ all -> 0x0022 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0022 }
                r1.a(r2, r3, r0)     // Catch:{ all -> 0x0022 }
                goto L_0x0087
            L_0x0077:
                xai r1 = defpackage.xai.this     // Catch:{ all -> 0x0022 }
                wzz r1 = r1.f     // Catch:{ all -> 0x0022 }
                r1.c()     // Catch:{ all -> 0x0022 }
                wzq r1 = r7.a     // Catch:{ all -> 0x0022 }
                xai r2 = defpackage.xai.this     // Catch:{ all -> 0x0022 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0022 }
            L_0x0087:
                xai r0 = defpackage.xai.this
                xah r0 = r0.a
                wzx r0 = r0.c
                goto L_0x001c
            L_0x008e:
                xai r1 = defpackage.xai.this
                xah r1 = r1.a
                wzx r1 = r1.c
                r1.a(r7)
                goto L_0x0099
            L_0x0098:
                throw r0
            L_0x0099:
                goto L_0x0098
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xai.a.b():void");
        }
    }

    private xai(xah xah, xaj xaj, boolean z) {
        this.a = xah;
        this.c = xaj;
        this.d = z;
        this.e = new xbm(xah, z);
        this.b.a((long) xah.z, TimeUnit.MILLISECONDS);
    }

    public static xai a(xah xah, xaj xaj, boolean z) {
        xai xai = new xai(xah, xaj, z);
        xai.f = xah.i.a(xai);
        return xai;
    }

    private void g() {
        this.e.b = xch.c().a("response.body().close()");
    }

    /* access modifiers changed from: 0000 */
    public final IOException a(IOException iOException) {
        if (!this.b.bg_()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final xaj a() {
        return this.c;
    }

    public final void a(wzq wzq) {
        synchronized (this) {
            if (!this.g) {
                this.g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        g();
        this.f.a((wzp) this);
        wzx wzx = this.a.c;
        a aVar = new a(wzq);
        synchronized (wzx) {
            wzx.a.add(aVar);
        }
        wzx.b();
    }

    public final xal b() {
        synchronized (this) {
            if (!this.g) {
                this.g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        g();
        this.b.bf_();
        this.f.a((wzp) this);
        try {
            this.a.c.a(this);
            xal f2 = f();
            if (f2 != null) {
                this.a.c.b(this);
                return f2;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            IOException a2 = a(e2);
            this.f.c();
            throw a2;
        } catch (Throwable th) {
            this.a.c.b(this);
            throw th;
        }
    }

    public final void c() {
        xbm xbm = this.e;
        xbm.c = true;
        xbc xbc = xbm.a;
        if (xbc != null) {
            xbc.e();
        }
    }

    public final /* synthetic */ Object clone() {
        return a(this.a, this.c, this.d);
    }

    public final boolean d() {
        return this.e.c;
    }

    /* access modifiers changed from: 0000 */
    public final String e() {
        return this.c.a.i();
    }

    /* access modifiers changed from: 0000 */
    public final xal f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.g);
        arrayList.add(this.e);
        arrayList.add(new xbd(this.a.k));
        arrayList.add(new xar(this.a.a()));
        arrayList.add(new xax(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.h);
        }
        arrayList.add(new xbe(this.d));
        xbj xbj = new xbj(arrayList, null, null, null, 0, this.c, this, this.f, this.a.A, this.a.B, this.a.C);
        xal a2 = xbj.a(this.c);
        if (!this.e.c) {
            return a2;
        }
        xaq.a((Closeable) a2);
        throw new IOException("Canceled");
    }
}
