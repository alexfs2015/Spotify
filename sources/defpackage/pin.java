package defpackage;

/* renamed from: pin reason: default package */
public final class pin implements wig<tyj> {
    private final wzi<tyj> a;

    private pin(wzi<tyj> wzi) {
        this.a = wzi;
    }

    public static pin a(wzi<tyj> wzi) {
        return new pin(wzi);
    }

    public final /* synthetic */ Object get() {
        return (tyj) wil.a((tyj) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
