package defpackage;

/* renamed from: kfl reason: default package */
public final class kfl implements vua<kfk> {
    private final wlc<jrp> a;

    private kfl(wlc<jrp> wlc) {
        this.a = wlc;
    }

    public static kfl a(wlc<jrp> wlc) {
        return new kfl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kfk((jrp) this.a.get());
    }
}
