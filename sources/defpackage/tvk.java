package defpackage;

/* renamed from: tvk reason: default package */
public final class tvk implements vua<tvj> {
    private final wlc<tvw> a;
    private final wlc<kxm> b;
    private final wlc<tvl> c;
    private final wlc<tvn> d;
    private final wlc<spi> e;

    private tvk(wlc<tvw> wlc, wlc<kxm> wlc2, wlc<tvl> wlc3, wlc<tvn> wlc4, wlc<spi> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static tvk a(wlc<tvw> wlc, wlc<kxm> wlc2, wlc<tvl> wlc3, wlc<tvn> wlc4, wlc<spi> wlc5) {
        tvk tvk = new tvk(wlc, wlc2, wlc3, wlc4, wlc5);
        return tvk;
    }

    public final /* synthetic */ Object get() {
        tvj tvj = new tvj((tvw) this.a.get(), (kxm) this.b.get(), (tvl) this.c.get(), (tvn) this.d.get(), (spi) this.e.get());
        return tvj;
    }
}
