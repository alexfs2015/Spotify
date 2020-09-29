package defpackage;

/* renamed from: qme reason: default package */
public final class qme implements vua<qmd> {
    private final wlc<gjf> a;
    private final wlc<qmf> b;

    private qme(wlc<gjf> wlc, wlc<qmf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qme a(wlc<gjf> wlc, wlc<qmf> wlc2) {
        return new qme(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qmd((gjf) this.a.get(), (qmf) this.b.get());
    }
}
