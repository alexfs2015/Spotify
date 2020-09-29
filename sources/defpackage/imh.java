package defpackage;

/* renamed from: imh reason: default package */
public final class imh implements vua<img> {
    private final wlc<hvl> a;
    private final wlc<wug> b;

    private imh(wlc<hvl> wlc, wlc<wug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static imh a(wlc<hvl> wlc, wlc<wug> wlc2) {
        return new imh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new img((hvl) this.a.get(), (wug) this.b.get());
    }
}
