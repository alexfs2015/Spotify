package defpackage;

/* renamed from: sqy reason: default package */
public final class sqy implements vua<String> {
    private static final sqy a = new sqy();

    public static sqy a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
