package defpackage;

/* renamed from: qt reason: default package */
public final class qt extends ro {
    public int a = 80;
    private float b = 3.0f;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r4 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r4 != false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(android.view.ViewGroup r18, androidx.transition.Transition r19, defpackage.qz r20, defpackage.qz r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            if (r20 != 0) goto L_0x0009
            if (r21 != 0) goto L_0x0009
            return r1
        L_0x0009:
            android.graphics.Rect r3 = r19.e()
            r4 = 1
            if (r21 == 0) goto L_0x001b
            int r5 = b(r20)
            if (r5 != 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r5 = r21
            r6 = 1
            goto L_0x001f
        L_0x001b:
            r5 = -1
            r5 = r20
            r6 = -1
        L_0x001f:
            r7 = 0
            int r8 = defpackage.ro.a(r5, r7)
            int r5 = defpackage.ro.a(r5, r4)
            r9 = 2
            int[] r10 = new int[r9]
            r11 = r18
            r11.getLocationOnScreen(r10)
            r12 = r10[r7]
            float r13 = r18.getTranslationX()
            int r13 = java.lang.Math.round(r13)
            int r12 = r12 + r13
            r10 = r10[r4]
            float r13 = r18.getTranslationY()
            int r13 = java.lang.Math.round(r13)
            int r10 = r10 + r13
            int r13 = r18.getWidth()
            int r13 = r13 + r12
            int r14 = r18.getHeight()
            int r14 = r14 + r10
            if (r3 == 0) goto L_0x0060
            int r9 = r3.centerX()
            int r3 = r3.centerY()
            r16 = r9
            r9 = r3
            r3 = r16
            goto L_0x0067
        L_0x0060:
            int r3 = r12 + r13
            int r3 = r3 / r9
            int r15 = r10 + r14
            int r9 = r15 / 2
        L_0x0067:
            int r15 = r0.a
            r7 = 8388613(0x800005, float:1.175495E-38)
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 3
            if (r15 != r1) goto L_0x0080
            int r15 = defpackage.ip.f(r18)
            if (r15 != r4) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 == 0) goto L_0x007e
        L_0x007c:
            r15 = 5
            goto L_0x008d
        L_0x007e:
            r15 = 3
            goto L_0x008d
        L_0x0080:
            if (r15 != r7) goto L_0x008d
            int r15 = defpackage.ip.f(r18)
            if (r15 != r4) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x007c
            goto L_0x007e
        L_0x008d:
            if (r15 == r2) goto L_0x00b4
            r4 = 5
            if (r15 == r4) goto L_0x00ac
            r4 = 48
            if (r15 == r4) goto L_0x00a4
            r4 = 80
            if (r15 == r4) goto L_0x009c
            r3 = 0
            goto L_0x00bb
        L_0x009c:
            int r5 = r5 - r10
            int r3 = r3 - r8
            int r3 = java.lang.Math.abs(r3)
            int r3 = r3 + r5
            goto L_0x00bb
        L_0x00a4:
            int r14 = r14 - r5
            int r3 = r3 - r8
            int r3 = java.lang.Math.abs(r3)
            int r3 = r3 + r14
            goto L_0x00bb
        L_0x00ac:
            int r8 = r8 - r12
            int r9 = r9 - r5
            int r3 = java.lang.Math.abs(r9)
            int r3 = r3 + r8
            goto L_0x00bb
        L_0x00b4:
            int r13 = r13 - r8
            int r9 = r9 - r5
            int r3 = java.lang.Math.abs(r9)
            int r3 = r3 + r13
        L_0x00bb:
            float r3 = (float) r3
            int r4 = r0.a
            if (r4 == r2) goto L_0x00cc
            r2 = 5
            if (r4 == r2) goto L_0x00cc
            if (r4 == r1) goto L_0x00cc
            if (r4 == r7) goto L_0x00cc
            int r1 = r18.getHeight()
            goto L_0x00d0
        L_0x00cc:
            int r1 = r18.getWidth()
        L_0x00d0:
            float r1 = (float) r1
            float r3 = r3 / r1
            r1 = r19
            long r1 = r1.c
            r4 = 0
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00de
            r1 = 300(0x12c, double:1.48E-321)
        L_0x00de:
            long r4 = (long) r6
            long r1 = r1 * r4
            float r1 = (float) r1
            float r2 = r0.b
            float r1 = r1 / r2
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.a(android.view.ViewGroup, androidx.transition.Transition, qz, qz):long");
    }
}
