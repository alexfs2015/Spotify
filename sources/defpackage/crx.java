package defpackage;

/* renamed from: crx reason: default package */
final class crx implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ crt b;

    crx(crt crt, boolean z) {
        this.b = crt;
        this.a = z;
    }

    public final void run() {
        this.b.a("windowVisibilityChanged", "isVisible", String.valueOf(this.a));
    }
}
