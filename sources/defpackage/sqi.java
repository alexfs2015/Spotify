package defpackage;

/* renamed from: sqi reason: default package */
public final class sqi implements vua<String> {
    private static final sqi a = new sqi();

    public static sqi a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
