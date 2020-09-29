package defpackage;

import java.util.Random;

/* renamed from: dzn reason: default package */
final class dzn extends dqk {
    private final dqj a;

    dzn(dqj dqj) {
        this.a = dqj;
    }

    public final void a() {
        if (dzw.a()) {
            int intValue = ((Integer) dqe.f().a(dtg.aZ)).intValue();
            int intValue2 = ((Integer) dqe.f().a(dtg.ba)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                bkc.r().a();
            } else {
                cmu.a.postDelayed(dzo.a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.a.a();
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b() {
        this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final void d() {
        this.a.d();
    }

    public final void e() {
        this.a.e();
    }

    public final void f() {
        this.a.f();
    }
}
