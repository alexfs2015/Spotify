package defpackage;

/* renamed from: pbb reason: default package */
public final class pbb implements vua<Boolean> {
    private final wlc<rgz> a;
    private final wlc<fpt> b;

    private pbb(wlc<rgz> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pbb a(wlc<rgz> wlc, wlc<fpt> wlc2) {
        return new pbb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!((rgz) this.a.get()).a((fpt) this.b.get()));
    }
}
