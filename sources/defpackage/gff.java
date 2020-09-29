package defpackage;

/* renamed from: gff reason: default package */
final class gff implements geu {
    private final gei a;
    private final gev b;

    gff(gei gei, gev gev) {
        this.a = gei;
        this.b = gev;
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
