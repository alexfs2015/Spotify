package defpackage;

/* renamed from: opr reason: default package */
public final class opr implements vua<gut> {
    private final wlc<gum> a;

    private opr(wlc<gum> wlc) {
        this.a = wlc;
    }

    public static opr a(wlc<gum> wlc) {
        return new opr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gut) vuf.a(new gut((gum) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
