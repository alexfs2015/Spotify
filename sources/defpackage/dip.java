package defpackage;

/* renamed from: dip reason: default package */
final class dip implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ dil c;

    dip(dil dil, int i, boolean z) {
        this.c = dil;
        this.a = i;
        this.b = z;
    }

    public final void run() {
        dbr b2 = this.c.b(this.a, this.b);
        this.c.f = b2;
        if (dil.a(this.a, b2)) {
            this.c.a(this.a + 1, this.b);
        }
    }
}
