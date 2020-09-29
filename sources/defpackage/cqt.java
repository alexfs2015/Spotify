package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: cqt reason: default package */
public final class cqt {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            cgp.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static dho a(dud dud) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        dud dud2 = dud;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = dud2.c;
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
                dho dho = new dho();
                dho.a = dud2.b;
                dho.b = str5;
                dho.f = j4;
                dho.e = j3;
                dho.c = a;
                dho.d = a3;
                dho.g = map;
                dho.h = dud2.d;
                return dho;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            dho dho2 = new dho();
            dho2.a = dud2.b;
            dho2.b = str5;
            dho2.f = j4;
            dho2.e = j3;
            dho2.c = a;
            dho2.d = a3;
            dho2.g = map;
            dho2.h = dud2.d;
            return dho2;
        }
        j3 = j4;
        dho dho22 = new dho();
        dho22.a = dud2.b;
        dho22.b = str5;
        dho22.f = j4;
        dho22.e = j3;
        dho22.c = a;
        dho22.d = a3;
        dho22.g = map;
        dho22.h = dud2.d;
        return dho22;
    }

    static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
