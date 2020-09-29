package defpackage;

/* renamed from: tni reason: default package */
public final class tni implements vua<tnh> {
    private final wlc<spe> a;
    private final wlc<tnj> b;
    private final wlc<Boolean> c;
    private final wlc<kpb> d;

    private tni(wlc<spe> wlc, wlc<tnj> wlc2, wlc<Boolean> wlc3, wlc<kpb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tni a(wlc<spe> wlc, wlc<tnj> wlc2, wlc<Boolean> wlc3, wlc<kpb> wlc4) {
        return new tni(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tnh((spe) this.a.get(), (tnj) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (kpb) this.d.get());
    }
}
