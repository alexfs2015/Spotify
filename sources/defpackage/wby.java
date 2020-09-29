package defpackage;

/* renamed from: wby reason: default package */
public final class wby implements wig<wbt> {
    private final wzi<gfk<fli>> a;

    private wby(wzi<gfk<fli>> wzi) {
        this.a = wzi;
    }

    public static wbt a(gfk<fli> gfk) {
        return (wbt) wil.a(CC.a(gfk), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static wby a(wzi<gfk<fli>> wzi) {
        return new wby(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gfk) this.a.get());
    }
}
