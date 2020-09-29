package defpackage;

/* renamed from: cqu reason: default package */
final class cqu implements Runnable {
    private final /* synthetic */ cqo a;

    cqu(cqo cqo) {
        this.a = cqo;
    }

    public final void run() {
        if (this.a.a != null) {
            this.a.a.a();
        }
    }
}
