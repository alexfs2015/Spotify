package defpackage;

/* renamed from: avx reason: default package */
public final class avx implements awi {
    private final avp a;
    private final bdz b = new bdz(new byte[10]);
    private int c = 0;
    private int d;
    private bek e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public avx(avp avp) {
        this.a = avp;
    }

    private void a(int i2) {
        this.c = i2;
        this.d = 0;
    }

    private boolean a(bea bea, byte[] bArr, int i2) {
        int min = Math.min(bea.b(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            bea.d(min);
        } else {
            bea.a(bArr, this.d, min);
        }
        this.d += min;
        return this.d == i2;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c5 A[SYNTHETIC] */
    public final void a(defpackage.bea r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "PesReader"
            r1 = 2
            r2 = -1
            r3 = 3
            r4 = 1
            if (r15 == 0) goto L_0x0041
            int r15 = r13.c
            if (r15 == 0) goto L_0x003f
            if (r15 == r4) goto L_0x003f
            if (r15 == r1) goto L_0x003a
            if (r15 != r3) goto L_0x0034
            int r15 = r13.j
            if (r15 == r2) goto L_0x002e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected start indicator: expected "
            r15.<init>(r5)
            int r5 = r13.j
            r15.append(r5)
            java.lang.String r5 = " more bytes"
            r15.append(r5)
            java.lang.String r15 = r15.toString()
            defpackage.bdu.c(r0, r15)
        L_0x002e:
            avp r15 = r13.a
            r15.b()
            goto L_0x003f
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x003a:
            java.lang.String r15 = "Unexpected start indicator reading extended header"
            defpackage.bdu.c(r0, r15)
        L_0x003f:
            r15 = r13
            goto L_0x007c
        L_0x0041:
            r15 = r13
        L_0x0042:
            int r5 = r14.b()
            if (r5 <= 0) goto L_0x01c5
            int r5 = r15.c
            if (r5 == 0) goto L_0x01bc
            r6 = 0
            if (r5 == r4) goto L_0x0136
            if (r5 == r1) goto L_0x0086
            if (r5 != r3) goto L_0x0080
            int r5 = r14.b()
            int r7 = r15.j
            if (r7 != r2) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r6 = r5 - r7
        L_0x005e:
            if (r6 <= 0) goto L_0x0067
            int r5 = r5 - r6
            int r6 = r14.b
            int r6 = r6 + r5
            r14.b(r6)
        L_0x0067:
            avp r6 = r15.a
            r6.a(r14)
            int r6 = r15.j
            if (r6 == r2) goto L_0x0042
            int r6 = r6 - r5
            r15.j = r6
            int r5 = r15.j
            if (r5 != 0) goto L_0x0042
            avp r5 = r15.a
            r5.b()
        L_0x007c:
            r15.a(r4)
            goto L_0x0042
        L_0x0080:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x0086:
            r5 = 10
            int r7 = r15.i
            int r5 = java.lang.Math.min(r5, r7)
            bdz r7 = r15.b
            byte[] r7 = r7.a
            boolean r5 = r15.a(r14, r7, r5)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            int r7 = r15.i
            boolean r5 = r15.a(r14, r5, r7)
            if (r5 == 0) goto L_0x0042
            bdz r5 = r15.b
            r5.a(r6)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15.l = r5
            boolean r5 = r15.f
            if (r5 == 0) goto L_0x0128
            bdz r5 = r15.b
            r6 = 4
            r5.b(r6)
            bdz r5 = r15.b
            int r5 = r5.c(r3)
            long r7 = (long) r5
            r5 = 30
            long r7 = r7 << r5
            bdz r9 = r15.b
            r9.b(r4)
            bdz r9 = r15.b
            r10 = 15
            int r9 = r9.c(r10)
            int r9 = r9 << r10
            long r11 = (long) r9
            long r7 = r7 | r11
            bdz r9 = r15.b
            r9.b(r4)
            bdz r9 = r15.b
            int r9 = r9.c(r10)
            long r11 = (long) r9
            long r7 = r7 | r11
            bdz r9 = r15.b
            r9.b(r4)
            boolean r9 = r15.h
            if (r9 != 0) goto L_0x0120
            boolean r9 = r15.g
            if (r9 == 0) goto L_0x0120
            bdz r9 = r15.b
            r9.b(r6)
            bdz r6 = r15.b
            int r6 = r6.c(r3)
            long r11 = (long) r6
            long r5 = r11 << r5
            bdz r9 = r15.b
            r9.b(r4)
            bdz r9 = r15.b
            int r9 = r9.c(r10)
            int r9 = r9 << r10
            long r11 = (long) r9
            long r5 = r5 | r11
            bdz r9 = r15.b
            r9.b(r4)
            bdz r9 = r15.b
            int r9 = r9.c(r10)
            long r9 = (long) r9
            long r5 = r5 | r9
            bdz r9 = r15.b
            r9.b(r4)
            bek r9 = r15.e
            r9.b(r5)
            r15.h = r4
        L_0x0120:
            bek r5 = r15.e
            long r5 = r5.b(r7)
            r15.l = r5
        L_0x0128:
            avp r5 = r15.a
            long r6 = r15.l
            boolean r8 = r15.k
            r5.a(r6, r8)
            r15.a(r3)
            goto L_0x0042
        L_0x0136:
            bdz r5 = r15.b
            byte[] r5 = r5.a
            r7 = 9
            boolean r5 = r15.a(r14, r5, r7)
            if (r5 == 0) goto L_0x0042
            bdz r5 = r15.b
            r5.a(r6)
            bdz r5 = r15.b
            r8 = 24
            int r5 = r5.c(r8)
            if (r5 == r4) goto L_0x0166
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unexpected start code prefix: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            defpackage.bdu.c(r0, r5)
            r15.j = r2
            r5 = 0
            goto L_0x01b4
        L_0x0166:
            bdz r5 = r15.b
            r8 = 8
            r5.b(r8)
            bdz r5 = r15.b
            r9 = 16
            int r5 = r5.c(r9)
            bdz r9 = r15.b
            r10 = 5
            r9.b(r10)
            bdz r9 = r15.b
            boolean r9 = r9.e()
            r15.k = r9
            bdz r9 = r15.b
            r9.b(r1)
            bdz r9 = r15.b
            boolean r9 = r9.e()
            r15.f = r9
            bdz r9 = r15.b
            boolean r9 = r9.e()
            r15.g = r9
            bdz r9 = r15.b
            r10 = 6
            r9.b(r10)
            bdz r9 = r15.b
            int r8 = r9.c(r8)
            r15.i = r8
            if (r5 != 0) goto L_0x01ab
            r15.j = r2
            goto L_0x01b3
        L_0x01ab:
            int r5 = r5 + 6
            int r5 = r5 - r7
            int r7 = r15.i
            int r5 = r5 - r7
            r15.j = r5
        L_0x01b3:
            r5 = 1
        L_0x01b4:
            if (r5 == 0) goto L_0x01b7
            r6 = 2
        L_0x01b7:
            r15.a(r6)
            goto L_0x0042
        L_0x01bc:
            int r5 = r14.b()
            r14.d(r5)
            goto L_0x0042
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avx.a(bea, boolean):void");
    }

    public final void a(bek bek, atm atm, d dVar) {
        this.e = bek;
        this.a.a(atm, dVar);
    }
}
