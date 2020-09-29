package defpackage;

import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: itw reason: default package */
public final class itw {
    public static Date a(String str, String str2, Locale locale, Calendar calendar) {
        calendar.setTime(new Date(Long.MIN_VALUE));
        Date time = calendar.getTime();
        if (str == null) {
            return time;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
        try {
            time = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            Logger.d(e, "Failed to parse date [%s] with formatter [%s]", str, simpleDateFormat);
        }
        return time;
    }

    public static String a(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
