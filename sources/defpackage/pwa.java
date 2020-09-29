package defpackage;

/* renamed from: pwa reason: default package */
public final class pwa implements vua<pvz> {
    private final wlc<sfj> a;
    private final wlc<sgn> b;

    private pwa(wlc<sfj> wlc, wlc<sgn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pwa a(wlc<sfj> wlc, wlc<sgn> wlc2) {
        return new pwa(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pvz((sfj) this.a.get(), (sgn) this.b.get());
    }
}
