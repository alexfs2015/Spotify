package defpackage;

/* renamed from: krp reason: default package */
public final class krp implements vua<kro> {
    private final wlc<krk> a;

    private krp(wlc<krk> wlc) {
        this.a = wlc;
    }

    public static krp a(wlc<krk> wlc) {
        return new krp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kro((krk) this.a.get());
    }
}
