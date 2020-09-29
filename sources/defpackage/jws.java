package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: jws reason: default package */
public final class jws implements Iterable<jwx> {
    private final Deque<jwx> a = new ArrayDeque();
    private final int b;
    private final int c;

    public jws(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jwx a(long r7) {
        /*
            r6 = this;
            java.util.Deque<jwx> r0 = r6.a
            int r0 = r0.size()
            int r1 = r6.c
            if (r0 < r1) goto L_0x0013
            java.util.Deque<jwx> r0 = r6.a
            java.lang.Object r0 = r0.removeFirst()
            jwx r0 = (defpackage.jwx) r0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.util.Deque<jwx> r1 = r6.a
            java.lang.Object r1 = r1.peekFirst()
            jwx r1 = (defpackage.jwx) r1
            if (r1 == 0) goto L_0x0032
            long r1 = r1.a
            int r3 = r6.b
            long r3 = (long) r3
            long r3 = r7 - r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0032
            java.util.Deque<jwx> r0 = r6.a
            java.lang.Object r0 = r0.removeFirst()
            jwx r0 = (defpackage.jwx) r0
            goto L_0x0014
        L_0x0032:
            if (r0 != 0) goto L_0x0039
            jwx r0 = new jwx
            r0.<init>()
        L_0x0039:
            r0.a = r7
            java.util.Deque<jwx> r7 = r6.a
            r7.addLast(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jws.a(long):jwx");
    }

    public final Iterator<jwx> iterator() {
        return this.a.iterator();
    }
}
