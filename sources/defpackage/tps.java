package defpackage;

/* renamed from: tps reason: default package */
public final class tps implements vua<tpr> {
    private final wlc<tmy> a;

    private tps(wlc<tmy> wlc) {
        this.a = wlc;
    }

    public static tps a(wlc<tmy> wlc) {
        return new tps(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tpr((tmy) this.a.get());
    }
}
