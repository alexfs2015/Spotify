package defpackage;

/* renamed from: qtb reason: default package */
public final class qtb implements vua<qta> {
    private final wlc<uqe> a;
    private final wlc<a> b;
    private final wlc<qvz> c;

    private qtb(wlc<uqe> wlc, wlc<a> wlc2, wlc<qvz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qtb a(wlc<uqe> wlc, wlc<a> wlc2, wlc<qvz> wlc3) {
        return new qtb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qta((uqe) this.a.get(), (a) this.b.get(), (qvz) this.c.get());
    }
}
