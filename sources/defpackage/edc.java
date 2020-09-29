package defpackage;

/* renamed from: edc reason: default package */
final class edc implements Runnable {
    private final /* synthetic */ cqi a;
    private final /* synthetic */ eda b;

    edc(eda eda, cqi cqi) {
        this.b = eda;
        this.a = cqi;
    }

    public final void run() {
        for (cqi cqi : this.b.e.keySet()) {
            if (cqi != this.a) {
                ((ecu) this.b.e.get(cqi)).a();
            }
        }
    }
}
