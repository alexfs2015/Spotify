package defpackage;

/* renamed from: ggp reason: default package */
final class ggp implements ggf {
    private final gft a;
    private final gge b;

    ggp(gft gft, gge gge) {
        this.a = gft;
        this.b = gge;
    }

    public final boolean a() {
        String str = "boot_count";
        int b2 = this.a.b(str, -1);
        int a2 = this.b.a();
        if (b2 != -1 && b2 >= a2) {
            return false;
        }
        this.a.a(str, a2);
        return true;
    }

    public final void b() {
        this.a.a("boot_count", this.b.a());
    }
}
