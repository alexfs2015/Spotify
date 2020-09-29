package defpackage;

@cfp
/* renamed from: csj reason: default package */
final class csj implements Runnable {
    boolean a = false;
    private crt b;

    csj(crt crt) {
        this.b = crt;
    }

    private final void b() {
        cmu.a.removeCallbacks(this);
        cmu.a.postDelayed(this, 250);
    }

    public final void a() {
        this.a = false;
        b();
    }

    public final void run() {
        if (!this.a) {
            crt crt = this.b;
            if (crt.b != null) {
                long f = (long) crt.b.f();
                if (crt.c != f && f > 0) {
                    crt.a("timeupdate", "time", String.valueOf(((float) f) / 1000.0f));
                    crt.c = f;
                }
            }
            b();
        }
    }
}
