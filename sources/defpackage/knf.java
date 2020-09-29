package defpackage;

/* renamed from: knf reason: default package */
final class knf<M, E, F> {
    private final kmx<M, F> a;
    private final kni<M, E, F> b;
    private volatile M c;

    knf(kmx<M, F> kmx, kni<M, E, F> kni, M m) {
        this.a = (kmx) koa.a(kmx);
        this.b = (kni) koa.a(kni);
        this.c = koa.a(m);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized kmw<M, F> a() {
        kmw<M, F> init;
        init = this.a.init(this.c);
        this.c = init.a();
        return init;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized kng<M, F> a(E e) {
        kng<M, F> update;
        update = this.b.update(this.c, koa.a(e));
        this.c = update.a(this.c);
        return update;
    }
}
