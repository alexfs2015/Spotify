package defpackage;

/* renamed from: doi reason: default package */
public final class doi extends dga<doi> {
    private static volatile doi[] a;
    private dom b;
    private dop c;
    private doq d;
    private dor e;
    private doj f;
    private don g;
    private dol h;
    private Integer i;
    private Integer j;
    private dog k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Long q;

    public doi() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.Y = null;
        this.Z = -1;
    }

    public static doi[] b() {
        if (a == null) {
            synchronized (dge.b) {
                if (a == null) {
                    a = new doi[0];
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        dom dom = this.b;
        if (dom != null) {
            a2 += dfz.b(5, (dgf) dom);
        }
        dop dop = this.c;
        if (dop != null) {
            a2 += dfz.b(6, (dgf) dop);
        }
        doq doq = this.d;
        if (doq != null) {
            a2 += dfz.b(7, (dgf) doq);
        }
        dor dor = this.e;
        if (dor != null) {
            a2 += dfz.b(8, (dgf) dor);
        }
        doj doj = this.f;
        if (doj != null) {
            a2 += dfz.b(9, (dgf) doj);
        }
        don don = this.g;
        if (don != null) {
            a2 += dfz.b(10, (dgf) don);
        }
        dol dol = this.h;
        if (dol != null) {
            a2 += dfz.b(11, (dgf) dol);
        }
        Integer num = this.i;
        if (num != null) {
            a2 += dfz.b(12, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            a2 += dfz.b(13, num2.intValue());
        }
        dog dog = this.k;
        if (dog != null) {
            a2 += dfz.b(14, (dgf) dog);
        }
        Integer num3 = this.l;
        if (num3 != null) {
            a2 += dfz.b(15, num3.intValue());
        }
        Integer num4 = this.m;
        if (num4 != null) {
            a2 += dfz.b(16, num4.intValue());
        }
        Integer num5 = this.n;
        if (num5 != null) {
            a2 += dfz.b(17, num5.intValue());
        }
        Integer num6 = this.o;
        if (num6 != null) {
            a2 += dfz.b(18, num6.intValue());
        }
        Integer num7 = this.p;
        if (num7 != null) {
            a2 += dfz.b(19, num7.intValue());
        }
        Long l2 = this.q;
        return l2 != null ? a2 + dfz.c(20, l2.longValue()) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        dgf dgf;
        while (true) {
            int a2 = dfx.a();
            switch (a2) {
                case 0:
                    return this;
                case 42:
                    if (this.b == null) {
                        this.b = new dom();
                    }
                    dgf = this.b;
                    break;
                case 50:
                    if (this.c == null) {
                        this.c = new dop();
                    }
                    dgf = this.c;
                    break;
                case 58:
                    if (this.d == null) {
                        this.d = new doq();
                    }
                    dgf = this.d;
                    break;
                case b.bu /*66*/:
                    if (this.e == null) {
                        this.e = new dor();
                    }
                    dgf = this.e;
                    break;
                case b.bC /*74*/:
                    if (this.f == null) {
                        this.f = new doj();
                    }
                    dgf = this.f;
                    break;
                case 82:
                    if (this.g == null) {
                        this.g = new don();
                    }
                    dgf = this.g;
                    break;
                case 90:
                    if (this.h == null) {
                        this.h = new dol();
                    }
                    dgf = this.h;
                    break;
                case 96:
                    this.i = Integer.valueOf(dfx.f());
                    continue;
                case 104:
                    this.j = Integer.valueOf(dfx.f());
                    continue;
                case a.aB /*114*/:
                    if (this.k == null) {
                        this.k = new dog();
                    }
                    dgf = this.k;
                    break;
                case 120:
                    this.l = Integer.valueOf(dfx.f());
                    continue;
                case 128:
                    this.m = Integer.valueOf(dfx.f());
                    continue;
                case 136:
                    this.n = Integer.valueOf(dfx.f());
                    continue;
                case 144:
                    this.o = Integer.valueOf(dfx.f());
                    continue;
                case 152:
                    this.p = Integer.valueOf(dfx.f());
                    continue;
                case 160:
                    this.q = Long.valueOf(dfx.g());
                    continue;
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
        dom dom = this.b;
        if (dom != null) {
            dfz.a(5, (dgf) dom);
        }
        dop dop = this.c;
        if (dop != null) {
            dfz.a(6, (dgf) dop);
        }
        doq doq = this.d;
        if (doq != null) {
            dfz.a(7, (dgf) doq);
        }
        dor dor = this.e;
        if (dor != null) {
            dfz.a(8, (dgf) dor);
        }
        doj doj = this.f;
        if (doj != null) {
            dfz.a(9, (dgf) doj);
        }
        don don = this.g;
        if (don != null) {
            dfz.a(10, (dgf) don);
        }
        dol dol = this.h;
        if (dol != null) {
            dfz.a(11, (dgf) dol);
        }
        Integer num = this.i;
        if (num != null) {
            dfz.a(12, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            dfz.a(13, num2.intValue());
        }
        dog dog = this.k;
        if (dog != null) {
            dfz.a(14, (dgf) dog);
        }
        Integer num3 = this.l;
        if (num3 != null) {
            dfz.a(15, num3.intValue());
        }
        Integer num4 = this.m;
        if (num4 != null) {
            dfz.a(16, num4.intValue());
        }
        Integer num5 = this.n;
        if (num5 != null) {
            dfz.a(17, num5.intValue());
        }
        Integer num6 = this.o;
        if (num6 != null) {
            dfz.a(18, num6.intValue());
        }
        Integer num7 = this.p;
        if (num7 != null) {
            dfz.a(19, num7.intValue());
        }
        Long l2 = this.q;
        if (l2 != null) {
            dfz.a(20, l2.longValue());
        }
        super.a(dfz);
    }
}
