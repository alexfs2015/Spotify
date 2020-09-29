package defpackage;

import android.os.Build.VERSION;

@cey
/* renamed from: bjl reason: default package */
public final class bjl {
    private static final Object a = new Object();
    private static bjl b;
    private final bir A;
    private final ccg B;
    private final dng C;
    private final ckp D;
    private final csb E;
    private final cqk F;
    private final dzr G;
    private final cmu H;
    private final coh I;
    private final cln J;
    private final bgq c = new bgq();
    private final cez d = new cez();
    private final bha e = new bha();
    private final cdc f = new cdc();
    private final cmd g = new cmd();
    private final csy h = new csy();
    private final cmj i;
    private final dlu j;
    private final cle k;
    private final dmr l;
    private final dms m;
    private final bzg n;
    private final bhs o;
    private final dsu p;
    private final cnd q;
    private final cht r;
    private final cqd s;
    private final dyy t;
    private final ebh u;
    private final cny v;
    private final bhj w;
    private final bhk x;
    private final eci y;
    private final cnz z;

    static {
        bjl bjl = new bjl();
        synchronized (a) {
            b = bjl;
        }
    }

    protected bjl() {
        int i2 = VERSION.SDK_INT;
        cmj cmj = i2 >= 21 ? new cmt() : i2 >= 19 ? new cmr() : i2 >= 18 ? new cmp() : i2 >= 17 ? new cmo() : i2 >= 16 ? new cmq() : new cmn();
        this.i = cmj;
        this.j = new dlu();
        this.k = new cle();
        this.J = new cln();
        this.l = new dmr();
        this.m = new dms();
        this.n = bzj.d();
        this.o = new bhs();
        this.p = new dsu();
        this.q = new cnd();
        this.r = new cht();
        this.G = new dzr();
        this.s = new cqd();
        this.t = new dyy();
        this.u = new ebh();
        this.v = new cny();
        this.w = new bhj();
        this.x = new bhk();
        this.y = new eci();
        this.z = new cnz();
        this.A = new bir();
        this.B = new ccg();
        this.C = new dng();
        this.D = new ckp();
        this.E = new csb();
        this.F = new cqk();
        this.H = new cmu();
        this.I = new coh();
    }

    public static cqk A() {
        return F().F;
    }

    public static ckp B() {
        return F().D;
    }

    public static dzr C() {
        return F().G;
    }

    public static cmu D() {
        return F().H;
    }

    public static coh E() {
        return F().I;
    }

    private static bjl F() {
        bjl bjl;
        synchronized (a) {
            bjl = b;
        }
        return bjl;
    }

    public static cez a() {
        return F().d;
    }

    public static bgq b() {
        return F().c;
    }

    public static bha c() {
        return F().e;
    }

    public static cdc d() {
        return F().f;
    }

    public static cmd e() {
        return F().g;
    }

    public static csy f() {
        return F().h;
    }

    public static cmj g() {
        return F().i;
    }

    public static dlu h() {
        return F().j;
    }

    public static cle i() {
        return F().k;
    }

    public static cln j() {
        return F().J;
    }

    public static dms k() {
        return F().m;
    }

    public static bzg l() {
        return F().n;
    }

    public static bhs m() {
        return F().o;
    }

    public static dsu n() {
        return F().p;
    }

    public static cnd o() {
        return F().q;
    }

    public static cht p() {
        return F().r;
    }

    public static cqd q() {
        return F().s;
    }

    public static dyy r() {
        return F().t;
    }

    public static ebh s() {
        return F().u;
    }

    public static cny t() {
        return F().v;
    }

    public static ccg u() {
        return F().B;
    }

    public static bhj v() {
        return F().w;
    }

    public static bhk w() {
        return F().x;
    }

    public static eci x() {
        return F().y;
    }

    public static cnz y() {
        return F().z;
    }

    public static csb z() {
        return F().E;
    }
}
