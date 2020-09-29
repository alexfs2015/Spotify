package defpackage;

/* renamed from: fqg reason: default package */
public final class fqg implements wig<fqf> {
    private final wzi<fqb> a;

    private fqg(wzi<fqb> wzi) {
        this.a = wzi;
    }

    public static fqf a(Object obj) {
        return new fqf((fqb) obj);
    }

    public static fqg a(wzi<fqb> wzi) {
        return new fqg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new fqf((fqb) this.a.get());
    }
}
