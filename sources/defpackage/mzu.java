package defpackage;

/* renamed from: mzu reason: default package */
public final class mzu implements vua<String> {
    private final wlc<sih> a;

    private mzu(wlc<sih> wlc) {
        this.a = wlc;
    }

    public static mzu a(wlc<sih> wlc) {
        return new mzu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((sih) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
