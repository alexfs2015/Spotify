package defpackage;

/* renamed from: rkp reason: default package */
public final class rkp implements vua<rko> {
    private final wlc<juj> a;
    private final wlc<a> b;

    private rkp(wlc<juj> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rkp a(wlc<juj> wlc, wlc<a> wlc2) {
        return new rkp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rko((juj) this.a.get(), (a) this.b.get());
    }
}
