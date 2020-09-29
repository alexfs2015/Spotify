package defpackage;

/* renamed from: swb reason: default package */
public final class swb implements vua<String> {
    private static final swb a = new swb();

    public static swb a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
