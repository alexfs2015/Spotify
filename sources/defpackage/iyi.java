package defpackage;

/* renamed from: iyi reason: default package */
public final class iyi implements vua<ixx> {
    private final wlc<ixz> a;

    private iyi(wlc<ixz> wlc) {
        this.a = wlc;
    }

    public static iyi a(wlc<ixz> wlc) {
        return new iyi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixx) vuf.a(new ixx((ixz) this.a.get(), "igstory"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
