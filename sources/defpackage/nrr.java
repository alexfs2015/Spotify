package defpackage;

/* renamed from: nrr reason: default package */
public final class nrr implements vua<nrq> {
    private final wlc<ujk> a;

    private nrr(wlc<ujk> wlc) {
        this.a = wlc;
    }

    public static nrr a(wlc<ujk> wlc) {
        return new nrr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nrq((ujk) this.a.get());
    }
}
