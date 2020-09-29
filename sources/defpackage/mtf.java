package defpackage;

/* renamed from: mtf reason: default package */
public final class mtf implements vua<Boolean> {
    private final wlc<fpt> a;
    private final wlc<kxg> b;

    private mtf(wlc<fpt> wlc, wlc<kxg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mtf a(wlc<fpt> wlc, wlc<kxg> wlc2) {
        return new mtf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((kxg) this.b.get()).a((fpt) this.a.get()));
    }
}
