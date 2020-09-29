package defpackage;

/* renamed from: fqc reason: default package */
public final class fqc implements wig<fqb> {
    private final wzi<fqd> a;

    private fqc(wzi<fqd> wzi) {
        this.a = wzi;
    }

    public static fqb a(Object obj) {
        return new fqb((fqd) obj);
    }

    public static fqc a(wzi<fqd> wzi) {
        return new fqc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new fqb((fqd) this.a.get());
    }
}
