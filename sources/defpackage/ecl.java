package defpackage;

/* renamed from: ecl reason: default package */
final class ecl implements Runnable {
    private final /* synthetic */ cpr a;
    private final /* synthetic */ ecj b;

    ecl(ecj ecj, cpr cpr) {
        this.b = ecj;
        this.a = cpr;
    }

    public final void run() {
        for (cpr cpr : this.b.e.keySet()) {
            if (cpr != this.a) {
                ((ecd) this.b.e.get(cpr)).a();
            }
        }
    }
}
