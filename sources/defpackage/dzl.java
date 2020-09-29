package defpackage;

/* renamed from: dzl reason: default package */
final /* synthetic */ class dzl implements Runnable {
    private final dzh a;
    private final String b;

    dzl(dzh dzh, String str) {
        this.a = dzh;
        this.b = str;
    }

    public final void run() {
        dzh dzh = this.a;
        dzh.a.loadUrl(this.b);
    }
}
