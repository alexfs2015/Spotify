package defpackage;

/* renamed from: dns reason: default package */
public final class dns extends dga<dns> {
    private String a;
    private dnq[] b;
    private Integer c;
    private Integer d;
    private Integer e;

    public dns() {
        this.a = null;
        this.b = dnq.b();
        this.c = null;
        this.d = null;
        this.e = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dns a(dfx dfx) {
        int i;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.d();
            } else if (a2 == 18) {
                int a3 = dgi.a(dfx, 18);
                dnq[] dnqArr = this.b;
                int length = dnqArr == null ? 0 : dnqArr.length;
                dnq[] dnqArr2 = new dnq[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dnqArr2, 0, length);
                }
                while (length < dnqArr2.length - 1) {
                    dnqArr2[length] = new dnq();
                    dfx.a((dgf) dnqArr2[length]);
                    dfx.a();
                    length++;
                }
                dnqArr2[length] = new dnq();
                dfx.a((dgf) dnqArr2[length]);
                this.b = dnqArr2;
            } else if (a2 == 24) {
                i = dfx.i();
                this.c = Integer.valueOf(dno.a(dfx.f()));
            } else if (a2 == 32) {
                i = dfx.i();
                this.d = Integer.valueOf(dno.a(dfx.f()));
            } else if (a2 == 40) {
                i = dfx.i();
                try {
                    this.e = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dfz.b(1, str);
        }
        dnq[] dnqArr = this.b;
        if (dnqArr != null && dnqArr.length > 0) {
            int i = 0;
            while (true) {
                dnq[] dnqArr2 = this.b;
                if (i >= dnqArr2.length) {
                    break;
                }
                dnq dnq = dnqArr2[i];
                if (dnq != null) {
                    a2 += dfz.b(2, (dgf) dnq);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dfz.b(3, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            a2 += dfz.b(4, num2.intValue());
        }
        Integer num3 = this.e;
        return num3 != null ? a2 + dfz.b(5, num3.intValue()) : a2;
    }

    public final void a(dfz dfz) {
        String str = this.a;
        if (str != null) {
            dfz.a(1, str);
        }
        dnq[] dnqArr = this.b;
        if (dnqArr != null && dnqArr.length > 0) {
            int i = 0;
            while (true) {
                dnq[] dnqArr2 = this.b;
                if (i >= dnqArr2.length) {
                    break;
                }
                dnq dnq = dnqArr2[i];
                if (dnq != null) {
                    dfz.a(2, (dgf) dnq);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            dfz.a(3, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            dfz.a(4, num2.intValue());
        }
        Integer num3 = this.e;
        if (num3 != null) {
            dfz.a(5, num3.intValue());
        }
        super.a(dfz);
    }
}