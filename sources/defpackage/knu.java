package defpackage;

/* renamed from: knu reason: default package */
public abstract class knu<M, E, F, MI, EI, FI> implements kni<M, E, F> {

    /* renamed from: knu$a */
    public static abstract class a<M, E, F, MI, EI, FI> {
        public abstract a<M, E, F, MI, EI, FI> a(kni<MI, EI, FI> kni);

        public abstract a<M, E, F, MI, EI, FI> a(kns<M, F, FI> kns);

        public abstract a<M, E, F, MI, EI, FI> a(knv<M, MI, M> knv);

        public abstract a<M, E, F, MI, EI, FI> a(knx<M, MI> knx);

        public abstract knu<M, E, F, MI, EI, FI> a();

        public abstract a<M, E, F, MI, EI, FI> b(knx<E, EI> knx);
    }

    public static <M, E, F, MI, EI, FI> a<M, E, F, MI, EI, FI> f() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public abstract kni<MI, EI, FI> a();

    /* access modifiers changed from: protected */
    public abstract knx<M, MI> b();

    /* access modifiers changed from: protected */
    public abstract knx<E, EI> c();

    /* access modifiers changed from: protected */
    public abstract knv<M, MI, M> d();

    /* access modifiers changed from: protected */
    public abstract kns<M, F, FI> e();

    public final kng<M, F> update(M m, E e) {
        kng kng = (kng) koa.a(a().update(koa.a(b().apply(m)), koa.a(c().apply(e))));
        boolean c = kng.c();
        if (c) {
            m = koa.a(d().apply(m, kng.d()));
        }
        return (kng) koa.a(e().a(m, c, kng.b()));
    }
}
