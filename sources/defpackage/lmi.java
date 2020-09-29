package defpackage;

import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: lmi reason: default package */
public final class lmi {
    public static Date a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            Logger.e(e, "Exception when parsing date.", new Object[0]);
            return null;
        }
    }
}
