package defpackage;

/* renamed from: gfe reason: default package */
final class gfe implements geu {
    private final gei a;
    private final get b;

    gfe(gei gei, get get) {
        this.a = gei;
        this.b = get;
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
