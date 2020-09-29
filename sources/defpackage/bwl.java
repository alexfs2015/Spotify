package defpackage;

/* renamed from: bwl reason: default package */
final class bwl implements Runnable {
    private final /* synthetic */ bwk a;

    bwl(bwk bwk) {
        this.a = bwk;
    }

    public final void run() {
        this.a.g.lock();
        try {
            bwk.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
