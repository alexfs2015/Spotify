package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: crk reason: default package */
public final class crk {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            chg.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static dif a(duu duu) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        duu duu2 = duu;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = duu2.c;
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                dif dif = new dif();
                dif.a = duu2.b;
                dif.b = str5;
                dif.f = j4;
                dif.e = j3;
                dif.c = a;
                dif.d = a3;
                dif.g = map;
                dif.h = duu2.d;
                return dif;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            dif dif2 = new dif();
            dif2.a = duu2.b;
            dif2.b = str5;
            dif2.f = j4;
            dif2.e = j3;
            dif2.c = a;
            dif2.d = a3;
            dif2.g = map;
            dif2.h = duu2.d;
            return dif2;
        }
        j3 = j4;
        dif dif22 = new dif();
        dif22.a = duu2.b;
        dif22.b = str5;
        dif22.f = j4;
        dif22.e = j3;
        dif22.c = a;
        dif22.d = a3;
        dif22.g = map;
        dif22.h = duu2.d;
        return dif22;
    }

    static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
