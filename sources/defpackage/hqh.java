package defpackage;

/* renamed from: hqh reason: default package */
public final class hqh implements vua<hqg> {
    private final wlc<hrv> a;

    private hqh(wlc<hrv> wlc) {
        this.a = wlc;
    }

    public static hqh a(wlc<hrv> wlc) {
        return new hqh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hqg(vtz.b(this.a));
    }
}
