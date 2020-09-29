package defpackage;

/* renamed from: tvb reason: default package */
public final class tvb implements wig<tva> {
    private final wzi<a> a;
    private final wzi<hhc> b;
    private final wzi<a> c;
    private final wzi<rkc> d;
    private final wzi<String> e;

    private tvb(wzi<a> wzi, wzi<hhc> wzi2, wzi<a> wzi3, wzi<rkc> wzi4, wzi<String> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tvb a(wzi<a> wzi, wzi<hhc> wzi2, wzi<a> wzi3, wzi<rkc> wzi4, wzi<String> wzi5) {
        tvb tvb = new tvb(wzi, wzi2, wzi3, wzi4, wzi5);
        return tvb;
    }

    public final /* synthetic */ Object get() {
        tva tva = new tva(this.a, this.b, this.c, this.d, this.e);
        return tva;
    }
}
