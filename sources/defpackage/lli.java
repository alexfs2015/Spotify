package defpackage;

/* renamed from: lli reason: default package */
public final class lli implements vua<lmb> {
    private final wlc<llp> a;

    private lli(wlc<llp> wlc) {
        this.a = wlc;
    }

    public static lli a(wlc<llp> wlc) {
        return new lli(wlc);
    }

    public static lmb a(llp llp) {
        return (lmb) vuf.a(CC.a(llp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((llp) this.a.get());
    }
}
