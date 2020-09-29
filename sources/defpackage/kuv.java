package defpackage;

/* renamed from: kuv reason: default package */
public final class kuv implements wig<kut> {
    private final wzi<gix> a;

    private kuv(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static kut a(gix gix) {
        return (kut) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static kuv a(wzi<gix> wzi) {
        return new kuv(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
