package defpackage;

/* renamed from: cqx reason: default package */
final class cqx implements Runnable {
    private final /* synthetic */ cqo a;

    cqx(cqo cqo) {
        this.a = cqo;
    }

    public final void run() {
        if (this.a.a != null) {
            this.a.a.c();
        }
    }
}
