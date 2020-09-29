package defpackage;

/* renamed from: sqq reason: default package */
public final class sqq implements vua<String> {
    private static final sqq a = new sqq();

    public static sqq a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
