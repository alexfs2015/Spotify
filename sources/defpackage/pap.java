package defpackage;

/* renamed from: pap reason: default package */
public final class pap implements vua<pao> {
    private final wlc<rnd> a;

    private pap(wlc<rnd> wlc) {
        this.a = wlc;
    }

    public static pap a(wlc<rnd> wlc) {
        return new pap(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pao((rnd) this.a.get());
    }
}
