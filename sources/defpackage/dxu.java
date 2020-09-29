package defpackage;

/* renamed from: dxu reason: default package */
final class dxu implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ dwv c;

    dxu(dwv dwv, String str, long j) {
        this.c = dwv;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.k.a(this.a, this.b);
        this.c.k.a(toString());
    }
}
