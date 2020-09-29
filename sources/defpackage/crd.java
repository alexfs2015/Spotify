package defpackage;

/* renamed from: crd reason: default package */
final /* synthetic */ class crd implements Runnable {
    private final cra a;

    private crd(cra cra) {
        this.a = cra;
    }

    static Runnable a(cra cra) {
        return new crd(cra);
    }

    public final void run() {
        this.a.b();
    }
}
