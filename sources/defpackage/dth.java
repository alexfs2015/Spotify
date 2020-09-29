package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: dth reason: default package */
final class dth implements Callable<Void> {
    private final /* synthetic */ Context a;

    dth(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        dte f = dqe.f();
        Context context = this.a;
        if (!f.c) {
            synchronized (f.a) {
                if (!f.c) {
                    f.e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context remoteContext = bsq.getRemoteContext(context);
                        if (remoteContext == null && context != null) {
                            remoteContext = context.getApplicationContext();
                            if (remoteContext == null) {
                                remoteContext = context;
                            }
                        }
                        if (remoteContext != null) {
                            dqe.d();
                            f.d = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            f.c = true;
                            f.b.open();
                        }
                    } finally {
                        f.b.open();
                    }
                }
            }
        }
        return null;
    }
}
