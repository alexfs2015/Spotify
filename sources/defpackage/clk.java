package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

@cfp
/* renamed from: clk reason: default package */
public final class clk {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        sb.append("&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static String a(String str, Context context) {
        if (bkc.B().a(context) && !TextUtils.isEmpty(str)) {
            String i = bkc.B().i(context);
            if (i == null) {
                return str;
            }
            if (((Boolean) dqe.f().a(dtg.ar)).booleanValue()) {
                String str2 = (String) dqe.f().a(dtg.as);
                if (str.contains(str2)) {
                    if (bkc.e().d(str)) {
                        bkc.B().c(context, i);
                        return str.replace(str2, i);
                    } else if (bkc.e().e(str)) {
                        bkc.B().d(context, i);
                        return str.replace(str2, i);
                    }
                }
            } else {
                String str3 = "fbs_aeid";
                if (!str.contains(str3)) {
                    if (bkc.e().d(str)) {
                        bkc.B().c(context, i);
                        return a(str, str3, i).toString();
                    } else if (bkc.e().e(str)) {
                        bkc.B().d(context, i);
                        str = a(str, str3, i).toString();
                    }
                }
            }
        }
        return str;
    }
}
