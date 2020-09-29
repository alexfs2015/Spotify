package defpackage;

/* renamed from: dke reason: default package */
final class dke implements Runnable {
    private final /* synthetic */ dwv a;
    private final /* synthetic */ djd b;

    dke(djd djd, dwv dwv) {
        this.b = djd;
        this.a = dwv;
    }

    public final void run() {
        try {
            this.b.c.put(this.a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
