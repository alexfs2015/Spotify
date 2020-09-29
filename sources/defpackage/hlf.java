package defpackage;

/* renamed from: hlf reason: default package */
public final class hlf implements vua<vnk> {
    private final wlc<ka> a;
    private final wlc<brx> b;
    private final wlc<gao> c;

    private hlf(wlc<ka> wlc, wlc<brx> wlc2, wlc<gao> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hlf a(wlc<ka> wlc, wlc<brx> wlc2, wlc<gao> wlc3) {
        return new hlf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (vnk) vuf.a(new vnk((ka) this.a.get(), (brx) this.b.get(), (gao) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
