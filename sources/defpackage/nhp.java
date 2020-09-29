package defpackage;

/* renamed from: nhp reason: default package */
public final class nhp implements vua<nil> {
    private final wlc<Boolean> a;
    private final wlc<neq> b;

    public static nil a(boolean z, neq neq) {
        return (nil) vuf.a(CC.a(z, neq), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Boolean) this.a.get()).booleanValue(), (neq) this.b.get());
    }
}
