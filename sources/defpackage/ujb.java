package defpackage;

/* renamed from: ujb reason: default package */
public final class ujb implements vua<ujc> {
    private final wlc<ujk> a;

    private ujb(wlc<ujk> wlc) {
        this.a = wlc;
    }

    public static ujb a(wlc<ujk> wlc) {
        return new ujb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ujc) vuf.a(new uiw((ujk) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
