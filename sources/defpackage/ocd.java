package defpackage;

/* renamed from: ocd reason: default package */
public final class ocd implements vua<occ> {
    private final wlc<ujc> a;

    private ocd(wlc<ujc> wlc) {
        this.a = wlc;
    }

    public static ocd a(wlc<ujc> wlc) {
        return new ocd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new occ((ujc) this.a.get());
    }
}
