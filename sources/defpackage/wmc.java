package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: wmc reason: default package */
public final class wmc implements wlj {
    final wmb a;
    final woi b = new woi() {
        public final void a() {
            wmc.this.c();
        }
    };
    final wmd c;
    final boolean d;
    private wng e;
    /* access modifiers changed from: private */
    public wlt f;
    private boolean g;

    /* renamed from: wmc$a */
    final class a extends wmj {
        static final /* synthetic */ boolean b = (!wmc.class.desiredAssertionStatus());
        final wlk a;

        a(wlk wlk) {
            super("OkHttp %s", wmc.this.e());
            this.a = wlk;
        }

        /* access modifiers changed from: 0000 */
        public final String a() {
            return wmc.this.c.a.b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[Catch:{ all -> 0x0022 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ all -> 0x0022 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r7 = this;
                wmc r0 = defpackage.wmc.this
                woi r0 = r0.b
                r0.bh_()
                r0 = 0
                wmc r1 = defpackage.wmc.this     // Catch:{ IOException -> 0x0024 }
                wmf r0 = r1.f()     // Catch:{ IOException -> 0x0024 }
                r1 = 1
                wlk r2 = r7.a     // Catch:{ IOException -> 0x0020 }
                wmc r3 = defpackage.wmc.this     // Catch:{ IOException -> 0x0020 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0020 }
                wmc r0 = defpackage.wmc.this
                wmb r0 = r0.a
                wlr r0 = r0.c
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
                wmc r2 = defpackage.wmc.this     // Catch:{ all -> 0x0022 }
                java.io.IOException r0 = r2.a(r0)     // Catch:{ all -> 0x0022 }
                if (r1 == 0) goto L_0x0077
                wob r1 = defpackage.wob.c()     // Catch:{ all -> 0x0022 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x0022 }
                wmc r4 = defpackage.wmc.this     // Catch:{ all -> 0x0022 }
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
                wmc r1 = defpackage.wmc.this     // Catch:{ all -> 0x0022 }
                wlt r1 = r1.f     // Catch:{ all -> 0x0022 }
                r1.c()     // Catch:{ all -> 0x0022 }
                wlk r1 = r7.a     // Catch:{ all -> 0x0022 }
                wmc r2 = defpackage.wmc.this     // Catch:{ all -> 0x0022 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0022 }
            L_0x0087:
                wmc r0 = defpackage.wmc.this
                wmb r0 = r0.a
                wlr r0 = r0.c
                goto L_0x001c
            L_0x008e:
                wmc r1 = defpackage.wmc.this
                wmb r1 = r1.a
                wlr r1 = r1.c
                r1.a(r7)
                goto L_0x0099
            L_0x0098:
                throw r0
            L_0x0099:
                goto L_0x0098
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wmc.a.b():void");
        }
    }

    private wmc(wmb wmb, wmd wmd, boolean z) {
        this.a = wmb;
        this.c = wmd;
        this.d = z;
        this.e = new wng(wmb, z);
        this.b.a((long) wmb.z, TimeUnit.MILLISECONDS);
    }

    public static wmc a(wmb wmb, wmd wmd, boolean z) {
        wmc wmc = new wmc(wmb, wmd, z);
        wmc.f = wmb.i.a(wmc);
        return wmc;
    }

    public final wmd a() {
        return this.c;
    }

    public final wmf b() {
        synchronized (this) {
            if (!this.g) {
                this.g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        g();
        this.b.bh_();
        this.f.a((wlj) this);
        try {
            this.a.c.a(this);
            wmf f2 = f();
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

    /* access modifiers changed from: 0000 */
    public final IOException a(IOException iOException) {
        if (!this.b.bi_()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void g() {
        this.e.b = wob.c().a("response.body().close()");
    }

    public final void a(wlk wlk) {
        synchronized (this) {
            if (!this.g) {
                this.g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        g();
        this.f.a((wlj) this);
        wlr wlr = this.a.c;
        a aVar = new a(wlk);
        synchronized (wlr) {
            wlr.a.add(aVar);
        }
        wlr.b();
    }

    public final void c() {
        wng wng = this.e;
        wng.c = true;
        wmw wmw = wng.a;
        if (wmw != null) {
            wmw.e();
        }
    }

    public final boolean d() {
        return this.e.c;
    }

    /* access modifiers changed from: 0000 */
    public final String e() {
        return this.c.a.i();
    }

    /* access modifiers changed from: 0000 */
    public final wmf f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.g);
        arrayList.add(this.e);
        arrayList.add(new wmx(this.a.k));
        arrayList.add(new wml(this.a.a()));
        arrayList.add(new wmr(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.h);
        }
        arrayList.add(new wmy(this.d));
        wnd wnd = new wnd(arrayList, null, null, null, 0, this.c, this, this.f, this.a.A, this.a.B, this.a.C);
        wmf a2 = wnd.a(this.c);
        if (!this.e.c) {
            return a2;
        }
        wmk.a((Closeable) a2);
        throw new IOException("Canceled");
    }

    public final /* synthetic */ Object clone() {
        return a(this.a, this.c, this.d);
    }
}
