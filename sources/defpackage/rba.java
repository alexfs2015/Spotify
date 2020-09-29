package defpackage;

/* renamed from: rba reason: default package */
public final class rba implements vua<raz> {
    private final wlc<ufq> a;

    private rba(wlc<ufq> wlc) {
        this.a = wlc;
    }

    public static rba a(wlc<ufq> wlc) {
        return new rba(wlc);
    }

    public final /* synthetic */ Object get() {
        return new raz((ufq) this.a.get());
    }
}
