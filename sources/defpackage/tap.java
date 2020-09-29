package defpackage;

/* renamed from: tap reason: default package */
public final class tap implements wig<String> {
    private static final tap a = new tap();

    public static tap a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
