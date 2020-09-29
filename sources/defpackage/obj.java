package defpackage;

/* renamed from: obj reason: default package */
public final class obj implements vua<vof> {
    private final wlc<oci> a;

    private obj(wlc<oci> wlc) {
        this.a = wlc;
    }

    public static obj a(wlc<oci> wlc) {
        return new obj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vof) vuf.a(new vof(((oci) this.a.get()).p()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
