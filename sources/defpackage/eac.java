package defpackage;

/* renamed from: eac reason: default package */
final /* synthetic */ class eac implements Runnable {
    private final dzy a;
    private final String b;

    eac(dzy dzy, String str) {
        this.a = dzy;
        this.b = str;
    }

    public final void run() {
        dzy dzy = this.a;
        dzy.a.loadUrl(this.b);
    }
}
