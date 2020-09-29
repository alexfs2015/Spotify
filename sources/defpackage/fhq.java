package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: fhq reason: default package */
final class fhq {
    final Intent a;
    private final PendingResult b;
    private boolean c = false;
    private final ScheduledFuture<?> d;

    fhq(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new fhr(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
