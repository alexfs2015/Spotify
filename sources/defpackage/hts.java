package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Pattern;

/* renamed from: hts reason: default package */
public final class hts {
    public static htw a(huo huo) {
        htw htw = new htw();
        String c = c(huo);
        String str = "signal";
        if (!fbo.a(huo.a())) {
            htw.a(str, c);
        }
        if (!fbo.a(huo.d())) {
            StringBuilder sb = new StringBuilder("client-id:");
            sb.append(huo.d());
            htw.a(str, sb.toString());
        }
        return htw;
    }

    private static String a(String str) {
        return Pattern.compile(":").split(str)[2];
    }

    public static String b(huo huo) {
        String b = huo.b();
        Assertion.a(b.contains("spotify:space_item:"), "The identifier [%s] should be a spaces identifier", b);
        StringBuilder sb = new StringBuilder("/vanilla/v1/views/hub2/");
        sb.append(a(b));
        return sb.toString();
    }

    private static String c(huo huo) {
        StringBuilder sb = new StringBuilder("category:");
        sb.append(huo.a());
        return sb.toString();
    }
}
