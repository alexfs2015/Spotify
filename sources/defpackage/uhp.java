package defpackage;

/* renamed from: uhp reason: default package */
public final class uhp implements vua<uho> {
    private final wlc<ugv> a;

    private uhp(wlc<ugv> wlc) {
        this.a = wlc;
    }

    public static uhp a(wlc<ugv> wlc) {
        return new uhp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uho((ugv) this.a.get());
    }
}
