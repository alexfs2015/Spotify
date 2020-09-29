package defpackage;

/* renamed from: scg reason: default package */
public final class scg implements vua<scf> {
    private final wlc<ryz> a;

    private scg(wlc<ryz> wlc) {
        this.a = wlc;
    }

    public static scg a(wlc<ryz> wlc) {
        return new scg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scf((ryz) this.a.get());
    }
}
