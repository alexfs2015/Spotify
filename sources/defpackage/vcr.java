package defpackage;

/* renamed from: vcr reason: default package */
public final class vcr implements vua<vcq> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private vcr(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vcr a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new vcr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vcq((jjf) this.a.get(), (jrp) this.b.get());
    }
}
