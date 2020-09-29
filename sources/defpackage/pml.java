package defpackage;

/* renamed from: pml reason: default package */
public final class pml {
    private static final long[] b = {172800000, 604800000};
    public final pmm a;
    private final jtz c;

    public pml(pmm pmm, jtz jtz) {
        this.a = pmm;
        this.c = jtz;
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
