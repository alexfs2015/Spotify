package defpackage;

/* renamed from: snr reason: default package */
public final class snr implements vua<snq> {
    private final wlc<snx> a;
    private final wlc<rka> b;

    private snr(wlc<snx> wlc, wlc<rka> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static snr a(wlc<snx> wlc, wlc<rka> wlc2) {
        return new snr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new snq((snx) this.a.get(), (rka) this.b.get());
    }
}
