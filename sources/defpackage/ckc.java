package defpackage;

import android.os.Bundle;

@cfp
/* renamed from: ckc reason: default package */
public final class ckc extends ckl {
    volatile cka a;
    volatile ckd b;
    volatile cki c;
    private volatile ckb d;

    public ckc(ckb ckb) {
        this.d = ckb;
    }

    public final void a(Bundle bundle) {
        if (this.c != null) {
            this.c.a(bundle);
        }
    }

    public final void a(cbi cbi) {
        if (this.a != null) {
            this.a.f();
        }
    }

    public final void a(cbi cbi, int i) {
        if (this.a != null) {
            this.a.g();
        }
    }

    public final void a(cbi cbi, cko cko) {
        if (this.d != null) {
            this.d.a(cko);
        }
    }

    public final void b(cbi cbi) {
        if (this.b != null) {
            this.b.a(cbj.a(cbi).getClass().getName());
        }
    }

    public final void b(cbi cbi, int i) {
        if (this.b != null) {
            ckd ckd = this.b;
            cbj.a(cbi).getClass().getName();
            ckd.a(i);
        }
    }

    public final void c(cbi cbi) {
        if (this.d != null) {
            this.d.E_();
        }
    }

    public final void d(cbi cbi) {
        if (this.d != null) {
            this.d.b();
        }
    }

    public final void e(cbi cbi) {
        if (this.d != null) {
            this.d.c();
        }
    }

    public final void f(cbi cbi) {
        if (this.d != null) {
            this.d.G_();
        }
    }

    public final void g(cbi cbi) {
        if (this.d != null) {
            this.d.H_();
        }
    }

    public final void h(cbi cbi) {
        if (this.d != null) {
            this.d.F_();
        }
    }
}
