package defpackage;

/* renamed from: hbh reason: default package */
public final class hbh implements vua<hbg> {
    private final wlc<uxc> a;

    private hbh(wlc<uxc> wlc) {
        this.a = wlc;
    }

    public static hbh a(wlc<uxc> wlc) {
        return new hbh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hbg(this.a);
    }
}
