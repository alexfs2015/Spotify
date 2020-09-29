package defpackage;

/* renamed from: pwt reason: default package */
public final class pwt implements vua<Boolean> {
    private final wlc<uio> a;
    private final wlc<fpt> b;

    private pwt(wlc<uio> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pwt a(wlc<uio> wlc, wlc<fpt> wlc2) {
        return new pwt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        uio uio = (uio) this.a.get();
        fpt fpt = (fpt) this.b.get();
        return Boolean.valueOf(((fpt) fay.a(fpt)).b(uin.a) || ((fpt) fay.a(fpt)).b(uin.b));
    }
}
