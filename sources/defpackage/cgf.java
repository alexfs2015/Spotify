package defpackage;

@cfp
/* renamed from: cgf reason: default package */
public abstract class cgf implements cgd, cnm<Void> {
    private final cqv<cgl> a;
    private final cgd b;
    private final Object c = new Object();

    public cgf(cqv<cgl> cqv, cgd cgd) {
        this.a = cqv;
        this.b = cgd;
    }

    public abstract void a();

    public final void a(cgp cgp) {
        synchronized (this.c) {
            this.b.a(cgp);
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(cgt cgt, cgl cgl) {
        try {
            cgt.a(cgl, (cgw) new cgo(this));
            return true;
        } catch (Throwable th) {
            cpn.a(5);
            bkc.i().a(th, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new cgp(0));
            return false;
        }
    }

    public final void b() {
        a();
    }

    public final /* synthetic */ Object c() {
        cgt d = d();
        if (d == null) {
            this.b.a(new cgp(0));
            a();
            return null;
        }
        this.a.a(new cgg(this, d), new cgh(this));
        return null;
    }

    public abstract cgt d();
}
