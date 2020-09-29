package defpackage;

/* renamed from: crg reason: default package */
final class crg implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ crc b;

    crg(crc crc, boolean z) {
        this.b = crc;
        this.a = z;
    }

    public final void run() {
        this.b.a("windowVisibilityChanged", "isVisible", String.valueOf(this.a));
    }
}
