package defpackage;

/* renamed from: vdf reason: default package */
public final class vdf implements vua<vdi> {
    private final wlc<ghm> a;

    private vdf(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static vdf a(wlc<ghm> wlc) {
        return new vdf(wlc);
    }

    public static vdi a(ghm ghm) {
        return (vdi) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
