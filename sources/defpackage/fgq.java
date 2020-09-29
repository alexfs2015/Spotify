package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fgq reason: default package */
public final class fgq {
    private static fgq c;
    final Context a;
    final ScheduledExecutorService b;
    private fgr d = new fgr(this, 0);
    private int e = 1;

    private fgq(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized fgq a(Context context) {
        fgq fgq;
        synchronized (fgq.class) {
            if (c == null) {
                c = new fgq(context, Executors.newSingleThreadScheduledExecutor(new cal("MessengerIpcClient")));
            }
            fgq = c;
        }
        return fgq;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    public final synchronized <T> exz<T> a(fgy<T> fgy) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(fgy);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.d.a((fgy) fgy)) {
            this.d = new fgr(this, 0);
            this.d.a((fgy) fgy);
        }
        return fgy.b.a;
    }
}
