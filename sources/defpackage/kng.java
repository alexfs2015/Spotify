package defpackage;

/* renamed from: kng reason: default package */
public final class kng implements vua<knf> {
    private final wlc<kda> a;
    private final wlc<rvv> b;

    private kng(wlc<kda> wlc, wlc<rvv> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kng a(wlc<kda> wlc, wlc<rvv> wlc2) {
        return new kng(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new knf((kda) this.a.get(), (rvv) this.b.get());
    }
}
