package defpackage;

/* renamed from: iye reason: default package */
public final class iye implements vua<ixz> {
    private final wlc<ghm> a;

    private iye(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static iye a(wlc<ghm> wlc) {
        return new iye(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixz) vuf.a((ixz) ((ghm) this.a.get()).a(ixz.class, new a().a("https").b("shareables.scdn.co").b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
