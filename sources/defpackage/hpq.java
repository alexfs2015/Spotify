package defpackage;

/* renamed from: hpq reason: default package */
public final class hpq implements vua<hpp> {
    private final wlc<hqm> a;

    private hpq(wlc<hqm> wlc) {
        this.a = wlc;
    }

    public static hpq a(wlc<hqm> wlc) {
        return new hpq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpp(vtz.b(this.a));
    }
}
