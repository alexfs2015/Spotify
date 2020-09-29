package defpackage;

import defpackage.dga;

/* renamed from: dga reason: default package */
public abstract class dga<M extends dga<M>> extends dgf {
    protected dgc Y;

    public final /* synthetic */ dgf c() {
        return (dga) clone();
    }

    public /* synthetic */ Object clone() {
        dga dga = (dga) super.clone();
        dge.a(this, dga);
        return dga;
    }

    /* access modifiers changed from: protected */
    public int a() {
        if (this.Y == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.Y.d; i2++) {
            i += this.Y.c[i2].a();
        }
        return i;
    }

    public void a(dfz dfz) {
        if (this.Y != null) {
            for (int i = 0; i < this.Y.d; i++) {
                this.Y.c[i].a(dfz);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.dfx r11, int r12) {
        /*
            r10 = this;
            int r0 = r11.i()
            boolean r1 = r11.b(r12)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            int r1 = r12 >>> 3
            int r3 = r11.i()
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x0018
            byte[] r11 = defpackage.dgi.e
            goto L_0x0023
        L_0x0018:
            byte[] r4 = new byte[r3]
            int r5 = r11.b
            int r5 = r5 + r0
            byte[] r11 = r11.a
            java.lang.System.arraycopy(r11, r5, r4, r2, r3)
            r11 = r4
        L_0x0023:
            dgh r0 = new dgh
            r0.<init>(r12, r11)
            dgc r11 = r10.Y
            r12 = 0
            if (r11 != 0) goto L_0x0036
            dgc r11 = new dgc
            r11.<init>()
            r10.Y = r11
        L_0x0034:
            r11 = r12
            goto L_0x0049
        L_0x0036:
            int r3 = r11.b(r1)
            if (r3 < 0) goto L_0x0034
            dgd[] r4 = r11.c
            r4 = r4[r3]
            dgd r5 = defpackage.dgc.a
            if (r4 != r5) goto L_0x0045
            goto L_0x0034
        L_0x0045:
            dgd[] r11 = r11.c
            r11 = r11[r3]
        L_0x0049:
            r3 = 1
            if (r11 != 0) goto L_0x00bf
            dgd r11 = new dgd
            r11.<init>()
            dgc r4 = r10.Y
            int r5 = r4.b(r1)
            if (r5 < 0) goto L_0x005e
            dgd[] r1 = r4.c
            r1[r5] = r11
            goto L_0x00bf
        L_0x005e:
            r5 = r5 ^ -1
            int r6 = r4.d
            if (r5 >= r6) goto L_0x0075
            dgd[] r6 = r4.c
            r6 = r6[r5]
            dgd r7 = defpackage.dgc.a
            if (r6 != r7) goto L_0x0075
            int[] r2 = r4.b
            r2[r5] = r1
            dgd[] r1 = r4.c
            r1[r5] = r11
            goto L_0x00bf
        L_0x0075:
            int r6 = r4.d
            int[] r7 = r4.b
            int r7 = r7.length
            if (r6 < r7) goto L_0x009b
            int r6 = r4.d
            int r6 = r6 + r3
            int r6 = defpackage.dgc.a(r6)
            int[] r7 = new int[r6]
            dgd[] r6 = new defpackage.dgd[r6]
            int[] r8 = r4.b
            int[] r9 = r4.b
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r7, r2, r9)
            dgd[] r8 = r4.c
            dgd[] r9 = r4.c
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r6, r2, r9)
            r4.b = r7
            r4.c = r6
        L_0x009b:
            int r2 = r4.d
            int r2 = r2 - r5
            if (r2 == 0) goto L_0x00b2
            int[] r2 = r4.b
            int r6 = r5 + 1
            int r7 = r4.d
            int r7 = r7 - r5
            java.lang.System.arraycopy(r2, r5, r2, r6, r7)
            dgd[] r2 = r4.c
            int r7 = r4.d
            int r7 = r7 - r5
            java.lang.System.arraycopy(r2, r5, r2, r6, r7)
        L_0x00b2:
            int[] r2 = r4.b
            r2[r5] = r1
            dgd[] r1 = r4.c
            r1[r5] = r11
            int r1 = r4.d
            int r1 = r1 + r3
            r4.d = r1
        L_0x00bf:
            java.util.List<dgh> r1 = r11.c
            if (r1 == 0) goto L_0x00c9
            java.util.List<dgh> r11 = r11.c
            r11.add(r0)
            goto L_0x00f2
        L_0x00c9:
            java.lang.Object r1 = r11.b
            boolean r1 = r1 instanceof defpackage.dgf
            if (r1 == 0) goto L_0x00f8
            byte[] r0 = r0.b
            int r1 = r0.length
            dfx r1 = defpackage.dfx.a(r0, r1)
            int r2 = r1.f()
            int r0 = r0.length
            int r4 = defpackage.dfz.a(r2)
            int r0 = r0 - r4
            if (r2 != r0) goto L_0x00f3
            java.lang.Object r0 = r11.b
            dgf r0 = (defpackage.dgf) r0
            dgf r0 = r0.a(r1)
            dgb<?, ?> r1 = r11.a
            r11.a = r1
            r11.b = r0
            r11.c = r12
        L_0x00f2:
            return r3
        L_0x00f3:
            com.google.android.gms.internal.ads.zzbfh r11 = com.google.android.gms.internal.ads.zzbfh.a()
            throw r11
        L_0x00f8:
            java.lang.Object r11 = r11.b
            boolean r11 = r11 instanceof defpackage.dgf[]
            java.util.Collections.singletonList(r0)
            if (r11 == 0) goto L_0x0107
            java.lang.NoSuchMethodError r11 = new java.lang.NoSuchMethodError
            r11.<init>()
            throw r11
        L_0x0107:
            java.lang.NoSuchMethodError r11 = new java.lang.NoSuchMethodError
            r11.<init>()
            goto L_0x010e
        L_0x010d:
            throw r11
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dga.a(dfx, int):boolean");
    }
}
