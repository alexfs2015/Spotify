package defpackage;

/* renamed from: hst reason: default package */
public final class hst implements wig<hss> {
    private final wzi<huy> a;
    private final wzi<hre> b;
    private final wzi<jty> c;
    private final wzi<jtp> d;
    private final wzi<hra> e;
    private final wzi<hgz> f;

    private hst(wzi<huy> wzi, wzi<hre> wzi2, wzi<jty> wzi3, wzi<jtp> wzi4, wzi<hra> wzi5, wzi<hgz> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static hst a(wzi<huy> wzi, wzi<hre> wzi2, wzi<jty> wzi3, wzi<jtp> wzi4, wzi<hra> wzi5, wzi<hgz> wzi6) {
        hst hst = new hst(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return hst;
    }

    public final /* synthetic */ Object get() {
        hss hss = new hss((huy) this.a.get(), (hre) this.b.get(), (jty) this.c.get(), (jtp) this.d.get(), (hra) this.e.get(), (hgz) this.f.get());
        return hss;
    }
}
