package defpackage;

@cfp
/* renamed from: eci reason: default package */
public final class eci<I, O> implements ebx<I, O> {
    final ebz<O> a;
    final eca<I> b;
    final String c;
    private final eay d;

    eci(eay eay, String str, eca<I> eca, ebz<O> ebz) {
        this.d = eay;
        this.c = str;
        this.b = eca;
        this.a = ebz;
    }

    public final cqi<O> a(I i) {
        return b(i);
    }

    public final cqi<O> b(I i) {
        cqt cqt = new cqt();
        ebl a2 = this.d.a();
        a2.a(new ecj(this, a2, i, cqt), new eck(cqt, a2));
        return cqt;
    }
}
