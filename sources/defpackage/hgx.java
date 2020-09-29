package defpackage;

/* renamed from: hgx reason: default package */
public final class hgx implements vua<hgw> {
    private final wlc<jug> a;

    private hgx(wlc<jug> wlc) {
        this.a = wlc;
    }

    public static hgx a(wlc<jug> wlc) {
        return new hgx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hgw(this.a);
    }
}
