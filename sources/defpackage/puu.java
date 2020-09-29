package defpackage;

/* renamed from: puu reason: default package */
public final class puu implements vua<put> {
    private final wlc<pur> a;
    private final wlc<a> b;
    private final wlc<a> c;

    private puu(wlc<pur> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static puu a(wlc<pur> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        return new puu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new put((pur) this.a.get(), (a) this.b.get(), (a) this.c.get());
    }
}
