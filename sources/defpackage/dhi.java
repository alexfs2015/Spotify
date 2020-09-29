package defpackage;

/* renamed from: dhi reason: default package */
public final class dhi extends dgr<dhi> {
    private static volatile dhi[] f;
    public Integer a;
    public String b;
    public dhd c;
    public Integer d;
    public String[] e;
    private dhf g;
    private Integer h;
    private int[] i;
    private String j;

    public dhi() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.g = null;
        this.h = null;
        this.i = dgz.a;
        this.j = null;
        this.d = null;
        this.e = dgz.c;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dhi a(dgo dgo) {
        dgw dgw;
        int f2;
        while (true) {
            int a2 = dgo.a();
            switch (a2) {
                case 0:
                    return this;
                case 8:
                    this.a = Integer.valueOf(dgo.f());
                    continue;
                case 18:
                    this.b = dgo.d();
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new dhd();
                    }
                    dgw = this.c;
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new dhf();
                    }
                    dgw = this.g;
                    break;
                case 40:
                    this.h = Integer.valueOf(dgo.f());
                    continue;
                case 48:
                    int a3 = dgz.a(dgo, 48);
                    int[] iArr = this.i;
                    int length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = dgo.f();
                        dgo.a();
                        length++;
                    }
                    iArr2[length] = dgo.f();
                    this.i = iArr2;
                    continue;
                case 50:
                    int c2 = dgo.c(dgo.f());
                    int i2 = dgo.i();
                    int i3 = 0;
                    while (dgo.h() > 0) {
                        dgo.f();
                        i3++;
                    }
                    dgo.e(i2);
                    int[] iArr3 = this.i;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.i, 0, iArr4, 0, length2);
                    }
                    while (length2 < iArr4.length) {
                        iArr4[length2] = dgo.f();
                        length2++;
                    }
                    this.i = iArr4;
                    dgo.d(c2);
                    continue;
                case 58:
                    this.j = dgo.d();
                    continue;
                case b.bs /*64*/:
                    try {
                        f2 = dgo.f();
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
                        dgo.e(dgo.i());
                        a(dgo, a2);
                        break;
                    }
                case b.bC /*74*/:
                    int a4 = dgz.a(dgo, 74);
                    String[] strArr = this.e;
                    int length3 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.e, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = dgo.d();
                        dgo.a();
                        length3++;
                    }
                    strArr2[length3] = dgo.d();
                    this.e = strArr2;
                    continue;
                default:
                    if (!super.a(dgo, a2)) {
                        return this;
                    }
                    continue;
            }
            dgo.a(dgw);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(f2);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static dhi[] b() {
        if (f == null) {
            synchronized (dgv.b) {
                if (f == null) {
                    f = new dhi[0];
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int[] iArr;
        int a2 = super.a() + dgq.b(1, this.a.intValue());
        String str = this.b;
        if (str != null) {
            a2 += dgq.b(2, str);
        }
        dhd dhd = this.c;
        if (dhd != null) {
            a2 += dgq.b(3, (dgw) dhd);
        }
        dhf dhf = this.g;
        if (dhf != null) {
            a2 += dgq.b(4, (dgw) dhf);
        }
        Integer num = this.h;
        if (num != null) {
            a2 += dgq.b(5, num.intValue());
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
                i4 += dgq.a(iArr[i3]);
                i3++;
            }
            a2 = a2 + i4 + (iArr.length * 1);
        }
        String str2 = this.j;
        if (str2 != null) {
            a2 += dgq.b(7, str2);
        }
        Integer num2 = this.d;
        if (num2 != null) {
            a2 += dgq.b(8, num2.intValue());
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
                i5 += dgq.a(str3);
            }
            i2++;
        }
    }

    public final void a(dgq dgq) {
        dgq.a(1, this.a.intValue());
        String str = this.b;
        if (str != null) {
            dgq.a(2, str);
        }
        dhd dhd = this.c;
        if (dhd != null) {
            dgq.a(3, (dgw) dhd);
        }
        dhf dhf = this.g;
        if (dhf != null) {
            dgq.a(4, (dgw) dhf);
        }
        Integer num = this.h;
        if (num != null) {
            dgq.a(5, num.intValue());
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
                dgq.a(6, iArr2[i3]);
                i3++;
            }
        }
        String str2 = this.j;
        if (str2 != null) {
            dgq.a(7, str2);
        }
        Integer num2 = this.d;
        if (num2 != null) {
            dgq.a(8, num2.intValue());
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
                    dgq.a(9, str3);
                }
                i2++;
            }
        }
        super.a(dgq);
    }
}
