package defpackage;

import android.net.Uri;

/* renamed from: izl reason: default package */
public final class izl {
    public static String a(String str, String str2, String str3) {
        return Uri.parse(str).buildUpon().appendQueryParameter("utm_source", str2).appendQueryParameter("utm_medium", str3).build().toString();
    }
}
