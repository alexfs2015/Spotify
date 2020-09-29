package defpackage;

/* renamed from: mlk reason: default package */
public final class mlk implements vua<mlj> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;
    private final wlc<sih> c;

    private mlk(wlc<jjf> wlc, wlc<jrp> wlc2, wlc<sih> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mlk a(wlc<jjf> wlc, wlc<jrp> wlc2, wlc<sih> wlc3) {
        return new mlk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mlj((jjf) this.a.get(), (jrp) this.b.get(), (sih) this.c.get());
    }
}
