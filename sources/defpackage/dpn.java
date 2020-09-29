package defpackage;

@cey
/* renamed from: dpn reason: default package */
public final class dpn {
    private static final Object a = new Object();
    private static dpn b;
    private final col c = new col();
    private final dpf d;
    private final String e;
    private final dsl f;
    private final dsm g;
    private final dsn h;

    static {
        dpn dpn = new dpn();
        synchronized (a) {
            b = dpn;
        }
    }

    protected dpn() {
        dpf dpf = new dpf(new dow(), new dov(), new drn(), new dwy(), new cja(), new cch(), new dwz());
        this.d = dpf;
        this.e = col.c();
        this.f = new dsl();
        this.g = new dsm();
        this.h = new dsn();
    }

    public static col a() {
        return g().c;
    }

    public static dpf b() {
        return g().d;
    }

    public static String c() {
        return g().e;
    }

    public static dsm d() {
        return g().g;
    }

    public static dsl e() {
        return g().f;
    }

    public static dsn f() {
        return g().h;
    }

    private static dpn g() {
        dpn dpn;
        synchronized (a) {
            dpn = b;
        }
        return dpn;
    }
}
