package defpackage;

/* renamed from: kji reason: default package */
final class kji<M, E, F> extends kjg<M, E> {
    private final kjf<M, E> a;
    private M b;

    /* access modifiers changed from: protected */
    public final String a() {
        return "init";
    }

    kji(kjf<M, E> kjf, M m) {
        this.a = kjf;
        this.b = m;
    }

    public final void a(kjd<M, E> kjd) {
        this.a.a(kjd, this.b);
    }

    public final M f() {
        return this.b;
    }
}
