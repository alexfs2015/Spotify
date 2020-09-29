package defpackage;

/* renamed from: hks reason: default package */
public final class hks implements vua<hkr> {
    private final wlc<gha> a;
    private final wlc<roc> b;

    private hks(wlc<gha> wlc, wlc<roc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hks a(wlc<gha> wlc, wlc<roc> wlc2) {
        return new hks(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hkr((gha) this.a.get(), (roc) this.b.get());
    }
}
