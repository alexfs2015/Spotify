package defpackage;

@cfp
/* renamed from: cmg reason: default package */
public abstract class cmg implements cnm<cqi> {
    private final Runnable a = new cmh(this);
    private boolean b = false;
    volatile Thread j;

    public cmg() {
    }

    public cmg(byte b2) {
    }

    public abstract void a();

    public final void b() {
        s_();
        if (this.j != null) {
            this.j.interrupt();
        }
    }

    public final /* synthetic */ Object c() {
        return this.b ? cms.b(this.a) : cms.a(this.a);
    }

    public final cqi h() {
        return this.b ? cms.b(this.a) : cms.a(this.a);
    }

    public abstract void s_();
}
