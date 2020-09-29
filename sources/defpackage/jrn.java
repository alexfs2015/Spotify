package defpackage;

/* renamed from: jrn reason: default package */
public final class jrn implements vua<jrm> {
    private final wlc<mc> a;
    private final wlc<unt> b;

    private jrn(wlc<mc> wlc, wlc<unt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jrn a(wlc<mc> wlc, wlc<unt> wlc2) {
        return new jrn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jrm((mc) this.a.get(), (unt) this.b.get());
    }
}
