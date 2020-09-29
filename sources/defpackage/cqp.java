package defpackage;

/* renamed from: cqp reason: default package */
final /* synthetic */ class cqp implements Runnable {
    private final cqo a;
    private final int b;

    cqp(cqo cqo, int i) {
        this.a = cqo;
        this.b = i;
    }

    public final void run() {
        cqo cqo = this.a;
        int i = this.b;
        if (cqo.a != null) {
            cqo.a.onWindowVisibilityChanged(i);
        }
    }
}
