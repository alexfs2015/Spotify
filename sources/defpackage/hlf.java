package defpackage;

import com.google.common.base.Optional;

/* renamed from: hlf reason: default package */
public final class hlf {
    kba a;
    private final kbf b;
    private final kah c;
    private final jtz d;

    public hlf(kbf kbf, kah kah, jtz jtz) {
        this.b = kbf;
        this.c = kah;
        this.d = jtz;
    }

    public final void a(fqn fqn) {
        if (fqn != null) {
            this.c.b = ((Boolean) fqn.a(kaz.e)).booleanValue();
            this.c.c = ((Integer) fqn.a(kaz.d)).intValue();
            this.c.a = Optional.c(fqn.a(kaz.b));
            kad a2 = kad.d().a((String) fqn.a(kaz.a)).a(true).a();
            if (!this.b.a()) {
                kbf kbf = this.b;
                kbf.f = this.a;
                kbf.a(a2);
            }
            kbf kbf2 = this.b;
            kbf2.e = a2;
            if (kbf2.d != null) {
                kbf2.d.a(a2);
            }
        }
    }

    public final void a(jzr jzr) {
        fbp.a(jzr);
        kbf kbf = this.b;
        kbf.f = null;
        kbf.a(jzr);
    }

    public final void a(boolean z) {
        this.b.a(z);
    }
}
