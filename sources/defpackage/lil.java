package defpackage;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: lil reason: default package */
public final class lil implements vua<String> {
    private static final lil a = new lil();

    public static lil a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        StringBuilder sb = new StringBuilder("Spotify/8.5.27 Android/");
        sb.append(VERSION.SDK_INT);
        sb.append(" (");
        sb.append(Build.MODEL);
        sb.append(')');
        return (String) vuf.a(jsd.a(sb.toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
