package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: ddz reason: default package */
public class ddz {
    zzbah a;
    volatile deq b;
    volatile zzbah c;

    static {
        dde.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.deq a(defpackage.deq r2) {
        /*
            r1 = this;
            deq r0 = r1.b
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            deq r0 = r1.b     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.b = r2     // Catch:{ zzbbu -> 0x0012 }
            com.google.android.gms.internal.ads.zzbah r0 = com.google.android.gms.internal.ads.zzbah.a     // Catch:{ zzbbu -> 0x0012 }
            r1.c = r0     // Catch:{ zzbbu -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.b = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.ads.zzbah r2 = com.google.android.gms.internal.ads.zzbah.a     // Catch:{ all -> 0x0019 }
            r1.c = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            deq r2 = r1.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddz.a(deq):deq");
    }

    public final int b() {
        if (this.c != null) {
            return this.c.a();
        }
        if (this.b != null) {
            return this.b.j();
        }
        return 0;
    }

    public final zzbah c() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                zzbah zzbah = this.c;
                return zzbah;
            }
            this.c = this.b == null ? zzbah.a : this.b.f();
            zzbah zzbah2 = this.c;
            return zzbah2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddz)) {
            return false;
        }
        ddz ddz = (ddz) obj;
        deq deq = this.b;
        deq deq2 = ddz.b;
        return (deq == null && deq2 == null) ? c().equals(ddz.c()) : (deq == null || deq2 == null) ? deq != null ? deq.equals(ddz.a(deq.m())) : a(deq2.m()).equals(deq2) : deq.equals(deq2);
    }

    public int hashCode() {
        return 1;
    }
}
