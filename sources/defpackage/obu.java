package defpackage;

/* renamed from: obu reason: default package */
public final class obu implements vua<qfy> {
    private final wlc<ujc> a;

    private obu(wlc<ujc> wlc) {
        this.a = wlc;
    }

    public static obu a(wlc<ujc> wlc) {
        return new obu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (qfy) vuf.a(new qfy((ujc) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
