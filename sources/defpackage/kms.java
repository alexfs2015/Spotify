package defpackage;

/* renamed from: kms reason: default package */
final class kms<M, E, F> extends kmp<M, E> {
    final knd<M, E, F> a;
    /* access modifiers changed from: private */
    public final kmo<M, E> b;
    private final kmn<M> c;
    private final M d;

    kms(kmo<M, E> kmo, kmn<M> kmn, c<M, E, F> cVar, M m) {
        this.b = kmo;
        this.c = kmn;
        this.a = cVar.a(m);
        this.d = m;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "running";
    }

    public final void a(E e) {
        this.a.a(e);
    }

    public final void b(M m) {
        this.c.accept(m);
    }

    public final boolean b() {
        return true;
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
