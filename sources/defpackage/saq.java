package defpackage;

/* renamed from: saq reason: default package */
public final class saq implements vua<sap> {
    private final wlc<ghm> a;

    private saq(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static saq a(wlc<ghm> wlc) {
        return new saq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (sap) vuf.a((sap) ((ghm) this.a.get()).a(sap.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
