package defpackage;

/* renamed from: kmr reason: default package */
final class kmr<M, E, F> extends kmp<M, E> {
    private final kmo<M, E> a;
    private M b;

    kmr(kmo<M, E> kmo, M m) {
        this.a = kmo;
        this.b = m;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "init";
    }

    public final void a(kmm<M, E> kmm) {
        this.a.a(kmm, this.b);
    }

    public final M f() {
        return this.b;
    }
}
