package defpackage;

import java.security.MessageDigest;

@cfp
/* renamed from: dne reason: default package */
public final class dne extends dmv {
    private MessageDigest b;
    private final int c;
    private final int d;

    public dne(int i) {
        int i2 = i / 8;
        if (i % 8 > 0) {
            i2++;
        }
        this.c = i2;
        this.d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            java.security.MessageDigest r1 = r8.a()     // Catch:{ all -> 0x006c }
            r8.b = r1     // Catch:{ all -> 0x006c }
            java.security.MessageDigest r1 = r8.b     // Catch:{ all -> 0x006c }
            r2 = 0
            if (r1 != 0) goto L_0x0012
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return r9
        L_0x0012:
            java.security.MessageDigest r1 = r8.b     // Catch:{ all -> 0x006c }
            r1.reset()     // Catch:{ all -> 0x006c }
            java.security.MessageDigest r1 = r8.b     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x006c }
            byte[] r9 = r9.getBytes(r3)     // Catch:{ all -> 0x006c }
            r1.update(r9)     // Catch:{ all -> 0x006c }
            java.security.MessageDigest r9 = r8.b     // Catch:{ all -> 0x006c }
            byte[] r9 = r9.digest()     // Catch:{ all -> 0x006c }
            int r1 = r9.length     // Catch:{ all -> 0x006c }
            int r3 = r8.c     // Catch:{ all -> 0x006c }
            if (r1 <= r3) goto L_0x0034
            int r1 = r8.c     // Catch:{ all -> 0x006c }
            goto L_0x0035
        L_0x0034:
            int r1 = r9.length     // Catch:{ all -> 0x006c }
        L_0x0035:
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x006c }
            int r3 = r1.length     // Catch:{ all -> 0x006c }
            java.lang.System.arraycopy(r9, r2, r1, r2, r3)     // Catch:{ all -> 0x006c }
            int r9 = r8.d     // Catch:{ all -> 0x006c }
            r3 = 8
            int r9 = r9 % r3
            if (r9 <= 0) goto L_0x006a
            r4 = 0
        L_0x0044:
            int r9 = r1.length     // Catch:{ all -> 0x006c }
            if (r2 >= r9) goto L_0x0053
            if (r2 <= 0) goto L_0x004a
            long r4 = r4 << r3
        L_0x004a:
            byte r9 = r1[r2]     // Catch:{ all -> 0x006c }
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r6 = (long) r9     // Catch:{ all -> 0x006c }
            long r4 = r4 + r6
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0053:
            int r9 = r8.d     // Catch:{ all -> 0x006c }
            int r9 = r9 % r3
            int r9 = 8 - r9
            long r4 = r4 >>> r9
            int r9 = r8.c     // Catch:{ all -> 0x006c }
            int r9 = r9 + -1
        L_0x005d:
            if (r9 < 0) goto L_0x006a
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r4
            int r2 = (int) r6     // Catch:{ all -> 0x006c }
            byte r2 = (byte) r2     // Catch:{ all -> 0x006c }
            r1[r9] = r2     // Catch:{ all -> 0x006c }
            long r4 = r4 >>> r3
            int r9 = r9 + -1
            goto L_0x005d
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return r1
        L_0x006c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006f:
            throw r9
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dne.a(java.lang.String):byte[]");
    }
}
