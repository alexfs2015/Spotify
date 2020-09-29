package defpackage;

/* renamed from: pxy reason: default package */
public final class pxy implements vua<Boolean> {
    private final wlc<pvl> a;

    private pxy(wlc<pvl> wlc) {
        this.a = wlc;
    }

    public static pxy a(wlc<pvl> wlc) {
        return new pxy(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((pvl) this.a.get()).b);
    }
}
