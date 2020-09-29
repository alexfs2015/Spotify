package defpackage;

/* renamed from: pez reason: default package */
public final class pez {
    private static final long[] b = {172800000, 604800000};
    public final pfa a;
    private final jrp c;

    public pez(pfa pfa, jrp jrp) {
        this.a = pfa;
        this.c = jrp;
    }

    public final long a() {
        int c2 = this.a.c();
        if (c2 >= 2) {
            return Long.MAX_VALUE;
        }
        return this.a.b() + b[c2];
    }

    public final boolean b() {
        return a() < this.c.a();
    }
}
