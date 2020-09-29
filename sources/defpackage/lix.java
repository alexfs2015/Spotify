package defpackage;

/* renamed from: lix reason: default package */
public final class lix implements wig<String> {
    private final wzi<a> a;

    private lix(wzi<a> wzi) {
        this.a = wzi;
    }

    public static String a(a aVar) {
        return (String) wil.a(CC.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lix a(wzi<a> wzi) {
        return new lix(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
