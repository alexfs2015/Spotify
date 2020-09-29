package defpackage;

/* renamed from: bjq reason: default package */
final /* synthetic */ class bjq implements Runnable {
    private final bjb a;

    private bjq(bjb bjb) {
        this.a = bjb;
    }

    static Runnable a(bjb bjb) {
        return new bjq(bjb);
    }

    public final void run() {
        this.a.b();
    }
}
