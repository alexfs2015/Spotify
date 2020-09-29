package defpackage;

import defpackage.wva;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wva reason: default package */
public abstract class wva<T extends wva<T>> implements wvi<T> {
    private static final AtomicLong a = new AtomicLong();
    private final long b = a.getAndIncrement();
    public final int u;
    public final String v;

    protected wva(int i, String str) {
        this.u = i;
        this.v = str;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=T, code=wva, for r5v0, types: [wva, T] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(defpackage.wva r5) {
        /*
            r4 = this;
            if (r4 != r5) goto L_0x0004
            r5 = 0
            return r5
        L_0x0004:
            int r0 = r4.hashCode()
            int r1 = r5.hashCode()
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            long r0 = r4.b
            long r2 = r5.b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x001a
            r5 = -1
            return r5
        L_0x001a:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            r5 = 1
            return r5
        L_0x0020:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r0 = "failed to compare two different constants"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.compareTo(wva):int");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return this.v;
    }
}
