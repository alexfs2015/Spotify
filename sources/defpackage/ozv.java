package defpackage;

/* renamed from: ozv reason: default package */
public final class ozv implements vua<ozu> {
    private final wlc<tmt> a;

    private ozv(wlc<tmt> wlc) {
        this.a = wlc;
    }

    public static ozv a(wlc<tmt> wlc) {
        return new ozv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ozu((tmt) this.a.get());
    }
}
