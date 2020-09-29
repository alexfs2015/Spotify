package defpackage;

/* renamed from: rvu reason: default package */
public final class rvu implements vua<rvt> {
    private final wlc<jjf> a;

    private rvu(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static rvu a(wlc<jjf> wlc) {
        return new rvu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rvt((jjf) this.a.get());
    }
}
