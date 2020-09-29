package defpackage;

import android.os.Handler;

/* renamed from: ewv reason: default package */
abstract class ewv {
    private static volatile Handler b;
    private final etn a;
    private final Runnable c;
    /* access modifiers changed from: private */
    public volatile long d;

    ewv(etn etn) {
        bxo.a(etn);
        this.a = etn;
        this.c = new eww(this, etn);
    }

    private final Handler d() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (ewv.class) {
            if (b == null) {
                b = new ekh(this.a.m().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.l().a();
            if (!d().postDelayed(this.c, j)) {
                this.a.q().c.a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.d != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }
}
