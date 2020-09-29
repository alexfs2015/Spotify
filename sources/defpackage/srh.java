package defpackage;

/* renamed from: srh reason: default package */
public final class srh implements vua<String> {
    private static final srh a = new srh();

    public static srh a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
