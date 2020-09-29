package defpackage;

/* renamed from: bki reason: default package */
final /* synthetic */ class bki implements Runnable {
    private final bjs a;

    private bki(bjs bjs) {
        this.a = bjs;
    }

    static Runnable a(bjs bjs) {
        return new bki(bjs);
    }

    public final void run() {
        this.a.c();
    }
}
