package defpackage;

/* renamed from: bjw reason: default package */
final class bjw implements Runnable {
    private final /* synthetic */ cla a;
    private final /* synthetic */ bju b;

    bjw(bju bju, cla cla) {
        this.b = bju;
        this.a = cla;
    }

    public final void run() {
        this.b.b(new ckz(this.a));
    }
}
