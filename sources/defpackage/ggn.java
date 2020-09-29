package defpackage;

/* renamed from: ggn reason: default package */
final class ggn {
    private final gft a;
    private final ggf b;
    private int c = -1;

    ggn(gft gft, ggf ggf) {
        this.a = gft;
        this.b = ggf;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized int a() {
        if (this.c != -1) {
            return this.c;
        }
        int b2 = this.a.b("monotonic_clock_id", -1);
        if (b2 == -1) {
            this.b.b();
            this.a.a("monotonic_clock_id", 1);
            this.c = 1;
            return this.c;
        }
        if (this.b.a()) {
            b2++;
            this.a.a("monotonic_clock_id", b2);
        }
        this.c = b2;
        return this.c;
    }
}
