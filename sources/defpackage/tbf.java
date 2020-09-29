package defpackage;

/* renamed from: tbf reason: default package */
public final class tbf implements wig<String> {
    private static final tbf a = new tbf();

    public static tbf a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
