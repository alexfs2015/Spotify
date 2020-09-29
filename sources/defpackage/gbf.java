package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.util.Set;

/* renamed from: gbf reason: default package */
public final class gbf {
    public static String a(Set<String> set, String str, long j) {
        fbp.a(set);
        gbc gbc = new gbc();
        String str2 = null;
        long j2 = 0;
        for (String str3 : set) {
            try {
                gbc.a(str3);
                long b = gbc.b();
                if (str != null && str.startsWith(str3)) {
                    b += j;
                }
                if (b > j2) {
                    str2 = str3;
                    j2 = b;
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("Tried to stat path ");
                sb.append(str3);
                sb.append(" but failed with exception: ");
                sb.append(e.getMessage());
                Assertion.c(sb.toString());
            }
        }
        return str2;
    }
}
