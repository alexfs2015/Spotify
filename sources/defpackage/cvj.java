package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: cvj reason: default package */
final class cvj implements a, b {
    private cvk a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue<dbr> d;
    private final HandlerThread e = new HandlerThread("GassClient");

    public cvj(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.e.start();
        this.a = new cvk(context, this.e.getLooper(), this, this);
        this.d = new LinkedBlockingQueue<>();
        this.a.l();
    }

    private final cvp b() {
        try {
            return this.a.s();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private final void c() {
        cvk cvk = this.a;
        if (cvk == null) {
            return;
        }
        if (cvk.g() || this.a.h()) {
            this.a.f();
        }
    }

    private static dbr d() {
        dbr dbr = new dbr();
        dbr.k = Long.valueOf(32768);
        return dbr;
    }

    public final dbr a() {
        dbr dbr;
        try {
            dbr = (dbr) this.d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            dbr = null;
        }
        return dbr == null ? d() : dbr;
    }

    public final void a(int i) {
        try {
            this.d.put(d());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        c();
        r3.e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.d.put(d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r4) {
        /*
            r3 = this;
            cvp r4 = r3.b()
            if (r4 == 0) goto L_0x0039
            cvl r0 = new cvl     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            cvn r4 = r4.a(r0)     // Catch:{ all -> 0x0025 }
            dbr r4 = r4.a()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<dbr> r0 = r3.d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.c()
            android.os.HandlerThread r4 = r3.e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<dbr> r4 = r3.d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            dbr r0 = d()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.c()
            android.os.HandlerThread r0 = r3.e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvj.a(android.os.Bundle):void");
    }

    public final void a(ConnectionResult connectionResult) {
        try {
            this.d.put(d());
        } catch (InterruptedException unused) {
        }
    }
}
