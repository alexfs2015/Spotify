package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: hre reason: default package */
public final class hre {
    private final Uri a;
    private final jty b;

    public hre(String str, jty jty) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(str);
        this.a = Uri.parse(sb.toString());
        this.b = jty;
    }

    private static Uri a(jty jty) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(jty.d());
        return Uri.parse(sb.toString());
    }

    public final Uri a(String str) {
        while (!TextUtils.isEmpty(str)) {
            if (str.startsWith("spotify:image:")) {
                str = Base64.encodeToString(str.substring(14).getBytes(fbi.c), 0);
            } else if (str.startsWith("spotify:localfileimage:")) {
                str = Base64.encodeToString(str.getBytes(fbi.c), 0);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                str = Base64.encodeToString(str.getBytes(fbi.c), 0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(a(this.b));
                sb.append("/image/");
                sb.append(Uri.encode(str));
                return this.a.buildUpon().encodedPath(Uri.parse(sb.toString()).getEncodedPath()).build();
            }
        }
        return Uri.EMPTY;
    }
}
