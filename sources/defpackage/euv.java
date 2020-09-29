package defpackage;

/* renamed from: euv reason: default package */
final class euv implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ euq b;

    euv(euq euq, long j) {
        this.b = euq;
        this.a = j;
    }

    public final void run() {
        euq euq = this.b;
        long j = this.a;
        euq.c();
        euq.v();
        euq.q().k.a("Activity resumed, time", Long.valueOf(j));
        euq.a = j;
        euq.b = euq.a;
        if (euq.s().j(euq.f().v())) {
            euq.a(euq.l().a());
            return;
        }
        euq.c.c();
        euq.d.c();
        if (euq.s().h(euq.f().v()) || euq.s().i(euq.f().v())) {
            euq.e.c();
        }
        if (euq.r().a(euq.l().a())) {
            euq.r().n.a(true);
            euq.r().p.a(0);
        }
        if (euq.r().n.a()) {
            euq.c.a(Math.max(0, euq.r().l.a() - euq.r().p.a()));
        } else {
            euq.d.a(Math.max(0, 3600000 - euq.r().p.a()));
        }
    }
}
