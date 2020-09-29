package defpackage;

/* renamed from: btu reason: default package */
abstract class btu implements Runnable {
    private final /* synthetic */ btk a;

    private btu(btk btk) {
        this.a = btk;
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
            buf buf = this.a.a;
            buf.e.sendMessage(buf.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }

    /* synthetic */ btu(btk btk, byte b) {
        this(btk);
    }
}
