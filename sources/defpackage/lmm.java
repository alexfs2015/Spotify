package defpackage;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: lmm reason: default package */
public final class lmm implements wig<String> {
    private static final lmm a = new lmm();

    public static lmm a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        StringBuilder sb = new StringBuilder("Spotify/8.5.29 Android/");
        sb.append(VERSION.SDK_INT);
        sb.append(" (");
        sb.append(Build.MODEL);
        sb.append(')');
        return (String) wil.a(jun.a(sb.toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
