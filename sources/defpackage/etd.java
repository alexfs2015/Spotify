package defpackage;

/* renamed from: etd reason: default package */
final class etd implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ eqf b;

    etd(eqf eqf, long j) {
        this.b = eqf;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
