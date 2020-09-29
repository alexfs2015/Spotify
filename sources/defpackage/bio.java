package defpackage;

/* renamed from: bio reason: default package */
final class bio implements Runnable {
    private final /* synthetic */ dpp a;
    private final /* synthetic */ bin b;

    bio(bin bin, dpp dpp) {
        this.b = bin;
        this.a = dpp;
    }

    public final void run() {
        synchronized (this.b.s) {
            if (bin.b(this.b)) {
                bin.a(this.b, this.a);
            } else {
                bin.a(this.b, this.a, 1);
            }
        }
    }
}
