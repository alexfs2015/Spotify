package defpackage;

/* renamed from: kjq reason: default package */
final class kjq<M, E, F> implements kjz<M, E, F> {
    private final kjz<M, E, F> a;
    private final d<M, E, F> b;

    kjq(kjz<M, E, F> kjz, d<M, E, F> dVar) {
        this.a = (kjz) kkr.a(kjz);
        this.b = (d) kkr.a(dVar);
    }

    public final kjx<M, F> update(M m, E e) {
        this.b.a(m, e);
        kjx<M, F> a2 = a(m, e);
        this.b.a(m, e, a2);
        return a2;
    }

    private kjx<M, F> a(M m, E e) {
        try {
            return this.a.update(m, e);
        } catch (Exception e2) {
            this.b.a(m, e, (Throwable) e2);
            throw kks.a(e2);
        }
    }
}
