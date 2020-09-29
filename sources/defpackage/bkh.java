package defpackage;

/* renamed from: bkh reason: default package */
final /* synthetic */ class bkh implements Runnable {
    private final bjs a;

    private bkh(bjs bjs) {
        this.a = bjs;
    }

    static Runnable a(bjs bjs) {
        return new bkh(bjs);
    }

    public final void run() {
        this.a.b();
    }
}
