package defpackage;

import android.net.Uri;

/* renamed from: jre reason: default package */
public final class jre {
    public static boolean a(Uri uri) {
        if (uri.getQuery() == null) {
            return false;
        }
        return uri.toString().contains("filterOffline=true");
    }
}
