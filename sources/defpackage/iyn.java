package defpackage;

/* renamed from: iyn reason: default package */
public final class iyn implements vua<ixx> {
    private final wlc<ixz> a;

    private iyn(wlc<ixz> wlc) {
        this.a = wlc;
    }

    public static iyn a(wlc<ixz> wlc) {
        return new iyn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixx) vuf.a(new ixx((ixz) this.a.get(), "snapchat"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
