package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: kkc reason: default package */
public class kkc implements kkv {
    private final Handler a;
    private volatile boolean b;

    kkc(Looper looper) {
        this.a = new Handler(looper);
    }

    public void dispose() {
        this.a.removeCallbacksAndMessages(null);
        this.b = true;
    }

    public final void a(Runnable runnable) {
        if (!this.b) {
            this.a.post(runnable);
        }
    }
}
