package defpackage;

/* renamed from: jjn reason: default package */
public final class jjn implements a {
    private final jkp a;

    public jjn(jkp jkp) {
        this.a = jkp;
    }

    public final void a() {
        jjm f = this.a.f();
        if (f != null && !f.a && f.c != null && f.b != null) {
            f.b.registerListener(f, f.c, 3);
            f.a = true;
        }
    }

    public final void b() {
        jjm f = this.a.f();
        if (f != null) {
            f.e();
        }
    }

    public final String c() {
        return "DeviceMovingState";
    }
}
