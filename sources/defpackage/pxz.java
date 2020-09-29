package defpackage;

/* renamed from: pxz reason: default package */
public final class pxz implements vua<Boolean> {
    private final wlc<pvl> a;

    private pxz(wlc<pvl> wlc) {
        this.a = wlc;
    }

    public static pxz a(wlc<pvl> wlc) {
        return new pxz(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((pvl) this.a.get()).a);
    }
}
