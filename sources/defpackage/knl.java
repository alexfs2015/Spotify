package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: knl reason: default package */
public class knl implements koe {
    private final Handler a;
    private volatile boolean b;

    knl(Looper looper) {
        this.a = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        if (!this.b) {
            this.a.post(runnable);
        }
    }

    public void dispose() {
        this.a.removeCallbacksAndMessages(null);
        this.b = true;
    }
}
