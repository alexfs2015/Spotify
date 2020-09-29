package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: jub reason: default package */
public final class jub {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    static {
        new SimpleDateFormat("HH:mm:ss", Locale.US);
        new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss-SSS", Locale.US);
    }

    public static synchronized String a(Calendar calendar) {
        String format;
        synchronized (jub.class) {
            fbp.a(calendar);
            a.setTimeZone(calendar.getTimeZone());
            format = a.format(calendar.getTime());
        }
        return format;
    }
}
