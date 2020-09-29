package defpackage;

/* renamed from: cqv reason: default package */
final class cqv implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ cqo c;

    cqv(cqo cqo, int i, int i2) {
        this.c = cqo;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        if (this.c.a != null) {
            this.c.a.a(this.a, this.b);
        }
    }
}
