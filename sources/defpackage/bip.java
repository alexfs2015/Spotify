package defpackage;

/* renamed from: bip reason: default package */
final class bip implements Runnable {
    private final /* synthetic */ dpp a;
    private final /* synthetic */ int b;
    private final /* synthetic */ bin c;

    bip(bin bin, dpp dpp, int i) {
        this.c = bin;
        this.a = dpp;
        this.b = i;
    }

    public final void run() {
        synchronized (this.c.s) {
            bin.a(this.c, this.a, this.b);
        }
    }
}
