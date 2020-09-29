package defpackage;

/* renamed from: hrf reason: default package */
public final class hrf implements vua<hre> {
    private final wlc<hpg> a;
    private final wlc<hri> b;
    private final wlc<hqt> c;
    private final wlc<hrg> d;

    private hrf(wlc<hpg> wlc, wlc<hri> wlc2, wlc<hqt> wlc3, wlc<hrg> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hrf a(wlc<hpg> wlc, wlc<hri> wlc2, wlc<hqt> wlc3, wlc<hrg> wlc4) {
        return new hrf(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hre((hpg) this.a.get(), (hri) this.b.get(), (hqt) this.c.get(), (hrg) this.d.get());
    }
}
