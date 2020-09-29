package defpackage;

/* renamed from: pxe reason: default package */
public final class pxe implements vua<ryz> {
    private final wlc<rzf> a;

    private pxe(wlc<rzf> wlc) {
        this.a = wlc;
    }

    public static pxe a(wlc<rzf> wlc) {
        return new pxe(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ryz) vuf.a(new ryz((rzf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
