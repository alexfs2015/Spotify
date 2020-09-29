package defpackage;

/* renamed from: ssi reason: default package */
public final class ssi implements wig<ssh> {
    private final wzi<hgz> a;
    private final wzi<rqb> b;
    private final wzi<hgy> c;

    private ssi(wzi<hgz> wzi, wzi<rqb> wzi2, wzi<hgy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ssi a(wzi<hgz> wzi, wzi<rqb> wzi2, wzi<hgy> wzi3) {
        return new ssi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ssh((hgz) this.a.get(), (rqb) this.b.get(), (hgy) this.c.get());
    }
}
