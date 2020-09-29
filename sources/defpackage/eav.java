package defpackage;

/* renamed from: eav reason: default package */
final class eav implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ eao b;

    eav(eao eao, String str) {
        this.b = eao;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadUrl(this.a);
    }
}
