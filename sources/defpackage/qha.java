package defpackage;

/* renamed from: qha reason: default package */
public final class qha implements wig<String> {
    private final wzi<a> a;

    private qha(wzi<a> wzi) {
        this.a = wzi;
    }

    public static String a(a aVar) {
        return (String) wil.a(aVar.e, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static qha a(wzi<a> wzi) {
        return new qha(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
