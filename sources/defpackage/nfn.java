package defpackage;

/* renamed from: nfn reason: default package */
public final class nfn implements vua<Boolean> {
    private final wlc<gtk> a;

    private nfn(wlc<gtk> wlc) {
        this.a = wlc;
    }

    public static nfn a(wlc<gtk> wlc) {
        return new nfn(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((gtk) this.a.get()).b);
    }
}
