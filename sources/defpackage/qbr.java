package defpackage;

import android.os.Handler;

@Deprecated
/* renamed from: qbr reason: default package */
public final class qbr {
    private final Handler a = new Handler();
    private final jui b;
    private Runnable c;

    public qbr(jui jui) {
        jtr.b("Not called on main looper");
        this.b = jui;
    }

    public final void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.c = null;
        }
    }

    public final boolean a(Runnable runnable, long j) {
        if (this.b.a()) {
            b(runnable, j);
            return true;
        }
        a();
        return false;
    }

    public final void b(Runnable runnable, long j) {
        a();
        this.c = runnable;
        this.a.postDelayed(this.c, j);
    }
}
