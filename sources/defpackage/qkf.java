package defpackage;

/* renamed from: qkf reason: default package */
public final class qkf implements vua<qke> {
    private final wlc<kxp> a;
    private final wlc<qho> b;

    private qkf(wlc<kxp> wlc, wlc<qho> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qkf a(wlc<kxp> wlc, wlc<qho> wlc2) {
        return new qkf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qke((kxp) this.a.get(), (qho) this.b.get());
    }
}
