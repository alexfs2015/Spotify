package defpackage;

@cey
/* renamed from: ebr reason: default package */
public final class ebr<I, O> implements ebg<I, O> {
    final ebi<O> a;
    final ebj<I> b;
    final String c;
    private final eah d;

    ebr(eah eah, String str, ebj<I> ebj, ebi<O> ebi) {
        this.d = eah;
        this.c = str;
        this.b = ebj;
        this.a = ebi;
    }

    public final cpr<O> a(I i) {
        return b(i);
    }

    public final cpr<O> b(I i) {
        cqc cqc = new cqc();
        eau a2 = this.d.a();
        a2.a(new ebs(this, a2, i, cqc), new ebt(cqc, a2));
        return cqc;
    }
}
