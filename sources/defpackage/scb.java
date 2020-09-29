package defpackage;

/* renamed from: scb reason: default package */
public final class scb implements vua<sca> {
    private final wlc<ryz> a;

    private scb(wlc<ryz> wlc) {
        this.a = wlc;
    }

    public static scb a(wlc<ryz> wlc) {
        return new scb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sca((ryz) this.a.get());
    }
}
