package defpackage;

/* renamed from: uhb reason: default package */
public final class uhb implements vua<uha> {
    private final wlc<ugv> a;

    private uhb(wlc<ugv> wlc) {
        this.a = wlc;
    }

    public static uhb a(wlc<ugv> wlc) {
        return new uhb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uha((ugv) this.a.get());
    }
}
