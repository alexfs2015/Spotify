package defpackage;

/* renamed from: sjb reason: default package */
public final class sjb implements vua<guz> {
    private final wlc<gum> a;

    private sjb(wlc<gum> wlc) {
        this.a = wlc;
    }

    public static sjb a(wlc<gum> wlc) {
        return new sjb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (guz) vuf.a(((gum) this.a.get()).c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
