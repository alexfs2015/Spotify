package defpackage;

/* renamed from: doz reason: default package */
public final class doz extends dgr<doz> {
    private static volatile doz[] a;
    private dpd b;
    private dpg c;
    private dph d;
    private dpi e;
    private dpa f;
    private dpe g;
    private dpc h;
    private Integer i;
    private Integer j;
    private dox k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Long q;

    public doz() {
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

    public static doz[] b() {
        if (a == null) {
            synchronized (dgv.b) {
                if (a == null) {
                    a = new doz[0];
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        dpd dpd = this.b;
        if (dpd != null) {
            a2 += dgq.b(5, (dgw) dpd);
        }
        dpg dpg = this.c;
        if (dpg != null) {
            a2 += dgq.b(6, (dgw) dpg);
        }
        dph dph = this.d;
        if (dph != null) {
            a2 += dgq.b(7, (dgw) dph);
        }
        dpi dpi = this.e;
        if (dpi != null) {
            a2 += dgq.b(8, (dgw) dpi);
        }
        dpa dpa = this.f;
        if (dpa != null) {
            a2 += dgq.b(9, (dgw) dpa);
        }
        dpe dpe = this.g;
        if (dpe != null) {
            a2 += dgq.b(10, (dgw) dpe);
        }
        dpc dpc = this.h;
        if (dpc != null) {
            a2 += dgq.b(11, (dgw) dpc);
        }
        Integer num = this.i;
        if (num != null) {
            a2 += dgq.b(12, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            a2 += dgq.b(13, num2.intValue());
        }
        dox dox = this.k;
        if (dox != null) {
            a2 += dgq.b(14, (dgw) dox);
        }
        Integer num3 = this.l;
        if (num3 != null) {
            a2 += dgq.b(15, num3.intValue());
        }
        Integer num4 = this.m;
        if (num4 != null) {
            a2 += dgq.b(16, num4.intValue());
        }
        Integer num5 = this.n;
        if (num5 != null) {
            a2 += dgq.b(17, num5.intValue());
        }
        Integer num6 = this.o;
        if (num6 != null) {
            a2 += dgq.b(18, num6.intValue());
        }
        Integer num7 = this.p;
        if (num7 != null) {
            a2 += dgq.b(19, num7.intValue());
        }
        Long l2 = this.q;
        return l2 != null ? a2 + dgq.c(20, l2.longValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        dgw dgw;
        while (true) {
            int a2 = dgo.a();
            switch (a2) {
                case 0:
                    return this;
                case 42:
                    if (this.b == null) {
                        this.b = new dpd();
                    }
                    dgw = this.b;
                    break;
                case 50:
                    if (this.c == null) {
                        this.c = new dpg();
                    }
                    dgw = this.c;
                    break;
                case 58:
                    if (this.d == null) {
                        this.d = new dph();
                    }
                    dgw = this.d;
                    break;
                case b.bu /*66*/:
                    if (this.e == null) {
                        this.e = new dpi();
                    }
                    dgw = this.e;
                    break;
                case b.bC /*74*/:
                    if (this.f == null) {
                        this.f = new dpa();
                    }
                    dgw = this.f;
                    break;
                case 82:
                    if (this.g == null) {
                        this.g = new dpe();
                    }
                    dgw = this.g;
                    break;
                case 90:
                    if (this.h == null) {
                        this.h = new dpc();
                    }
                    dgw = this.h;
                    break;
                case 96:
                    this.i = Integer.valueOf(dgo.f());
                    continue;
                case 104:
                    this.j = Integer.valueOf(dgo.f());
                    continue;
                case a.aB /*114*/:
                    if (this.k == null) {
                        this.k = new dox();
                    }
                    dgw = this.k;
                    break;
                case 120:
                    this.l = Integer.valueOf(dgo.f());
                    continue;
                case 128:
                    this.m = Integer.valueOf(dgo.f());
                    continue;
                case 136:
                    this.n = Integer.valueOf(dgo.f());
                    continue;
                case 144:
                    this.o = Integer.valueOf(dgo.f());
                    continue;
                case 152:
                    this.p = Integer.valueOf(dgo.f());
                    continue;
                case 160:
                    this.q = Long.valueOf(dgo.g());
                    continue;
                default:
                    if (!super.a(dgo, a2)) {
                        return this;
                    }
                    continue;
            }
            dgo.a(dgw);
        }
    }

    public final void a(dgq dgq) {
        dpd dpd = this.b;
        if (dpd != null) {
            dgq.a(5, (dgw) dpd);
        }
        dpg dpg = this.c;
        if (dpg != null) {
            dgq.a(6, (dgw) dpg);
        }
        dph dph = this.d;
        if (dph != null) {
            dgq.a(7, (dgw) dph);
        }
        dpi dpi = this.e;
        if (dpi != null) {
            dgq.a(8, (dgw) dpi);
        }
        dpa dpa = this.f;
        if (dpa != null) {
            dgq.a(9, (dgw) dpa);
        }
        dpe dpe = this.g;
        if (dpe != null) {
            dgq.a(10, (dgw) dpe);
        }
        dpc dpc = this.h;
        if (dpc != null) {
            dgq.a(11, (dgw) dpc);
        }
        Integer num = this.i;
        if (num != null) {
            dgq.a(12, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            dgq.a(13, num2.intValue());
        }
        dox dox = this.k;
        if (dox != null) {
            dgq.a(14, (dgw) dox);
        }
        Integer num3 = this.l;
        if (num3 != null) {
            dgq.a(15, num3.intValue());
        }
        Integer num4 = this.m;
        if (num4 != null) {
            dgq.a(16, num4.intValue());
        }
        Integer num5 = this.n;
        if (num5 != null) {
            dgq.a(17, num5.intValue());
        }
        Integer num6 = this.o;
        if (num6 != null) {
            dgq.a(18, num6.intValue());
        }
        Integer num7 = this.p;
        if (num7 != null) {
            dgq.a(19, num7.intValue());
        }
        Long l2 = this.q;
        if (l2 != null) {
            dgq.a(20, l2.longValue());
        }
        super.a(dgq);
    }
}
