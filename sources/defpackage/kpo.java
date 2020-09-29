package defpackage;

/* renamed from: kpo reason: default package */
public final class kpo implements vua<kpn> {
    private final wlc<kpm> a;

    private kpo(wlc<kpm> wlc) {
        this.a = wlc;
    }

    public static kpo a(wlc<kpm> wlc) {
        return new kpo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kpn((kpm) this.a.get());
    }
}
