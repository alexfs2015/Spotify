package defpackage;

/* renamed from: dzy reason: default package */
final /* synthetic */ class dzy implements Runnable {
    private final dzx a;
    private final String b;

    dzy(dzx dzx, String str) {
        this.a = dzx;
        this.b = str;
    }

    public final void run() {
        dzx dzx = this.a;
        dzx.a.b(this.b);
    }
}
