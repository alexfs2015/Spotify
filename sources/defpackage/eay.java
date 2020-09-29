package defpackage;

/* renamed from: eay reason: default package */
public final class eay extends cqi<dzv> {
    cnh<dzv> b;
    private final Object c = new Object();
    private boolean d;
    private int e;

    public eay(cnh<dzv> cnh) {
        this.b = cnh;
        this.d = false;
        this.e = 0;
    }

    public final eau b() {
        eau eau = new eau(this);
        synchronized (this.c) {
            a(new eaz(eau), new eba(eau));
            bwx.a(this.e >= 0);
            this.e++;
        }
        return eau;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        synchronized (this.c) {
            bwx.a(this.e > 0);
            clu.a();
            this.e--;
            e();
        }
    }

    public final void d() {
        synchronized (this.c) {
            bwx.a(this.e >= 0);
            clu.a();
            this.d = true;
            e();
        }
    }

    private final void e() {
        synchronized (this.c) {
            bwx.a(this.e >= 0);
            if (!this.d || this.e != 0) {
                clu.a();
            } else {
                clu.a();
                a(new ebb(this), new cqg());
            }
        }
    }
}
