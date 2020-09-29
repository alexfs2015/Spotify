package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ffw reason: default package */
public final class ffw {
    private static ffw c;
    final Context a;
    final ScheduledExecutorService b;
    private ffx d = new ffx(this, 0);
    private int e = 1;

    public static synchronized ffw a(Context context) {
        ffw ffw;
        synchronized (ffw.class) {
            if (c == null) {
                c = new ffw(context, Executors.newSingleThreadScheduledExecutor(new bzu("MessengerIpcClient")));
            }
            ffw = c;
        }
        return ffw;
    }

    private ffw(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public final synchronized <T> exi<T> a(fge<T> fge) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(fge);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.d.a((fge) fge)) {
            this.d = new ffx(this, 0);
            this.d.a((fge) fge);
        }
        return fge.b.a;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
