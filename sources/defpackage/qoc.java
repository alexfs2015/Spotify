package defpackage;

/* renamed from: qoc reason: default package */
public final class qoc implements vua<qob> {
    private final wlc<String> a;

    private qoc(wlc<String> wlc) {
        this.a = wlc;
    }

    public static qoc a(wlc<String> wlc) {
        return new qoc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qob((String) this.a.get());
    }
}
