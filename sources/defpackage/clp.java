package defpackage;

@cey
/* renamed from: clp reason: default package */
public abstract class clp implements cmv<cpr> {
    private final Runnable a = new clq(this);
    private boolean b = false;
    volatile Thread j;

    public clp() {
    }

    public clp(byte b2) {
    }

    public abstract void a();

    public final void b() {
        s_();
        if (this.j != null) {
            this.j.interrupt();
        }
    }

    public final /* synthetic */ Object c() {
        return this.b ? cmb.b(this.a) : cmb.a(this.a);
    }

    public final cpr h() {
        return this.b ? cmb.b(this.a) : cmb.a(this.a);
    }

    public abstract void s_();
}
