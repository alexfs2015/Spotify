package defpackage;

/* renamed from: nvd reason: default package */
public final class nvd implements wig<nuu> {
    private final wzi<nvk> a;

    private nvd(wzi<nvk> wzi) {
        this.a = wzi;
    }

    public static nvd a(wzi<nvk> wzi) {
        return new nvd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (nuu) wil.a(new nuu((nvk) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
