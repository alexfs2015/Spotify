package defpackage;

/* renamed from: rbj reason: default package */
public final class rbj implements vua<rbi> {
    private final wlc<ufq> a;
    private final wlc<ram> b;

    private rbj(wlc<ufq> wlc, wlc<ram> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rbj a(wlc<ufq> wlc, wlc<ram> wlc2) {
        return new rbj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rbi((ufq) this.a.get(), (ram) this.b.get());
    }
}
