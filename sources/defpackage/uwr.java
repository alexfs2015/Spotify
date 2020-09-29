package defpackage;

/* renamed from: uwr reason: default package */
public final class uwr implements vua<uwq> {
    private final wlc<rnf> a;

    private uwr(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static uwr a(wlc<rnf> wlc) {
        return new uwr(wlc);
    }

    public static uwq a(rnf rnf) {
        return new uwq(rnf);
    }

    public final /* synthetic */ Object get() {
        return new uwq((rnf) this.a.get());
    }
}
