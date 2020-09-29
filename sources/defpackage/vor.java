package defpackage;

import android.os.Build;

/* renamed from: vor reason: default package */
public final class vor implements wig<String> {
    private static final vor a = new vor();

    public static vor a() {
        return a;
    }

    public static String b() {
        return (String) wil.a(Build.MODEL, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
