package defpackage;

/* renamed from: psh reason: default package */
public final class psh implements vua<psg> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private psh(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static psh a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new psh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new psg((jjf) this.a.get(), (jrp) this.b.get());
    }
}
