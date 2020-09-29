package defpackage;

/* renamed from: chm reason: default package */
final class chm implements Runnable {
    private final /* synthetic */ chh a;

    chm(chh chh) {
        this.a = chh;
    }

    public final void run() {
        if (this.a.m != null) {
            this.a.m.b();
            this.a.m = null;
        }
    }
}
