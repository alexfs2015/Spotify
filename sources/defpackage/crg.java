package defpackage;

/* renamed from: crg reason: default package */
final /* synthetic */ class crg implements Runnable {
    private final crf a;
    private final int b;

    crg(crf crf, int i) {
        this.a = crf;
        this.b = i;
    }

    public final void run() {
        crf crf = this.a;
        int i = this.b;
        if (crf.a != null) {
            crf.a.onWindowVisibilityChanged(i);
        }
    }
}
