package defpackage;

/* renamed from: dzn reason: default package */
final /* synthetic */ class dzn implements Runnable {
    private final dzh a;
    private final String b;

    dzn(dzh dzh, String str) {
        this.a = dzh;
        this.b = str;
    }

    public final void run() {
        dzh dzh = this.a;
        dzh.a.b(this.b);
    }
}
