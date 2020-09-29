package defpackage;

/* renamed from: tbo reason: default package */
public final class tbo implements wig<String> {
    private static final tbo a = new tbo();

    public static tbo a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
