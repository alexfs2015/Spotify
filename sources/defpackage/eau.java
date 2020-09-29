package defpackage;

/* renamed from: eau reason: default package */
final class eau implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ eao b;

    eau(eao eao, String str) {
        this.b = eao;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadData(this.a, "text/html", "UTF-8");
    }
}
