package defpackage;

/* renamed from: qbd reason: default package */
public final class qbd implements vua<qbc> {
    private final wlc<fpt> a;
    private final wlc<Boolean> b;

    private qbd(wlc<fpt> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qbd a(wlc<fpt> wlc, wlc<Boolean> wlc2) {
        return new qbd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qbc((fpt) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
