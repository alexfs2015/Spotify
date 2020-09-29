package defpackage;

import android.os.Handler;

@Deprecated
/* renamed from: psv reason: default package */
public final class psv {
    private final Handler a = new Handler();
    private final jry b;
    private Runnable c;

    public psv(jry jry) {
        jrh.b("Not called on main looper");
        this.b = jry;
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

    public final void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.c = null;
        }
    }
}
