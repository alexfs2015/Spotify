package defpackage;

/* renamed from: rpr reason: default package */
public final class rpr implements vua<rpq> {
    private final wlc<gkw> a;

    private rpr(wlc<gkw> wlc) {
        this.a = wlc;
    }

    public static rpr a(wlc<gkw> wlc) {
        return new rpr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rpq((gkw) this.a.get());
    }
}
