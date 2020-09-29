package defpackage;

/* renamed from: gyb reason: default package */
public final class gyb implements vua<gya> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<a> c;

    private gyb(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gyb a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3) {
        return new gyb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gya((jjf) this.a.get(), (udr) this.b.get(), (a) this.c.get());
    }
}
