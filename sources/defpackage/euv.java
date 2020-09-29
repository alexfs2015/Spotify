package defpackage;

/* renamed from: euv reason: default package */
final class euv implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ ewa b;
    private final /* synthetic */ ewh c;
    private final /* synthetic */ euj d;

    euv(euj euj, boolean z, ewa ewa, ewh ewh) {
        this.d = euj;
        this.a = z;
        this.b = ewa;
        this.c = ewh;
    }

    public final void run() {
        ere ere = this.d.b;
        if (ere == null) {
            this.d.q().c.a("Discarding data. Failed to set user attribute");
            return;
        }
        this.d.a(ere, this.a ? null : this.b, this.c);
        this.d.y();
    }
}
