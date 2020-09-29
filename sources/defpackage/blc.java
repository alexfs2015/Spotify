package defpackage;

/* renamed from: blc reason: default package */
final /* synthetic */ class blc implements cut {
    private final clq a;
    private final Runnable b;

    blc(clq clq, Runnable runnable) {
        this.a = clq;
        this.b = runnable;
    }

    public final void a() {
        clq clq = this.a;
        Runnable runnable = this.b;
        if (!clq.m) {
            bkc.e();
            cmu.a(runnable);
        }
    }
}
