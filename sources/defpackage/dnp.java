package defpackage;

/* renamed from: dnp reason: default package */
public final class dnp extends dga<dnp> {
    public Integer a;
    public dns b;
    private Integer c;
    private dnr d;
    private dnq[] e;
    private dnt f;
    private doc g;
    private dob h;
    private dny i;
    private dnz j;
    private doi[] k;

    public dnp() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.b = null;
        this.e = dnq.b();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = doi.b();
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dnp a(defpackage.dfx r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x013e;
                case 56: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 74: goto L_0x00e1;
                case 82: goto L_0x00d3;
                case 90: goto L_0x0095;
                case 98: goto L_0x0087;
                case 106: goto L_0x0079;
                case 114: goto L_0x006a;
                case 122: goto L_0x005b;
                case 130: goto L_0x004c;
                case 138: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 138(0x8a, float:1.93E-43)
            int r0 = defpackage.dgi.a(r7, r0)
            doi[] r2 = r6.k
            if (r2 != 0) goto L_0x001b
            r2 = 0
            goto L_0x001c
        L_0x001b:
            int r2 = r2.length
        L_0x001c:
            int r0 = r0 + r2
            doi[] r0 = new defpackage.doi[r0]
            if (r2 == 0) goto L_0x0026
            doi[] r3 = r6.k
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0026:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x003d
            doi r1 = new doi
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r7.a()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003d:
            doi r1 = new doi
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r6.k = r0
            goto L_0x0000
        L_0x004c:
            dnz r0 = r6.j
            if (r0 != 0) goto L_0x0057
            dnz r0 = new dnz
            r0.<init>()
            r6.j = r0
        L_0x0057:
            dnz r0 = r6.j
            goto L_0x00ee
        L_0x005b:
            dny r0 = r6.i
            if (r0 != 0) goto L_0x0066
            dny r0 = new dny
            r0.<init>()
            r6.i = r0
        L_0x0066:
            dny r0 = r6.i
            goto L_0x00ee
        L_0x006a:
            dob r0 = r6.h
            if (r0 != 0) goto L_0x0075
            dob r0 = new dob
            r0.<init>()
            r6.h = r0
        L_0x0075:
            dob r0 = r6.h
            goto L_0x00ee
        L_0x0079:
            doc r0 = r6.g
            if (r0 != 0) goto L_0x0084
            doc r0 = new doc
            r0.<init>()
            r6.g = r0
        L_0x0084:
            doc r0 = r6.g
            goto L_0x00ee
        L_0x0087:
            dnt r0 = r6.f
            if (r0 != 0) goto L_0x0092
            dnt r0 = new dnt
            r0.<init>()
            r6.f = r0
        L_0x0092:
            dnt r0 = r6.f
            goto L_0x00ee
        L_0x0095:
            r0 = 90
            int r0 = defpackage.dgi.a(r7, r0)
            dnq[] r2 = r6.e
            if (r2 != 0) goto L_0x00a1
            r2 = 0
            goto L_0x00a2
        L_0x00a1:
            int r2 = r2.length
        L_0x00a2:
            int r0 = r0 + r2
            dnq[] r0 = new defpackage.dnq[r0]
            if (r2 == 0) goto L_0x00ac
            dnq[] r3 = r6.e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x00ac:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x00c3
            dnq r1 = new dnq
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r7.a()
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00c3:
            dnq r1 = new dnq
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.a(r1)
            r6.e = r0
            goto L_0x0000
        L_0x00d3:
            dns r0 = r6.b
            if (r0 != 0) goto L_0x00de
            dns r0 = new dns
            r0.<init>()
            r6.b = r0
        L_0x00de:
            dns r0 = r6.b
            goto L_0x00ee
        L_0x00e1:
            dnr r0 = r6.d
            if (r0 != 0) goto L_0x00ec
            dnr r0 = new dnr
            r0.<init>()
            r6.d = r0
        L_0x00ec:
            dnr r0 = r6.d
        L_0x00ee:
            r7.a(r0)
            goto L_0x0000
        L_0x00f3:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x0136 }
            int r2 = defpackage.dno.a(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            r6.c = r2     // Catch:{ IllegalArgumentException -> 0x0136 }
            goto L_0x0000
        L_0x0107:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x0136 }
            if (r2 < 0) goto L_0x011d
            r3 = 9
            if (r2 > r3) goto L_0x011d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            r6.a = r2     // Catch:{ IllegalArgumentException -> 0x0136 }
            goto L_0x0000
        L_0x011d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0136 }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0136 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0136 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            java.lang.String r2 = " is not a valid enum AdInitiater"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0136 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0136 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0136 }
        L_0x0136:
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x013e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnp.a(dfx):dnp");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dfz.b(7, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            a2 += dfz.b(8, num2.intValue());
        }
        dnr dnr = this.d;
        if (dnr != null) {
            a2 += dfz.b(9, (dgf) dnr);
        }
        dns dns = this.b;
        if (dns != null) {
            a2 += dfz.b(10, (dgf) dns);
        }
        dnq[] dnqArr = this.e;
        int i2 = 0;
        if (dnqArr != null && dnqArr.length > 0) {
            int i3 = a2;
            int i4 = 0;
            while (true) {
                dnq[] dnqArr2 = this.e;
                if (i4 >= dnqArr2.length) {
                    break;
                }
                dnq dnq = dnqArr2[i4];
                if (dnq != null) {
                    i3 += dfz.b(11, (dgf) dnq);
                }
                i4++;
            }
            a2 = i3;
        }
        dnt dnt = this.f;
        if (dnt != null) {
            a2 += dfz.b(12, (dgf) dnt);
        }
        doc doc = this.g;
        if (doc != null) {
            a2 += dfz.b(13, (dgf) doc);
        }
        dob dob = this.h;
        if (dob != null) {
            a2 += dfz.b(14, (dgf) dob);
        }
        dny dny = this.i;
        if (dny != null) {
            a2 += dfz.b(15, (dgf) dny);
        }
        dnz dnz = this.j;
        if (dnz != null) {
            a2 += dfz.b(16, (dgf) dnz);
        }
        doi[] doiArr = this.k;
        if (doiArr != null && doiArr.length > 0) {
            while (true) {
                doi[] doiArr2 = this.k;
                if (i2 >= doiArr2.length) {
                    break;
                }
                doi doi = doiArr2[i2];
                if (doi != null) {
                    a2 += dfz.b(17, (dgf) doi);
                }
                i2++;
            }
        }
        return a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(7, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            dfz.a(8, num2.intValue());
        }
        dnr dnr = this.d;
        if (dnr != null) {
            dfz.a(9, (dgf) dnr);
        }
        dns dns = this.b;
        if (dns != null) {
            dfz.a(10, (dgf) dns);
        }
        dnq[] dnqArr = this.e;
        int i2 = 0;
        if (dnqArr != null && dnqArr.length > 0) {
            int i3 = 0;
            while (true) {
                dnq[] dnqArr2 = this.e;
                if (i3 >= dnqArr2.length) {
                    break;
                }
                dnq dnq = dnqArr2[i3];
                if (dnq != null) {
                    dfz.a(11, (dgf) dnq);
                }
                i3++;
            }
        }
        dnt dnt = this.f;
        if (dnt != null) {
            dfz.a(12, (dgf) dnt);
        }
        doc doc = this.g;
        if (doc != null) {
            dfz.a(13, (dgf) doc);
        }
        dob dob = this.h;
        if (dob != null) {
            dfz.a(14, (dgf) dob);
        }
        dny dny = this.i;
        if (dny != null) {
            dfz.a(15, (dgf) dny);
        }
        dnz dnz = this.j;
        if (dnz != null) {
            dfz.a(16, (dgf) dnz);
        }
        doi[] doiArr = this.k;
        if (doiArr != null && doiArr.length > 0) {
            while (true) {
                doi[] doiArr2 = this.k;
                if (i2 >= doiArr2.length) {
                    break;
                }
                doi doi = doiArr2[i2];
                if (doi != null) {
                    dfz.a(17, (dgf) doi);
                }
                i2++;
            }
        }
        super.a(dfz);
    }
}
