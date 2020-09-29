package defpackage;

import android.app.Activity;
import com.crashlytics.android.answers.SessionEvent.Type;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: agr reason: default package */
final class agr extends b {
    private final ahk a;
    private final agv b;

    public final void a(Activity activity) {
    }

    public agr(ahk ahk, agv agv) {
        this.a = ahk;
        this.b = agv;
    }

    public final void b(Activity activity) {
        this.a.a(activity, Type.START);
    }

    public final void c(Activity activity) {
        this.a.a(activity, Type.RESUME);
        agv agv = this.b;
        agv.e = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) agv.d.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void d(Activity activity) {
        this.a.a(activity, Type.PAUSE);
        agv agv = this.b;
        if (agv.c && !agv.e) {
            agv.e = true;
            try {
                agv.d.compareAndSet(null, agv.a.schedule(new Runnable() {
                    public final void run() {
                        agv.this.d.set(null);
                        for (a a2 : agv.this.b) {
                            a2.a();
                        }
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                vuu.a().a("Answers", "Failed to schedule background detector", (Throwable) e);
            }
        }
    }

    public final void e(Activity activity) {
        this.a.a(activity, Type.STOP);
    }
}
