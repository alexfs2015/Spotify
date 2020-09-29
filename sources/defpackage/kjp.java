package defpackage;

/* renamed from: kjp reason: default package */
final class kjp<M, F> implements kjo<M, F> {
    private final kjo<M, F> a;
    private final d<M, ?, F> b;

    kjp(kjo<M, F> kjo, d<M, ?, F> dVar) {
        this.a = (kjo) kkr.a(kjo);
        this.b = (d) kkr.a(dVar);
    }

    public final kjn<M, F> init(M m) {
        this.b.a(m);
        kjn<M, F> a2 = a(m);
        this.b.a(m, a2);
        return a2;
    }

    private kjn<M, F> a(M m) {
        try {
            return this.a.init(m);
        } catch (Exception e) {
            this.b.a(m, (Throwable) e);
            throw kks.a(e);
        }
    }
}
