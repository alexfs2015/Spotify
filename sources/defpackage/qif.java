package defpackage;

/* renamed from: qif reason: default package */
public final class qif implements vua<qie> {
    private final wlc<qig> a;
    private final wlc<qix> b;

    private qif(wlc<qig> wlc, wlc<qix> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qif a(wlc<qig> wlc, wlc<qix> wlc2) {
        return new qif(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qie((qig) this.a.get(), (qix) this.b.get());
    }
}
