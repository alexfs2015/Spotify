package defpackage;

import android.net.Uri;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: sak reason: default package */
public final class sak {
    public static sih a(String str) {
        return ViewUris.ag.a(b(str));
    }

    private static String b(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder(":");
            sb.append(Uri.encode(str));
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("spotify:search");
        sb2.append(str2);
        return sb2.toString();
    }
}
