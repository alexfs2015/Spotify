package defpackage;

/* renamed from: ece reason: default package */
final class ece implements Runnable {
    private final /* synthetic */ ecc a;
    private final /* synthetic */ ecd b;

    ece(ecd ecd, ecc ecc) {
        this.b = ecd;
        this.a = ecc;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.d == -2) {
                this.b.c = this.b.b();
                if (this.b.c == null) {
                    this.b.a(4);
                } else if (!this.b.c() || this.b.b(1)) {
                    ecc ecc = this.a;
                    ecd ecd = this.b;
                    synchronized (ecc.a) {
                        ecc.b = ecd;
                    }
                    ecd.a(this.b, this.a);
                } else {
                    String str = this.b.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(str);
                    sb.append(" as delayed impression is not supported");
                    sb.toString();
                    cow.a(5);
                    this.b.a(2);
                }
            }
        }
    }
}
