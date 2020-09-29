package defpackage;

/* renamed from: qgv reason: default package */
public final class qgv implements wig<String> {
    private final wzi<b> a;

    private qgv(wzi<b> wzi) {
        this.a = wzi;
    }

    public static String a(b bVar) {
        return (String) wil.a(CC.a(bVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static qgv a(wzi<b> wzi) {
        return new qgv(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((b) this.a.get());
    }
}
