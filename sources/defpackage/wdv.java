package defpackage;

/* renamed from: wdv reason: default package */
public final class wdv implements wig<wdx> {
    private final wzi<gfk<fli>> a;

    private wdv(wzi<gfk<fli>> wzi) {
        this.a = wzi;
    }

    public static wdv a(wzi<gfk<fli>> wzi) {
        return new wdv(wzi);
    }

    public static wdx a(gfk<fli> gfk) {
        return (wdx) wil.a(CC.a(gfk), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gfk) this.a.get());
    }
}
