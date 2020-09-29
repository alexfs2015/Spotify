package defpackage;

/* renamed from: gtg reason: default package */
public final class gtg implements vua<Boolean> {
    private final wlc<fpt> a;

    private gtg(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static gtg a(wlc<fpt> wlc) {
        return new gtg(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.c((fpt) this.a.get()));
    }
}
