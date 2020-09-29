package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import java.util.Random;
import java.util.concurrent.Executors;

/* renamed from: vjo reason: default package */
public final class vjo {
    private final a a;

    /* renamed from: vjo$a */
    interface a {
        void a(Context context, Intent intent, String str, Object... objArr);

        void a(Intent intent);
    }

    public static void a(Intent intent) {
        intent.putExtra("needs_foreground_start", true);
    }

    private vjo(a aVar) {
        this.a = (a) fay.a(aVar);
    }

    public final void a(Context context, Intent intent, String str, Object... objArr) {
        Logger.c("Starting foreground service for %s", intent);
        a(intent);
        this.a.a(context, intent, str, objArr);
    }

    public final void b(Intent intent) {
        Logger.c("Acknowledging foreground service for intent %s", intent != null ? intent.toUri(0) : "");
        this.a.a(intent);
    }

    public vjo(Context context, Random random, jrp jrp) {
        a aVar;
        if (VERSION.SDK_INT < 26) {
            aVar = new a() {
                public final void a(Intent intent) {
                }

                public final void a(Context context, Intent intent, String str, Object... objArr) {
                    context.startService(intent);
                }
            };
        } else {
            vjn vjn = new vjn(context.getDir("service-tombstones", 0).toPath(), Executors.newSingleThreadScheduledExecutor(), random, jrp, false);
            aVar = vjn;
        }
        this(aVar);
    }
}
