package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import java.util.Random;
import java.util.concurrent.Executors;

/* renamed from: vwu reason: default package */
public final class vwu {
    private final a a;

    /* renamed from: vwu$a */
    interface a {
        void a(Context context, Intent intent, String str, Object... objArr);

        void a(Intent intent);
    }

    public vwu(Context context, Random random, jtz jtz) {
        a aVar;
        if (VERSION.SDK_INT < 26) {
            aVar = new a() {
                public final void a(Context context, Intent intent, String str, Object... objArr) {
                    context.startService(intent);
                }

                public final void a(Intent intent) {
                }
            };
        } else {
            vwt vwt = new vwt(context.getDir("service-tombstones", 0).toPath(), Executors.newSingleThreadScheduledExecutor(), random, jtz, false);
            aVar = vwt;
        }
        this(aVar);
    }

    private vwu(a aVar) {
        this.a = (a) fbp.a(aVar);
    }

    public static void a(Intent intent) {
        intent.putExtra("needs_foreground_start", true);
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
}
