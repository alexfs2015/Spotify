package defpackage;

/* renamed from: paw reason: default package */
public final class paw implements vua<gut> {
    private final wlc<gum> a;

    private paw(wlc<gum> wlc) {
        this.a = wlc;
    }

    public static paw a(wlc<gum> wlc) {
        return new paw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gut) vuf.a(new gut((gum) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
