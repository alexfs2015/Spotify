package defpackage;

/* renamed from: scu reason: default package */
public final class scu implements vua<sct> {
    private final wlc<ryz> a;

    private scu(wlc<ryz> wlc) {
        this.a = wlc;
    }

    public static scu a(wlc<ryz> wlc) {
        return new scu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sct((ryz) this.a.get());
    }
}
