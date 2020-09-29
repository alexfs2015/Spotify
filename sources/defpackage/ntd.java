package defpackage;

/* renamed from: ntd reason: default package */
public final class ntd implements vua<gup> {
    private final wlc<gum> a;
    private final wlc<gur> b;

    private ntd(wlc<gum> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ntd a(wlc<gum> wlc, wlc<gur> wlc2) {
        return new ntd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gup) vuf.a(new gup((gum) this.a.get(), (gur) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
