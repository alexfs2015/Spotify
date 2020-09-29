package defpackage;

/* renamed from: pwk reason: default package */
public final class pwk implements vua<pwj> {
    private final wlc<sgn> a;
    private final wlc<upd> b;
    private final wlc<upi> c;

    private pwk(wlc<sgn> wlc, wlc<upd> wlc2, wlc<upi> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pwk a(wlc<sgn> wlc, wlc<upd> wlc2, wlc<upi> wlc3) {
        return new pwk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pwj((sgn) this.a.get(), (upd) this.b.get(), (upi) this.c.get());
    }
}
