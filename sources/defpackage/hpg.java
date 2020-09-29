package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: hpg reason: default package */
public final class hpg {
    private final Uri a;
    private final jro b;

    public hpg(String str, jro jro) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(str);
        this.a = Uri.parse(sb.toString());
        this.b = jro;
    }

    public final Uri a(String str) {
        while (!TextUtils.isEmpty(str)) {
            if (str.startsWith("spotify:image:")) {
                str = Base64.encodeToString(str.substring(14).getBytes(far.c), 0);
            } else if (str.startsWith("spotify:localfileimage:")) {
                str = Base64.encodeToString(str.getBytes(far.c), 0);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                str = Base64.encodeToString(str.getBytes(far.c), 0);
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

    private static Uri a(jro jro) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(jro.d());
        return Uri.parse(sb.toString());
    }
}
