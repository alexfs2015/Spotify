package defpackage;

/* renamed from: ozt reason: default package */
public final class ozt implements vua<ozs> {
    private final wlc<pcd> a;

    private ozt(wlc<pcd> wlc) {
        this.a = wlc;
    }

    public static ozt a(wlc<pcd> wlc) {
        return new ozt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ozs((pcd) this.a.get());
    }
}
