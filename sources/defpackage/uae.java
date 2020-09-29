package defpackage;

/* renamed from: uae reason: default package */
public final class uae implements vua<uab> {
    private final wlc<uaj> a;
    private final wlc<tzz> b;

    private uae(wlc<uaj> wlc, wlc<tzz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uae a(wlc<uaj> wlc, wlc<tzz> wlc2) {
        return new uae(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uab((uaj) this.a.get(), (tzz) this.b.get());
    }
}
