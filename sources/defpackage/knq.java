package defpackage;

/* renamed from: knq reason: default package */
public class knq<M, E, F> implements d<M, E, F> {
    private static final xfo a = xfp.a(knq.class);
    private final String b;

    private knq(String str) {
        this.b = str;
    }

    public static <M, E, F> d<M, E, F> a(String str) {
        return new knq(str);
    }

    public final void a(M m) {
        a.b("Mobius ({}) - Initializing loop", (Object) this.b);
    }

    public final void a(M m, E e) {
        a.b("Mobius ({}) - Event received: {}", this.b, e);
    }

    public final void a(M m, E e, Throwable th) {
        a.c("FATAL ERROR: exception updating model '{}' with event '{}'", m, e, th);
    }

    public final void a(M m, E e, kng<M, F> kng) {
        if (kng.c()) {
            a.b("Mobius ({}) - Model updated: {}", this.b, kng.d());
        }
        for (Object b2 : kng.b()) {
            String str = "Mobius ({}) - Effect dispatched: {}";
            a.b(str, this.b, b2);
        }
    }

    public final void a(M m, Throwable th) {
        a.d("FATAL ERROR: exception during initialization from model {}", m, th);
    }

    public final void a(M m, kmw<M, F> kmw) {
        a.b("Mobius ({}) - Loop initialized, starting from model: {}", this.b, kmw.a());
        for (Object b2 : kmw.b()) {
            String str = "Mobius ({}) - Effect dispatched: {}";
            a.b(str, this.b, b2);
        }
    }
}
