package defpackage;

/* renamed from: eat reason: default package */
final class eat implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ eao b;

    eat(eao eao, String str) {
        this.b = eao;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadData(this.a, "text/html", "UTF-8");
    }
}
