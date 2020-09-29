package defpackage;

/* renamed from: ouh reason: default package */
public final class ouh implements vua<oug> {
    private final wlc<a> a;

    private ouh(wlc<a> wlc) {
        this.a = wlc;
    }

    public static ouh a(wlc<a> wlc) {
        return new ouh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oug((a) this.a.get());
    }
}
