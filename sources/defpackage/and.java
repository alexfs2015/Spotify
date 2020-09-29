package defpackage;

import android.util.Log;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: and reason: default package */
public final class and {
    private static final HashMap<String, String> a = new HashMap<>();
    private final LoggingBehavior b;
    private final String c;
    private StringBuilder d;
    private int e = 3;

    public and(LoggingBehavior loggingBehavior, String str) {
        anl.a(str, "tag");
        this.b = loggingBehavior;
        StringBuilder sb = new StringBuilder("FacebookSDK.");
        sb.append(str);
        this.c = sb.toString();
        this.d = new StringBuilder();
    }

    public static void a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (akq.a(loggingBehavior)) {
            String c2 = c(str2);
            String str3 = "FacebookSDK.";
            if (!str.startsWith(str3)) {
                StringBuilder sb = new StringBuilder(str3);
                sb.append(str);
                str = sb.toString();
            }
            Log.println(i, str, c2);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    public static void a(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        if (akq.a(loggingBehavior)) {
            a(loggingBehavior, 5, str, String.format(str2, objArr));
        }
    }

    public static void a(LoggingBehavior loggingBehavior, String str, String str2) {
        a(loggingBehavior, 3, str, str2);
    }

    public static void a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (akq.a(loggingBehavior)) {
            a(loggingBehavior, 3, str, String.format(str2, objArr));
        }
    }

    public static synchronized void a(String str) {
        synchronized (and.class) {
            if (!akq.a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    private static synchronized void a(String str, String str2) {
        synchronized (and.class) {
            a.put(str, str2);
        }
    }

    private void a(String str, Object... objArr) {
        if (akq.a(this.b)) {
            this.d.append(String.format(str, objArr));
        }
    }

    private static synchronized String c(String str) {
        synchronized (and.class) {
            for (Entry entry : a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    private void d(String str) {
        a(this.b, this.e, this.c, str);
    }

    public final void a() {
        d(this.d.toString());
        this.d = new StringBuilder();
    }

    public final void a(String str, Object obj) {
        a("  %s:\t%s\n", str, obj);
    }

    public final void b(String str) {
        if (akq.a(this.b)) {
            this.d.append(str);
        }
    }
}
