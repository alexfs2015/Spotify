package defpackage;

/* renamed from: lkm reason: default package */
public final class lkm implements vua<lkl> {
    private final wlc<hed> a;

    private lkm(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static lkm a(wlc<hed> wlc) {
        return new lkm(wlc);
    }

    public static lkl a(hed hed) {
        return new lkl(hed);
    }

    public final /* synthetic */ Object get() {
        return new lkl((hed) this.a.get());
    }
}
