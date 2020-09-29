package defpackage;

/* renamed from: iyd reason: default package */
public final class iyd implements vua<ixx> {
    private final wlc<ixz> a;

    private iyd(wlc<ixz> wlc) {
        this.a = wlc;
    }

    public static iyd a(wlc<ixz> wlc) {
        return new iyd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ixx) vuf.a(new ixx((ixz) this.a.get(), "fbstory"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
