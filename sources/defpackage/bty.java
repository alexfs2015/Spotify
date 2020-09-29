package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bty reason: default package */
public final class bty implements buv {
    final buw a;
    boolean b = false;

    public bty(buw buw) {
        this.a = buw;
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t) {
        return b(t);
    }

    public final void a() {
    }

    public final void a(int i) {
        this.a.a((ConnectionResult) null);
        this.a.n.a(i, this.b);
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bst<?> bst, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [bst$b] */
    /* JADX WARNING: type inference failed for: r0v11, types: [bst$h<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends defpackage.bst.b, T extends defpackage.bti.a<? extends defpackage.btc, A>> T b(T r4) {
        /*
            r3 = this;
            buw r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            bun r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            bvu r0 = r0.e     // Catch:{ DeadObjectException -> 0x0045 }
            r0.a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            buw r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            bun r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            bst$c<A> r1 = r4.b     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<bst$c<?>, bst$f> r0 = r0.b     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            bst$f r0 = (defpackage.bst.f) r0     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r1 = "Appropriate Api was not requested."
            defpackage.bxo.a(r0, r1)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r0.g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 != 0) goto L_0x0039
            buw r1 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<bst$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.g     // Catch:{ DeadObjectException -> 0x0045 }
            bst$c<A> r2 = r4.b     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r1 = r0 instanceof defpackage.bxt     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            bxt r0 = (defpackage.bxt) r0     // Catch:{ DeadObjectException -> 0x0045 }
            bst$h<T> r0 = r0.a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            buw r0 = r3.a
            btz r1 = new btz
            r1.<init>(r3, r3)
            r0.a(r1)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bty.b(bti$a):bti$a");
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.m.m()) {
            this.b = true;
            for (bvt bvt : this.a.m.d) {
                bvt.a = null;
            }
            return false;
        }
        this.a.a((ConnectionResult) null);
        return true;
    }

    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.a((bux) new bua(this, this));
        }
    }
}
