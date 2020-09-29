package defpackage;

/* renamed from: nho reason: default package */
public final class nho implements vua<String> {
    private final wlc<Boolean> a;

    private nho(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static nho a(wlc<Boolean> wlc) {
        return new nho(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Boolean) this.a.get()).booleanValue() ? "free-tier-cache" : "premium-cache", "Cannot return null from a non-@Nullable @Provides method");
    }
}
