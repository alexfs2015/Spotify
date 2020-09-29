package defpackage;

/* renamed from: ecv reason: default package */
final class ecv implements Runnable {
    private final /* synthetic */ ect a;
    private final /* synthetic */ ecu b;

    ecv(ecu ecu, ect ect) {
        this.b = ecu;
        this.a = ect;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.d == -2) {
                this.b.c = this.b.b();
                if (this.b.c == null) {
                    this.b.a(4);
                } else if (!this.b.c() || this.b.b(1)) {
                    ect ect = this.a;
                    ecu ecu = this.b;
                    synchronized (ect.a) {
                        ect.b = ecu;
                    }
                    ecu.a(this.b, this.a);
                } else {
                    String str = this.b.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(str);
                    sb.append(" as delayed impression is not supported");
                    sb.toString();
                    cpn.a(5);
                    this.b.a(2);
                }
            }
        }
    }
}
