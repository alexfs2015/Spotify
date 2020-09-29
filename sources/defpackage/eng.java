package defpackage;

import com.google.android.gms.internal.measurement.zzun;

/* renamed from: eng reason: default package */
public class eng {
    zzun a;
    volatile enx b;
    volatile zzun c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eng)) {
            return false;
        }
        eng eng = (eng) obj;
        enx enx = this.b;
        enx enx2 = eng.b;
        if (enx == null && enx2 == null) {
            return c().equals(eng.c());
        }
        if (enx != null && enx2 != null) {
            return enx.equals(enx2);
        }
        if (enx != null) {
            return enx.equals(eng.a(enx.k()));
        }
        return a(enx2.k()).equals(enx2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.enx a(defpackage.enx r2) {
        /*
            r1 = this;
            enx r0 = r1.b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            enx r0 = r1.b     // Catch:{ all -> 0x001a }
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
            enx r2 = r1.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eng.a(enx):enx");
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

    static {
        eml.a();
    }
}
