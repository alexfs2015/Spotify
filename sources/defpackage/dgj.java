package defpackage;

/* renamed from: dgj reason: default package */
public final class dgj extends dga<dgj> {
    public Integer a;
    public String b;
    public String c;
    public dgk d;
    public dgr[] e;
    public String f;
    public dgq g;
    public dgs h;
    public String[] i;
    public String[] j;
    private Integer k;
    private String l;
    private Boolean m;
    private String[] n;
    private String o;
    private Boolean p;
    private Boolean q;
    private byte[] r;

    public dgj() {
        this.a = null;
        this.k = null;
        this.b = null;
        this.c = null;
        this.l = null;
        this.d = null;
        this.e = dgr.b();
        this.f = null;
        this.g = null;
        this.m = null;
        this.n = dgi.c;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.h = null;
        this.i = dgi.c;
        this.j = dgi.c;
        this.Y = null;
        this.Z = -1;
    }

    public final void a(dfz dfz) {
        String str = this.b;
        if (str != null) {
            dfz.a(1, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            dfz.a(2, str2);
        }
        String str3 = this.l;
        if (str3 != null) {
            dfz.a(3, str3);
        }
        dgr[] dgrArr = this.e;
        int i2 = 0;
        if (dgrArr != null && dgrArr.length > 0) {
            int i3 = 0;
            while (true) {
                dgr[] dgrArr2 = this.e;
                if (i3 >= dgrArr2.length) {
                    break;
                }
                dgr dgr = dgrArr2[i3];
                if (dgr != null) {
                    dfz.a(4, (dgf) dgr);
                }
                i3++;
            }
        }
        Boolean bool = this.m;
        if (bool != null) {
            dfz.a(5, bool.booleanValue());
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i4];
                if (str4 != null) {
                    dfz.a(6, str4);
                }
                i4++;
            }
        }
        String str5 = this.o;
        if (str5 != null) {
            dfz.a(7, str5);
        }
        Boolean bool2 = this.p;
        if (bool2 != null) {
            dfz.a(8, bool2.booleanValue());
        }
        Boolean bool3 = this.q;
        if (bool3 != null) {
            dfz.a(9, bool3.booleanValue());
        }
        Integer num = this.a;
        if (num != null) {
            dfz.a(10, num.intValue());
        }
        Integer num2 = this.k;
        if (num2 != null) {
            dfz.a(11, num2.intValue());
        }
        dgk dgk = this.d;
        if (dgk != null) {
            dfz.a(12, (dgf) dgk);
        }
        String str6 = this.f;
        if (str6 != null) {
            dfz.a(13, str6);
        }
        dgq dgq = this.g;
        if (dgq != null) {
            dfz.a(14, (dgf) dgq);
        }
        byte[] bArr = this.r;
        if (bArr != null) {
            dfz.a(15, bArr);
        }
        dgs dgs = this.h;
        if (dgs != null) {
            dfz.a(17, (dgf) dgs);
        }
        String[] strArr3 = this.i;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.i;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i5];
                if (str7 != null) {
                    dfz.a(20, str7);
                }
                i5++;
            }
        }
        String[] strArr5 = this.j;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.j;
                if (i2 >= strArr6.length) {
                    break;
                }
                String str8 = strArr6[i2];
                if (str8 != null) {
                    dfz.a(21, str8);
                }
                i2++;
            }
        }
        super.a(dfz);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.b;
        if (str != null) {
            a2 += dfz.b(1, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            a2 += dfz.b(2, str2);
        }
        String str3 = this.l;
        if (str3 != null) {
            a2 += dfz.b(3, str3);
        }
        dgr[] dgrArr = this.e;
        int i2 = 0;
        if (dgrArr != null && dgrArr.length > 0) {
            int i3 = a2;
            int i4 = 0;
            while (true) {
                dgr[] dgrArr2 = this.e;
                if (i4 >= dgrArr2.length) {
                    break;
                }
                dgr dgr = dgrArr2[i4];
                if (dgr != null) {
                    i3 += dfz.b(4, (dgf) dgr);
                }
                i4++;
            }
            a2 = i3;
        }
        Boolean bool = this.m;
        if (bool != null) {
            bool.booleanValue();
            a2 += dfz.c(40) + 1;
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i5];
                if (str4 != null) {
                    i7++;
                    i6 += dfz.a(str4);
                }
                i5++;
            }
            a2 = a2 + i6 + (i7 * 1);
        }
        String str5 = this.o;
        if (str5 != null) {
            a2 += dfz.b(7, str5);
        }
        Boolean bool2 = this.p;
        if (bool2 != null) {
            bool2.booleanValue();
            a2 += dfz.c(64) + 1;
        }
        Boolean bool3 = this.q;
        if (bool3 != null) {
            bool3.booleanValue();
            a2 += dfz.c(72) + 1;
        }
        Integer num = this.a;
        if (num != null) {
            a2 += dfz.b(10, num.intValue());
        }
        Integer num2 = this.k;
        if (num2 != null) {
            a2 += dfz.b(11, num2.intValue());
        }
        dgk dgk = this.d;
        if (dgk != null) {
            a2 += dfz.b(12, (dgf) dgk);
        }
        String str6 = this.f;
        if (str6 != null) {
            a2 += dfz.b(13, str6);
        }
        dgq dgq = this.g;
        if (dgq != null) {
            a2 += dfz.b(14, (dgf) dgq);
        }
        byte[] bArr = this.r;
        if (bArr != null) {
            a2 += dfz.b(15, bArr);
        }
        dgs dgs = this.h;
        if (dgs != null) {
            a2 += dfz.b(17, (dgf) dgs);
        }
        String[] strArr3 = this.i;
        if (strArr3 != null && strArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr4 = this.i;
                if (i8 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i8];
                if (str7 != null) {
                    i10++;
                    i9 += dfz.a(str7);
                }
                i8++;
            }
            a2 = a2 + i9 + (i10 * 2);
        }
        String[] strArr5 = this.j;
        if (strArr5 == null || strArr5.length <= 0) {
            return a2;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr6 = this.j;
            if (i2 >= strArr6.length) {
                return a2 + i11 + (i12 * 2);
            }
            String str8 = strArr6[i2];
            if (str8 != null) {
                i12++;
                i11 += dfz.a(str8);
            }
            i2++;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dgj a(defpackage.dfx r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x01c8;
                case 10: goto L_0x01c0;
                case 18: goto L_0x01b8;
                case 26: goto L_0x01b0;
                case 34: goto L_0x0172;
                case 40: goto L_0x0166;
                case 50: goto L_0x0134;
                case 58: goto L_0x012c;
                case 64: goto L_0x0120;
                case 72: goto L_0x0114;
                case 80: goto L_0x00dd;
                case 88: goto L_0x00af;
                case 98: goto L_0x009d;
                case 106: goto L_0x0095;
                case 114: goto L_0x0087;
                case 122: goto L_0x007f;
                case 138: goto L_0x0071;
                case 162: goto L_0x0040;
                case 170: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 170(0xaa, float:2.38E-43)
            int r0 = defpackage.dgi.a(r7, r0)
            java.lang.String[] r2 = r6.j
            if (r2 != 0) goto L_0x001b
            r2 = 0
            goto L_0x001c
        L_0x001b:
            int r2 = r2.length
        L_0x001c:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0026
            java.lang.String[] r3 = r6.j
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0026:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0037
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r7.a()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0037:
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r6.j = r0
            goto L_0x0000
        L_0x0040:
            r0 = 162(0xa2, float:2.27E-43)
            int r0 = defpackage.dgi.a(r7, r0)
            java.lang.String[] r2 = r6.i
            if (r2 != 0) goto L_0x004c
            r2 = 0
            goto L_0x004d
        L_0x004c:
            int r2 = r2.length
        L_0x004d:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0057
            java.lang.String[] r3 = r6.i
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0057:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0068
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r7.a()
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0068:
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r6.i = r0
            goto L_0x0000
        L_0x0071:
            dgs r0 = r6.h
            if (r0 != 0) goto L_0x007c
            dgs r0 = new dgs
            r0.<init>()
            r6.h = r0
        L_0x007c:
            dgs r0 = r6.h
            goto L_0x00aa
        L_0x007f:
            byte[] r0 = r7.e()
            r6.r = r0
            goto L_0x0000
        L_0x0087:
            dgq r0 = r6.g
            if (r0 != 0) goto L_0x0092
            dgq r0 = new dgq
            r0.<init>()
            r6.g = r0
        L_0x0092:
            dgq r0 = r6.g
            goto L_0x00aa
        L_0x0095:
            java.lang.String r0 = r7.d()
            r6.f = r0
            goto L_0x0000
        L_0x009d:
            dgk r0 = r6.d
            if (r0 != 0) goto L_0x00a8
            dgk r0 = new dgk
            r0.<init>()
            r6.d = r0
        L_0x00a8:
            dgk r0 = r6.d
        L_0x00aa:
            r7.a(r0)
            goto L_0x0000
        L_0x00af:
            int r1 = r7.i()
            int r2 = r7.b()     // Catch:{ IllegalArgumentException -> 0x010c }
            if (r2 < 0) goto L_0x00c4
            r3 = 4
            if (r2 > r3) goto L_0x00c4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            r6.k = r2     // Catch:{ IllegalArgumentException -> 0x010c }
            goto L_0x0000
        L_0x00c4:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x010c }
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = " is not a valid enum Verdict"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x010c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            throw r3     // Catch:{ IllegalArgumentException -> 0x010c }
        L_0x00dd:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x010c }
            if (r2 < 0) goto L_0x00f3
            r3 = 9
            if (r2 > r3) goto L_0x00f3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            r6.a = r2     // Catch:{ IllegalArgumentException -> 0x010c }
            goto L_0x0000
        L_0x00f3:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x010c }
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = " is not a valid enum ReportType"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x010c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            throw r3     // Catch:{ IllegalArgumentException -> 0x010c }
        L_0x010c:
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x0114:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.q = r0
            goto L_0x0000
        L_0x0120:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.p = r0
            goto L_0x0000
        L_0x012c:
            java.lang.String r0 = r7.d()
            r6.o = r0
            goto L_0x0000
        L_0x0134:
            r0 = 50
            int r0 = defpackage.dgi.a(r7, r0)
            java.lang.String[] r2 = r6.n
            if (r2 != 0) goto L_0x0140
            r2 = 0
            goto L_0x0141
        L_0x0140:
            int r2 = r2.length
        L_0x0141:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x014b
            java.lang.String[] r3 = r6.n
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x014b:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x015c
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r7.a()
            int r2 = r2 + 1
            goto L_0x014b
        L_0x015c:
            java.lang.String r1 = r7.d()
            r0[r2] = r1
            r6.n = r0
            goto L_0x0000
        L_0x0166:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.m = r0
            goto L_0x0000
        L_0x0172:
            r0 = 34
            int r0 = defpackage.dgi.a(r7, r0)
            dgr[] r2 = r6.e
            if (r2 != 0) goto L_0x017e
            r2 = 0
            goto L_0x017f
        L_0x017e:
            int r2 = r2.length
        L_0x017f:
            int r0 = r0 + r2
            dgr[] r0 = new defpackage.dgr[r0]
            if (r2 == 0) goto L_0x0189
            dgr[] r3 = r6.e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0189:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x01a0
            dgr r1 = new dgr
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r7.a()
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01a0:
            dgr r1 = new dgr
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r6.e = r0
            goto L_0x0000
        L_0x01b0:
            java.lang.String r0 = r7.d()
            r6.l = r0
            goto L_0x0000
        L_0x01b8:
            java.lang.String r0 = r7.d()
            r6.c = r0
            goto L_0x0000
        L_0x01c0:
            java.lang.String r0 = r7.d()
            r6.b = r0
            goto L_0x0000
        L_0x01c8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.a(dfx):dgj");
    }
}
