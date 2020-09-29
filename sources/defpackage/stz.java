package defpackage;

/* renamed from: stz reason: default package */
public final class stz implements vua<stt> {
    private final wlc<stw> a;
    private final wlc<ssa> b;

    private stz(wlc<stw> wlc, wlc<ssa> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static stz a(wlc<stw> wlc, wlc<ssa> wlc2) {
        return new stz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new stt((stw) this.a.get(), (ssa) this.b.get());
    }
}
