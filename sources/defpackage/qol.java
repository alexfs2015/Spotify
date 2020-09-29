package defpackage;

/* renamed from: qol reason: default package */
public final class qol implements vua<qok> {
    private final wlc<rgz> a;

    private qol(wlc<rgz> wlc) {
        this.a = wlc;
    }

    public static qol a(wlc<rgz> wlc) {
        return new qol(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qok((rgz) this.a.get());
    }
}
