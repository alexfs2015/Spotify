package defpackage;

/* renamed from: eab reason: default package */
final /* synthetic */ class eab implements Runnable {
    private final dzy a;
    private final String b;

    eab(dzy dzy, String str) {
        this.a = dzy;
        this.b = str;
    }

    public final void run() {
        dzy dzy = this.a;
        dzy.a.loadData(this.b, "text/html", "UTF-8");
    }
}
