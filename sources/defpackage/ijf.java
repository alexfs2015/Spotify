package defpackage;

/* renamed from: ijf reason: default package */
public final class ijf implements wig<ije> {
    private final wzi<jtz> a;
    private final wzi<iin> b;
    private final wzi<igd> c;
    private final wzi<keu> d;
    private final wzi<ijh> e;

    private ijf(wzi<jtz> wzi, wzi<iin> wzi2, wzi<igd> wzi3, wzi<keu> wzi4, wzi<ijh> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ijf a(wzi<jtz> wzi, wzi<iin> wzi2, wzi<igd> wzi3, wzi<keu> wzi4, wzi<ijh> wzi5) {
        ijf ijf = new ijf(wzi, wzi2, wzi3, wzi4, wzi5);
        return ijf;
    }

    public final /* synthetic */ Object get() {
        ije ije = new ije(this.a, this.b, this.c, (keu) this.d.get(), (ijh) this.e.get());
        return ije;
    }
}
