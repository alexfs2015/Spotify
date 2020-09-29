package defpackage;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: iwg reason: default package */
public final class iwg {
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

    public static String a(String str, Date date, Calendar calendar, Locale locale) {
        return TextUtils.join(" • ", new String[]{a(date, calendar, locale), str});
    }

    private static String a(Date date, Calendar calendar, Locale locale) {
        calendar.setTime(date);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            return calendar.get(12) == 0 ? DateFormat.format("EEE, h a", date).toString() : new SimpleDateFormat("EEE, h:mm a", locale).format(date);
        }
        String displayName = calendar.getDisplayName(7, 1, locale);
        String format = java.text.DateFormat.getTimeInstance(3, locale).format(date);
        StringBuilder sb = new StringBuilder();
        sb.append(displayName);
        sb.append(", ");
        sb.append(format);
        return sb.toString();
    }

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
}
