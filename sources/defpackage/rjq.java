package defpackage;

/* renamed from: rjq reason: default package */
public final class rjq implements vua<rjp> {
    private final wlc<rjs> a;

    private rjq(wlc<rjs> wlc) {
        this.a = wlc;
    }

    public static rjq a(wlc<rjs> wlc) {
        return new rjq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rjp((rjs) this.a.get());
    }
}
