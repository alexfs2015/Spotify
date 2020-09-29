package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: alv reason: default package */
public final class alv {
    public static double a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(ank.a()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static String a() {
        Context g = akq.g();
        try {
            return g.getPackageManager().getPackageInfo(g.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }
}