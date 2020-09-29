package defpackage;

/* renamed from: qjr reason: default package */
public final class qjr implements vua<qjq> {
    private final wlc<qja> a;
    private final wlc<qkq> b;

    private qjr(wlc<qja> wlc, wlc<qkq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qjr a(wlc<qja> wlc, wlc<qkq> wlc2) {
        return new qjr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qjq((qja) this.a.get(), (qkq) this.b.get());
    }
}
