package defpackage;

/* renamed from: unn reason: default package */
public final class unn implements vua<unm> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private unn(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static unn a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new unn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new unm((jjf) this.a.get(), (jrp) this.b.get());
    }
}
