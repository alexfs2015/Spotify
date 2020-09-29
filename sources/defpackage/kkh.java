package defpackage;

/* renamed from: kkh reason: default package */
public class kkh<M, E, F> implements d<M, E, F> {
    private static final wrj a = wrk.a(kkh.class);
    private final String b;

    public static <M, E, F> d<M, E, F> a(String str) {
        return new kkh(str);
    }

    private kkh(String str) {
        this.b = str;
    }

    public final void a(M m) {
        a.b("Mobius ({}) - Initializing loop", (Object) this.b);
    }

    public final void a(M m, kjn<M, F> kjn) {
        a.b("Mobius ({}) - Loop initialized, starting from model: {}", this.b, kjn.a());
        for (Object b2 : kjn.b()) {
            String str = "Mobius ({}) - Effect dispatched: {}";
            a.b(str, this.b, b2);
        }
    }

    public final void a(M m, Throwable th) {
        a.d("FATAL ERROR: exception during initialization from model {}", m, th);
    }

    public final void a(M m, E e) {
        a.b("Mobius ({}) - Event received: {}", this.b, e);
    }

    public final void a(M m, E e, kjx<M, F> kjx) {
        if (kjx.c()) {
            a.b("Mobius ({}) - Model updated: {}", this.b, kjx.d());
        }
        for (Object b2 : kjx.b()) {
            String str = "Mobius ({}) - Effect dispatched: {}";
            a.b(str, this.b, b2);
        }
    }

    public final void a(M m, E e, Throwable th) {
        a.c("FATAL ERROR: exception updating model '{}' with event '{}'", m, e, th);
    }
}
