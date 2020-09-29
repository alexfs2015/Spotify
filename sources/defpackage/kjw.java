package defpackage;

/* renamed from: kjw reason: default package */
final class kjw<M, E, F> {
    private final kjo<M, F> a;
    private final kjz<M, E, F> b;
    private volatile M c;

    kjw(kjo<M, F> kjo, kjz<M, E, F> kjz, M m) {
        this.a = (kjo) kkr.a(kjo);
        this.b = (kjz) kkr.a(kjz);
        this.c = kkr.a(m);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized kjn<M, F> a() {
        kjn<M, F> init;
        init = this.a.init(this.c);
        this.c = init.a();
        return init;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized kjx<M, F> a(E e) {
        kjx<M, F> update;
        update = this.b.update(this.c, kkr.a(e));
        this.c = update.a(this.c);
        return update;
    }
}
