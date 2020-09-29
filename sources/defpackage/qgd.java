package defpackage;

/* renamed from: qgd reason: default package */
public final class qgd implements wig<sit> {
    private final wzi<siq> a;
    private final wzi<String> b;
    private final wzi<Boolean> c;

    private qgd(wzi<siq> wzi, wzi<String> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qgd a(wzi<siq> wzi, wzi<String> wzi2, wzi<Boolean> wzi3) {
        return new qgd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (sit) wil.a(((siq) this.a.get()).a((String) this.b.get(), ((Boolean) this.c.get()).booleanValue() ? "assisted_curation" : "default"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
