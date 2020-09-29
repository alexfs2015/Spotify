package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: ddi reason: default package */
public class ddi {
    zzbah a;
    volatile ddz b;
    volatile zzbah c;

    static {
        dcn.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ddz a(defpackage.ddz r2) {
        /*
            r1 = this;
            ddz r0 = r1.b
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            ddz r0 = r1.b     // Catch:{ all -> 0x0019 }
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
            ddz r2 = r1.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.a(ddz):ddz");
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
        if (!(obj instanceof ddi)) {
            return false;
        }
        ddi ddi = (ddi) obj;
        ddz ddz = this.b;
        ddz ddz2 = ddi.b;
        return (ddz == null && ddz2 == null) ? c().equals(ddi.c()) : (ddz == null || ddz2 == null) ? ddz != null ? ddz.equals(ddi.a(ddz.m())) : a(ddz2.m()).equals(ddz2) : ddz.equals(ddz2);
    }

    public int hashCode() {
        return 1;
    }
}
