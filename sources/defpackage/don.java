package defpackage;

import com.comscore.streaming.ContentType;

/* renamed from: don reason: default package */
public final class don extends dgr<don> {
    public String a;
    public long[] b;
    public dol c;
    public dog d;
    private Integer e;
    private Integer f;
    private Integer g;
    private doy h;
    private dom i;
    private dor j;

    public don() {
        this.e = null;
        this.a = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = dgz.b;
        this.c = null;
        this.i = null;
        this.j = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final don a(dgo dgo) {
        dgw dgw;
        while (true) {
            int a2 = dgo.a();
            switch (a2) {
                case 0:
                    return this;
                case b.bA /*72*/:
                    this.e = Integer.valueOf(dgo.f());
                    continue;
                case 82:
                    this.a = dgo.d();
                    continue;
                case 88:
                    this.f = Integer.valueOf(dgo.f());
                    continue;
                case 96:
                    int i2 = dgo.i();
                    try {
                        this.g = Integer.valueOf(dof.a(dgo.f()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        dgo.e(i2);
                        a(dgo, a2);
                        break;
                    }
                case 106:
                    if (this.h == null) {
                        this.h = new doy();
                    }
                    dgw = this.h;
                    break;
                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                    int a3 = dgz.a(dgo, ContentType.LONG_FORM_ON_DEMAND);
                    long[] jArr = this.b;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, jArr2, 0, length);
                    }
                    while (true) {
                        int length2 = jArr2.length - 1;
                        long g2 = dgo.g();
                        if (length < length2) {
                            jArr2[length] = g2;
                            dgo.a();
                            length++;
                        } else {
                            jArr2[length] = g2;
                            this.b = jArr2;
                            continue;
                        }
                    }
                case a.aB /*114*/:
                    int c2 = dgo.c(dgo.f());
                    int i3 = dgo.i();
                    int i4 = 0;
                    while (dgo.h() > 0) {
                        dgo.g();
                        i4++;
                    }
                    dgo.e(i3);
                    long[] jArr3 = this.b;
                    int length3 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(i4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.b, 0, jArr4, 0, length3);
                    }
                    while (length3 < jArr4.length) {
                        jArr4[length3] = dgo.g();
                        length3++;
                    }
                    this.b = jArr4;
                    dgo.d(c2);
                    continue;
                case 122:
                    if (this.c == null) {
                        this.c = new dol();
                    }
                    dgw = this.c;
                    break;
                case 130:
                    if (this.i == null) {
                        this.i = new dom();
                    }
                    dgw = this.i;
                    break;
                case 138:
                    if (this.j == null) {
                        this.j = new dor();
                    }
                    dgw = this.j;
                    break;
                case 146:
                    if (this.d == null) {
                        this.d = new dog();
                    }
                    dgw = this.d;
                    break;
                default:
                    if (!super.a(dgo, a2)) {
                        return this;
                    }
                    continue;
            }
            dgo.a(dgw);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        long[] jArr;
        int a2 = super.a();
        Integer num = this.e;
        if (num != null) {
            a2 += dgq.b(9, num.intValue());
        }
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(10, str);
        }
        Integer num2 = this.f;
        if (num2 != null) {
            a2 += dgq.c(88) + dgq.c(num2.intValue());
        }
        Integer num3 = this.g;
        if (num3 != null) {
            a2 += dgq.b(12, num3.intValue());
        }
        doy doy = this.h;
        if (doy != null) {
            a2 += dgq.b(13, (dgw) doy);
        }
        long[] jArr2 = this.b;
        if (jArr2 != null && jArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr = this.b;
                if (i2 >= jArr.length) {
                    break;
                }
                i3 += dgq.a(jArr[i2]);
                i2++;
            }
            a2 = a2 + i3 + (jArr.length * 1);
        }
        dol dol = this.c;
        if (dol != null) {
            a2 += dgq.b(15, (dgw) dol);
        }
        dom dom = this.i;
        if (dom != null) {
            a2 += dgq.b(16, (dgw) dom);
        }
        dor dor = this.j;
        if (dor != null) {
            a2 += dgq.b(17, (dgw) dor);
        }
        dog dog = this.d;
        return dog != null ? a2 + dgq.b(18, (dgw) dog) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.e;
        if (num != null) {
            dgq.a(9, num.intValue());
        }
        String str = this.a;
        if (str != null) {
            dgq.a(10, str);
        }
        Integer num2 = this.f;
        int i2 = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            dgq.c(11, 0);
            dgq.b(intValue);
        }
        Integer num3 = this.g;
        if (num3 != null) {
            dgq.a(12, num3.intValue());
        }
        doy doy = this.h;
        if (doy != null) {
            dgq.a(13, (dgw) doy);
        }
        long[] jArr = this.b;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.b;
                if (i2 >= jArr2.length) {
                    break;
                }
                dgq.a(14, jArr2[i2]);
                i2++;
            }
        }
        dol dol = this.c;
        if (dol != null) {
            dgq.a(15, (dgw) dol);
        }
        dom dom = this.i;
        if (dom != null) {
            dgq.a(16, (dgw) dom);
        }
        dor dor = this.j;
        if (dor != null) {
            dgq.a(17, (dgw) dor);
        }
        dog dog = this.d;
        if (dog != null) {
            dgq.a(18, (dgw) dog);
        }
        super.a(dgq);
    }
}
