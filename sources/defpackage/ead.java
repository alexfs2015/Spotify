package defpackage;

/* renamed from: ead reason: default package */
final class ead implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ dzx b;

    ead(dzx dzx, String str) {
        this.b = dzx;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadData(this.a, "text/html", "UTF-8");
    }
}
