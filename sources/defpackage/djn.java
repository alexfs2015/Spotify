package defpackage;

/* renamed from: djn reason: default package */
final class djn implements Runnable {
    private final /* synthetic */ dwe a;
    private final /* synthetic */ dim b;

    djn(dim dim, dwe dwe) {
        this.b = dim;
        this.a = dwe;
    }

    public final void run() {
        try {
            this.b.c.put(this.a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
