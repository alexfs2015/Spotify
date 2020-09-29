package defpackage;

/* renamed from: lxo reason: default package */
public final class lxo implements vua<vim<gzz>> {
    private final wlc<lzp> a;
    private final wlc<lyn> b;
    private final wlc<veg> c;
    private final wlc<lyp> d;

    private lxo(wlc<lzp> wlc, wlc<lyn> wlc2, wlc<veg> wlc3, wlc<lyp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lxo a(wlc<lzp> wlc, wlc<lyn> wlc2, wlc<veg> wlc3, wlc<lyp> wlc4) {
        return new lxo(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        lyn lyn = (lyn) this.b.get();
        veg veg = (veg) this.c.get();
        lyp lyp = (lyp) this.d.get();
        lyn.a(((lzp) this.a.get()).e());
        a a2 = new a().a(vun.a((c<T, R>) lyn));
        if (veg.b()) {
            a2.a(lyp);
        }
        return (vim) vuf.a(vim.a(a2.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
