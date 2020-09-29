package defpackage;

/* renamed from: kxg reason: default package */
public final class kxg implements wig<kxf> {
    private final wzi<kwn> a;
    private final wzi<kwy> b;
    private final wzi<jtz> c;
    private final wzi<kwp> d;
    private final wzi<kxj> e;

    private kxg(wzi<kwn> wzi, wzi<kwy> wzi2, wzi<jtz> wzi3, wzi<kwp> wzi4, wzi<kxj> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static kxg a(wzi<kwn> wzi, wzi<kwy> wzi2, wzi<jtz> wzi3, wzi<kwp> wzi4, wzi<kxj> wzi5) {
        kxg kxg = new kxg(wzi, wzi2, wzi3, wzi4, wzi5);
        return kxg;
    }

    public final /* synthetic */ Object get() {
        kxf kxf = new kxf((kwn) this.a.get(), (kwy) this.b.get(), (jtz) this.c.get(), (kwp) this.d.get(), (kxj) this.e.get());
        return kxf;
    }
}
