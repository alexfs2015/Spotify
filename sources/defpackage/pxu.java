package defpackage;

/* renamed from: pxu reason: default package */
public final class pxu implements vua<Boolean> {
    private final wlc<pvl> a;

    private pxu(wlc<pvl> wlc) {
        this.a = wlc;
    }

    public static pxu a(wlc<pvl> wlc) {
        return new pxu(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((pvl) this.a.get()).c);
    }
}
