package defpackage;

/* renamed from: hpo reason: default package */
public final class hpo implements vua<hpn> {
    private final wlc<hqk> a;

    private hpo(wlc<hqk> wlc) {
        this.a = wlc;
    }

    public static hpo a(wlc<hqk> wlc) {
        return new hpo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpn(vtz.b(this.a));
    }
}
