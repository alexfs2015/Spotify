package defpackage;

/* renamed from: igs reason: default package */
public final class igs implements vua<igr> {
    private final wlc<jrp> a;
    private final wlc<iga> b;
    private final wlc<idq> c;
    private final wlc<kct> d;
    private final wlc<igu> e;

    private igs(wlc<jrp> wlc, wlc<iga> wlc2, wlc<idq> wlc3, wlc<kct> wlc4, wlc<igu> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static igs a(wlc<jrp> wlc, wlc<iga> wlc2, wlc<idq> wlc3, wlc<kct> wlc4, wlc<igu> wlc5) {
        igs igs = new igs(wlc, wlc2, wlc3, wlc4, wlc5);
        return igs;
    }

    public final /* synthetic */ Object get() {
        igr igr = new igr(this.a, this.b, this.c, (kct) this.d.get(), (igu) this.e.get());
        return igr;
    }
}
