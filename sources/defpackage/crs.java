package defpackage;

@cey
/* renamed from: crs reason: default package */
final class crs implements Runnable {
    boolean a = false;
    private crc b;

    crs(crc crc) {
        this.b = crc;
    }

    private final void b() {
        cmd.a.removeCallbacks(this);
        cmd.a.postDelayed(this, 250);
    }

    public final void a() {
        this.a = false;
        b();
    }

    public final void run() {
        if (!this.a) {
            crc crc = this.b;
            if (crc.b != null) {
                long f = (long) crc.b.f();
                if (crc.c != f && f > 0) {
                    crc.a("timeupdate", "time", String.valueOf(((float) f) / 1000.0f));
                    crc.c = f;
                }
            }
            b();
        }
    }
}
