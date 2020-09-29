package defpackage;

import defpackage.eql;

/* renamed from: eql reason: default package */
public abstract class eql<M extends eql<M>> extends eqq {
    protected eqn L;

    public void a(eqk eqk) {
        if (this.L != null) {
            for (int i = 0; i < this.L.d; i++) {
                this.L.c[i].a(eqk);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.eqj r11, int r12) {
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
            byte[] r11 = defpackage.eqt.d
            goto L_0x0023
        L_0x0018:
            byte[] r4 = new byte[r3]
            int r5 = r11.b
            int r5 = r5 + r0
            byte[] r11 = r11.a
            java.lang.System.arraycopy(r11, r5, r4, r2, r3)
            r11 = r4
        L_0x0023:
            eqs r0 = new eqs
            r0.<init>(r12, r11)
            eqn r11 = r10.L
            r12 = 0
            if (r11 != 0) goto L_0x0036
            eqn r11 = new eqn
            r11.<init>()
            r10.L = r11
        L_0x0034:
            r11 = r12
            goto L_0x0049
        L_0x0036:
            int r3 = r11.b(r1)
            if (r3 < 0) goto L_0x0034
            eqo[] r4 = r11.c
            r4 = r4[r3]
            eqo r5 = defpackage.eqn.a
            if (r4 != r5) goto L_0x0045
            goto L_0x0034
        L_0x0045:
            eqo[] r11 = r11.c
            r11 = r11[r3]
        L_0x0049:
            r3 = 1
            if (r11 != 0) goto L_0x00bf
            eqo r11 = new eqo
            r11.<init>()
            eqn r4 = r10.L
            int r5 = r4.b(r1)
            if (r5 < 0) goto L_0x005e
            eqo[] r1 = r4.c
            r1[r5] = r11
            goto L_0x00bf
        L_0x005e:
            r5 = r5 ^ -1
            int r6 = r4.d
            if (r5 >= r6) goto L_0x0075
            eqo[] r6 = r4.c
            r6 = r6[r5]
            eqo r7 = defpackage.eqn.a
            if (r6 != r7) goto L_0x0075
            int[] r6 = r4.b
            r6[r5] = r1
            eqo[] r1 = r4.c
            r1[r5] = r11
            goto L_0x00bf
        L_0x0075:
            int r6 = r4.d
            int[] r7 = r4.b
            int r7 = r7.length
            if (r6 < r7) goto L_0x009b
            int r6 = r4.d
            int r6 = r6 + r3
            int r6 = defpackage.eqn.a(r6)
            int[] r7 = new int[r6]
            eqo[] r6 = new defpackage.eqo[r6]
            int[] r8 = r4.b
            int[] r9 = r4.b
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r7, r2, r9)
            eqo[] r8 = r4.c
            eqo[] r9 = r4.c
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r6, r2, r9)
            r4.b = r7
            r4.c = r6
        L_0x009b:
            int r6 = r4.d
            int r6 = r6 - r5
            if (r6 == 0) goto L_0x00b2
            int[] r6 = r4.b
            int r7 = r5 + 1
            int r8 = r4.d
            int r8 = r8 - r5
            java.lang.System.arraycopy(r6, r5, r6, r7, r8)
            eqo[] r6 = r4.c
            int r8 = r4.d
            int r8 = r8 - r5
            java.lang.System.arraycopy(r6, r5, r6, r7, r8)
        L_0x00b2:
            int[] r6 = r4.b
            r6[r5] = r1
            eqo[] r1 = r4.c
            r1[r5] = r11
            int r1 = r4.d
            int r1 = r1 + r3
            r4.d = r1
        L_0x00bf:
            java.util.List<eqs> r1 = r11.c
            if (r1 == 0) goto L_0x00ca
            java.util.List<eqs> r11 = r11.c
            r11.add(r0)
            goto L_0x0172
        L_0x00ca:
            java.lang.Object r1 = r11.b
            boolean r1 = r1 instanceof defpackage.eqq
            if (r1 == 0) goto L_0x00f2
            byte[] r0 = r0.b
            int r1 = r0.length
            eqj r1 = defpackage.eqj.a(r0, r1)
            int r2 = r1.d()
            int r0 = r0.length
            int r4 = defpackage.eqk.a(r2)
            int r0 = r0 - r4
            if (r2 != r0) goto L_0x00ed
            java.lang.Object r0 = r11.b
            eqq r0 = (defpackage.eqq) r0
            eqq r0 = r0.a(r1)
            goto L_0x016a
        L_0x00ed:
            com.google.android.gms.internal.measurement.zzzq r11 = com.google.android.gms.internal.measurement.zzzq.a()
            throw r11
        L_0x00f2:
            java.lang.Object r1 = r11.b
            boolean r1 = r1 instanceof defpackage.eqq[]
            if (r1 == 0) goto L_0x0118
            eqm<?, ?> r1 = r11.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.a(r0)
            eqq[] r0 = (defpackage.eqq[]) r0
            java.lang.Object r1 = r11.b
            eqq[] r1 = (defpackage.eqq[]) r1
            int r4 = r1.length
            int r5 = r0.length
            int r4 = r4 + r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            eqq[] r4 = (defpackage.eqq[]) r4
            int r1 = r1.length
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r4, r1, r5)
        L_0x0116:
            r0 = r4
            goto L_0x016a
        L_0x0118:
            java.lang.Object r1 = r11.b
            boolean r1 = r1 instanceof defpackage.eoo
            if (r1 == 0) goto L_0x013b
            eqm<?, ?> r1 = r11.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.a(r0)
            eoo r0 = (defpackage.eoo) r0
            java.lang.Object r1 = r11.b
            eoo r1 = (defpackage.eoo) r1
            eop r1 = r1.i()
            eop r0 = r1.a(r0)
            eoo r0 = r0.d()
            goto L_0x016a
        L_0x013b:
            java.lang.Object r1 = r11.b
            boolean r1 = r1 instanceof defpackage.eoo[]
            if (r1 == 0) goto L_0x0160
            eqm<?, ?> r1 = r11.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.a(r0)
            eoo[] r0 = (defpackage.eoo[]) r0
            java.lang.Object r1 = r11.b
            eoo[] r1 = (defpackage.eoo[]) r1
            int r4 = r1.length
            int r5 = r0.length
            int r4 = r4 + r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            eoo[] r4 = (defpackage.eoo[]) r4
            int r1 = r1.length
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r4, r1, r5)
            goto L_0x0116
        L_0x0160:
            eqm<?, ?> r1 = r11.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.a(r0)
        L_0x016a:
            eqm<?, ?> r1 = r11.a
            r11.a = r1
            r11.b = r0
            r11.c = r12
        L_0x0172:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eql.a(eqj, int):boolean");
    }

    /* access modifiers changed from: protected */
    public int b() {
        if (this.L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.L.d; i2++) {
            i += this.L.c[i2].a();
        }
        return i;
    }

    public final /* synthetic */ eqq c() {
        return (eql) clone();
    }

    public /* synthetic */ Object clone() {
        eql eql = (eql) super.clone();
        eqp.a(this, eql);
        return eql;
    }
}
