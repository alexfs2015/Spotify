package defpackage;

/* renamed from: cno reason: default package */
final /* synthetic */ class cno implements Runnable {
    private final cnn a;

    cno(cnn cnn) {
        this.a = cnn;
    }

    public final void run() {
        cnn cnn = this.a;
        cnn.f = 4;
        cnn.a();
    }
}
