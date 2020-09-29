package defpackage;

/* renamed from: kjg reason: default package */
abstract class kjg<M, E> {
    private static final wrj a = wrk.a(kjg.class);

    /* access modifiers changed from: protected */
    public abstract String a();

    public boolean b() {
        return false;
    }

    public abstract M f();

    kjg() {
    }

    public void a(kjd<M, E> kjd) {
        throw new IllegalStateException(String.format("cannot call connect when in the %s state", new Object[]{a()}));
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

    public void a(E e) {
        a.b("Dropping event that was dispatched when the program was in the {} state: {}", a(), e);
    }

    public void b(M m) {
        a.b("Dropping model that was dispatched when the program was in the {} state: {}", a(), m);
    }
}
