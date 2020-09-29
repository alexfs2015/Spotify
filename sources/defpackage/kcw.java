package defpackage;

/* renamed from: kcw reason: default package */
public final class kcw implements vua<kcv> {
    private final wlc<rve> a;

    private kcw(wlc<rve> wlc) {
        this.a = wlc;
    }

    public static kcw a(wlc<rve> wlc) {
        return new kcw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kcv((rve) this.a.get());
    }
}
