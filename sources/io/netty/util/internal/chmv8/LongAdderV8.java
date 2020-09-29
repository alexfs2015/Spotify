package io.netty.util.internal.chmv8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LongAdderV8 extends Striped64 implements Serializable, wxk {
    private static final long serialVersionUID = 7249069246863182397L;

    private long d() {
        long j = this.e;
        a[] aVarArr = this.d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.a;
                }
            }
        }
        return j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f = 0;
        this.d = null;
        this.e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(d());
    }

    /* access modifiers changed from: 0000 */
    public final long a(long j, long j2) {
        return j + j2;
    }

    public final void a() {
        a(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (b(r4, r4 + r2) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b6, code lost:
        if (r1.d != r9) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b8, code lost:
        r8 = new io.netty.util.internal.chmv8.Striped64.a[(r10 << 1)];
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bd, code lost:
        if (r11 >= r10) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bf, code lost:
        r8[r11] = r9[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c6, code lost:
        r1.d = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0054 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            io.netty.util.internal.chmv8.Striped64$a[] r0 = r1.d
            if (r0 != 0) goto L_0x0012
            long r4 = r1.e
            long r6 = r4 + r2
            boolean r4 = r1.b(r4, r6)
            if (r4 != 0) goto L_0x0115
        L_0x0012:
            java.lang.ThreadLocal r4 = a
            java.lang.Object r4 = r4.get()
            int[] r4 = (int[]) r4
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0036
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0036
            int r7 = r7 - r5
            r8 = r4[r6]
            r7 = r7 & r8
            r0 = r0[r7]
            if (r0 == 0) goto L_0x0036
            long r7 = r0.a
            long r9 = r7 + r2
            boolean r0 = r0.a(r7, r9)
            if (r0 != 0) goto L_0x0115
            goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r4 != 0) goto L_0x0051
            java.lang.ThreadLocal<int[]> r4 = io.netty.util.internal.chmv8.Striped64.a
            int[] r7 = new int[r5]
            r4.set(r7)
            java.util.Random r4 = io.netty.util.internal.chmv8.Striped64.b
            int r4 = r4.nextInt()
            if (r4 != 0) goto L_0x0049
            r4 = 1
        L_0x0049:
            r7[r6] = r4
            r16 = r7
            r7 = r4
            r4 = r16
            goto L_0x0053
        L_0x0051:
            r7 = r4[r6]
        L_0x0053:
            r8 = 0
        L_0x0054:
            io.netty.util.internal.chmv8.Striped64$a[] r9 = r1.d
            if (r9 == 0) goto L_0x00dc
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00dc
            int r11 = r10 + -1
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L_0x008f
            int r9 = r1.f
            io.netty.util.internal.chmv8.Striped64$a r9 = new io.netty.util.internal.chmv8.Striped64$a
            r9.<init>(r2)
            int r10 = r1.f
            boolean r10 = r17.b()
            if (r10 == 0) goto L_0x008d
            io.netty.util.internal.chmv8.Striped64$a[] r10 = r1.d     // Catch:{ all -> 0x0089 }
            if (r10 == 0) goto L_0x0083
            int r11 = r10.length     // Catch:{ all -> 0x0089 }
            if (r11 <= 0) goto L_0x0083
            int r11 = r11 + -1
            r11 = r11 & r7
            r12 = r10[r11]     // Catch:{ all -> 0x0089 }
            if (r12 != 0) goto L_0x0083
            r10[r11] = r9     // Catch:{ all -> 0x0089 }
            r9 = 1
            goto L_0x0084
        L_0x0083:
            r9 = 0
        L_0x0084:
            r1.f = r6
            if (r9 == 0) goto L_0x0054
            return
        L_0x0089:
            r0 = move-exception
            r1.f = r6
            throw r0
        L_0x008d:
            r8 = 0
            goto L_0x00cf
        L_0x008f:
            if (r0 != 0) goto L_0x0093
            r0 = 1
            goto L_0x00cf
        L_0x0093:
            long r12 = r11.a
            long r14 = r1.a(r12, r2)
            boolean r11 = r11.a(r12, r14)
            if (r11 != 0) goto L_0x0115
            int r11 = io.netty.util.internal.chmv8.Striped64.c
            if (r10 >= r11) goto L_0x008d
            io.netty.util.internal.chmv8.Striped64$a[] r11 = r1.d
            if (r11 == r9) goto L_0x00a8
            goto L_0x008d
        L_0x00a8:
            if (r8 != 0) goto L_0x00ac
            r8 = 1
            goto L_0x00cf
        L_0x00ac:
            int r11 = r1.f
            boolean r11 = r17.b()
            if (r11 == 0) goto L_0x00cf
            io.netty.util.internal.chmv8.Striped64$a[] r8 = r1.d     // Catch:{ all -> 0x00cb }
            if (r8 != r9) goto L_0x00c8
            int r8 = r10 << 1
            io.netty.util.internal.chmv8.Striped64$a[] r8 = new io.netty.util.internal.chmv8.Striped64.a[r8]     // Catch:{ all -> 0x00cb }
            r11 = 0
        L_0x00bd:
            if (r11 >= r10) goto L_0x00c6
            r12 = r9[r11]     // Catch:{ all -> 0x00cb }
            r8[r11] = r12     // Catch:{ all -> 0x00cb }
            int r11 = r11 + 1
            goto L_0x00bd
        L_0x00c6:
            r1.d = r8     // Catch:{ all -> 0x00cb }
        L_0x00c8:
            r1.f = r6
            goto L_0x0053
        L_0x00cb:
            r0 = move-exception
            r1.f = r6
            throw r0
        L_0x00cf:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r4[r6] = r7
            goto L_0x0054
        L_0x00dc:
            int r10 = r1.f
            io.netty.util.internal.chmv8.Striped64$a[] r10 = r1.d
            if (r10 != r9) goto L_0x0107
            boolean r10 = r17.b()
            if (r10 == 0) goto L_0x0107
            io.netty.util.internal.chmv8.Striped64$a[] r10 = r1.d     // Catch:{ all -> 0x0103 }
            if (r10 != r9) goto L_0x00fc
            r9 = 2
            io.netty.util.internal.chmv8.Striped64$a[] r9 = new io.netty.util.internal.chmv8.Striped64.a[r9]     // Catch:{ all -> 0x0103 }
            r10 = r7 & 1
            io.netty.util.internal.chmv8.Striped64$a r11 = new io.netty.util.internal.chmv8.Striped64$a     // Catch:{ all -> 0x0103 }
            r11.<init>(r2)     // Catch:{ all -> 0x0103 }
            r9[r10] = r11     // Catch:{ all -> 0x0103 }
            r1.d = r9     // Catch:{ all -> 0x0103 }
            r9 = 1
            goto L_0x00fd
        L_0x00fc:
            r9 = 0
        L_0x00fd:
            r1.f = r6
            if (r9 != 0) goto L_0x0115
            goto L_0x0054
        L_0x0103:
            r0 = move-exception
            r1.f = r6
            throw r0
        L_0x0107:
            long r9 = r1.e
            long r11 = r1.a(r9, r2)
            boolean r9 = r1.b(r9, r11)
            if (r9 != 0) goto L_0x0115
            goto L_0x0054
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.LongAdderV8.a(long):void");
    }

    public double doubleValue() {
        return (double) d();
    }

    public float floatValue() {
        return (float) d();
    }

    public int intValue() {
        return (int) d();
    }

    public long longValue() {
        return d();
    }

    public String toString() {
        return Long.toString(d());
    }
}
