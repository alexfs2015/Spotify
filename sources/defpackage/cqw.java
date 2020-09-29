package defpackage;

/* renamed from: cqw reason: default package */
final class cqw implements Runnable {
    private final /* synthetic */ cqo a;

    cqw(cqo cqo) {
        this.a = cqo;
    }

    public final void run() {
        if (this.a.a != null) {
            this.a.a.d();
            this.a.a.f();
        }
    }
}
