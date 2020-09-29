package defpackage;

/* renamed from: rbc reason: default package */
public final class rbc implements vua<rbb> {
    private final wlc<ram> a;

    private rbc(wlc<ram> wlc) {
        this.a = wlc;
    }

    public static rbc a(wlc<ram> wlc) {
        return new rbc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rbb((ram) this.a.get());
    }
}
