package defpackage;

/* renamed from: ijb reason: default package */
public final class ijb implements wig<ija> {
    private final wzi<iin> a;
    private final wzi<igd> b;
    private final wzi<keu> c;
    private final wzi<ijh> d;

    private ijb(wzi<iin> wzi, wzi<igd> wzi2, wzi<keu> wzi3, wzi<ijh> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ijb a(wzi<iin> wzi, wzi<igd> wzi2, wzi<keu> wzi3, wzi<ijh> wzi4) {
        return new ijb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ija(this.a, this.b, (keu) this.c.get(), (ijh) this.d.get());
    }
}
