package defpackage;

/* renamed from: ngs reason: default package */
public final class ngs implements vua<wud<Boolean>> {
    private final wlc<net> a;

    private ngs(wlc<net> wlc) {
        this.a = wlc;
    }

    public static ngs a(wlc<net> wlc) {
        return new ngs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((net) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
