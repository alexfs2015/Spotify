package defpackage;

/* renamed from: skq reason: default package */
public final class skq implements vua<skp> {
    private final wlc<skr> a;

    private skq(wlc<skr> wlc) {
        this.a = wlc;
    }

    public static skq a(wlc<skr> wlc) {
        return new skq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new skp((skr) this.a.get());
    }
}
