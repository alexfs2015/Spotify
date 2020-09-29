package defpackage;

/* renamed from: kcm reason: default package */
public final class kcm implements vua<kcl> {
    private final wlc<gdz<fko>> a;

    private kcm(wlc<gdz<fko>> wlc) {
        this.a = wlc;
    }

    public static kcm a(wlc<gdz<fko>> wlc) {
        return new kcm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kcl((gdz) this.a.get());
    }
}
