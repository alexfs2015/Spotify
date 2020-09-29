package defpackage;

/* renamed from: scm reason: default package */
public final class scm implements vua<scl> {
    private final wlc<sap> a;

    private scm(wlc<sap> wlc) {
        this.a = wlc;
    }

    public static scm a(wlc<sap> wlc) {
        return new scm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scl((sap) this.a.get());
    }
}
