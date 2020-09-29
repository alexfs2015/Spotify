package defpackage;

/* renamed from: bul reason: default package */
abstract class bul implements Runnable {
    private final /* synthetic */ bub a;

    private bul(bub bub) {
        this.a = bub;
    }

    /* synthetic */ bul(bub bub, byte b) {
        this(bub);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (RuntimeException e) {
            buw buw = this.a.a;
            buw.e.sendMessage(buw.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }
}
