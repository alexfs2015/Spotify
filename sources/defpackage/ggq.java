package defpackage;

/* renamed from: ggq reason: default package */
final class ggq implements ggf {
    private final gft a;
    private final ggg b;

    ggq(gft gft, ggg ggg) {
        this.a = gft;
        this.b = ggg;
    }

    public final boolean a() {
        String str = "boot_id";
        String a2 = this.a.a(str, (String) null);
        String a3 = this.b.a();
        if (a2 != null && a2.equals(a3)) {
            return false;
        }
        this.a.b(str, a3);
        return true;
    }

    public final void b() {
        this.a.b("boot_id", this.b.a());
    }
}
