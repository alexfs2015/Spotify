package defpackage;

/* renamed from: djg reason: default package */
final class djg implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ djc c;

    djg(djc djc, int i, boolean z) {
        this.c = djc;
        this.a = i;
        this.b = z;
    }

    public final void run() {
        dci b2 = this.c.b(this.a, this.b);
        this.c.f = b2;
        if (djc.a(this.a, b2)) {
            this.c.a(this.a + 1, this.b);
        }
    }
}
