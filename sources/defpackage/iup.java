package defpackage;

/* renamed from: iup reason: default package */
public final class iup implements vua<String> {
    private static final iup a = new iup();

    public static iup a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(udt.ar.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
