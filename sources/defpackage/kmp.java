package defpackage;

/* renamed from: kmp reason: default package */
abstract class kmp<M, E> {
    private static final xfo a = xfp.a(kmp.class);

    kmp() {
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public void a(E e) {
        a.b("Dropping event that was dispatched when the program was in the {} state: {}", a(), e);
    }

    public void a(kmm<M, E> kmm) {
        throw new IllegalStateException(String.format("cannot call connect when in the %s state", new Object[]{a()}));
    }

    public void b(M m) {
        a.b("Dropping model that was dispatched when the program was in the {} state: {}", a(), m);
    }

    public boolean b() {
        return false;
    }

    public void c() {
        throw new IllegalStateException(String.format("cannot call disconnect when in the %s state", new Object[]{a()}));
    }

    public void d() {
        throw new IllegalStateException(String.format("cannot call start when in the %s state", new Object[]{a()}));
    }

    public void e() {
        throw new IllegalStateException(String.format("cannot call stop when in the %s state", new Object[]{a()}));
    }

    public abstract M f();
}
