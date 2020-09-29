package defpackage;

import android.graphics.Color;
import android.text.format.DateUtils;
import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: mpe reason: default package */
final class mpe {
    static int a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    static String b(String str) {
        try {
            return DateUtils.getRelativeTimeSpanString(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault()).parse(str).getTime()).toString();
        } catch (ParseException e) {
            Logger.e(e, "Exception when parsing date.", new Object[0]);
            return "";
        }
    }
}
