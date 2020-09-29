package defpackage;

import android.os.Build.VERSION;

@cfp
/* renamed from: bkc reason: default package */
public final class bkc {
    private static final Object a = new Object();
    private static bkc b;
    private final bji A;
    private final ccx B;
    private final dnx C;
    private final clg D;
    private final css E;
    private final crb F;
    private final eai G;
    private final cnl H;
    private final coy I;
    private final cme J;
    private final bhh c = new bhh();
    private final cfq d = new cfq();
    private final bhr e = new bhr();
    private final cdt f = new cdt();
    private final cmu g = new cmu();
    private final ctp h = new ctp();
    private final cna i;
    private final dml j;
    private final clv k;
    private final dni l;
    private final dnj m;
    private final bzx n;
    private final bij o;
    private final dtl p;
    private final cnu q;
    private final cik r;
    private final cqu s;
    private final dzp t;
    private final eby u;
    private final cop v;
    private final bia w;
    private final bib x;
    private final ecz y;
    private final coq z;

    static {
        bkc bkc = new bkc();
        synchronized (a) {
            b = bkc;
        }
    }

    protected bkc() {
        int i2 = VERSION.SDK_INT;
        cna cna = i2 >= 21 ? new cnk() : i2 >= 19 ? new cni() : i2 >= 18 ? new cng() : i2 >= 17 ? new cnf() : i2 >= 16 ? new cnh() : new cne();
        this.i = cna;
        this.j = new dml();
        this.k = new clv();
        this.J = new cme();
        this.l = new dni();
        this.m = new dnj();
        this.n = caa.d();
        this.o = new bij();
        this.p = new dtl();
        this.q = new cnu();
        this.r = new cik();
        this.G = new eai();
        this.s = new cqu();
        this.t = new dzp();
        this.u = new eby();
        this.v = new cop();
        this.w = new bia();
        this.x = new bib();
        this.y = new ecz();
        this.z = new coq();
        this.A = new bji();
        this.B = new ccx();
        this.C = new dnx();
        this.D = new clg();
        this.E = new css();
        this.F = new crb();
        this.H = new cnl();
        this.I = new coy();
    }

    public static crb A() {
        return F().F;
    }

    public static clg B() {
        return F().D;
    }

    public static eai C() {
        return F().G;
    }

    public static cnl D() {
        return F().H;
    }

    public static coy E() {
        return F().I;
    }

    private static bkc F() {
        bkc bkc;
        synchronized (a) {
            bkc = b;
        }
        return bkc;
    }

    public static cfq a() {
        return F().d;
    }

    public static bhh b() {
        return F().c;
    }

    public static bhr c() {
        return F().e;
    }

    public static cdt d() {
        return F().f;
    }

    public static cmu e() {
        return F().g;
    }

    public static ctp f() {
        return F().h;
    }

    public static cna g() {
        return F().i;
    }

    public static dml h() {
        return F().j;
    }

    public static clv i() {
        return F().k;
    }

    public static cme j() {
        return F().J;
    }

    public static dnj k() {
        return F().m;
    }

    public static bzx l() {
        return F().n;
    }

    public static bij m() {
        return F().o;
    }

    public static dtl n() {
        return F().p;
    }

    public static cnu o() {
        return F().q;
    }

    public static cik p() {
        return F().r;
    }

    public static cqu q() {
        return F().s;
    }

    public static dzp r() {
        return F().t;
    }

    public static eby s() {
        return F().u;
    }

    public static cop t() {
        return F().v;
    }

    public static ccx u() {
        return F().B;
    }

    public static bia v() {
        return F().w;
    }

    public static bib w() {
        return F().x;
    }

    public static ecz x() {
        return F().y;
    }

    public static coq y() {
        return F().z;
    }

    public static css z() {
        return F().E;
    }
}
