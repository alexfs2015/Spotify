package defpackage;

/* renamed from: vpk reason: default package */
public final class vpk implements vua<vpj> {
    private final wlc<vpm> a;
    private final wlc<vph> b;

    private vpk(wlc<vpm> wlc, wlc<vph> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vpk a(wlc<vpm> wlc, wlc<vph> wlc2) {
        return new vpk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vpj((vpm) this.a.get(), (vph) this.b.get());
    }
}
