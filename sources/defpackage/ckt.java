package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

@cey
/* renamed from: ckt reason: default package */
public final class ckt {
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
        if (bjl.B().a(context) && !TextUtils.isEmpty(str)) {
            String i = bjl.B().i(context);
            if (i == null) {
                return str;
            }
            if (((Boolean) dpn.f().a(dsp.ar)).booleanValue()) {
                String str2 = (String) dpn.f().a(dsp.as);
                if (str.contains(str2)) {
                    if (bjl.e().d(str)) {
                        bjl.B().c(context, i);
                        return str.replace(str2, i);
                    } else if (bjl.e().e(str)) {
                        bjl.B().d(context, i);
                        return str.replace(str2, i);
                    }
                }
            } else {
                String str3 = "fbs_aeid";
                if (!str.contains(str3)) {
                    if (bjl.e().d(str)) {
                        bjl.B().c(context, i);
                        return a(str, str3, i).toString();
                    } else if (bjl.e().e(str)) {
                        bjl.B().d(context, i);
                        str = a(str, str3, i).toString();
                    }
                }
            }
        }
        return str;
    }
}
