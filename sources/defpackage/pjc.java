package defpackage;

/* renamed from: pjc reason: default package */
public final class pjc implements wig<pjb> {
    private final wzi<lon> a;
    private final wzi<tyj> b;
    private final wzi<piv> c;
    private final wzi<String> d;
    private final wzi<phf> e;

    private pjc(wzi<lon> wzi, wzi<tyj> wzi2, wzi<piv> wzi3, wzi<String> wzi4, wzi<phf> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pjc a(wzi<lon> wzi, wzi<tyj> wzi2, wzi<piv> wzi3, wzi<String> wzi4, wzi<phf> wzi5) {
        pjc pjc = new pjc(wzi, wzi2, wzi3, wzi4, wzi5);
        return pjc;
    }

    public final /* synthetic */ Object get() {
        pjb pjb = new pjb((lon) this.a.get(), (tyj) this.b.get(), (piv) this.c.get(), (String) this.d.get(), (phf) this.e.get());
        return pjb;
    }
}
