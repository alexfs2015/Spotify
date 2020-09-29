package defpackage;

/* renamed from: kjh reason: default package */
final class kjh<M, E, F> extends kjg<M, E> {
    private final kjf<M, E> a;
    private final kje<M> b;
    private M c;

    /* access modifiers changed from: protected */
    public final String a() {
        return "created";
    }

    kjh(kjf<M, E> kjf, kje<M> kje, M m) {
        this.a = kjf;
        this.b = kje;
        this.c = m;
    }

    public final void c() {
        this.b.dispose();
        this.a.b(this.c);
    }

    public final void d() {
        this.a.b(this.b, this.c);
    }

    public final M f() {
        return this.c;
    }
}
