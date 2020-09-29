package defpackage;

import java.util.Locale;

/* renamed from: ldj reason: default package */
public final class ldj implements wig<String> {
    private static final ldj a = new ldj();

    public static ldj a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(gos.a(Locale.getDefault()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
