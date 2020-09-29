package defpackage;

/* renamed from: nhr reason: default package */
public final class nhr implements vua<wud<Boolean>> {
    private final wlc<net> a;

    private nhr(wlc<net> wlc) {
        this.a = wlc;
    }

    public static nhr a(wlc<net> wlc) {
        return new nhr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((net) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
