package defpackage;

/* renamed from: hpw reason: default package */
public final class hpw implements vua<hpv> {
    private final wlc<hqv> a;
    private final wlc<hpp> b;

    private hpw(wlc<hqv> wlc, wlc<hpp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hpw a(wlc<hqv> wlc, wlc<hpp> wlc2) {
        return new hpw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hpv(vtz.b(this.a), (hpp) this.b.get());
    }
}
