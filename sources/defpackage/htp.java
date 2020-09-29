package defpackage;

/* renamed from: htp reason: default package */
public final class htp implements wig<hto> {
    private final wzi<htb> a;
    private final wzi<htu> b;
    private final wzi<hre> c;
    private final wzi<hts> d;
    private final wzi<hgz> e;
    private final wzi<jty> f;

    private htp(wzi<htb> wzi, wzi<htu> wzi2, wzi<hre> wzi3, wzi<hts> wzi4, wzi<hgz> wzi5, wzi<jty> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static htp a(wzi<htb> wzi, wzi<htu> wzi2, wzi<hre> wzi3, wzi<hts> wzi4, wzi<hgz> wzi5, wzi<jty> wzi6) {
        htp htp = new htp(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return htp;
    }

    public final /* synthetic */ Object get() {
        hto hto = new hto((htb) this.a.get(), (htu) this.b.get(), (hre) this.c.get(), (hts) this.d.get(), (hgz) this.e.get(), (jty) this.f.get());
        return hto;
    }
}
