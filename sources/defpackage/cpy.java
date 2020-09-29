package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: cpy reason: default package */
final class cpy implements Executor {
    private final Handler a = new clv(Looper.getMainLooper());

    cpy() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                bjl.e();
                cmd.a(bjl.i().e, th);
                throw th;
            }
        } else {
            this.a.post(runnable);
        }
    }
}
