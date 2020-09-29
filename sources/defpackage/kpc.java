package defpackage;

/* renamed from: kpc reason: default package */
public final class kpc implements vua<kpb> {
    private final wlc<kos> a;
    private final wlc<kop> b;

    private kpc(wlc<kos> wlc, wlc<kop> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kpc a(wlc<kos> wlc, wlc<kop> wlc2) {
        return new kpc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kpb((kos) this.a.get(), (kop) this.b.get());
    }
}
