package defpackage;

/* renamed from: bkl reason: default package */
final /* synthetic */ class bkl implements cuc {
    private final ckz a;
    private final Runnable b;

    bkl(ckz ckz, Runnable runnable) {
        this.a = ckz;
        this.b = runnable;
    }

    public final void a() {
        ckz ckz = this.a;
        Runnable runnable = this.b;
        if (!ckz.m) {
            bjl.e();
            cmd.a(runnable);
        }
    }
}
