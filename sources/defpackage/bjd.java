package defpackage;

import android.os.Handler;

/* renamed from: bjd reason: default package */
public final class bjd {
    private final Handler a;

    public bjd(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final boolean a(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }
}
