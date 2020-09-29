package defpackage;

/* renamed from: slb reason: default package */
final class slb implements sla {
    private final fqn a;

    public slb(fqn fqn) {
        this.a = fqn;
    }

    public final int a() {
        fqn fqn = this.a;
        fbp.a(fqn);
        if (isu.a(fqn)) {
            return (!isu.c(fqn) || !kbb.b(fqn)) ? 6 : 2;
        }
        return 0;
    }
}
