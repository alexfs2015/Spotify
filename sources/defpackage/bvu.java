package defpackage;

/* renamed from: bvu reason: default package */
final class bvu implements Runnable {
    private final /* synthetic */ bvt a;

    bvu(bvt bvt) {
        this.a = bvt;
    }

    public final void run() {
        this.a.g.lock();
        try {
            bvt.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
