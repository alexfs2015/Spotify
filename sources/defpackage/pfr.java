package defpackage;

/* renamed from: pfr reason: default package */
public final class pfr implements vua<String> {
    private final wlc<jsi> a;

    private pfr(wlc<jsi> wlc) {
        this.a = wlc;
    }

    public static pfr a(wlc<jsi> wlc) {
        return new pfr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jsi) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
