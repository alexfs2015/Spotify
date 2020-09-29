package defpackage;

/* renamed from: eiu reason: default package */
final /* synthetic */ class eiu implements Runnable {
    private final eir a;

    eiu(eir eir) {
        this.a = eir;
    }

    public final void run() {
        eir eir = this.a;
        synchronized (eir.b) {
            if (eir.a != -1) {
                eir.a(15);
            }
        }
    }
}
