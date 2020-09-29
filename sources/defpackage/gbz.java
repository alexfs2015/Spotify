package defpackage;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;

/* renamed from: gbz reason: default package */
public final class gbz {
    public static void a(Runnable runnable) {
        $$Lambda$Wp3a9u5EpaapYhswfwlFdXA9u3A r0 = $$Lambda$Wp3a9u5EpaapYhswfwlFdXA9u3A.INSTANCE;
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(((Builder) r0.apply(new Builder(threadPolicy))).build());
            runnable.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
