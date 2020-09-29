package defpackage;

/* renamed from: iwk reason: default package */
public final class iwk implements vua<iwj> {
    private final wlc<meo> a;
    private final wlc<iri> b;
    private final wlc<irl> c;

    private iwk(wlc<meo> wlc, wlc<iri> wlc2, wlc<irl> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iwk a(wlc<meo> wlc, wlc<iri> wlc2, wlc<irl> wlc3) {
        return new iwk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new iwj((meo) this.a.get(), (iri) this.b.get(), (irl) this.c.get());
    }
}
