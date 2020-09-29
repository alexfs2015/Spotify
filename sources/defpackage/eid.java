package defpackage;

/* renamed from: eid reason: default package */
final /* synthetic */ class eid implements Runnable {
    private final eia a;

    eid(eia eia) {
        this.a = eia;
    }

    public final void run() {
        eia eia = this.a;
        synchronized (eia.b) {
            if (eia.a != -1) {
                eia.a(15);
            }
        }
    }
}
