package defpackage;

/* renamed from: rfl reason: default package */
public final class rfl implements vua<rfk> {
    private final wlc<jjf> a;
    private final wlc<String> b;

    private rfl(wlc<jjf> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rfl a(wlc<jjf> wlc, wlc<String> wlc2) {
        return new rfl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rfk((jjf) this.a.get(), (String) this.b.get());
    }
}
