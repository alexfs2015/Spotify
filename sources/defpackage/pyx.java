package defpackage;

/* renamed from: pyx reason: default package */
public final class pyx implements vua<pyw> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<a> c;
    private final wlc<jrp> d;

    private pyx(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3, wlc<jrp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pyx a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3, wlc<jrp> wlc4) {
        return new pyx(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pyw((jjf) this.a.get(), (udr) this.b.get(), (a) this.c.get(), (jrp) this.d.get());
    }
}
