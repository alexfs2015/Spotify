package defpackage;

/* renamed from: eae reason: default package */
final class eae implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ dzx b;

    eae(dzx dzx, String str) {
        this.b = dzx;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadUrl(this.a);
    }
}
