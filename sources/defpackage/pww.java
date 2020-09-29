package defpackage;

/* renamed from: pww reason: default package */
public final class pww implements vua<Boolean> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;

    private pww(wlc<Boolean> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pww a(wlc<Boolean> wlc, wlc<Boolean> wlc2) {
        return new pww(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Boolean) this.a.get()).booleanValue() && !((Boolean) this.b.get()).booleanValue());
    }
}
