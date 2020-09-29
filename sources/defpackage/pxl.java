package defpackage;

/* renamed from: pxl reason: default package */
public final class pxl implements vua<vim<gzz>> {
    private final wlc<gur> a;
    private final wlc<pzc> b;

    private pxl(wlc<gur> wlc, wlc<pzc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pxl a(wlc<gur> wlc, wlc<pzc> wlc2) {
        return new pxl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        pzc pzc = (pzc) this.b.get();
        pzc.a(((gur) this.a.get()).e());
        return (vim) vuf.a(vim.a(new a().a(vun.a((c<T, R>) pzc)).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
