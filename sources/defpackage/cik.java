package defpackage;

/* renamed from: cik reason: default package */
final class cik implements Runnable {
    private final /* synthetic */ cla a;
    private final /* synthetic */ cii b;

    cik(cii cii, cla cla) {
        this.b = cii;
        this.a = cla;
    }

    public final void run() {
        this.b.b(new ckz(this.a));
    }
}
