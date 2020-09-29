package defpackage;

import java.util.Random;

/* renamed from: dyw reason: default package */
final class dyw extends dpt {
    private final dps a;

    dyw(dps dps) {
        this.a = dps;
    }

    public final void a() {
        if (dzf.a()) {
            int intValue = ((Integer) dpn.f().a(dsp.aZ)).intValue();
            int intValue2 = ((Integer) dpn.f().a(dsp.ba)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                bjl.r().a();
            } else {
                cmd.a.postDelayed(dyx.a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
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
