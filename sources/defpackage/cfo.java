package defpackage;

@cey
/* renamed from: cfo reason: default package */
public abstract class cfo implements cfm, cmv<Void> {
    private final cqe<cfu> a;
    private final cfm b;
    private final Object c = new Object();

    public cfo(cqe<cfu> cqe, cfm cfm) {
        this.a = cqe;
        this.b = cfm;
    }

    public abstract void a();

    public final void a(cfy cfy) {
        synchronized (this.c) {
            this.b.a(cfy);
            a();
        }
    }

    public final void b() {
        a();
    }

    public final /* synthetic */ Object c() {
        cgc d = d();
        if (d == null) {
            this.b.a(new cfy(0));
            a();
            return null;
        }
        this.a.a(new cfp(this, d), new cfq(this));
        return null;
    }

    public abstract cgc d();

    /* access modifiers changed from: 0000 */
    public final boolean a(cgc cgc, cfu cfu) {
        try {
            cgc.a(cfu, (cgf) new cfx(this));
            return true;
        } catch (Throwable th) {
            cow.a(5);
            bjl.i().a(th, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new cfy(0));
            return false;
        }
    }
}
