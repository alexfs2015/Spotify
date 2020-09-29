package defpackage;

/* renamed from: kmy reason: default package */
final class kmy<M, F> implements kmx<M, F> {
    private final kmx<M, F> a;
    private final d<M, ?, F> b;

    kmy(kmx<M, F> kmx, d<M, ?, F> dVar) {
        this.a = (kmx) koa.a(kmx);
        this.b = (d) koa.a(dVar);
    }

    private kmw<M, F> a(M m) {
        try {
            return this.a.init(m);
        } catch (Exception e) {
            this.b.a(m, (Throwable) e);
            throw kob.a(e);
        }
    }

    public final kmw<M, F> init(M m) {
        this.b.a(m);
        kmw<M, F> a2 = a(m);
        this.b.a(m, a2);
        return a2;
    }
}
