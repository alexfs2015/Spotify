package defpackage;

/* renamed from: vcn reason: default package */
public final class vcn implements vua<vcm> {
    private final wlc<vco> a;
    private final wlc<vcz> b;

    private vcn(wlc<vco> wlc, wlc<vcz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vcn a(wlc<vco> wlc, wlc<vcz> wlc2) {
        return new vcn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vcm((vco) this.a.get(), (vcz) this.b.get());
    }
}
