package defpackage;

/* renamed from: htr reason: default package */
public final class htr implements wig<htq> {
    private final wzi<hre> a;
    private final wzi<htu> b;
    private final wzi<htb> c;
    private final wzi<hts> d;
    private final wzi<hgz> e;
    private final wzi<jty> f;

    private htr(wzi<hre> wzi, wzi<htu> wzi2, wzi<htb> wzi3, wzi<hts> wzi4, wzi<hgz> wzi5, wzi<jty> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static htr a(wzi<hre> wzi, wzi<htu> wzi2, wzi<htb> wzi3, wzi<hts> wzi4, wzi<hgz> wzi5, wzi<jty> wzi6) {
        htr htr = new htr(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return htr;
    }

    public final /* synthetic */ Object get() {
        htq htq = new htq((hre) this.a.get(), (htu) this.b.get(), (htb) this.c.get(), (hts) this.d.get(), (hgz) this.e.get(), (jty) this.f.get());
        return htq;
    }
}
