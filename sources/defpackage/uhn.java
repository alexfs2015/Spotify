package defpackage;

/* renamed from: uhn reason: default package */
public final class uhn implements vua<uhm> {
    private final wlc<ugv> a;

    private uhn(wlc<ugv> wlc) {
        this.a = wlc;
    }

    public static uhn a(wlc<ugv> wlc) {
        return new uhn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uhm((ugv) this.a.get());
    }
}
