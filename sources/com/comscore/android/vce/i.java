package com.comscore.android.vce;

import android.app.Activity;

class i {
    static final String a = "Director";
    final p b;
    final b c;
    final j d;
    final s e;
    q f;
    f g;
    ag h;
    af i;

    i(p pVar, b bVar, s sVar, j jVar) {
        this.b = pVar;
        this.c = bVar;
        this.e = sVar;
        this.d = jVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.c.g(true);
        this.d.f();
        j();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        q qVar = this.f;
        if (qVar != null) {
            qVar.a(i2, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity) {
        Activity d2 = this.e.d();
        if (activity != d2) {
            this.e.f().b(activity);
            if (d2 != null) {
                c(d2);
            }
        }
        if (activity != null && this.c.d()) {
            this.e.a().h();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(af afVar) {
        this.i = afVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(ag agVar) {
        this.h = agVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(f fVar) {
        this.g = fVar;
        k();
    }

    /* access modifiers changed from: 0000 */
    public void a(q qVar) {
        this.f = qVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(x xVar) {
        ag agVar = this.h;
        if (agVar != null) {
            agVar.a(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.c.b(str);
        o();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.c.g(false);
        i();
        q qVar = this.f;
        if (qVar != null) {
            qVar.C();
        }
        this.e.a(new Runnable() {
            public void run() {
                try {
                    i.this.d.e();
                } catch (Exception unused) {
                }
            }
        }, 300);
    }

    /* access modifiers changed from: 0000 */
    public void b(Activity activity) {
        this.d.a(activity);
    }

    /* access modifiers changed from: 0000 */
    public void b(x xVar) {
        ag agVar = this.h;
        if (agVar != null) {
            agVar.c(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        this.c.c(str);
        o();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.c.h(true);
        q qVar = this.f;
        if (qVar != null) {
            qVar.C();
        }
        this.d.c();
    }

    /* access modifiers changed from: 0000 */
    public void c(Activity activity) {
        this.d.b(activity);
    }

    /* access modifiers changed from: 0000 */
    public void c(x xVar) {
        af afVar = this.i;
        if (afVar != null) {
            afVar.a(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.c.h(false);
        this.d.d();
    }

    /* access modifiers changed from: 0000 */
    public void d(x xVar) {
        af afVar = this.i;
        if (afVar != null) {
            afVar.c(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        ag agVar = this.h;
        if (agVar != null) {
            agVar.b();
        }
        af afVar = this.i;
        if (afVar != null) {
            afVar.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (!this.c.j()) {
            this.e.a().i();
        }
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (!this.c.j()) {
            i();
        }
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        if (!this.c.j() && this.c.i()) {
            this.e.a().b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        if (this.c.i()) {
            this.e.a().b();
        }
        if (this.c.d()) {
            this.e.a().i();
        }
        if (this.c.h()) {
            this.e.a().d();
            this.e.a().f();
            this.e.a().m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        this.e.a().c();
        this.e.a().e();
        this.e.a().j();
        this.e.a().g();
        this.e.a().n();
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.f.d(this.c.b());
        this.f.e(this.c.m());
        this.f.f(this.c.l());
        f fVar = this.g;
        if (fVar != null) {
            fVar.c(this.f.H());
        }
        this.d.a(this.f.I());
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.d.j();
    }

    /* access modifiers changed from: 0000 */
    public String m() {
        return this.c.l();
    }

    /* access modifiers changed from: 0000 */
    public String n() {
        return this.c.m();
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        if (this.f != null) {
            this.e.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        i.this.k();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public int p() {
        q qVar = this.f;
        if (qVar != null) {
            return qVar.L();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public int q() {
        q qVar = this.f;
        if (qVar != null) {
            return qVar.M();
        }
        return -1;
    }
}
