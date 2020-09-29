package defpackage;

/* renamed from: skx reason: default package */
public final class skx implements wig<skw> {
    private final wzi<gix> a;

    private skx(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static skx a(wzi<gix> wzi) {
        return new skx(wzi);
    }

    public final /* synthetic */ Object get() {
        return (skw) wil.a((skw) ((gix) this.a.get()).a(skw.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
