package defpackage;

import android.content.Context;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qvm reason: default package */
public final class qvm {
    private static final Pattern c = Pattern.compile("(|.+)(device_address=)([a-fA-F0-9:]+)(|&.*)");
    private static final Pattern d = Pattern.compile("(|.+)(device_name=)([^&]*)(|&.*)");
    final Context a;
    final vwu b;

    qvm(Context context, vwu vwu) {
        this.a = context;
        this.b = vwu;
    }

    public static String a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            return matcher.group(3);
        }
        return null;
    }

    public static String b(String str) {
        Matcher matcher = d.matcher(str);
        return matcher.matches() ? matcher.group(3) : "Samsung Watch";
    }

    static boolean c(String str) {
        return str != null && str.contains("start_app_protocol_server=true");
    }
}
