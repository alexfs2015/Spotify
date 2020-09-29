package defpackage;

import com.google.android.gms.internal.measurement.zzun;

/* renamed from: enx reason: default package */
public class enx {
    zzun a;
    volatile eoo b;
    volatile zzun c;

    static {
        enc.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.eoo a(defpackage.eoo r2) {
        /*
            r1 = this;
            eoo r0 = r1.b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            eoo r0 = r1.b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.b = r2     // Catch:{ zzwe -> 0x0012 }
            com.google.android.gms.internal.measurement.zzun r0 = com.google.android.gms.internal.measurement.zzun.a     // Catch:{ zzwe -> 0x0012 }
            r1.c = r0     // Catch:{ zzwe -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzun r2 = com.google.android.gms.internal.measurement.zzun.a     // Catch:{ all -> 0x001a }
            r1.c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            eoo r2 = r1.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enx.a(eoo):eoo");
    }

    public final int b() {
        if (this.c != null) {
            return this.c.a();
        }
        if (this.b != null) {
            return this.b.h();
        }
        return 0;
    }

    public final zzun c() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                zzun zzun = this.c;
                return zzun;
            }
            if (this.b == null) {
                this.c = zzun.a;
            } else {
                this.c = this.b.d();
            }
            zzun zzun2 = this.c;
            return zzun2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enx)) {
            return false;
        }
        enx enx = (enx) obj;
        eoo eoo = this.b;
        eoo eoo2 = enx.b;
        return (eoo == null && eoo2 == null) ? c().equals(enx.c()) : (eoo == null || eoo2 == null) ? eoo != null ? eoo.equals(enx.a(eoo.k())) : a(eoo2.k()).equals(eoo2) : eoo.equals(eoo2);
    }

    public int hashCode() {
        return 1;
    }
}
