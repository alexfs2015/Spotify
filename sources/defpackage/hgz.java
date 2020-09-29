package defpackage;

/* renamed from: hgz reason: default package */
public final class hgz implements vua<hgy> {
    private final wlc<hgw> a;

    private hgz(wlc<hgw> wlc) {
        this.a = wlc;
    }

    public static hgz a(wlc<hgw> wlc) {
        return new hgz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hgy((hgw) this.a.get());
    }
}
