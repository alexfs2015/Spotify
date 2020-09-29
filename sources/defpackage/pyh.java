package defpackage;

/* renamed from: pyh reason: default package */
public final class pyh implements vua<ryz> {
    private final wlc<rzf> a;

    private pyh(wlc<rzf> wlc) {
        this.a = wlc;
    }

    public static pyh a(wlc<rzf> wlc) {
        return new pyh(wlc);
    }

    public static ryz a(rzf rzf) {
        return (ryz) vuf.a(pye.a(rzf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rzf) this.a.get());
    }
}
