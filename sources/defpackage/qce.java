package defpackage;

/* renamed from: qce reason: default package */
public final class qce implements vua<qcd> {
    private final wlc<saj> a;

    private qce(wlc<saj> wlc) {
        this.a = wlc;
    }

    public static qce a(wlc<saj> wlc) {
        return new qce(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qcd((saj) this.a.get());
    }
}
