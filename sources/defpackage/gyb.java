package defpackage;

/* renamed from: gyb reason: default package */
public final class gyb implements wig<gya> {
    private final wzi<szp> a;
    private final wzi<has> b;
    private final wzi<hcf> c;
    private final wzi<wbt> d;

    private gyb(wzi<szp> wzi, wzi<has> wzi2, wzi<hcf> wzi3, wzi<wbt> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static gyb a(wzi<szp> wzi, wzi<has> wzi2, wzi<hcf> wzi3, wzi<wbt> wzi4) {
        return new gyb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new gya((szp) this.a.get(), (has) this.b.get(), (hcf) this.c.get(), (wbt) this.d.get());
    }
}
