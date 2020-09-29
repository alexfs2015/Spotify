package defpackage;

/* renamed from: lxg reason: default package */
public final class lxg implements vua<gvd> {
    private final wlc<gum> a;

    private lxg(wlc<gum> wlc) {
        this.a = wlc;
    }

    public static lxg a(wlc<gum> wlc) {
        return new lxg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gvd) vuf.a(new gvd((gum) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
