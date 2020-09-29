package defpackage;

/* renamed from: syp reason: default package */
public final class syp implements vua<syo> {
    private final wlc<jws> a;
    private final wlc<syu> b;

    private syp(wlc<jws> wlc, wlc<syu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static syp a(wlc<jws> wlc, wlc<syu> wlc2) {
        return new syp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new syo((jws) this.a.get(), (syu) this.b.get());
    }
}
