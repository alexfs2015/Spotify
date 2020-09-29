package defpackage;

/* renamed from: ngt reason: default package */
public final class ngt implements vua<wud<Boolean>> {
    private final wlc<net> a;

    private ngt(wlc<net> wlc) {
        this.a = wlc;
    }

    public static ngt a(wlc<net> wlc) {
        return new ngt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((net) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
