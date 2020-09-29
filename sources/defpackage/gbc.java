package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: gbc reason: default package */
public final class gbc {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    final Handler b = new Handler();
    public final Map<Runnable, ScheduledFuture<?>> c = new HashMap();

    /* renamed from: gbc$a */
    public class a implements Runnable {
        private final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        public final void run() {
            gbc.this.b.post(this.a);
        }
    }

    public final void a(Runnable runnable) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c.get(runnable);
        if (scheduledFuture != null) {
            this.c.remove(runnable);
            scheduledFuture.cancel(false);
        }
    }
}
