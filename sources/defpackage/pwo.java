package defpackage;

/* renamed from: pwo reason: default package */
public final class pwo implements vua<sfw> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<jrp> c;

    private pwo(wlc<jjf> wlc, wlc<udr> wlc2, wlc<jrp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pwo a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<jrp> wlc3) {
        return new pwo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (sfw) vuf.a(new pyv((jjf) this.a.get(), (udr) this.b.get(), (jrp) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
