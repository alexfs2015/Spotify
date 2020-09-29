package defpackage;

/* renamed from: qrj reason: default package */
public final class qrj implements vua<qri> {
    private final wlc<jpb> a;
    private final wlc<uql> b;

    private qrj(wlc<jpb> wlc, wlc<uql> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qrj a(wlc<jpb> wlc, wlc<uql> wlc2) {
        return new qrj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qri((jpb) this.a.get(), (uql) this.b.get());
    }
}
