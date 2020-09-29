package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* renamed from: eia reason: default package */
public final class eia {
    static final Object b = new Object();
    private static final ehw g = new ehw("RequestTracker", 0);
    long a = -1;
    private long c;
    private final Handler d = new eig(Looper.getMainLooper());
    private eib e;
    private Runnable f;

    public eia(long j) {
        this.c = j;
    }

    public final void a(long j, eib eib) {
        eib eib2;
        long j2;
        synchronized (b) {
            eib2 = this.e;
            j2 = this.a;
            this.a = j;
            this.e = eib;
        }
        if (eib2 != null) {
            eib2.a(j2);
        }
        synchronized (b) {
            if (this.f != null) {
                this.d.removeCallbacks(this.f);
            }
            this.f = new eid(this);
            this.d.postDelayed(this.f, this.c);
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (b) {
            z = this.a != -1;
        }
        return z;
    }

    public final boolean a(long j) {
        boolean z;
        synchronized (b) {
            z = this.a != -1 && this.a == j;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r8, int r10, java.lang.Object r11) {
        /*
            r7 = this;
            java.lang.Object r0 = b
            monitor-enter(r0)
            long r1 = r7.a     // Catch:{ all -> 0x002a }
            r3 = -1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0028
            long r1 = r7.a     // Catch:{ all -> 0x002a }
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "request %d completed"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x002a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x002a }
            r4[r5] = r8     // Catch:{ all -> 0x002a }
            java.lang.String r8 = java.lang.String.format(r1, r2, r4)     // Catch:{ all -> 0x002a }
            r7.a(r10, r11, r8)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r3
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r5
        L_0x002a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eia.a(long, int, java.lang.Object):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i) {
        synchronized (b) {
            if (this.a == -1) {
                return false;
            }
            a(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(this.a)}));
            return true;
        }
    }

    private final void a(int i, Object obj, String str) {
        g.a(str, new Object[0]);
        synchronized (b) {
            if (this.e != null) {
                this.e.a(this.a, i, obj);
            }
            this.a = -1;
            this.e = null;
            synchronized (b) {
                if (this.f != null) {
                    this.d.removeCallbacks(this.f);
                    this.f = null;
                }
            }
        }
    }
}
