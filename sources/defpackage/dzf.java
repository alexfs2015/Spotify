package defpackage;

@cey
/* renamed from: dzf reason: default package */
final class dzf {
    private static final dzc a = dzc.a();
    private static final float b = ((Float) dpn.f().a(dsp.bd)).floatValue();
    private static final long c = ((Long) dpn.f().a(dsp.bb)).longValue();
    private static final float d = ((Float) dpn.f().a(dsp.be)).floatValue();
    private static final long e = ((Long) dpn.f().a(dsp.bc)).longValue();

    private static int a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a() {
        /*
            dzc r0 = a
            int r0 = r0.d
            dzc r1 = a
            int r1 = r1.e
            dzc r2 = a
            int r2 = r2.c
            dzc r3 = a
            int r3 = r3.b
            int r2 = r2 + r3
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r7 = 0
            r8 = 16
            if (r0 >= r8) goto L_0x0027
            long r9 = e
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0027
            int r9 = a(r9, r0)
            goto L_0x0036
        L_0x0027:
            float r9 = d
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0033
            float r10 = (float) r0
            float r9 = r9 * r10
            int r9 = (int) r9
            int r9 = r9 + r3
            goto L_0x0036
        L_0x0033:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x0036:
            if (r1 > r9) goto L_0x0052
            if (r0 >= r8) goto L_0x0045
            long r8 = c
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0045
            int r4 = a(r8, r0)
            goto L_0x004f
        L_0x0045:
            float r1 = b
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            float r0 = (float) r0
            float r1 = r1 * r0
            int r4 = (int) r1
        L_0x004f:
            if (r2 > r4) goto L_0x0052
            return r3
        L_0x0052:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzf.a():boolean");
    }
}
