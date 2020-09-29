package defpackage;

/* renamed from: kkl reason: default package */
public abstract class kkl<M, E, F, MI, EI, FI> implements kjz<M, E, F> {

    /* renamed from: kkl$a */
    public static abstract class a<M, E, F, MI, EI, FI> {
        public abstract a<M, E, F, MI, EI, FI> a(kjz<MI, EI, FI> kjz);

        public abstract a<M, E, F, MI, EI, FI> a(kkj<M, F, FI> kkj);

        public abstract a<M, E, F, MI, EI, FI> a(kkm<M, MI, M> kkm);

        public abstract a<M, E, F, MI, EI, FI> a(kko<M, MI> kko);

        public abstract kkl<M, E, F, MI, EI, FI> a();

        public abstract a<M, E, F, MI, EI, FI> b(kko<E, EI> kko);
    }

    /* access modifiers changed from: protected */
    public abstract kjz<MI, EI, FI> a();

    /* access modifiers changed from: protected */
    public abstract kko<M, MI> b();

    /* access modifiers changed from: protected */
    public abstract kko<E, EI> c();

    /* access modifiers changed from: protected */
    public abstract kkm<M, MI, M> d();

    /* access modifiers changed from: protected */
    public abstract kkj<M, F, FI> e();

    public final kjx<M, F> update(M m, E e) {
        kjx kjx = (kjx) kkr.a(a().update(kkr.a(b().apply(m)), kkr.a(c().apply(e))));
        boolean c = kjx.c();
        if (c) {
            m = kkr.a(d().apply(m, kjx.d()));
        }
        return (kjx) kkr.a(e().a(m, c, kjx.b()));
    }

    public static <M, E, F, MI, EI, FI> a<M, E, F, MI, EI, FI> f() {
        return new a();
    }
}
