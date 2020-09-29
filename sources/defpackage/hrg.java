package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Pattern;

/* renamed from: hrg reason: default package */
public final class hrg {
    public static hrk a(hnd hnd) {
        hrk hrk = new hrk();
        String a = a(hnd.a());
        String str = "signal";
        if (!a.isEmpty()) {
            hrk.a(str, a);
        }
        if (!hnd.c().isEmpty()) {
            StringBuilder sb = new StringBuilder("client-id:");
            sb.append(hnd.c());
            hrk.a(str, sb.toString());
        }
        return hrk;
    }

    private static String a(String str) {
        RootListType b = hpk.b(str);
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("category:");
        sb.append(b.name);
        return sb.toString();
    }

    public static String b(hnd hnd) {
        String a = hnd.a();
        Assertion.a(a.contains("spotify:space_item:"), "The identifier [%s] should be a spaces identifier", a);
        StringBuilder sb = new StringBuilder("/vanilla/v1/views/hub2/");
        sb.append(b(a));
        return sb.toString();
    }

    private static String b(String str) {
        String[] split = Pattern.compile(":").split(str);
        if (a(split)) {
            return split[split.length - 3];
        }
        return split[2];
    }

    private static boolean a(String[] strArr) {
        return strArr.length > 2 && strArr[strArr.length - 2].equals(MoatAdEvent.EVENT_TYPE);
    }
}
