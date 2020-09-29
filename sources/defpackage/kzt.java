package defpackage;

/* renamed from: kzt reason: default package */
public final class kzt implements wig<kzr> {
    private final wzi<gix> a;

    private kzt(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static kzr a(gix gix) {
        return (kzr) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static kzt a(wzi<gix> wzi) {
        return new kzt(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
