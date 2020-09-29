package defpackage;

/* renamed from: rxe reason: default package */
public final class rxe implements wig<rxf> {
    private final wzi<gix> a;

    private rxe(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static rxe a(wzi<gix> wzi) {
        return new rxe(wzi);
    }

    public static rxf a(gix gix) {
        return (rxf) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
