package defpackage;

/* renamed from: dgr reason: default package */
public final class dgr extends dga<dgr> {
    private static volatile dgr[] f;
    public Integer a;
    public String b;
    public dgm c;
    public Integer d;
    public String[] e;
    private dgo g;
    private Integer h;
    private int[] i;
    private String j;

    public dgr() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.g = null;
        this.h = null;
        this.i = dgi.a;
        this.j = null;
        this.d = null;
        this.e = dgi.c;
        this.Y = null;
        this.Z = -1;
    }

    public static dgr[] b() {
        if (f == null) {
            synchronized (dge.b) {
                if (f == null) {
                    f = new dgr[0];
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int[] iArr;
        int a2 = super.a() + dfz.b(1, this.a.intValue());
        String str = this.b;
        if (str != null) {
            a2 += dfz.b(2, str);
        }
        dgm dgm = this.c;
        if (dgm != null) {
            a2 += dfz.b(3, (dgf) dgm);
        }
        dgo dgo = this.g;
        if (dgo != null) {
            a2 += dfz.b(4, (dgf) dgo);
        }
        Integer num = this.h;
        if (num != null) {
            a2 += dfz.b(5, num.intValue());
        }
        int[] iArr2 = this.i;
        int i2 = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                iArr = this.i;
                if (i3 >= iArr.length) {
                    break;
                }
                i4 += dfz.a(iArr[i3]);
                i3++;
            }
            a2 = a2 + i4 + (iArr.length * 1);
        }
        String str2 = this.j;
        if (str2 != null) {
            a2 += dfz.b(7, str2);
        }
        Integer num2 = this.d;
        if (num2 != null) {
            a2 += dfz.b(8, num2.intValue());
        }
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return a2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.e;
            if (i2 >= strArr2.length) {
                return a2 + i5 + (i6 * 1);
            }
            String str3 = strArr2[i2];
            if (str3 != null) {
                i6++;
                i5 += dfz.a(str3);
            }
            i2++;
        }
    }

    public final void a(dfz dfz) {
        dfz.a(1, this.a.intValue());
        String str = this.b;
        if (str != null) {
            dfz.a(2, str);
        }
        dgm dgm = this.c;
        if (dgm != null) {
            dfz.a(3, (dgf) dgm);
        }
        dgo dgo = this.g;
        if (dgo != null) {
            dfz.a(4, (dgf) dgo);
        }
        Integer num = this.h;
        if (num != null) {
            dfz.a(5, num.intValue());
        }
        int[] iArr = this.i;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.i;
                if (i3 >= iArr2.length) {
                    break;
                }
                dfz.a(6, iArr2[i3]);
                i3++;
            }
        }
        String str2 = this.j;
        if (str2 != null) {
            dfz.a(7, str2);
        }
        Integer num2 = this.d;
        if (num2 != null) {
            dfz.a(8, num2.intValue());
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.e;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i2];
                if (str3 != null) {
                    dfz.a(9, str3);
                }
                i2++;
            }
        }
        super.a(dfz);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dgr a(dfx dfx) {
        dgf dgf;
        int f2;
        while (true) {
            int a2 = dfx.a();
            switch (a2) {
                case 0:
                    return this;
                case 8:
                    this.a = Integer.valueOf(dfx.f());
                    continue;
                case 18:
                    this.b = dfx.d();
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new dgm();
                    }
                    dgf = this.c;
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new dgo();
                    }
                    dgf = this.g;
                    break;
                case 40:
                    this.h = Integer.valueOf(dfx.f());
                    continue;
                case 48:
                    int a3 = dgi.a(dfx, 48);
                    int[] iArr = this.i;
                    int length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = dfx.f();
                        dfx.a();
                        length++;
                    }
                    iArr2[length] = dfx.f();
                    this.i = iArr2;
                    continue;
                case 50:
                    int c2 = dfx.c(dfx.f());
                    int i2 = dfx.i();
                    int i3 = 0;
                    while (dfx.h() > 0) {
                        dfx.f();
                        i3++;
                    }
                    dfx.e(i2);
                    int[] iArr3 = this.i;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.i, 0, iArr4, 0, length2);
                    }
                    while (length2 < iArr4.length) {
                        iArr4[length2] = dfx.f();
                        length2++;
                    }
                    this.i = iArr4;
                    dfx.d(c2);
                    continue;
                case 58:
                    this.j = dfx.d();
                    continue;
                case b.bs /*64*/:
                    try {
                        f2 = dfx.f();
                        if (f2 < 0 || f2 > 3) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(f2);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        } else {
                            this.d = Integer.valueOf(f2);
                            continue;
                        }
                    } catch (IllegalArgumentException unused) {
                        dfx.e(dfx.i());
                        a(dfx, a2);
                        break;
                    }
                case b.bC /*74*/:
                    int a4 = dgi.a(dfx, 74);
                    String[] strArr = this.e;
                    int length3 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.e, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = dfx.d();
                        dfx.a();
                        length3++;
                    }
                    strArr2[length3] = dfx.d();
                    this.e = strArr2;
                    continue;
                default:
                    if (!super.a(dfx, a2)) {
                        return this;
                    }
                    continue;
            }
            dfx.a(dgf);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(f2);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
