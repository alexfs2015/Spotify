package defpackage;

/* renamed from: eac reason: default package */
final class eac implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ dzx b;

    eac(dzx dzx, String str) {
        this.b = dzx;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadData(this.a, "text/html", "UTF-8");
    }
}
