package defpackage;

/* renamed from: kmz reason: default package */
final class kmz<M, E, F> implements kni<M, E, F> {
    private final kni<M, E, F> a;
    private final d<M, E, F> b;

    kmz(kni<M, E, F> kni, d<M, E, F> dVar) {
        this.a = (kni) koa.a(kni);
        this.b = (d) koa.a(dVar);
    }

    private kng<M, F> a(M m, E e) {
        try {
            return this.a.update(m, e);
        } catch (Exception e2) {
            this.b.a(m, e, (Throwable) e2);
            throw kob.a(e2);
        }
    }

    public final kng<M, F> update(M m, E e) {
        this.b.a(m, e);
        kng<M, F> a2 = a(m, e);
        this.b.a(m, e, a2);
        return a2;
    }
}
