package defpackage;

/* renamed from: dxd reason: default package */
final class dxd implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ dwe c;

    dxd(dwe dwe, String str, long j) {
        this.c = dwe;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.k.a(this.a, this.b);
        this.c.k.a(toString());
    }
}
