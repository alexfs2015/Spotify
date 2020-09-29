package defpackage;

/* renamed from: rct reason: default package */
public final class rct implements vua<rcs> {
    private final wlc<jjf> a;

    private rct(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static rct a(wlc<jjf> wlc) {
        return new rct(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rcs((jjf) this.a.get());
    }
}
