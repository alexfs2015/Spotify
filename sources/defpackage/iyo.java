package defpackage;

/* renamed from: iyo reason: default package */
public final class iyo implements vua<ixz> {
    private final wlc<ghm> a;

    private iyo(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static iyo a(wlc<ghm> wlc) {
        return new iyo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixz) vuf.a((ixz) ((ghm) this.a.get()).a(ixz.class, new a().a("https").b("shareables.scdn.co").b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
