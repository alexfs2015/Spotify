package defpackage;

import android.app.Activity;
import com.crashlytics.android.answers.SessionEvent.Type;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ahf reason: default package */
final class ahf extends b {
    private final ahy a;
    private final ahj b;

    public ahf(ahy ahy, ahj ahj) {
        this.a = ahy;
        this.b = ahj;
    }

    public final void a(Activity activity) {
    }

    public final void b(Activity activity) {
        this.a.a(activity, Type.START);
    }

    public final void c(Activity activity) {
        this.a.a(activity, Type.RESUME);
        ahj ahj = this.b;
        ahj.e = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) ahj.d.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void d(Activity activity) {
        this.a.a(activity, Type.PAUSE);
        ahj ahj = this.b;
        if (ahj.c && !ahj.e) {
            ahj.e = true;
            try {
                ahj.d.compareAndSet(null, ahj.a.schedule(new Runnable() {
                    public final void run() {
                        ahj.this.d.set(null);
                        for (a a2 : ahj.this.b) {
                            a2.a();
                        }
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                wja.a().a("Answers", "Failed to schedule background detector", (Throwable) e);
            }
        }
    }

    public final void e(Activity activity) {
        this.a.a(activity, Type.STOP);
    }
}
