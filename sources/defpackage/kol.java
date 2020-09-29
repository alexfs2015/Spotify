package defpackage;

/* renamed from: kol reason: default package */
public final class kol implements vua<Boolean> {
    private final wlc<fpt> a;

    private kol(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static kol a(wlc<fpt> wlc) {
        return new kol(wlc);
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        return Boolean.valueOf(kok.a(fpt) || kok.b(fpt));
    }
}
