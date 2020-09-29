package defpackage;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: eiv reason: default package */
public final class eiv {
    private static final ein a = new ein("MetadataUtils", 0);
    private static final String[] b = {"Z", "+hh", "+hhmm", "+hh:mm"};
    private static final String c;

    static {
        String valueOf = String.valueOf(b[0]);
        String str = "yyyyMMdd'T'HHmmss";
        c = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public static Calendar a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        String b2 = b(str);
        if (TextUtils.isEmpty(b2)) {
            a.a("Invalid date format", new Object[0]);
            return null;
        }
        String c2 = c(str);
        if (!TextUtils.isEmpty(c2)) {
            String valueOf = String.valueOf(b2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(c2).length());
            sb.append(valueOf);
            sb.append("T");
            sb.append(c2);
            b2 = sb.toString();
            str2 = c2.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(b2));
            return instance;
        } catch (ParseException e) {
            a.a("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    public static void a(List<bwu> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new bwu(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            a.c("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        boolean z = true;
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                if (!(length == b[1].length() + 6 || length == b[2].length() + 6 || length == b[3].length() + 6)) {
                    z = false;
                }
                if (z) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt != 'Z' || substring.length() != b[0].length() + 6) {
                return null;
            } else {
                String valueOf = String.valueOf(substring.substring(0, substring.length() - 1));
                String str2 = "+0000";
                return str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            a.a("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }
}
