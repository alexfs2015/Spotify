package defpackage;

/* renamed from: eyi reason: default package */
final class eyi implements Runnable {
    private final /* synthetic */ eyh a;

    eyi(eyh eyh) {
        this.a = eyh;
    }

    public final void run() {
        synchronized (this.a.a) {
            if (this.a.b != null) {
                this.a.b.a();
            }
        }
    }
}
