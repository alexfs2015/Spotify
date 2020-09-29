package defpackage;

/* renamed from: uwo reason: default package */
public final class uwo implements vua<uwn> {
    private final wlc<uws> a;
    private final wlc<uwq> b;

    private uwo(wlc<uws> wlc, wlc<uwq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uwo a(wlc<uws> wlc, wlc<uwq> wlc2) {
        return new uwo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uwn((uws) this.a.get(), (uwq) this.b.get());
    }
}
