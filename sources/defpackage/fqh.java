package defpackage;

/* renamed from: fqh reason: default package */
public final class fqh implements wig<fqa> {
    private final wzi<fqf> a;

    private fqh(wzi<fqf> wzi) {
        this.a = wzi;
    }

    public static fqa a(Object obj) {
        return new fqa((fqf) obj);
    }

    public static fqh a(wzi<fqf> wzi) {
        return new fqh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new fqa((fqf) this.a.get());
    }
}
