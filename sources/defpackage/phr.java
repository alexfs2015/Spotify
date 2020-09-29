package defpackage;

/* renamed from: phr reason: default package */
public final class phr implements vua<phq> {
    private final wlc<phk> a;

    private phr(wlc<phk> wlc) {
        this.a = wlc;
    }

    public static phr a(wlc<phk> wlc) {
        return new phr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new phq((phk) this.a.get());
    }
}
