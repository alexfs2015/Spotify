package defpackage;

/* renamed from: owl reason: default package */
public final class owl implements vua<owk> {
    private final wlc<ows> a;
    private final wlc<Boolean> b;
    private final wlc<String> c;

    private owl(wlc<ows> wlc, wlc<Boolean> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static owl a(wlc<ows> wlc, wlc<Boolean> wlc2, wlc<String> wlc3) {
        return new owl(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new owk((ows) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (String) this.c.get());
    }
}
