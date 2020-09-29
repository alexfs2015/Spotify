package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bth reason: default package */
public final class bth implements bue {
    final buf a;
    boolean b = false;

    public bth(buf buf) {
        this.a = buf;
    }

    public final void a() {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bsc<?> bsc, boolean z) {
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t) {
        return b(t);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [bsc$b] */
    /* JADX WARNING: type inference failed for: r0v11, types: [bsc$h<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends defpackage.bsc.b, T extends defpackage.bsr.a<? extends defpackage.bsl, A>> T b(T r4) {
        /*
            r3 = this;
            buf r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            btw r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            bvd r0 = r0.e     // Catch:{ DeadObjectException -> 0x0045 }
            r0.a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            buf r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            btw r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            bsc$c<A> r1 = r4.b     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<bsc$c<?>, bsc$f> r0 = r0.b     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            bsc$f r0 = (defpackage.bsc.f) r0     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r1 = "Appropriate Api was not requested."
            defpackage.bwx.a(r0, r1)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r0.g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 != 0) goto L_0x0039
            buf r1 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<bsc$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.g     // Catch:{ DeadObjectException -> 0x0045 }
            bsc$c<A> r2 = r4.b     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r1 = r0 instanceof defpackage.bxc     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            bxc r0 = (defpackage.bxc) r0     // Catch:{ DeadObjectException -> 0x0045 }
            bsc$h<T> r0 = r0.a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            buf r0 = r3.a
            bti r1 = new bti
            r1.<init>(r3, r3)
            r0.a(r1)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bth.b(bsr$a):bsr$a");
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.m.m()) {
            this.b = true;
            for (bvc bvc : this.a.m.d) {
                bvc.a = null;
            }
            return false;
        }
        this.a.a((ConnectionResult) null);
        return true;
    }

    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.a((bug) new btj(this, this));
        }
    }

    public final void a(int i) {
        this.a.a((ConnectionResult) null);
        this.a.n.a(i, this.b);
    }
}
