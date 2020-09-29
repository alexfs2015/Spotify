package defpackage;

/* renamed from: nvd reason: default package */
public final class nvd implements vua<c<nvn, nvl, nvk>> {
    private final wlc<nvo> a;
    private final wlc<nvq> b;

    private nvd(wlc<nvo> wlc, wlc<nvq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nvd a(wlc<nvo> wlc, wlc<nvq> wlc2) {
        return new nvd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (c) vuf.a(CC.a((nvo) this.a.get(), (nvq) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
