package defpackage;

import java.util.Locale;

/* renamed from: kzx reason: default package */
public final class kzx implements vua<String> {
    private static final kzx a = new kzx();

    public static kzx a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(gnd.a(Locale.getDefault()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
