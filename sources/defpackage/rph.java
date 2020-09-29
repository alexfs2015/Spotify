package defpackage;

/* renamed from: rph reason: default package */
public final class rph implements vua<rpg> {
    private final wlc<jjf> a;
    private final wlc<jrf> b;

    private rph(wlc<jjf> wlc, wlc<jrf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rph a(wlc<jjf> wlc, wlc<jrf> wlc2) {
        return new rph(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rpg((jjf) this.a.get(), (jrf) this.b.get());
    }
}
