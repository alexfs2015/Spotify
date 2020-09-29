package defpackage;

/* renamed from: hps reason: default package */
public final class hps implements vua<hpr> {
    private final wlc<hqo> a;

    private hps(wlc<hqo> wlc) {
        this.a = wlc;
    }

    public static hps a(wlc<hqo> wlc) {
        return new hps(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpr(vtz.b(this.a));
    }
}
