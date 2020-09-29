package defpackage;

/* renamed from: esn reason: default package */
final class esn implements Runnable {
    private final /* synthetic */ eqk a;
    private final /* synthetic */ String b;
    private final /* synthetic */ esa c;

    esn(esa esa, eqk eqk, String str) {
        this.c = esa;
        this.a = eqk;
        this.b = str;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.a(this.a, this.b);
    }
}
