package defpackage;

/* renamed from: nhl reason: default package */
public final class nhl implements vua<nel> {
    private final wlc<Boolean> a;

    public static nel a(boolean z) {
        return (nel) vuf.a(CC.a(z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Boolean) this.a.get()).booleanValue());
    }
}
