package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vbq reason: default package */
public final class vbq {
    public static long a(fqn fqn) {
        String str = (String) fqn.a(vbp.a);
        if (str != null) {
            Matcher matcher = Pattern.compile("^Enabled(\\d+)h$").matcher(str);
            if (matcher.matches()) {
                int i = 0;
                try {
                    i = Integer.parseInt(matcher.group(1));
                } catch (NumberFormatException unused) {
                    Logger.e("Bad formatted flag value: %s", str);
                }
                return TimeUnit.HOURS.toMillis((long) i);
            }
        }
        return 0;
    }
}
