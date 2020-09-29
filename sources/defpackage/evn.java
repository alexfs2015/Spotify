package defpackage;

/* renamed from: evn reason: default package */
final class evn implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ evh b;

    evn(evh evh, long j) {
        this.b = evh;
        this.a = j;
    }

    public final void run() {
        evh evh = this.b;
        long j = this.a;
        evh.c();
        evh.v();
        evh.c.c();
        evh.d.c();
        if (evh.s().h(evh.f().v()) || evh.s().i(evh.f().v())) {
            evh.e.c();
            evh.e.a(evh.r().m.a());
        }
        evh.q().k.a("Activity paused, time", Long.valueOf(j));
        if (evh.a != 0) {
            evh.r().p.a(evh.r().p.a() + (j - evh.a));
        }
    }
}
