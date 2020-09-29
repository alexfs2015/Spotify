package defpackage;

/* renamed from: dzk reason: default package */
final /* synthetic */ class dzk implements Runnable {
    private final dzh a;
    private final String b;

    dzk(dzh dzh, String str) {
        this.a = dzh;
        this.b = str;
    }

    public final void run() {
        dzh dzh = this.a;
        dzh.a.loadData(this.b, "text/html", "UTF-8");
    }
}
