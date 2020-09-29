package defpackage;

/* renamed from: mus reason: default package */
public final class mus implements vua<mur> {
    private final wlc<mul> a;
    private final wlc<til> b;

    private mus(wlc<mul> wlc, wlc<til> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mus a(wlc<mul> wlc, wlc<til> wlc2) {
        return new mus(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mur((mul) this.a.get(), (til) this.b.get());
    }
}
