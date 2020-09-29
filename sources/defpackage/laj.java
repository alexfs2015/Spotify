package defpackage;

/* renamed from: laj reason: default package */
public final class laj implements vua<String> {
    private static final laj a = new laj();

    public static laj a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a("8.5.27.957", "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
