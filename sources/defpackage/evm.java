package defpackage;

/* renamed from: evm reason: default package */
final class evm implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ evh b;

    evm(evh evh, long j) {
        this.b = evh;
        this.a = j;
    }

    public final void run() {
        evh evh = this.b;
        long j = this.a;
        evh.c();
        evh.v();
        evh.q().k.a("Activity resumed, time", Long.valueOf(j));
        evh.a = j;
        evh.b = evh.a;
        if (evh.s().j(evh.f().v())) {
            evh.a(evh.l().a());
            return;
        }
        evh.c.c();
        evh.d.c();
        if (evh.s().h(evh.f().v()) || evh.s().i(evh.f().v())) {
            evh.e.c();
        }
        if (evh.r().a(evh.l().a())) {
            evh.r().n.a(true);
            evh.r().p.a(0);
        }
        if (evh.r().n.a()) {
            evh.c.a(Math.max(0, evh.r().l.a() - evh.r().p.a()));
        } else {
            evh.d.a(Math.max(0, 3600000 - evh.r().p.a()));
        }
    }
}
