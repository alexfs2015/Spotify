package defpackage;

/* renamed from: kmq reason: default package */
final class kmq<M, E, F> extends kmp<M, E> {
    private final kmo<M, E> a;
    private final kmn<M> b;
    private M c;

    kmq(kmo<M, E> kmo, kmn<M> kmn, M m) {
        this.a = kmo;
        this.b = kmn;
        this.c = m;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "created";
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
