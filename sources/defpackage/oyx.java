package defpackage;

/* renamed from: oyx reason: default package */
public final class oyx implements vua<oyw> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;
    private final wlc<Boolean> c;

    private oyx(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oyx a(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3) {
        return new oyx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oyw(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Boolean) this.c.get()).booleanValue());
    }
}
