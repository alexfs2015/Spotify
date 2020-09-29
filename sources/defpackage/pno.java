package defpackage;

/* renamed from: pno reason: default package */
public final class pno implements vua<pnn> {
    private final wlc<jrp> a;

    private pno(wlc<jrp> wlc) {
        this.a = wlc;
    }

    public static pno a(wlc<jrp> wlc) {
        return new pno(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pnn((jrp) this.a.get());
    }
}
