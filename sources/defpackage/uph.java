package defpackage;

/* renamed from: uph reason: default package */
public final class uph implements vua<upg> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<jrp> c;

    private uph(wlc<jjf> wlc, wlc<udr> wlc2, wlc<jrp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uph a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<jrp> wlc3) {
        return new uph(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new upg((jjf) this.a.get(), (udr) this.b.get(), (jrp) this.c.get());
    }
}
