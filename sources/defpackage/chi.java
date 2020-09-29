package defpackage;

/* renamed from: chi reason: default package */
final class chi implements Runnable {
    private final /* synthetic */ clr a;
    private final /* synthetic */ chh b;

    chi(chh chh, clr clr) {
        this.b = chh;
        this.a = clr;
    }

    public final void run() {
        this.b.h.a(this.a);
        if (this.b.m != null) {
            this.b.m.b();
            this.b.m = null;
        }
    }
}
