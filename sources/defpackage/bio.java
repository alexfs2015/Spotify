package defpackage;

/* renamed from: bio reason: default package */
final /* synthetic */ class bio implements Runnable {
    private final bin a;
    private final Runnable b;

    bio(bin bin, Runnable runnable) {
        this.a = bin;
        this.b = runnable;
    }

    public final void run() {
        cpx.a.execute(new biq(this.a, this.b));
    }
}
