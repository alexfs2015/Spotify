package defpackage;

/* renamed from: qur reason: default package */
public final class qur implements vua<quq> {
    private final wlc<qxq> a;
    private final wlc<qwz> b;

    private qur(wlc<qxq> wlc, wlc<qwz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qur a(wlc<qxq> wlc, wlc<qwz> wlc2) {
        return new qur(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new quq((qxq) this.a.get(), (qwz) this.b.get());
    }
}
