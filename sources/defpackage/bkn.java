package defpackage;

/* renamed from: bkn reason: default package */
final class bkn implements Runnable {
    private final /* synthetic */ clr a;
    private final /* synthetic */ bkl b;

    bkn(bkl bkl, clr clr) {
        this.b = bkl;
        this.a = clr;
    }

    public final void run() {
        this.b.b(new clq(this.a));
    }
}
