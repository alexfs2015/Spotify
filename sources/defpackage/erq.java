package defpackage;

/* renamed from: erq reason: default package */
final class erq implements Runnable {
    private final /* synthetic */ ery a;
    private final /* synthetic */ eqw b;

    erq(ery ery, eqw eqw) {
        this.a = ery;
        this.b = eqw;
    }

    public final void run() {
        if (this.a.j == null) {
            this.b.c.a("Install Referrer Reporter is null");
            return;
        }
        erm erm = this.a.j;
        erm.a(erm.a.m().getPackageName());
    }
}
