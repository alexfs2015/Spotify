package defpackage;

/* renamed from: sfv reason: default package */
public final class sfv implements vua<sfu> {
    private final wlc<fpt> a;
    private final wlc<Boolean> b;

    private sfv(wlc<fpt> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sfv a(wlc<fpt> wlc, wlc<Boolean> wlc2) {
        return new sfv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sfu((fpt) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
