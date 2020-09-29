package defpackage;

/* renamed from: bjk reason: default package */
final class bjk implements Runnable {
    private final /* synthetic */ clr a;
    private final /* synthetic */ bjj b;

    bjk(bjj bjj, clr clr) {
        this.b = bjj;
        this.a = clr;
    }

    public final void run() {
        this.b.b(new clq(this.a));
    }
}
