package defpackage;

/* renamed from: lst reason: default package */
public final class lst implements vua<lss> {
    private final wlc<sgn> a;
    private final wlc<txc> b;
    private final wlc<gyj> c;

    private lst(wlc<sgn> wlc, wlc<txc> wlc2, wlc<gyj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lst a(wlc<sgn> wlc, wlc<txc> wlc2, wlc<gyj> wlc3) {
        return new lst(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lss((sgn) this.a.get(), (txc) this.b.get(), (gyj) this.c.get());
    }
}
