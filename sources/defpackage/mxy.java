package defpackage;

/* renamed from: mxy reason: default package */
public final class mxy implements vua<mxx> {
    private final wlc<uvf> a;

    private mxy(wlc<uvf> wlc) {
        this.a = wlc;
    }

    public static mxy a(wlc<uvf> wlc) {
        return new mxy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mxx((uvf) this.a.get());
    }
}
