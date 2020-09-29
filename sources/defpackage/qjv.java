package defpackage;

/* renamed from: qjv reason: default package */
public final class qjv implements vua<qju> {
    private final wlc<qkt> a;
    private final wlc<qja> b;

    private qjv(wlc<qkt> wlc, wlc<qja> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qjv a(wlc<qkt> wlc, wlc<qja> wlc2) {
        return new qjv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qju((qkt) this.a.get(), (qja) this.b.get());
    }
}
