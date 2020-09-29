package defpackage;

/* renamed from: qab reason: default package */
public final class qab implements vua<ryz> {
    private final wlc<rzf> a;

    private qab(wlc<rzf> wlc) {
        this.a = wlc;
    }

    public static qab a(wlc<rzf> wlc) {
        return new qab(wlc);
    }

    public static ryz a(rzf rzf) {
        return (ryz) vuf.a(pzz.a(rzf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rzf) this.a.get());
    }
}
