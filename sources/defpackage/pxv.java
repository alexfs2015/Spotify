package defpackage;

/* renamed from: pxv reason: default package */
public final class pxv implements vua<Boolean> {
    private final wlc<pvl> a;

    private pxv(wlc<pvl> wlc) {
        this.a = wlc;
    }

    public static pxv a(wlc<pvl> wlc) {
        return new pxv(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((pvl) this.a.get()).d.equals("premium"));
    }
}
