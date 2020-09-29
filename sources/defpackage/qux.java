package defpackage;

/* renamed from: qux reason: default package */
public final class qux implements vua<quw> {
    private final wlc<hcw> a;

    private qux(wlc<hcw> wlc) {
        this.a = wlc;
    }

    public static qux a(wlc<hcw> wlc) {
        return new qux(wlc);
    }

    public final /* synthetic */ Object get() {
        return new quw((hcw) this.a.get());
    }
}
