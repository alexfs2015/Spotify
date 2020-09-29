package defpackage;

/* renamed from: hsz reason: default package */
public final class hsz implements wig<hsy> {
    private final wzi<huz> a;
    private final wzi<hre> b;
    private final wzi<jty> c;
    private final wzi<jtp> d;
    private final wzi<hra> e;
    private final wzi<hgz> f;

    private hsz(wzi<huz> wzi, wzi<hre> wzi2, wzi<jty> wzi3, wzi<jtp> wzi4, wzi<hra> wzi5, wzi<hgz> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static hsz a(wzi<huz> wzi, wzi<hre> wzi2, wzi<jty> wzi3, wzi<jtp> wzi4, wzi<hra> wzi5, wzi<hgz> wzi6) {
        hsz hsz = new hsz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return hsz;
    }

    public final /* synthetic */ Object get() {
        hsy hsy = new hsy((huz) this.a.get(), (hre) this.b.get(), (jty) this.c.get(), (jtp) this.d.get(), (hra) this.e.get(), (hgz) this.f.get());
        return hsy;
    }
}
