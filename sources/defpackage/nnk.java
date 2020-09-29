package defpackage;

/* renamed from: nnk reason: default package */
public final class nnk implements wig<String> {
    private final wzi<Boolean> a;

    private nnk(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static nnk a(wzi<Boolean> wzi) {
        return new nnk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Boolean) this.a.get()).booleanValue() ? "free-tier-cache" : "premium-cache", "Cannot return null from a non-@Nullable @Provides method");
    }
}
