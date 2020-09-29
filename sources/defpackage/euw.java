package defpackage;

/* renamed from: euw reason: default package */
final class euw implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ euq b;

    euw(euq euq, long j) {
        this.b = euq;
        this.a = j;
    }

    public final void run() {
        euq euq = this.b;
        long j = this.a;
        euq.c();
        euq.v();
        euq.c.c();
        euq.d.c();
        if (euq.s().h(euq.f().v()) || euq.s().i(euq.f().v())) {
            euq.e.c();
            euq.e.a(euq.r().m.a());
        }
        euq.q().k.a("Activity paused, time", Long.valueOf(j));
        if (euq.a != 0) {
            euq.r().p.a(euq.r().p.a() + (j - euq.a));
        }
    }
}
