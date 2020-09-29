package defpackage;

/* renamed from: lyl reason: default package */
public final class lyl implements vua<lyk> {
    private final wlc<String> a;
    private final wlc<Boolean> b;
    private final wlc<lwc> c;
    private final wlc<Boolean> d;

    private lyl(wlc<String> wlc, wlc<Boolean> wlc2, wlc<lwc> wlc3, wlc<Boolean> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lyl a(wlc<String> wlc, wlc<Boolean> wlc2, wlc<lwc> wlc3, wlc<Boolean> wlc4) {
        return new lyl(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new lyk((String) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (lwc) this.c.get(), ((Boolean) this.d.get()).booleanValue());
    }
}
