package defpackage;

/* renamed from: mtb reason: default package */
public final class mtb implements vua<String> {
    private final wlc<String> a;

    private mtb(wlc<String> wlc) {
        this.a = wlc;
    }

    public static mtb a(wlc<String> wlc) {
        return new mtb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a((String) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
