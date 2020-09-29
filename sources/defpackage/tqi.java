package defpackage;

/* renamed from: tqi reason: default package */
public final class tqi implements vua<jnq> {
    private final wlc<tqn> a;
    private final wlc<tqm> b;

    public static jnq a(tqn tqn, tqm tqm) {
        return (jnq) vuf.a(CC.a(tqn, tqm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tqn) this.a.get(), (tqm) this.b.get());
    }
}
