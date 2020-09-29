package defpackage;

/* renamed from: nbu reason: default package */
public final class nbu implements vua<nbm> {
    private final wlc<nbn> a;

    private nbu(wlc<nbn> wlc) {
        this.a = wlc;
    }

    public static nbu a(wlc<nbn> wlc) {
        return new nbu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nbm) vuf.a(CC.a((nbn) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
