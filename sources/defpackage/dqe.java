package defpackage;

@cfp
/* renamed from: dqe reason: default package */
public final class dqe {
    private static final Object a = new Object();
    private static dqe b;
    private final cpc c = new cpc();
    private final dpw d;
    private final String e;
    private final dtc f;
    private final dtd g;
    private final dte h;

    static {
        dqe dqe = new dqe();
        synchronized (a) {
            b = dqe;
        }
    }

    protected dqe() {
        dpw dpw = new dpw(new dpn(), new dpm(), new dse(), new dxp(), new cjr(), new ccy(), new dxq());
        this.d = dpw;
        this.e = cpc.c();
        this.f = new dtc();
        this.g = new dtd();
        this.h = new dte();
    }

    public static cpc a() {
        return g().c;
    }

    public static dpw b() {
        return g().d;
    }

    public static String c() {
        return g().e;
    }

    public static dtd d() {
        return g().g;
    }

    public static dtc e() {
        return g().f;
    }

    public static dte f() {
        return g().h;
    }

    private static dqe g() {
        dqe dqe;
        synchronized (a) {
            dqe = b;
        }
        return dqe;
    }
}
