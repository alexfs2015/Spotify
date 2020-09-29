package defpackage;

import android.os.Build;

/* renamed from: jsh reason: default package */
public final class jsh implements vua<String> {
    private static final jsh a = new jsh();

    public static jsh a() {
        return a;
    }

    public static String b() {
        return (String) vuf.a(Build.MODEL, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
