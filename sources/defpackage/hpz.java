package defpackage;

/* renamed from: hpz reason: default package */
public final class hpz implements vua<hpy> {
    private final wlc<hra> a;

    private hpz(wlc<hra> wlc) {
        this.a = wlc;
    }

    public static hpz a(wlc<hra> wlc) {
        return new hpz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpy(vtz.b(this.a));
    }
}
