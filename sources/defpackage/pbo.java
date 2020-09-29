package defpackage;

/* renamed from: pbo reason: default package */
public final class pbo implements vua<pbn> {
    private final wlc<String> a;
    private final wlc<pbh> b;

    private pbo(wlc<String> wlc, wlc<pbh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pbo a(wlc<String> wlc, wlc<pbh> wlc2) {
        return new pbo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pbn((String) this.a.get(), (pbh) this.b.get());
    }
}
