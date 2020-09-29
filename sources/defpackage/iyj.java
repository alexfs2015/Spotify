package defpackage;

/* renamed from: iyj reason: default package */
public final class iyj implements vua<ixz> {
    private final wlc<ghm> a;

    private iyj(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static iyj a(wlc<ghm> wlc) {
        return new iyj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixz) vuf.a((ixz) ((ghm) this.a.get()).a(ixz.class, new a().a("https").b("shareables.scdn.co").b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
