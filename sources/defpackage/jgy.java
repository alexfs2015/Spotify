package defpackage;

/* renamed from: jgy reason: default package */
public final class jgy implements a {
    private final jhz a;

    public final String c() {
        return "DeviceMovingState";
    }

    public jgy(jhz jhz) {
        this.a = jhz;
    }

    public final void a() {
        jgx f = this.a.f();
        if (f != null && !f.a && f.c != null && f.b != null) {
            f.b.registerListener(f, f.c, 3);
            f.a = true;
        }
    }

    public final void b() {
        jgx f = this.a.f();
        if (f != null) {
            f.e();
        }
    }
}
