package defpackage;

/* renamed from: cjb reason: default package */
final class cjb implements Runnable {
    private final /* synthetic */ clr a;
    private final /* synthetic */ ciz b;

    cjb(ciz ciz, clr clr) {
        this.b = ciz;
        this.a = clr;
    }

    public final void run() {
        this.b.b(new clq(this.a));
    }
}
