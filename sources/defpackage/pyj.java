package defpackage;

/* renamed from: pyj reason: default package */
public final class pyj implements vua<Boolean> {
    private final wlc<sgr> a;
    private final wlc<fpt> b;

    private pyj(wlc<sgr> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pyj a(wlc<sgr> wlc, wlc<fpt> wlc2) {
        return new pyj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        sgr sgr = (sgr) this.a.get();
        return Boolean.valueOf(sgr.b((fpt) this.b.get()));
    }
}
