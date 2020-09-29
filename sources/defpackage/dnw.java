package defpackage;

import com.comscore.streaming.ContentType;

/* renamed from: dnw reason: default package */
public final class dnw extends dga<dnw> {
    public String a;
    public long[] b;
    public dnu c;
    public dnp d;
    private Integer e;
    private Integer f;
    private Integer g;
    private doh h;
    private dnv i;
    private doa j;

    public dnw() {
        this.e = null;
        this.a = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = dgi.b;
        this.c = null;
        this.i = null;
        this.j = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnw a(dfx dfx) {
        dgf dgf;
        while (true) {
            int a2 = dfx.a();
            switch (a2) {
                case 0:
                    return this;
                case b.bA /*72*/:
                    this.e = Integer.valueOf(dfx.f());
                    continue;
                case 82:
                    this.a = dfx.d();
                    continue;
                case 88:
                    this.f = Integer.valueOf(dfx.f());
                    continue;
                case 96:
                    int i2 = dfx.i();
                    try {
                        this.g = Integer.valueOf(dno.a(dfx.f()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        dfx.e(i2);
                        a(dfx, a2);
                        break;
                    }
                case 106:
                    if (this.h == null) {
                        this.h = new doh();
                    }
                    dgf = this.h;
                    break;
                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                    int a3 = dgi.a(dfx, ContentType.LONG_FORM_ON_DEMAND);
                    long[] jArr = this.b;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, jArr2, 0, length);
                    }
                    while (true) {
                        int length2 = jArr2.length - 1;
                        long g2 = dfx.g();
                        if (length < length2) {
                            jArr2[length] = g2;
                            dfx.a();
                            length++;
                        } else {
                            jArr2[length] = g2;
                            this.b = jArr2;
                            continue;
                        }
                    }
                case a.aB /*114*/:
                    int c2 = dfx.c(dfx.f());
                    int i3 = dfx.i();
                    int i4 = 0;
                    while (dfx.h() > 0) {
                        dfx.g();
                        i4++;
                    }
                    dfx.e(i3);
                    long[] jArr3 = this.b;
                    int length3 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(i4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.b, 0, jArr4, 0, length3);
                    }
                    while (length3 < jArr4.length) {
                        jArr4[length3] = dfx.g();
                        length3++;
                    }
                    this.b = jArr4;
                    dfx.d(c2);
                    continue;
                case 122:
                    if (this.c == null) {
                        this.c = new dnu();
                    }
                    dgf = this.c;
                    break;
                case 130:
                    if (this.i == null) {
                        this.i = new dnv();
                    }
                    dgf = this.i;
                    break;
                case 138:
                    if (this.j == null) {
                        this.j = new doa();
                    }
                    dgf = this.j;
                    break;
                case 146:
                    if (this.d == null) {
                        this.d = new dnp();
                    }
                    dgf = this.d;
                    break;
                default:
                    if (!super.a(dfx, a2)) {
                        return this;
                    }
                    continue;
            }
            dfx.a(dgf);
        }
    }

    public final void a(dfz dfz) {
        Integer num = this.e;
        if (num != null) {
            dfz.a(9, num.intValue());
        }
        String str = this.a;
        if (str != null) {
            dfz.a(10, str);
        }
        Integer num2 = this.f;
        int i2 = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            dfz.c(11, 0);
            dfz.b(intValue);
        }
        Integer num3 = this.g;
        if (num3 != null) {
            dfz.a(12, num3.intValue());
        }
        doh doh = this.h;
        if (doh != null) {
            dfz.a(13, (dgf) doh);
        }
        long[] jArr = this.b;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.b;
                if (i2 >= jArr2.length) {
                    break;
                }
                dfz.a(14, jArr2[i2]);
                i2++;
            }
        }
        dnu dnu = this.c;
        if (dnu != null) {
            dfz.a(15, (dgf) dnu);
        }
        dnv dnv = this.i;
        if (dnv != null) {
            dfz.a(16, (dgf) dnv);
        }
        doa doa = this.j;
        if (doa != null) {
            dfz.a(17, (dgf) doa);
        }
        dnp dnp = this.d;
        if (dnp != null) {
            dfz.a(18, (dgf) dnp);
        }
        super.a(dfz);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        long[] jArr;
        int a2 = super.a();
        Integer num = this.e;
        if (num != null) {
            a2 += dfz.b(9, num.intValue());
        }
        String str = this.a;
        if (str != null) {
            a2 += dfz.b(10, str);
        }
        Integer num2 = this.f;
        if (num2 != null) {
            a2 += dfz.c(88) + dfz.c(num2.intValue());
        }
        Integer num3 = this.g;
        if (num3 != null) {
            a2 += dfz.b(12, num3.intValue());
        }
        doh doh = this.h;
        if (doh != null) {
            a2 += dfz.b(13, (dgf) doh);
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
                i3 += dfz.a(jArr[i2]);
                i2++;
            }
            a2 = a2 + i3 + (jArr.length * 1);
        }
        dnu dnu = this.c;
        if (dnu != null) {
            a2 += dfz.b(15, (dgf) dnu);
        }
        dnv dnv = this.i;
        if (dnv != null) {
            a2 += dfz.b(16, (dgf) dnv);
        }
        doa doa = this.j;
        if (doa != null) {
            a2 += dfz.b(17, (dgf) doa);
        }
        dnp dnp = this.d;
        return dnp != null ? a2 + dfz.b(18, (dgf) dnp) : a2;
    }
}
