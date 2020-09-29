package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: cqp reason: default package */
final class cqp implements Executor {
    private final Handler a = new cmm(Looper.getMainLooper());

    cqp() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                bkc.e();
                cmu.a(bkc.i().e, th);
                throw th;
            }
        } else {
            this.a.post(runnable);
        }
    }
}
