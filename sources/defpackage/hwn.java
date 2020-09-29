package defpackage;

/* renamed from: hwn reason: default package */
public final class hwn implements vua<ife> {
    private final wlc<hvg> a;
    private final wlc<gbd> b;
    private final wlc<ghm> c;

    private hwn(wlc<hvg> wlc, wlc<gbd> wlc2, wlc<ghm> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hwn a(wlc<hvg> wlc, wlc<gbd> wlc2, wlc<ghm> wlc3) {
        return new hwn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (ife) vuf.a(new ife((hvg) this.a.get(), (gbd) this.b.get(), new ifh((ifk) ((ghm) this.c.get()).a(ifk.class))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
