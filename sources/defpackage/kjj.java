package defpackage;

/* renamed from: kjj reason: default package */
final class kjj<M, E, F> extends kjg<M, E> {
    final kju<M, E, F> a;
    /* access modifiers changed from: private */
    public final kjf<M, E> b;
    private final kje<M> c;
    private final M d;

    /* access modifiers changed from: protected */
    public final String a() {
        return "running";
    }

    public final boolean b() {
        return true;
    }

    kjj(kjf<M, E> kjf, kje<M> kje, c<M, E, F> cVar, M m) {
        this.b = kjf;
        this.c = kje;
        this.a = cVar.a(m);
        this.d = m;
    }

    public final void a(E e) {
        this.a.a(e);
    }

    public final void b(M m) {
        this.c.accept(m);
    }

    public final void e() {
        this.a.dispose();
        this.b.a(this.c, this.a.b);
    }

    public final M f() {
        M m = this.a.b;
        return m != null ? m : this.d;
    }
}
