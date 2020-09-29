package defpackage;

/* renamed from: scd reason: default package */
public final class scd implements vua<scc> {
    private final wlc<ryz> a;

    private scd(wlc<ryz> wlc) {
        this.a = wlc;
    }

    public static scd a(wlc<ryz> wlc) {
        return new scd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scc((ryz) this.a.get());
    }
}
