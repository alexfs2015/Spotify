package defpackage;

/* renamed from: hkz reason: default package */
public final class hkz implements vua<hky> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;
    private final wlc<Boolean> c;
    private final wlc<Boolean> d;

    private hkz(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hkz a(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4) {
        return new hkz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hky(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue());
    }
}
