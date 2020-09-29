package defpackage;

/* renamed from: oum reason: default package */
public final class oum implements vua<oul> {
    private final wlc<String> a;
    private final wlc<uxt> b;
    private final wlc<uxh> c;
    private final wlc<til> d;

    private oum(wlc<String> wlc, wlc<uxt> wlc2, wlc<uxh> wlc3, wlc<til> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static oum a(wlc<String> wlc, wlc<uxt> wlc2, wlc<uxh> wlc3, wlc<til> wlc4) {
        return new oum(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oul((String) this.a.get(), (uxt) this.b.get(), (uxh) this.c.get(), (til) this.d.get());
    }
}
