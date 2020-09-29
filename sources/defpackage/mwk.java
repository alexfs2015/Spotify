package defpackage;

/* renamed from: mwk reason: default package */
public final class mwk implements vua<mwj> {
    private final wlc<gup> a;
    private final wlc<gur> b;

    private mwk(wlc<gup> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mwk a(wlc<gup> wlc, wlc<gur> wlc2) {
        return new mwk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mwj((gup) this.a.get(), (gur) this.b.get());
    }
}
