package defpackage;

/* renamed from: ebp reason: default package */
public final class ebp extends cqz<eam> {
    cny<eam> b;
    private final Object c = new Object();
    private boolean d;
    private int e;

    public ebp(cny<eam> cny) {
        this.b = cny;
        this.d = false;
        this.e = 0;
    }

    private final void e() {
        synchronized (this.c) {
            bxo.a(this.e >= 0);
            if (!this.d || this.e != 0) {
                cml.a();
            } else {
                cml.a();
                a(new ebs(this), new cqx());
            }
        }
    }

    public final ebl b() {
        ebl ebl = new ebl(this);
        synchronized (this.c) {
            a(new ebq(ebl), new ebr(ebl));
            bxo.a(this.e >= 0);
            this.e++;
        }
        return ebl;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        synchronized (this.c) {
            bxo.a(this.e > 0);
            cml.a();
            this.e--;
            e();
        }
    }

    public final void d() {
        synchronized (this.c) {
            bxo.a(this.e >= 0);
            cml.a();
            this.d = true;
            e();
        }
    }
}
