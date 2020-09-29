package defpackage;

/* renamed from: tgi reason: default package */
public final class tgi implements wig<String> {
    private static final tgi a = new tgi();

    public static tgi a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
